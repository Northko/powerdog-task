package fsnip.powerdog.task.common.utils;

import org.apache.commons.lang.StringUtils;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: kun.tan
 * @dateTime: 2018-12-24 14:27
 */
public class StrBuilder {

    private StringBuilder builder;
    private String separator;

    public StrBuilder(String separator) {
        builder = new StringBuilder();
        this.separator = separator;
    }

    public StrBuilder append(String url) {
        if (StringUtils.isNotBlank(url)) {
            if (StringUtils.isNotBlank(builder.toString())) {
                builder.append(separator);
            }
            builder.append(url);
        }
        return this;
    }

    public String getStr() {
        return builder.toString();
    }
}

package fsnip.powerdog.task.common.utils;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import fsnip.powerdog.task.modules.fsnip2smart.entity.OrgTranslation;
import fsnip.powerdog.task.modules.fsnip2smart.service.OrgTranslateService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 *
 * @description: 组织机构编码转换
 * @author: kun.tan
 * @dateTime: 2018-11-20 10:56
 */
public class OrgCodeTranslateUtils {

    @Autowired
    private OrgTranslateService orgTranslateService;

    private static final ConcurrentHashMap<String, String> common2fsnipPool = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, String> fsnip2commonPool = new ConcurrentHashMap<>();

    @PostConstruct
    private void init() {
        List<OrgTranslation> orgTranslations = orgTranslateService.selectList(new EntityWrapper<>());
        common2fsnipPool.putAll(orgTranslations.stream().collect(Collectors.toMap(OrgTranslation::getCommonCode, OrgTranslation::getFsnipCode)));
        fsnip2commonPool.putAll(orgTranslations.stream().collect(Collectors.toMap(OrgTranslation::getFsnipCode, OrgTranslation::getCommonCode)));
    }

    public static String common2fsnip(String commonCode) {
        if (StringUtils.isNotBlank(commonCode)) {
            return common2fsnipPool.get(commonCode);
        }
        return null;
    }

    public static String fsnip2common(String fsnipCode) {
        if (StringUtils.isNotBlank(fsnipCode)) {
            return fsnip2commonPool.get(fsnipCode);
        }
        return null;
    }
}

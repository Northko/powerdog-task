package fsnip.powerdog.task;

import fsnip.powerdog.task.common.utils.OrgCodeTranslateUtils;
import fsnip.powerdog.task.datasources.DynamicDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;


/**
 * @author tankun
 * @date 2018-7-13 13:23:00
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Import({DynamicDataSourceConfig.class, OrgCodeTranslateUtils.class})
public class TaskApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TaskApplication.class);
    }
}

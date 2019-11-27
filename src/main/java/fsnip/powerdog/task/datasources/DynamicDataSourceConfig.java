package fsnip.powerdog.task.datasources;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 配置多数据源
 *
 * @author kun.tan
 * @email
 * @date 2018-7-12 14:28:01
 */
@Configuration
public class DynamicDataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.druid.first")
    public DataSource firstDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.second")
    public DataSource secondDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.three")
    public DataSource threeDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.four")
    public DataSource fourDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.five")
    public DataSource fiveDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public DynamicDataSource dataSource() {
        Map<Object, Object> targetDataSources = new HashMap<>(4);
        targetDataSources.put(DataSourceNames.FIRST, firstDataSource());
        targetDataSources.put(DataSourceNames.SECOND, secondDataSource());
        targetDataSources.put(DataSourceNames.THREE, threeDataSource());
        targetDataSources.put(DataSourceNames.FOUR, fourDataSource());
        targetDataSources.put(DataSourceNames.FIVE, fiveDataSource());
        return new DynamicDataSource(firstDataSource(), targetDataSources);
    }
}

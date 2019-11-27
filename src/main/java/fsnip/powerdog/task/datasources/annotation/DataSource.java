package fsnip.powerdog.task.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 *
 * @author kun.tan
 * @email
 * @date 2018-7-12 14:29:54
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

    String name() default "";
}

package annotation;

import java.lang.annotation.*;

/**
 * @author : wh
 * @date : 2022/6/8 09:54
 * @description: 创建聚合根
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AggregateCreate {

}

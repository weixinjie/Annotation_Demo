package will.github.com.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by will on 2018/2/4.
 */
@Documented
//此注解修饰的是属性
@Target(ElementType.FIELD)
//此注解的作用域是Class,也就是编译时
@Retention(value = RetentionPolicy.CLASS)
public @interface BindView {
    int id() default 0;
}

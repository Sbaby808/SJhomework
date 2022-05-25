package com.corwin.springlistener.annotations;

import java.lang.annotation.*;

/**
 * @Author Sbaby
 * @Date 2022/5/25 0:09
 * @Version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Target(ElementType.METHOD)
public @interface Counter {


}

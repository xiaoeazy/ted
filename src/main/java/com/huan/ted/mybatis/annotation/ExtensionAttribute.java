package com.huan.ted.mybatis.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * to control that, a dto use standard attribute field or not.
 * <p>
 * default false(use extension field).<br>
 * if a dto doesn't have this annotation, it means <b>use extension field</b>
 * 
 * @author huanghuan
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExtensionAttribute {
    boolean disable() default false;
}

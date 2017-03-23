/*
 * #{copyright}#
 */

package com.huan.ted.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 拥有此注解的 bean, 将会出现在 freemarker context 中出现.
 * <p>
 * 引用名称为 bean 的 name
 * 
 * @author huanghuan
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface FreeMarkerBean {
}
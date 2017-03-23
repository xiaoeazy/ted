/*
 * #{copyright}#
 */

package com.huan.ted.core;

import org.springframework.aop.framework.AopContext;

/**
 * 获取代理对象 self.
 * 
 * @param <T>
 *            接口类型
 * @author huanghuan
 */
public interface ProxySelf<T> {
    /**
     * 取得当前对象的代理.
     * 
     * @return 代理对象,如果未被代理,则抛出 IllegalStateException
     */
    @SuppressWarnings("unchecked")
    default T self() {
        return (T) AopContext.currentProxy();
    }
}

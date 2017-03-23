/*
 * #{copyright}#
 */

package com.huan.ted.core;

/**
 * 一般用于 DTO获取 IRequest.
 * <p>
 *
 * @author huanghuan
 */
public interface IRequestAware {
    /**
     * 设置上下文.
     * 
     * @param request
     *            请求上下文
     */
    void setRequest(IRequest request);
}

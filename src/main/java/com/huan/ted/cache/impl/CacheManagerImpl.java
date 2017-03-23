/*
 * #{copyright}#
 */
package com.huan.ted.cache.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ApplicationContext;

import com.huan.ted.cache.Cache;
import com.huan.ted.cache.CacheManager;
import com.huan.ted.core.AppContextInitListener;

/**
 * @author huanghuan
 */
public class CacheManagerImpl implements CacheManager, AppContextInitListener {

    private HashMap<String, Cache> cacheMap = new HashMap<>();
    private List<Cache> caches;

    public void setCaches(List<Cache> caches) {
        this.caches = caches;
        if (caches != null) {
            for (Cache c : caches) {
                cacheMap.put(c.getName(), c);
                c.init();
            }
        }
    }

    public List<Cache> getCaches() {
        return caches;
    }

    @Override
    public <T> Cache<T> getCache(String name) {
        return cacheMap.get(name);
    }

    @Override
    public void addCache(Cache<?> cache) {
        if (caches == null) {
            caches = new ArrayList<>();
        }
        if (!caches.contains(cache)) {
            caches.add(cache);
        }
        cacheMap.put(cache.getName(), cache);
    }

    @Override
    public void contextInitialized(ApplicationContext applicationContext) {
        Map<String, Cache> cacheBeans = applicationContext.getBeansOfType(Cache.class);
        if (cacheBeans != null) {
            cacheBeans.forEach((k, v) -> {
                if (!caches.contains(v)) {
                    if (StringUtils.isEmpty(v.getName())) {
                        throw new RuntimeException(v + " cacheName is empty");
                    }
                    addCache(v);
                    v.init();
                }
            });
        }
    }
}

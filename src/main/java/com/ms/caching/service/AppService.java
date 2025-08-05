package com.ms.caching.service;

import com.ms.caching.modal.CachingRequest;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

@Service
public class AppService {

  @Autowired
  CacheManager cacheManager;

  @Autowired
  CacheStoreService cacheStoreService;

  public String insertToCache(CachingRequest cachingRequest) {
    String response = cacheStoreService.cacheRequest(cachingRequest);
    return "Caching put request handled";
  }

  public String getFromCache(String requestId) {
    String cachedValue = "Value not found in cache";
    Cache cache = cacheManager.getCache("requestIdCache");
    if (cache != null && null != cache.get("requestId")) {
      Cache.ValueWrapper wrapper =  cache.get("requestId");
      Object wrappedValue = wrapper.get();
      cachedValue = Objects.toString(wrappedValue, null);
    }
    return cachedValue;
  }

}

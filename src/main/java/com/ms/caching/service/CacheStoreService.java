package com.ms.caching.service;

import com.ms.caching.modal.CachingRequest;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheStoreService {

  @Cacheable(value = "requestIdCache", key = "'requestId'")
  public String cacheRequest(CachingRequest request) {
    System.out.println("Caching new requestId: " + request.getRequestId());
    return request.getRequestId();
  }
}

package com.ms.caching.controller;

import com.ms.caching.modal.CachingRequest;
import com.ms.caching.service.AppService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CachingController {

  @Autowired
  AppService cachingService;

  @PostMapping("/caching/post")
  public String put(HttpServletRequest request,@RequestBody CachingRequest cachingRequest) {
    return cachingService.insertToCache(cachingRequest);
  }

  @GetMapping("/caching/get/{requestId}")
  public String get(HttpServletRequest request, @PathVariable String requestId) {
    return cachingService.getFromCache(requestId);
  }
}

package com.ms.caching.modal;


public class CachingRequest {

  private String requestId;
  private String requestType;
  private String timestamp;
  private String value;

  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public String getRequestType() {
    return requestType;
  }

  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }
}

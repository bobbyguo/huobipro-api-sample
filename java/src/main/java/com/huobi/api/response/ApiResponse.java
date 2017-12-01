package com.huobi.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huobi.api.ApiException;

public class ApiResponse<T> {

  public String status;
  @JsonProperty("err-code")
  public String errCode;
  @JsonProperty("err-msg")
  public String errMsg;
  public T data;
  public long ts;

  public T checkAndReturn() {
    if ("ok".equals(status)) {
      return data;
    }
    throw new ApiException(errCode, errMsg);
  }
}

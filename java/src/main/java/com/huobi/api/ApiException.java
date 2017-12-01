package com.huobi.api;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ApiException if api returns error.
 * 
 * @author liaoxuefeng
 */
public class ApiException extends RuntimeException {

  final String errCode;

  public ApiException(String errCode, String errMsg) {
    super(errMsg);
    this.errCode = errCode;
  }

  public ApiException(Exception e) {
    super(e);
    this.errCode = e.getClass().getName();
  }

  public String getErrCode() {
    return this.errCode;
  }

  public static void main(String[] args) {
      String date = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date(1512117000 * 1000));
      System.out.println(date);
  }
}

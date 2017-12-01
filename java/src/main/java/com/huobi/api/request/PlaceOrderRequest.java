package com.huobi.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PlaceOrderRequest {

    @JsonProperty("account-id")
    String accountId;
    String amount;
    String price;
    String source = "api";
    String symbol;
    String type;
}

package com.huobi.api.request;

import lombok.Data;

@Data
public class KlineRequest {

    String symbol;
    String period;
    String size;
}

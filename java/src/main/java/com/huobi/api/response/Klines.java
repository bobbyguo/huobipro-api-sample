package com.huobi.api.response;

import java.util.List;

import lombok.Data;

@Data
public class Klines {

    long ts;
    List<Kline> klines;
}

package com.huobi.api.model;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Data extends LinkedHashMap<String, Double> implements Comparable<Data> {

    public String symbol;


    /**
     * 数据时间点
     */
    public Date date;

   

    /**
     * 属性值
     */
    public Map<String, String> attribute = new HashMap<>();

    public Data() {
    }

    public Data(String symbol) {
        this.symbol = symbol;
    }

    public Data(Map<String, Double> map) {
        this.putAll(map);
    }

    public void attr(String key, String val) {
        attribute.put(key, val);
    }

    public String attr(String key) {
        return attribute.get(key);
    }


    @Override
    public int compareTo(Data stockData) {
        int compare = this.symbol.compareTo(stockData.symbol);
        if (compare != 0) {
            return compare;
        }
        return this.date.compareTo(stockData.date);
    }
}

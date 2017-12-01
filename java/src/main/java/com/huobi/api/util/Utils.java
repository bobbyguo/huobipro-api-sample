package com.huobi.api.util;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import com.huobi.api.model.Data;

/**
 * Created by eryk on 2015/7/4.
 */
public class Utils {

    public static String[] toArray(List stockList){
        String[] array = new String[stockList.size()];
        stockList.toArray(array);
        return array;
    }

    /**
     * 将StockDatas的一列值转化成double[]
     * @param stockDatas stock data list
     * @param column column
     * @return return
     */
    public static double[] toDoubleArray(List<Data> stockDatas,String column){
        List<Double> values = stockDatas.parallelStream().map(stockData -> stockData.get(column)).collect(Collectors.toList());
        double[] doubles = Utils.toDoubleArray(values);
        return doubles;
    }

    public static boolean addDoubleArrayToList(double[] values,List<Data> stockDatas,String column){
        if(values.length == stockDatas.size()){
            for(int i =0 ;i<values.length;i++){
                stockDatas.get(i).put(column,new BigDecimal(values[i]).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
            }
            return true;
        }else{
            return false;
        }
    }

    public static double[] toDoubleArray(List<Double> values){
        double[] array = new double[values.size()];
        for(int i=0;i<values.size();i++){
            array[i] = values.get(i);
        }
        return array;
    }
    
}

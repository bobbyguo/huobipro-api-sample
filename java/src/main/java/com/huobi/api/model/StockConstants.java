package com.huobi.api.model;

/**
 * author: eryk
 * mail: xuqi86@gmail.com
 * date: 15-8-30.
 */
public class StockConstants {
    public static String CLOSE = "close";                   //最新价,收盘价
    public static String HIGH = "high";                     //最高价
    public static String LOW = "low";                       //最低价
    public static String OPEN = "open";                     //开盘价
    public static String LAST_CLOSE = "lastClose";          //昨日收盘价
    public static String CHANGE_AMOUNT = "changeAmount";    //涨跌额   今天收盘价-昨天收盘价
    public static String CHANGE = "change";                 //涨跌幅
    public static String TURNOVER_RATE = "turnoverRate";    //换手率
    public static String VOLUME = "volume";                 //成交量，单位：手
    public static String AMOUNT = "amount";                 //成交额,单位:万
    public static String TOTAL_VALUE = "totalValue";        //总市值,单位:亿
    public static String MARKET_VALUE = "marketValue";      //流通市值,单位:亿
    public static String AMPLITUDE = "amplitude";           //振幅
    public static String FACTOR = "factor";                 //复权因子

    public static String PE = "PE";                         //动态市盈率

    public static String POSITION="position";
    //macd指标
    public static String DIF = "dif";
    public static String DEA = "dea";
    public static String MACD = "macd";
    public static String MACD_CROSS = "macd_cross";
    //布林线指标
    public static String UPPER = "upper";
    public static String MID = "mid";
    public static String LOWER = "lower";
    public static String BOLL_SHRINK = "boll_shrink";
    //均线指标
    public static String CLOSE_MA5 = "close_ma5";
    public static String CLOSE_MA10 = "close_ma10";
    public static String CLOSE_MA13 = "close_ma13";
    public static String CLOSE_MA20 = "close_ma20";
    public static String CLOSE_MA30 = "close_ma30";
    public static String CLOSE_MA34 = "close_ma34";
    public static String CLOSE_MA40 = "close_ma40";
    public static String CLOSE_MA55 = "close_ma55";
    public static String CLOSE_MA60 = "close_ma60";
    public static String CLOSE_MA120 = "close_ma120";

    public static String MAX = "max";
    public static String MIN = "min";

    public static String AVERAGE_BOND = "average_bond";

    public static String GOLDEN_SPIDER = "golden_spider";
    public static String GOLDEN_SPIDER_RANGE = "golden_spider_range";

    public static String DATE_OF_DECLARATION = "dateOfDeclaration";  //公告日期
    public static String ANNUAL = "annual"; //分红年度
    public static String DATE_OF_RECORD = "dateOfRecord"; //股权登记日
    public static String DATE_OF_EX_DIVIDEND = "dateOfExDividend";   //除权除息日

    public static String STOCK_SHARES = "stockShares"; //送股
    public static String STOCK_TRANSFERRED = "stockTransferred"; //转增
    public static String STOCK_DIVIDEND = "stockDividend"; //派息

    public static String TYPE = "type";

    public static int DAILY_SIZE = 15;

}

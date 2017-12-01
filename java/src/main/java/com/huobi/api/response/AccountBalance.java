package com.huobi.api.response;

import java.util.List;

import lombok.Data;

@Data
public class AccountBalance {

    Long id;
    String state;
    String type;
    List<SubAccount> list;
    
    @Data
    public static class SubAccount {
        String balance;
        String currency;
        String type;
    }
}

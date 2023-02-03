package com.hashkey.mewallet.feign;


import org.springframework.stereotype.Component;

@Component
public class AccountClientFallback implements AccountClient {
    public String getAccount() {
        System.out.println("account 服务不可用，发送服务降级");
        return "00000";
    }
}

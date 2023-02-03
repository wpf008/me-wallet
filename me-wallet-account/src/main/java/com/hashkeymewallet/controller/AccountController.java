package com.hashkeymewallet.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class AccountController {
    @Value("${account:ox11111}")
    private String account;

    @GetMapping("getAccount")
    public String getAsset() {
        return "account is " + account;
    }
}

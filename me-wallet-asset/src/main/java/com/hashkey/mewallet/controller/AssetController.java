package com.hashkey.mewallet.controller;

import com.hashkey.mewallet.feign.AccountClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class AssetController {
    @Resource
    private AccountClient accountClient;

    @GetMapping("getBalance")
    public String getAsset() {
        log.info("asset service +++++");
        String account = accountClient.getAccount();
        return "Balance of 100ETH,Account is " + account;
    }
}

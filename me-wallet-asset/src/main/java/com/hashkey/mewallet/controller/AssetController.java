package com.hashkey.mewallet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssetController {

    @GetMapping("getBalance")
    public String getAsset() {
        return "Balance of 100ETH";
    }
}

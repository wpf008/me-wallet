package com.hashkeymewallet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("getAccount")
    public String getAsset() {
        return "Account is ox666666";
    }
}

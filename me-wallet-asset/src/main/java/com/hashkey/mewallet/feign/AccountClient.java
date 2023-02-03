package com.hashkey.mewallet.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "account",fallback = AccountClientFallback.class)
public interface AccountClient {
    @GetMapping("/rest/getAccount")
    String getAccount();
}

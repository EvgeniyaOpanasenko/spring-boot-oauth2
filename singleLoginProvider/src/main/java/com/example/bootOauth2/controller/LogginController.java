package com.example.bootOauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class LogginController {

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}


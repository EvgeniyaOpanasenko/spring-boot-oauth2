package com.example.bootOauth2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class LogginController {

    private static final Logger logger = LoggerFactory.getLogger(LogginController.class);


    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }

   /* @RequestMapping({ "/user", "/me" })
    public Map<String, String> user(Principal principal) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", principal.getName());
        //logger.info("user details = " + details);  // id, email, name, link etc.
        return map;
    }
*/
   /* @RequestMapping({ "/user", "/me" })
    @SuppressWarnings("unchecked")
    public Map<String, String> user(Principal principal) {
        if (principal != null) {
            OAuth2Authentication oAuth2Authentication = (OAuth2Authentication) principal;
            Authentication authentication = oAuth2Authentication.getUserAuthentication();
            Map<String, String> details = new LinkedHashMap<>();
            details = (Map<String, String>) authentication.getDetails();
            logger.info("user details = " + details);  // id, email, name, link etc.
            Map<String, String> map = new LinkedHashMap<>();
            map.put("name", details.get("name"));
            return map;
        }
        return null;
    }*/
}


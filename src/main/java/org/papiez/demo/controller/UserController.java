package org.papiez.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @RequestMapping(value = "/user/me", method = RequestMethod.GET)
    public Object userMe(Principal principal) {
        return principal;
    }
}

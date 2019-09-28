package org.lyh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    //localhost:8080/uset/test
    @RequestMapping(value = "/test")
    public String test(){
        return "index";
    }
}

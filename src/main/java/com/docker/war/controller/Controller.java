package com.docker.war.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value="/home", method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}

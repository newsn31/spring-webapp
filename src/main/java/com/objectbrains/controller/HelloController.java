/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objectbrains.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author quang
 */

@Controller
public class HelloController {
    @RequestMapping("hi")
    @ResponseBody
    public String hi() {
        return "Hello world!";
    }
}

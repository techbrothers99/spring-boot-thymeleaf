/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techbrothers99.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author chiru
 */
@Controller
public class UserController {
    
    @GetMapping("/user")
    public String welcomeUser(){
        return "user";
    }
    
}

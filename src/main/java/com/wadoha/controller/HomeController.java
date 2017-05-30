package com.wadoha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jalal Maqdisi on 30/05/2017.
 *
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}

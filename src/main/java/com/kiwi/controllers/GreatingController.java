package com.kiwi.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by malithi on 12/25/16.
 */
@RestController
public class GreatingController {

    @RequestMapping("/KiwiApp/{name}")
    String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}

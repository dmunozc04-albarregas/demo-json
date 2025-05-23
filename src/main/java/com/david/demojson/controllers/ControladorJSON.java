package com.david.demojson.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ControladorJSON {
    @GetMapping("/json1")
    public Map<String, String> json1(){
        return Map.of("mensaje", "hola mundo");
    }

    @GetMapping("/json2")
    public Map<String, String> json2(){
        return Map.of("producto", "ordenador, negro, 15.99€");
    }
}

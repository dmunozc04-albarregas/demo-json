package com.david.demojson.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ControladorJSON {

    /**
     * Métooo que devuelve un JSON con un mensaje
     * @return JSON con el mensaje
     */
    @GetMapping("/json1")
    public Map<String, String> json1(){
        return Map.of("mensaje", "hola mundo");
    }

    /**
     * Método que devuelve un JSON con un producto
     * @return JSON con el producto
     */
    @GetMapping("/json2")
    public Map<String, String> json2(){
        return Map.of("producto", "ordenador, negro, 15.99€");
    }
}

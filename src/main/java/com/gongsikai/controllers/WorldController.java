package com.gongsikai.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class WorldController {

    @GetMapping("/world")
    public static Map world() {
        System.out.println("Hello World");
//        return "world";
//        return "{ status: 0, data: { world: \"world\" }, msg: \"\" }";
//        return "{\"status\": 0, \"data\": {\"world\": \"world\"}, \"msg\": \"\"}";
        return Map.of(
                "status", 0,
                "data", Map.of("world", "world"),
                "msg", ""
        );
    }
}

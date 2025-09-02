package com.gongsikai.controllers;

import com.gongsikai.dto.ApiResponse;
import com.gongsikai.dto.HelloData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloControllers {
    
    @GetMapping("/hello")
    public ApiResponse<HelloData> hello() {
        HelloData data = new HelloData("world");
        return ApiResponse.success(data);
    }
}
package com.gongsikai.dto;

import lombok.Data;

@Data
public class HelloData {
    private String content;
    
    public HelloData(String content) {
        this.content = content;
    }
    
    public HelloData() {
        // 默认构造函数
    }
}
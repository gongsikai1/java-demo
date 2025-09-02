package com.gongsikai.dto;

import lombok.Data;

@Data
public class ApiResponse<T> {
    private int status;
    private T data;
    private String msg;
    
    public ApiResponse(int status, T data, String msg) {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }
    
    // 成功响应静态方法
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(0, data, "");
    }
    
    // 失败响应静态方法
    public static <T> ApiResponse<T> error(int status, String message) {
        return new ApiResponse<>(status, null, message);
    }
}
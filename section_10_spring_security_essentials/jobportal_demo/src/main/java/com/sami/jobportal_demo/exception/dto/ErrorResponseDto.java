package com.sami.jobportal_demo.exception.dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ErrorResponseDto(
        String apiPath,               // رابط الـ API
        HttpStatus errorCode,         // كود الخطأ
        String errorMessage,          // وصف الخطأ
        LocalDateTime errorTime       // وقت حدوث الخطأ
) {
}
package com.sami.backend_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 2️⃣ 📌 API Versioning -  Spring 7 API Versioning (الطريقة الحديثة) */
@RestController
// @RequestMapping("/api/versions/{v}")
@RequestMapping("/api/versions")
public class VersionController {

    @GetMapping(version = "1.0")
    public ResponseEntity<String> defaultVersion() {
        return ResponseEntity.ok().body("Version 1.0.0");
    }

    @GetMapping(version = "2.0+")
    public ResponseEntity<String> v2Version() {
        return ResponseEntity.ok().body("Version 2.0.0");
    }
}

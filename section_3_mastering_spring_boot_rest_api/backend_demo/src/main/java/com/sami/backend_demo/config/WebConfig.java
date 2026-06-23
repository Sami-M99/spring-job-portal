package com.sami.backend_demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/** 1️⃣ 📌 API Versioning -  Spring 7 API Versioning (الطريقة الحديثة) */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    /**
     * Configure API versioning for the application. In order for versioning to
     * be enabled, you must configure at least one way to resolve the API
     * version from a request (e.g. via request header).
     *
     * @param configurer
     * @since 7.0
     */
    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
        // configurer.usePathSegment(2).addSupportedVersions("1.0","2.0","3.0");                                                  // 1️⃣ Path Versioning
        // configurer.useQueryParam("version").addSupportedVersions("1.0","2.0","3.0").setDefaultVersion("1.0");                  // 2️⃣ Request Parameter Versioning
        // configurer.useRequestHeader("X-API-VERSION").addSupportedVersions("1.0","2.0","3.0").setDefaultVersion("1.0");         // 3️⃣ Header Versioning
        configurer.useMediaTypeParameter(MediaType.parseMediaType("application/vnd.sami+json"),"v")
                .addSupportedVersions("1.0","2.0","3.0").setDefaultVersion("1.0");                                                // 4️⃣ Media Type Versioning

    }
}

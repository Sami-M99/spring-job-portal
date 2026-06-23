package com.sami.ex5_advanced_autowiring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sami.ex5_advanced_autowiring.beans")
public class ProjectConfig {
}

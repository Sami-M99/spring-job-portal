package com.sami.ex7_bean_scopes.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.sami.ex7_bean_scopes.beans")
public class ProjectScopeConfig {
}

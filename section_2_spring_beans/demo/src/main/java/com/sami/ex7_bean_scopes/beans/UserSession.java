package com.sami.ex7_bean_scopes.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)   // "prototype"
public class UserSession {
    private final String id;

    public UserSession() {
        this.id = "27";
        System.out.println("UserSession Bean is created");
    }

    public String getId() {
        return id;
    }
}

package com.sami.ex5_advanced_autowiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CoffeeShop {
    private final Coffee coffee;

    @Autowired
    public CoffeeShop(@Qualifier("cappuccino") Coffee coffee) {
        this.coffee = coffee;
        System.out.println("From Coffee Shop Constructor");
    }

    public Coffee getCoffee() {
        return coffee;
    }
}

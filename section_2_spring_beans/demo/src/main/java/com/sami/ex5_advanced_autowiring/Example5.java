package com.sami.ex5_advanced_autowiring;

import com.sami.ex5_advanced_autowiring.beans.Coffee;
import com.sami.ex5_advanced_autowiring.beans.CoffeeShop;
import com.sami.ex5_advanced_autowiring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var coffeeShop = context.getBean(CoffeeShop.class);
        Coffee coffee = coffeeShop.getCoffee();
        System.out.println(coffee.makeCoffee());

    }
}

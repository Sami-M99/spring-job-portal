package com.sami.ex3_component;

import com.sami.ex3_component.beans.Vehicle;
import com.sami.ex3_component.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var veh1 = context.getBean(Vehicle.class);
        System.out.println("veh1 = " + veh1.getName());  // in normal way will return 'null'

        veh1.sayHello();

        context.close();
    }
}

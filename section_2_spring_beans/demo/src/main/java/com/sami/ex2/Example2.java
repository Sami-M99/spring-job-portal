package com.sami.ex2;

import com.sami.ex2.beans.Vehicle;
import com.sami.ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var veh1 = context.getBean(Vehicle.class);
        System.out.println(veh1.getName());

        var veh2 = context.getBean("Ferrari", Vehicle.class);
        System.out.println(veh2.getName());

        var veh3 = (Vehicle) context.getBean("Sport");
        System.out.println(veh3.getName());

        var vehDouc = context.getBean(String.class);
        System.out.println(vehDouc);
    }
}

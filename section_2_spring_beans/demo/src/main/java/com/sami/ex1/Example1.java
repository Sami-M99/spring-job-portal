package com.sami.ex1;

import com.sami.ex1.beans.Vehicle;
import com.sami.ex1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var veh1 = context.getBean("vehicle1", Vehicle.class);
        System.out.println(veh1.getName());

        var veh2 = (Vehicle) context.getBean("vehicle2");
        System.out.println(veh2.getName());
    }
}

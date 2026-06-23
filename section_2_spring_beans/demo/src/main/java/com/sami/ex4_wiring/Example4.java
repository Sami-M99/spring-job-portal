package com.sami.ex4_wiring;

import com.sami.ex4_wiring.beans.Car;
import com.sami.ex4_wiring.beans.Engine;
import com.sami.ex4_wiring.beans.Person;
import com.sami.ex4_wiring.beans.Vehicle;
import com.sami.ex4_wiring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var person = context.getBean(Person.class);
        var vehicle = context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());

        var car = context.getBean(Car.class);
        var engine = context.getBean(Engine.class);
        System.out.println("Car name from Spring Context is: " + car.getName());
        System.out.println("Engine name from Spring Context is: " + engine.getName());
        System.out.println("Engine that Car own is: " + car.getEngine());
    }
}

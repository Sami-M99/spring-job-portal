package com.sami.ex4_wiring.config;

import com.sami.ex4_wiring.beans.Person;
import com.sami.ex4_wiring.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** Manual Wiring */

@Configuration
@ComponentScan(basePackages = "com.sami.ex4_wiring.beans")
public class ProjectConfig {
    @Bean
    Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    /** Method Call */
    /*@Bean
    Person person() {
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle());
        return person;
    }*/

    /** Method Parameter */
    @Bean
    Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle);
        return person;
    }
}

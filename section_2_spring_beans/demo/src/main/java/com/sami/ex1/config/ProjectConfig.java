package com.sami.ex1.config;

import com.sami.ex1.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("vehicle 1 -> Audi");
        return veh;
    }

    @Bean
    Vehicle vehicle2() {
        Vehicle veh = new Vehicle();
        veh.setName("vehicle 2 -> Honda");
        return veh;
    }

    @Bean
    Vehicle vehicle3() {
        Vehicle veh = new Vehicle();
        veh.setName("vehicle 3 -> Ferrari");
        return veh;
    }

}

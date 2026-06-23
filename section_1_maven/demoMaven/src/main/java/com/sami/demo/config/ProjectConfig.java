package com.sami.demo.config;
import com.sami.demo.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean
    String message(){
        return "Hello Sami, your vehicle is nice...";
    }

    @Bean
    String buy(){
        return "Purchase Completed Successfully...";
    }

    @Bean
    Integer vehicleNumber(){
        return 7001;
    }
}

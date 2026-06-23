package com.sami.ex2.config;

import com.sami.ex2.beans.Vehicle;
import jdk.jfr.Description;
import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

@Configuration
@Import({AnotherProjectConfig.class})
public class ProjectConfig {

    @Bean(name = "Audi")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("vehicle 1 -> Audi");
        return veh;
    }

    @Bean(value = "Honda")
    @Primary
    @Description("The default bean")
    Vehicle vehicle2() {
        Vehicle veh = new Vehicle();
        veh.setName("vehicle 2 -> Honda");
        return veh;
    }

    @Bean("Ferrari")
    Vehicle vehicle3() {
        Vehicle veh = new Vehicle();
        veh.setName("vehicle 3 -> Ferrari");
        return veh;
    }

    @Bean({"BMW", "Sport"})
    Vehicle vehicle4() {
        Vehicle veh = new Vehicle();
        veh.setName("vehicle 4 -> BMW");
        return veh;
    }

}

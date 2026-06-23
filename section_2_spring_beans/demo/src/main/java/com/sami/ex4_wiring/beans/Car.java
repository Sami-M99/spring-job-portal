package com.sami.ex4_wiring.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/** Autowiring */

@Component
public class Car {
    private String name;

    /** Field Injection */
    // @Autowired
    private Engine engine;

    /** Constructor Injection */
    @Autowired
    public Car(Engine engine){
        this.engine = engine;
        System.out.println("Car bean created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    /** Setter Injection */
    // @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @PostConstruct
    public void initialize() {
        this.name = "Kia";
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}

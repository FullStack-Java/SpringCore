package org.example.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MotorBike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Motor Bike Annotations");
    }
}

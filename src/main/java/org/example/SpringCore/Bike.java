package org.example.SpringCore;

public class Bike implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Bke drive We have a bike and for the sake of this example we will say that " +
                "we drive a bike even though we ride a bike.");
    }
}

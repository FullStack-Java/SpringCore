package org.example.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

    @Autowired
    MobileProcessor cpu; //Don't understand how we can create an instance of an interface.

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config(){
        System.out.println("Octa Core 4, gb Ram, 12MP camera");
        cpu.process();
    }
}

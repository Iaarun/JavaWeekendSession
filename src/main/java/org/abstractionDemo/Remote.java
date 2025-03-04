package org.abstractionDemo;

public abstract class Remote {
    abstract void turnOn();
    abstract void turnOff();

    public void display(){
        System.out.println("Display of the TV");
    }
}

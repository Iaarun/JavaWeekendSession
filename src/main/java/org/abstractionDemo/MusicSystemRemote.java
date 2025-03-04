package org.abstractionDemo;

public class MusicSystemRemote extends Remote{
    @Override
    void turnOn() {
        System.out.println("Set the MusicSystem turnOn");
    }

    @Override
    void turnOff() {
        System.out.println("Set the MusicSystem turnOff");
    }
}

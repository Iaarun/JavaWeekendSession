package org.abstractionDemo;

public class Test {
    public static void main(String[] args) {
        TVRemote tv = new TVRemote();
        tv.turnOn();
        tv.turnOff();

        MusicSystemRemote ms = new MusicSystemRemote();
        ms.turnOn();
        ms.turnOff();
    }
}

package org.abstractionDemo;

public class TVRemote extends Remote implements ConnectionInterface{


    public void chaneCHannel(){

    }

    public void setVolume(){

    }

    @Override
    void turnOn() {
        System.out.println("Set the TV turnOn");
    }

    @Override
    void turnOff() {
        System.out.println("Set the TV turnOff");
    }

    @Override
    public void connectionSetUp() {
        System.out.println("SetUp TV Connection");
    }
}

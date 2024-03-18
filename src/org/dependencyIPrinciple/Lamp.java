package org.dependencyIPrinciple;

public class Lamp implements SwitchableDevice{
    private boolean isOn;
    public Lamp() {
        this.isOn = false;
    }
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("turn on ....");
    }
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("turn off ....");
    }
}

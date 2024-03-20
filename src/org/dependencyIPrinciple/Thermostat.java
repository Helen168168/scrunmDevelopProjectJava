package org.dependencyIPrinciple;

public class Thermostat {
    private final TemperatureSensor sensor;
    private final double targetTemperature;
    private double currentTemperature;
    public Thermostat(TemperatureSensor sensor, double targetTemperature) {
        this.sensor = sensor;
        this.targetTemperature = targetTemperature;
        this.currentTemperature = sensor.getCurrentTemperature();
    }
    public void regulateTemperature() {
            currentTemperature = sensor.getCurrentTemperature();
            if(currentTemperature > targetTemperature) {
                coolDown();
            } else {
                heatUp();
            }
    }
    private void coolDown() {
        System.out.print("cool down....");
    }
    private void heatUp() {
        System.out.print("heat up....");
    }
}

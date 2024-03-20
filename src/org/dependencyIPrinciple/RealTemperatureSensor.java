package org.dependencyIPrinciple;

// public class RealTemperatureSensor {
//     public double readTemperature() {
//         return Math.random() * 30;
//     }
// }
public class RealTemperatureSensor implements TemperatureSensor {
    @Override
    public double getCurrentTemperature() {
        return Math.random() * 30 + 20;
    }
}
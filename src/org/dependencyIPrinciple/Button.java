package org.dependencyIPrinciple;

public class Button {
    private SwitchableDevice device;
    public Button (SwitchableDevice device) {
        this.device = device;
    }
    public void press() {
        if(device != null) {
            //turnOn和turnOff的逻辑处理
            device.turnOn();
        } else {
            System.out.print("No device attached to the button.");
        }
    }
}

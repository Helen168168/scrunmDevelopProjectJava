package org.interfaceSeperatePrinciple.secondVersion;
public class TimedDoor extends Door {
    private boolean isDoorOpen;
    @Override
    public boolean isDoorOpen() {
        return this.isDoorOpen;
    }
    public void DoorTimeOut(int outTimerId) {
        // ...
    }
}

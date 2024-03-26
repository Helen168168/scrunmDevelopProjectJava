package org.interfaceSeperatePrinciple.secondVersion;
import org.interfaceSeperatePrinciple.secondVersion.TimedDoor;
public class DoorTimerAdapter implements TimerClient {
    private final TimedDoor timedDoor;
    public DoorTimerAdapter(TimedDoor timedDoor) {
        this.timedDoor = timedDoor;
    }
    @Override
    public void TimeOut(int outTimerId) {
        timedDoor.DoorTimeOut(outTimerId);
    }
}

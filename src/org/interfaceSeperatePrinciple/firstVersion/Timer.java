package org.interfaceSeperatePrinciple.firstVersion;
import org.interfaceSeperatePrinciple.firstVersion.TimerClient;
public class Timer {
    private TimerClient timerClient;
    private int timeout;
    public void Register(TimerClient timerClient, int timeout) {
        this.timeout = timeout;
        this.timerClient = timerClient;
    }
}

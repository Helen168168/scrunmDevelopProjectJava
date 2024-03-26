package org.interfaceSeperatePrinciple.firstVersion;

public class Timer implements TimerClient{
    private int outTimer;
    private int outTimerId;
    private TimerClient client;
    public void Register(int  outTimer, int outTimerId, TimerClient client) {
        this.outTimer = outTimer;
        this.outTimerId = outTimerId;
        this.client = client;
    }

    @Override
    public void TimeOut(int outTimerId) {
    System.out.print("outTimerId is: " + outTimerId);
    }
}

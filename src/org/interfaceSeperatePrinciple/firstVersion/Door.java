package org.interfaceSeperatePrinciple.firstVersion;

import org.interfaceSeperatePrinciple.secondVersion.TimerClient;

public class Door implements TimerClient {
    public void Lock() {

    }
    public void Unlock() {

    }
    public boolean isDoorOpen() {
        //写判断逻辑
        return false;
    }

    @Override
    public void TimeOut(int outTimerId) {

    }
}

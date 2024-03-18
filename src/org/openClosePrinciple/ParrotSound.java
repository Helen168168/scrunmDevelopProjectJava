package org.openClosePrinciple;
import org.openClosePrinciple.SoundBehavior;
public class ParrotSound implements SoundBehavior {
    @Override
    public void makeSound() {
        System.out.println("yingwu!");
    }
}
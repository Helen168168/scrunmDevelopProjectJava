package org.openClosePrinciple;
import org.openClosePrinciple.SoundBehavior;
public class DogSound implements SoundBehavior {
    @Override
    public void makeSound() {
        System.out.println("wangwang!");
    }
}
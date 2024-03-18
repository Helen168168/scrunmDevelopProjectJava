package org.openClosePrinciple;
import org.openClosePrinciple.SoundBehavior;
public class CatSound implements SoundBehavior {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

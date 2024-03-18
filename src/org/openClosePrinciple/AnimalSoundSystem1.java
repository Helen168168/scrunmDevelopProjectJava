package org.openClosePrinciple;

interface SoundBehavior {
    void makeSound();
}

public class AnimalSoundSystem1 {
    class AnimalSoundSystem {
        public void makeSound(Animal animal) {
            animal.makeSound();
        }
    }
    public class Animal {
        private SoundBehavior soundBehavior;
        public Animal(SoundBehavior soundBehavior) {
            this.soundBehavior = soundBehavior;
        }
        public void makeSound() {
            soundBehavior.makeSound();
        }
    }
   public class DogSound implements SoundBehavior {
        @Override
        public void makeSound() {
            System.out.println("Woof!");
        }
    }
    public class CatSound implements SoundBehavior {
        @Override
        public void makeSound() {
            System.out.println("Meow!");
        }
    }
    class ParrotSound implements SoundBehavior {
        @Override
        public void makeSound() {
            System.out.println("Polly wanna cracker!");
        }
    }
}
//
//    Animal dog = new Animal(new DogSound());
//    Animal cat = new Animal(new CatSound());
//    Animal parrot = new Animal(new ParrotSound());
//    new AnimalSoundSystem().makeSound(dog); // Woof!
//    new AnimalSoundSystem().makeSound(cat); // Meow!
//    new AnimalSoundSystem().makeSound(parrot); // Polly wanna cracker!
package org.openClosePrinciple;


public class AnimalSoundSystem {
    public class Animal {
        public void eat() {}
    }
    public class Cat extends Animal {
        public void meow() {
            System.out.println("Meow...");
        }
    }
    public class Dog extends Animal {
        public  void bark() {
            System.out.println("Woof...");
        }
    }
    public void makeSound(Animal animal) {
        if(animal instanceof Dog) {
            ((Dog) animal).bark();
        } else if(animal instanceof Cat) {
            ((Cat) animal).meow();
        }
    }
}


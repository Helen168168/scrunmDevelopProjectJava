package org.openClosePrinciple;
    public class AnimalSoundSystem1 {
        public void makeSound(Animal animal) {
            if (animal instanceof Dog) {
                ((Dog) animal).bark();
            } else if (animal instanceof Cat) {
                ((Cat) animal).meow();
            }
        }
    }
    class Animal {
        // ...
    }
    class Cat extends Animal {
    public void meow() {
        System.out.println("Meow!");
    }
}
    class Dog extends Animal {
    public void bark() {
        System.out.println("Woof!");
    }
}






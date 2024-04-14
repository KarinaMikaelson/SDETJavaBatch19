package org.example.class20;

import org.checkerframework.checker.units.qual.C;

public class AnimalTester {
    public static void main(String[] args) {
        Animal [] animals = {new Dog(), new Cat()};
        for(int i = 0; i <animals.length ; i++){
            Animal a = animals[i];
            a.eat();
            a.sleep();
            a.speak();
        }
    }
}

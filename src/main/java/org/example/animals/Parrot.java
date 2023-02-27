package org.example.animals;

import org.example.Animal;
import org.example.Talkative;

import java.util.Arrays;

public class Parrot extends Animal implements Talkative {
    public Parrot(String name, int age, boolean owner) {
        super(name, age, owner);
    }

    @Override
    public void makeNoise() {
        System.out.println("KARR-KARR");
    }

    @Override
    public <T> void eat(T... food) {
        Arrays.stream(food)
                .forEach(System.out::println);
    }

    @Override
    public void speak() {
        System.out.println("Good day!");
    }
}

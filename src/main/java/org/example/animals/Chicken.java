package org.example.animals;

import org.example.Animal;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Chicken extends Animal {
    public Chicken(String name, int age, boolean owner) {
        super(name, age, owner);
    }

    @Override
    public void makeNoise() {
        System.out.println("CSIPP!");
    }

    @Override
    public <T> void eat(T... food) {
        System.out.println(Arrays.stream(food)
                .map(Object::toString)
                .collect(Collectors.joining()));
    }
}

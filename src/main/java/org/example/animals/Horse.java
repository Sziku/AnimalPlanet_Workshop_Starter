package org.example.animals;

import org.example.Animal;

import java.util.Arrays;

public class Horse extends Animal {
    public Horse(String name, int age, boolean owner) {
        super(name, age, owner);
    }

    @Override
    public void makeNoise() {
        System.out.println("Nyihahahha");
    }

    @Override
    public <T> void eat(T... food) {
        System.out.println(Arrays.stream(food)
                .mapToInt(f -> Arrays.toString(food).length())
                .reduce((a, b) -> a * b).getAsInt());
    }
}

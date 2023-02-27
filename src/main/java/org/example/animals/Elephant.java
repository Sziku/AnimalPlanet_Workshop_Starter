package org.example.animals;

import org.example.Animal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Elephant extends Animal {
    public Elephant(String name, int age, boolean owner) {
        super(name, age, owner);
    }

    @Override
    public void makeNoise() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = localDateTime.format(format);

        System.out.println(formatDateTime);
    }

    @Override
    public <T> void eat(T... food) {
        if(food.length%2 == 0) {
            makeNoise();
        }else {
            System.out.println("BUMM");
        }
    }
}

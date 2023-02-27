package org.example;

import org.example.animals.Chicken;
import org.example.animals.Elephant;
import org.example.animals.Horse;
import org.example.animals.Parrot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalFactory {
    private AnimalReader animalReader;
    private Random random;

    public AnimalFactory(String filePath) {
        this.animalReader = new AnimalReader(filePath);
        random = new Random();
    }

    public List<Animal> getAnimalListFromFile(){

        List<Animal> animals = new ArrayList<>();
        for (String s : animalReader.readAnimalsFromFile()){
            switch (s.toLowerCase()){
                case "parrot" -> animals.add(new Parrot(radomazedName(), randomazedAge(), randomazedOwner()));
                case "horse" -> animals.add(new Horse(radomazedName(), randomazedAge(), randomazedOwner()));
                case "chicken" -> animals.add(new Chicken(radomazedName(), randomazedAge(), randomazedOwner()));
                case "elephant" -> animals.add(new Elephant(radomazedName(), randomazedAge(), randomazedOwner()));
            }

        }


        return animals;
    }

    private boolean randomazedOwner() {
        //random.nextBoolean();
        return random.nextInt(1, 2) % 2 == 0;
    }

    private int randomazedAge() {
        return random.nextInt(0,100);
    }

    private String radomazedName() {

        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLenght = 10;
        return  random.ints(leftLimit, rightLimit +1)
                .limit(targetStringLenght)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}

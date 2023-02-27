package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //AnimalReader reader = new AnimalReader(Util.animalFile1);
        //AnimalReader reader = new AnimalReader(Util.animalFile2);
        //AnimalReader reader = new AnimalReader(Util.animalFile3);
        //AnimalReader reader = new AnimalReader(Util.animalFile4);
        //AnimalReader reader = new AnimalReader(Util.animalFile5);

        //reader.readAnimalsFromFile().forEach(System.out::println);

        //Arrays.stream(reader.numberOfNonAnimalsInEachRow()).forEach(System.out::println);

        AnimalPlanet planet = new AnimalPlanet(Util.animalFile1);
        planet.listen();

        System.out.println("FEEDING");
        planet.feedAnimalsWithThreeFoods();

    }
}
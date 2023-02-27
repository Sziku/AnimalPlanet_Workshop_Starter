package org.example;

import java.util.List;

public class AnimalPlanet {
    private AnimalFactory factory;
    private List<Animal> animals;

    public AnimalPlanet(String filePath) {
        this.factory = new AnimalFactory(filePath);

        animals = factory.getAnimalListFromFile();
    }

    public void listen(){
        animals.forEach(Animal::makeNoise);
    }

    public void feedAnimalsWithThreeFoods(){
        for (Animal animal :animals) {
            switch (animal.getClass().getSimpleName()){
                case "Horse" -> animal.eat(12.2, 0.4, 453.143123);
                case "Chicken" -> animal.eat(true, false, true);
                case "Elephant" -> animal.eat("String","Szöveg", "valami");
                case "Parrot" -> animal.eat(1,2,3);
            }
        }
    }
}

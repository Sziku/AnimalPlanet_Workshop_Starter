package org.example;

import org.example.excpetions.NoAnimalsFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
solid elvek
stream
expections
try/catch/finally
generic
* */

public class AnimalReader {
    private File file;


    public AnimalReader(String path) {
        this.file = new File(path);
    }

    public List<String> readAnimalsFromFile() throws NoAnimalsFoundException{

        List<String> animals =  new ArrayList<>();

        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()){
               animals.addAll(Arrays.stream(scanner.nextLine().split(";"))
                       .filter(animal -> Util.validAnimals.contains(animal)).toList());
            }
        }catch (FileNotFoundException e){
            System.out.println("No suck file found!");
        }

        if (animals.isEmpty()){
            throw new NoAnimalsFoundException();
        }

        return animals;
    }

    public int[] numberOfNonAnimalsInEachRow(){
        int[] numberOfNonAnimals = new int[getNumberOfRowsFile()];

        try(Scanner scanner = new Scanner(file)) {
            int row= 0;
            while(scanner.hasNextLine()){
             numberOfNonAnimals[row] =  (int) Arrays.stream(scanner.nextLine().split(";"))
                        .filter(animal ->!Util.validAnimals.contains(animal))
                        .count();
             row++;
            }
        }catch (FileNotFoundException e){
            System.out.println("No suck file found!");
        }

        return numberOfNonAnimals;
    }

    private int getNumberOfRowsFile() {
        int counter = 0;
        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()){
                counter++;
                scanner.nextLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("No suck file found!");
        }
        return counter;
    }
}

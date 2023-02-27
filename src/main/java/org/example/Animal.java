package org.example;

public abstract class Animal {
    private String name;
    private int age;
    private boolean owner;

    public Animal(String name, int age, boolean owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOwner() {
        return owner;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }

    public abstract  void makeNoise();
    public abstract <T> void eat(T... food);
}

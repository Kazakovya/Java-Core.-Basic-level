package ru.geekbrains;

public abstract class Animal {
    protected String name;
    public static int coutAnimals;

    public Animal(String name) {
        this.name = name;
        coutAnimals++;
    }

    public abstract void running(String name, int runningDistance);

    public abstract void swimming(String name, int swimmingDistance);


}

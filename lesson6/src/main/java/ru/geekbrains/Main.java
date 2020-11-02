package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        Cats cat = new Cats("Барсик");
        Dogs dog = new Dogs("Трезор");
        Cats cat1 = new Cats("Василий");


        run(22, new Cats("Мурзик"));
        swim(4, new Dogs("Тобик"));
        System.out.println("Создано " + Animal.coutAnimals + " животных," + Cats.countCats + " котов и " + Dogs.countDogs + " собак");
    }

    public static void run(int distance, Animal animal) {
        animal.running(animal.name, distance);
    }

    public static void swim(int distance, Animal animal) {
        animal.swimming(animal.name, distance);
    }


}

package ru.geekbrains;

public class Cats extends Animal {
    public static int countCats;
    int maxRunningDistance = 200;

    public Cats(String name) {
        super(name);
        countCats++;
    }

    @Override
    public void running(String name, int runningDistance) {
        if (runningDistance > maxRunningDistance) {
            System.out.println("Я не могу столько бегать. Я же кот. Максимум " + maxRunningDistance + " м.");
        } else {
            System.out.println("Кот " + name + " пробежал " + runningDistance + " м.");
        }
    }

    @Override
    public void swimming(String name, int swimmingDistance) {
        System.out.println(name + " плыть отказался, сославшись на то, что он кот");
    }

}

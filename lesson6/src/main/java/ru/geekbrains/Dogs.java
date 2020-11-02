package ru.geekbrains;

public class Dogs extends Animal {
    public static int countDogs;
    int maxRunningDistance = 500;
    int maxSwimmingDistance = 10;

    public Dogs(String name) {
        super(name);
        countDogs++;
    }

    @Override
    public void running(String name, int runningDistance) {
        if (runningDistance > maxRunningDistance) {
            System.out.println("Я не могу столько бегать. Я же пес. Максимум " + maxRunningDistance + " м.");
        } else {
            System.out.println("Пес " + name + " пробежал " + runningDistance + " м.");
        }
    }

    @Override
    public void swimming(String name, int swimmingDistance) {
        if (swimmingDistance > maxSwimmingDistance) {
            System.out.println("Я не могу столько плавать. Я же пес. Максимум " + maxRunningDistance + " м.");
        } else {
            System.out.println("Пес " + name + " проплыл " + swimmingDistance + " м.");
        }
    }
}

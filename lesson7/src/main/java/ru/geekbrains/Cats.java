package ru.geekbrains;

public class Cats {
    private String name;
    private int appetite;
    private boolean satiety; //сытость

    public Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        System.out.println(name + ", кушай. Приятного аппетита!");
        if (p.decreaseFood(appetite)) {
            satiety = true;
            System.out.println("Кот " + name + " наелся. Он благодарен");
        } else {
            satiety = false;
            System.out.println("Кот " + name + " остался голоден. Он негодует");
        }
    }
}

package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        Cats[] cats = new Cats[5];
        cats[0] = new Cats("Трезор", 15);
        cats[1] = new Cats("Полкан", 13);
        cats[2] = new Cats("Бобик", 8);
        cats[3] = new Cats("Шарик", 22);
        cats[4] = new Cats("Тобик", 10);
        Plate plate = new Plate(35);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.info();
            System.out.println("");
        }
        plate.addFood(7);

    }


}

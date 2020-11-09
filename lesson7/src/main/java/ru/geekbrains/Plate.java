package ru.geekbrains;

import com.sun.source.tree.IfTree;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n > food) {
            System.out.println("Ой! Кот, извини, но тебе не хватит оставшейся еды. Приходи в следующий раз");
            return false;
        } else food -= n;
        return true;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int n) {
        if (n >= 0) {
            food += n;
            System.out.println("Вы добавили в миску " + n + " еды. Теперь там " + food);
        } else System.out.println("Добавьте положительное количество еды");
    }
}

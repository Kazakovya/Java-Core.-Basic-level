package ru.geekbrains;

public class Three {

    //  3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float
    public static void main(String[] args) {

        System.out.println(calc(3.5F, 3F, 6F, 4F));
    }

    public static float calc(float a, float b, float c, float d) {

        return (a * (b + (c / d)));
    }
}

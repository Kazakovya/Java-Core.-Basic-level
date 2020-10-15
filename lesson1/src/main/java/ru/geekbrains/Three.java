package ru.geekbrains;

public class Three {

    //  3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float
    public static void main(String[] args) {

        calc(3F, 3F, 6F, 4F);
    }

    public static void calc(float a, float b, float c, float d) {

        System.out.println(a * (b + (c / d)));
    }
}

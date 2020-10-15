package ru.geekbrains;

public class Five {

//  5. Написать метод, которому в качестве параметра передается целое число,
//  метод должен напечатать в консоль, положительное ли число передали или
//  отрицательное. Замечание: ноль считаем положительным числом.

    public static void main(String[] args) {
        pos(-13);

    }

    public static void pos(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}

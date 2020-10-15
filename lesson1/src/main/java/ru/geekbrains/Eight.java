package ru.geekbrains;

public class Eight {

//  8. *Написать метод, который определяет, является ли год високосным, и
//  выводит сообщение в консоль. Каждый 4-й год является високосным, кроме
//  каждого 100-го, при этом каждый 400-й – високосный.

    public static void main(String[] args) {

        leap(1700);
    }

    public static void leap(int a) {
        boolean b = a % 400 == 0 || (a % 4 == 0 && a % 100 != 0);
        if (b == true) {
            System.out.println(a + "- високосный год");
        } else {
            System.out.println(a + "- НЕвисокосный год");
        }
    }
}

package ru.geekbrains;

public class Six {

//  6. Написать метод, которому в качестве параметра передается целое число.
//  Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static void main(String[] args) {

        negOrPos(-1);
    }

    public static void negOrPos(int a) {
        System.out.println(a < 0);

    }
}

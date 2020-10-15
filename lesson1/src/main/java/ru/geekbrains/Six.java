package ru.geekbrains;

public class Six {

//  6. Написать метод, которому в качестве параметра передается целое число.
//  Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static void main(String[] args) {

        System.out.println(negOrPos(1));
    }

    public static boolean negOrPos(int a) {
        return (a < 0);

    }
}

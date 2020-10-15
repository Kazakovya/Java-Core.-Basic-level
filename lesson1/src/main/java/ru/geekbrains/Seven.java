package ru.geekbrains;

public class Seven {

//  7. Написать метод, которому в качестве параметра передается строка, обозначающая
//  имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!»

    public static void main(String[] args) {

        hi("Вася");
    }

    public static void hi(String name) {

        System.out.println("Привет, " + name + "!");
    }
}

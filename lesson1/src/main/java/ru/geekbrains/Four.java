package ru.geekbrains;

public class Four {

//  4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма
//  лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false

    public static void main(String[] args) {

        sum(10, 16);
    }

    public static void sum(int a, int b) {
        System.out.println((a + b) >= 10 && (a + b) <= 20);
    }
}

package ru.geekbrains;

public class Staff {
    private String name;
    private String function;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Staff(String name, String function, String email, String phone, int salary, int age) {
        this.name = name;
        this.function = function;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return name + " " + function + " " + email + " " + phone + " " + salary + "руб. " + age + " лет";
    }

    public boolean oldScool() {
        return age > 40;
    }

}

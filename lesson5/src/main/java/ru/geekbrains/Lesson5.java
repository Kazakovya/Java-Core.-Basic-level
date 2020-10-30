package ru.geekbrains;

public class Lesson5 {
    public static void main(String[] args) {
        Staff[] person = new Staff[5];

        person[0] = new Staff("Иванов Иван Иванович", "Генеральный директор", "ivanovii@mail.ru", "+7 987 654 32 10", 450000, 58);
        person[1] = new Staff("Иванов Степан Иванович", "Коммерческий директор", "ivanovsi@mail.ru", "+7 903 223 65 89", 310000, 31);
        person[2] = new Staff("Иванов Сергей Иванович", "Исполнительный директор", "SergIvanov@ya.ru", "+7 926 120 20 04", 300000, 27);
        person[3] = new Staff("Иванов Максим Иванович", "Креативный директор", "max-best777@gmail.com", "+7 926 100 20 03", 220000, 23);
        person[4] = new Staff("Султанбекова Сауле Саримоковна", "Уборщица", "Saule1977@mail.ru", "+7 952 347 12 36", 14000, 43);


        System.out.println("Сотрудники старше 40 лет:");
        for (int i = 0; i < person.length; i++) {
            if (person[i].oldScool()) {
                System.out.println(person[i].toString());
            }
        }

    }
}


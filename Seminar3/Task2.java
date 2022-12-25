package Seminar3;

import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        // Создайте класс Счетчик, у которого есть метод add(),
        // увеличивающий значение внутренней int переменной на 1.
        // Сделайте так, чтобы с объектом такого типа можно было работать в блоке
        // try-with-resources.
        // Нужно бросить исключение, если работа с объектом типа счетчик была не в
        // ресурсном try и/или ресурс остался открыт.
        // Подумайте какой тип исключения подойдет лучше всего.
        Counter counter = new Counter(2);
        counter.add();
        try (counter) {
            counter.add();

        } catch (Exception e) {
            e.printStackTrace();
        }
        //counter.add();
        System.out.println(counter.getCount());
    }
}
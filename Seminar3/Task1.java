package Seminar3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args)  {
        // Создайте метод doSomething(), который может быть источником одного из типов
        // checked exceptions
        // (тело самого метода прописывать не обязательно). Вызовите этот метод из main
        // и обработайте в нем исключение,
        // которое вызвал метод doSomething().
        try {
            doSomething();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void doSomething() throws IOException {
        File file = new File ("1.txt");
        FileInputStream stream = new FileInputStream(file);
    }
}

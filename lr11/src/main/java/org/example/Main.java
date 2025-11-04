package org.example;

import java.io.*;

public class Main {
    private static final String FILE_NAME = "about_me.txt";

    public static void main(String[] args) {
        createAboutMeFile();
    }

    private static void createAboutMeFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write("ИНФОРМАЦИЯ О СЕБЕ\n");
            writer.write("ФИО: Радевич Роман Дмитриевич\n");
            writer.write("Возраст: 20 лет\n");
            writer.write("Группа: т-319\n");
            writer.write("Хобби: Футбол\n");
            System.out.println("Файл '" + FILE_NAME + "' создан!");
        } catch (IOException e) {
            System.out.println("Ошибка создания файла: " + e.getMessage());
        }
    }

}
package org.example;

import java.io.*;
import java.util.Scanner;

public class Temperature {
    private static final String FILE_NAME = "temperatures.txt";

    public static void main(String[] args) {
        System.out.println("=== ЗАДАНИЕ 2: ТЕМПЕРАТУРЫ ВОЗДУХА ===");

        // Ввод 15 температур и запись в файл
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            System.out.println("Введите 15 вещественных значений температуры:");
            for (int i = 0; i < 15; i++) {
                System.out.print("Температура " + (i + 1) + ": ");
                double temp = scanner.nextDouble();
                writer.write(temp + " ");
            }
            System.out.println("Данные записаны в файл '" + FILE_NAME + "'.");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        // Чтение и вычисление среднего
        double sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line = reader.readLine();
            if (line != null) {
                String[] temps = line.trim().split("\\s+");
                for (String temp : temps) {
                    if (!temp.isEmpty()) {
                        sum += Double.parseDouble(temp);
                        count++;
                    }
                }
            }
            if (count > 0) {
                double average = sum / count;
                System.out.println("Средняя температура: " + average + "°C");
            } else {
                System.out.println("Ошибка: Нет данных для вычисления.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка формата числа: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
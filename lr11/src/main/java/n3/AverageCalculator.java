package n3;

import java.io.*;

public class AverageCalculator {
    private static final String FILE_NAME = "numbers.txt";

    public static void main(String[] args) {
        System.out.println("=== ЗАДАНИЕ 3 (ВАРИАНТ 18): СРЕДНЕЕ ИЗ ЧИСЕЛ ===");


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write("12 154 12");
            writer.newLine();
            System.out.println("Файл '" + FILE_NAME + "' создан с числами.");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        int sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line = reader.readLine();
            if (line != null) {
                String[] numbers = line.trim().split("\\s+");
                for (String num : numbers) {
                    if (!num.isEmpty()) {
                        sum += Integer.parseInt(num);
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Ошибка: Деление на ноль! Файл пуст.");
            } else {
                double average = (double) sum / count;
                System.out.println("Среднее: " + average);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка формата числа: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
        
        new File(FILE_NAME).delete();
        System.out.println("Файл удалён.");
    }
}
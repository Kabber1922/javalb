package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Введите данные для хорька:");

            try {
                System.out.print("Введите имя хорька: ");
                String name = scanner.nextLine();

                System.out.print("Введите возраст хорька (до 15): ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("Введите цвет шерсти: ");
                String furColor = scanner.nextLine();

                System.out.print("Введите вес хорька (в кг до 3): ");
                double weight = Double.parseDouble(scanner.nextLine());

                Ferret ferret = new Ferret(name, age, furColor, weight);
                validInput = true;
                System.out.println("-----");
                ferret.printInfo();
                ferret.play();

            } catch (Exception e) {
                System.out.println(e.getMessage() + " Попробуйте снова.");
            }
        }
        scanner.close();
    }
}
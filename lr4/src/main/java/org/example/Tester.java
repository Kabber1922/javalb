package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "Unknown");
    }

    public void printInfo() {
        System.out.println("Тестер: " + name + " " + surname);
    }

    public void printInfo(boolean showSalary) {
        if (showSalary) {
            System.out.println("Тестер: " + name + " " + surname + ", ЗП: $" + salary);
        } else {
            printInfo();
        }
    }

    public void printInfo(String prefix) {
        System.out.println(prefix + ": " + name + " " + surname + ", English Level: " + englishLevel);
    }

    public static String getTesterRole() {
        return "Инженер по обеспечению качества\n";
    }
}
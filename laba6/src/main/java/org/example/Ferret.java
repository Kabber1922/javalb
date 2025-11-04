package org.example;

public class Ferret {
    private String name;
    private int age;
    protected String furColor;
    public double weight;

    public Ferret(String name, int age, String furColor, double weight) throws Exception {
        this.name = name;

        if (age < 0 || age > 15) {
            throw new Exception("Возраст должен быть от 0 до 15 лет!");
        }
        this.age = age;

        if (furColor == null || furColor.isEmpty()) {
            throw new Exception("Цвет шерсти не может быть пустым!");
        } else if (!furColor.matches("^[a-zA-Zа-яА-Я]+$")) {
            throw new Exception("Цвет шерсти должен содержать только буквы!");
        }
        this.furColor = furColor;

        if (weight < 0 || weight > 3) {
            throw new Exception("Вес должен быть от 0 до 3 кг!");
        }
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("Имя: " + (name.isEmpty() ? "Нету" : name));
        System.out.println("Возраст: " + age);
        System.out.println("Цвет шерсти: " + furColor);
        System.out.println("Вес: " + weight + " кг");
    }

    public void play() {
        System.out.println((name.isEmpty() ? "Хорек" : name) + " играет и роет!");
    }
}
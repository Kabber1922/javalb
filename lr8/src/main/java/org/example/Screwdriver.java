package org.example;

public class Screwdriver implements Tool {
    private double ves;

    public Screwdriver(double ves) {
        this.ves = ves;
    }
    public Screwdriver() {
        this.ves = 0.2;
    }
    public double getves() {
        return ves;
    }

    public void setves(double ves) {
        this.ves = ves;
    }

    @Override
    public void use() {
        System.out.println("Отвертка весом " + ves + " кг");
    }
}
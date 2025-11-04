package org.example;

public class Hammer implements Tool, Faf {
    private double ves;

    public Hammer(double ves) {
        this.ves = ves;
    }

    public Hammer() {
        this.ves = 1.0;
    }

    public double getves() {
        return ves;
    }

    public void setves(double ves) {
        this.ves = ves;
    }

    @Override
    public void use() {
        System.out.println("Молоток с весом " + ves + " кг");
    }
}
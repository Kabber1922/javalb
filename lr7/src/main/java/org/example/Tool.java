package org.example;

public abstract class Tool {
    public double ves;

    public Tool(double ves) {
        this.ves = ves;
    }

    public Tool() {

    }

    public abstract void use();


    public void printinfo() {
        System.out.println("uytr");
    }
}
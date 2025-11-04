package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Tool hammer = new Hammer(1.5);
        Tool screwdriver = new Screwdriver(0.3);
        hammer.use();
        screwdriver.use();
    }
}
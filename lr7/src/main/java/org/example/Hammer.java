package org.example;

public class Hammer extends Tool {
    @Override
    public void use() {
        System.out.println("Молоток.");
    }

    public void displayinfo(){
        System.out.println("123");
    }
}
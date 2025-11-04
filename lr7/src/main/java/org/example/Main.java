package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tool hammer = new Hammer();
        Hammer hammer1= new Hammer();
        hammer.printinfo();

        hammer1.printinfo();
        hammer1.displayinfo();


        Tool screwdriver = new Screwdriver();
        hammer.use();
        screwdriver.use();
        }
    }

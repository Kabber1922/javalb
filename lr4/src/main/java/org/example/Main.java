package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.printf("Hello Roma");
        String role = Tester.getTesterRole();
        System.out.println("Role: " + role);

        Tester t1 = new Tester("Илюха", "Сухой");
        Tester t2 = new Tester("Никитос", "Нос", 2, "B2");
        Tester t3 = new Tester("Макс", "Черепахин", 6, "C1", 2500.0);

        t1.printInfo();
        t2.printInfo(true);
        t3.printInfo("Senior QA");
    }
}

package n2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Вася", "ИТ-21", 2, Map.of("Матан", 4, "Прога", 3, "Физика", 2)));
        students.add(new Student("Петя", "ИТ-21", 2, Map.of("Матан", 2, "Прога", 2, "Физика", 3)));
        students.add(new Student("Коля", "ИТ-22", 3, Map.of("Матан", 4, "Прога", 4, "ООП", 5)));
        students.add(new Student("Маша", "ИТ-21", 2, Map.of("Матан", 4, "Прога", 4, "Английский", 5)));

        System.out.println("До фильтрации:");
        Student.infostudent(students, 2);

        Student.filterstruddentov(students);

        System.out.println("\nПосле фильтрации и перевода:");
        Student.infostudent(students, 3);
        System.out.println("\nПосле фильтрации и перевода:");
        Student.infostudent(students, 4);

        System.out.println(students.get(0));
    }
}
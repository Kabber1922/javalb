package n3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee[] staff = {
                new FixedSalaryEmployee("RADEадевич Роман", 33333.31),
                new HourlySalaryEmployee("Носатый Никита", 1111.11),
                new HourlySalaryEmployee("ZET Роман", 33333.33),
                new FixedSalaryEmployee("Сухой Илья", 8888.80),
                new FixedSalaryEmployee("Медведь Вадим", 15000.00),
                new HourlySalaryEmployee("Каранкевич Валерия", 1111.11),
        };

        List<Employee> employees = new ArrayList<>(Arrays.asList(staff));

        employees.sort((a, b) -> {
            if (b.getMonthlySalary() > a.getMonthlySalary()) return 1;
            if (b.getMonthlySalary() < a.getMonthlySalary()) return -1;
            return a.getFullName().compareTo(b.getFullName());
        });

        System.out.println("a) Полный список сотрудников (ID, Имя, Зарплата):");
        for (Employee e : employees) {
            System.out.println(
                    "ID: " + e.getId() +" | Имя: " + e.getFullName() + " | Зарплата: " + e.getMonthlySalary() + " руб."
            );
        }


        System.out.println("\n" + "b) Первые 5 имён:");
        int count = 0;
        for (Employee e : employees) {
            if (count >= 5) break;
            System.out.println(e.getFullName());
            count++;
        }

        System.out.println("\n" + "c) Последние 3 ID:");
        int size = employees.size();
        for (int i = Math.max(0, size - 3); i < size; i++) {
            System.out.println("ID: " + employees.get(i).getId());
        }
    }
}

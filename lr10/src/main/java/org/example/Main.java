package org.example;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("ООО Ромашка");
        Department itDept = new Department("IT-отдел");

        try {
            Employee e1 = new Employee("Иванов И.И.", "Программист", -5000);
        } catch (SalaryException e) {
            System.out.println("ОШИБКА СОЗДАНИЯ: " + e.getMessage());
            try {
                throw new SalaryException(e.getMessage());
            } catch (SalaryException ex) {
                System.out.println("Повторное исключение: " + ex.getMessage());
            }
        }


        try {
            Employee e2 = new Employee("Петров П.П.", "Менеджер", 6000);
            itDept.addEmployee(e2);
        } catch (SalaryException e) {
            System.out.println(e.getMessage());
        }


        try {
            Staff s1 = new Staff("Сидоров С.С.", "Старший разработчик", 8000, -1000);
        } catch (SalaryException | BonusException e) {
            System.out.println("ОШИБКА: " + e.getMessage());
        }


        try {
            Staff s2 = new Staff("Козлов К.К.", "Архитектор", 10000, 3000);
            itDept.addEmployee(s2);
            System.out.println("Зарплата Козлова: " + s2.calculatePay());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            Contractor c1 = new Contractor("Васильев В.В.", "Фрилансер", 7000);
            itDept.addEmployee(c1);
            System.out.println("Зарплата контрактника: " + c1.calculatePay());
        } catch (SalaryException e) {
            System.out.println(e.getMessage());
        }

        company.addDepartment(itDept);
        System.out.println("Фирма: " + company.getName());
        System.out.println("В " + itDept.getName() + " сотрудников: " + itDept.getEmployeeCount());
    }
}
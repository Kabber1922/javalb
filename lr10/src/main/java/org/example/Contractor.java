package org.example;

public class Contractor extends Employee {
    public Contractor(String fullName, String position, double salary) throws SalaryException {
        super(fullName, position, salary);
    }

    @Override
    public double calculatePay() {
        try {
            return getSalary() * 1.3; // +30%
        } catch (Exception e) {
            System.out.println("Ошибка при расчете зарплаты контрактника: " + e.getMessage());
            return 0;
        }
    }
}
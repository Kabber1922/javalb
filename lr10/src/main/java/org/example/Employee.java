package org.example;

public class Employee {
    private String fullName;
    private String position;
    private double salary;

    public Employee(String fullName, String position, double salary) throws SalaryException {
        if (salary < 0) {
            throw new SalaryException("Невозможно создать сотрудника – указан отрицательный оклад: " + salary);
        }
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
    }

    public double calculatePay() {
        return salary;
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) throws SalaryException {
        if (salary < 0) {
            throw new SalaryException("Оклад не может быть отрицательным: " + salary);
        }
        this.salary = salary;
    }
}
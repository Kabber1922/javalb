package org.example;

public class Staff extends Employee {
    private double bonus;

    public Staff(String fullName, String position, double salary, double bonus)
            throws SalaryException, BonusException {
        super(fullName, position, salary);
        if (bonus < 0) {
            throw new BonusException("Премия не может быть отрицательной: " + bonus);
        }
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        try {
            if (bonus < 0) {
                throw new BonusException("Премия отрицательная!");
            }
            return getSalary() + bonus;
        } catch (BonusException e) {
            System.out.println("ОШИБКА в расчете зарплаты: " + e.getMessage());
            return getSalary();
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
            return 0;
        }
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) throws BonusException {
        if (bonus < 0) {
            throw new BonusException("Премия не может быть отрицательной: " + bonus);
        }
        this.bonus = bonus;
    }
}
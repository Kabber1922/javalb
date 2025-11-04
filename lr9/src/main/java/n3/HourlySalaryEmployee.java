package n3;

class HourlySalaryEmployee extends Employee {
    private static final double HOURS_PER_MONTH = 20.8 * 8; // 166.4 ч
    private final double monthlySalary;

    public HourlySalaryEmployee(String fullName, double monthlySalary) {
        super(fullName);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getMonthlySalary() {
        return monthlySalary;
    }


    public double getHourlyRate() {
        return monthlySalary / HOURS_PER_MONTH;
    }
}
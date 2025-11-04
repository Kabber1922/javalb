package n3;

class FixedSalaryEmployee extends Employee {
    private final double fixedSalary;

    public FixedSalaryEmployee(String fullName, double fixedSalary) {
        super(fullName);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getMonthlySalary() {
        return fixedSalary;
    }
}
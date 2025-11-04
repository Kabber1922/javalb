package n3;

abstract class Employee {
    private static int counter = 1;
    private final int id;
    protected String fullName;

    public Employee(String fullName) {
        this.fullName = fullName;
        this.id = counter++;
    }

    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public abstract double getMonthlySalary();
}
package org.example;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getEmployeeCount() { return employees.size(); }
}
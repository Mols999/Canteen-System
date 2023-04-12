package com.example.canteensystem;

public class Employee {
    private int employeeId;
    private String name;
    private double balance;

    public Employee(int employeeId, String name, double balance) {
        this.employeeId = employeeId;
        this.name = name;
        this.balance = balance;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

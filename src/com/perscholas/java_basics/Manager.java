package com.perscholas.java_basics;

public class Manager extends Employee {
    public Manager() {

    }

    public Manager(int employeeId, String employeeName, String employeeAddress, int employeePhone, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    @Override
    public double calculateTransportAllowance() {
        double transportAllowance = .15 * basicSalary;
        return transportAllowance;
    }
}

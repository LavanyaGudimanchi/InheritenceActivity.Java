package com.perscholas.java_basics;

public class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    int employeePhone;
    double basicSalary;
    double specialAllowance=250.0;
    double hra=1000.50;
    public Employee(){} //Default constructor

    public Employee(int employeeId, String employeeName,   String employeeAddress,   int employeePhone)
    {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeAddress=employeeAddress;
        this.employeePhone=employeePhone;
    }

public double calculateSalary(){
        double salary;
      return  salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
}
public double calculateTransportAllowance(){
          double transportAllowance= .1 *basicSalary;
          return transportAllowance;


}



}

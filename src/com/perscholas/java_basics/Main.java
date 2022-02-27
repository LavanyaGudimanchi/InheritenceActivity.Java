package com.perscholas.java_basics;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Employee employeeManager=new Manager(126534,"Peter","Chennai, India",
                23450,65000);
      double totalSalary=employeeManager.calculateSalary();

        System.out.println("Manager Total Salar is: " + totalSalary);

       double empManagertransportAllowance= employeeManager.calculateTransportAllowance();

        System.out.println("Employee Manager Transport Allowance is: "+ empManagertransportAllowance);


        Employee traineeEmployee=new Trainee(29846,"Jack","Mubai,India",
                442085,45000);

        double totalTraineeSalary=traineeEmployee.calculateSalary();
        System.out.println("Trainee total salary is :"+ totalTraineeSalary);
double traineeTotalTransportAlllowance= traineeEmployee.calculateTransportAllowance();
        System.out.println("Transport allowance of trainee is: "+traineeTotalTransportAlllowance);
    }
}

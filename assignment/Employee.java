package com.assignment;
import java.util.Scanner;
public class Employee {
    private double salary;
    private int hours;
    public void getinfo(double salary, int hours){
        System.out.println("Enter your salary");
        Scanner sc = new Scanner(System.in);
        this.salary = sc.nextDouble();
        System.out.println("Enter the number of hours you work");
        this.hours = sc.nextInt();
    }
    public void addSal(){
        if(this.salary<500){
            this.salary = 10 + this.salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public int getHours() {
        return hours;
    }

    public void AddWork(){
        if(hours>6){
            this.salary = this.salary + 5;
        }

    }

    public static void main(String[] args) {
       Employee employee = new Employee();
       employee.getinfo(employee.salary, employee.hours);
       employee.addSal();
       employee.AddWork();
       System.out.println(employee.getSalary());
    }
}

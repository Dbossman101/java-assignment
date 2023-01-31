package com.assignment;
import java.util.Scanner;
public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public void calculateMonthlyInterest(){
        double monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        System.out.println("The monthly interest: "+monthlyInterest);
        savingsBalance = monthlyInterest + savingsBalance;
        System.out.println("Your balance: "+savingsBalance);
    }
    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.03);


        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        SavingsAccount.modifyInterestRate(0.04);

    }
}

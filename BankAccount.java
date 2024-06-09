/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount;

public class BankAccount {
    private String accNum;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
    this.accNum = accountNumber;
    this.balance = balance;
}
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Balance is = " + amount + " Taka into account " + accNum);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew money = " + amount + " Taka from account " + accNum);
        } else {
            System.out.println("Balance is not enough in the account " + accNum);
        }
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("112233445566", 1000);
        account.deposit(2200);
        System.out.println("New balance = " + account.getBalance()+" Taka");
        account.withdraw(580);
        System.out.println("New balance = " + account.getBalance()+" Taka");
    }
}

package br.com.alura.exercises.OO.gettersandsetters.bankaccountexercise;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String cardHolder;

    public void setAccountNumber (String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void bankAccountExercise(){
        Scanner readCustomerInput = new Scanner (System.in);
        System.out.println("Please, enter your account number: ");
        setAccountNumber(readCustomerInput.nextLine());
        System.out.println("Please, enter your name. ");
        setCardHolder(readCustomerInput.nextLine());
        System.out.println("Hello! " + cardHolder);
        BankAccountMenu displayMenu = new BankAccountMenu();
        displayMenu.displayMenu();
    }
}

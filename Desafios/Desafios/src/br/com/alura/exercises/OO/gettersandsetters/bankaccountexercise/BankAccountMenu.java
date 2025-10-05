package br.com.alura.exercises.OO.gettersandsetters.bankaccountexercise;

public class BankAccountMenu {

    private String welcomeText = """
            Welcome!
            Please, select an option from the menu.\n""";
    private String menuOption1 = "Balance\n";
    private String menuOption2 = "Account Information\n";
    private String menuOption3 = "Deposit\n";
    private String menuOption4 = "Withdraw\n";

    public void displayMenu (){
        System.out.println(welcomeText + menuOption1 + menuOption2 + menuOption3 + menuOption4 );
    }

}

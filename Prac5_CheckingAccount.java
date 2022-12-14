/*   ID   : 21CE027
     Name : Fachara Raj
     Aim  : According to question no 1, the Account class was defined to model a bank account. 
            An account has the properties account number, balance, annual interest rate, and date 
            created, and methods to deposit and withdraw funds. Create two subclasses for 
            checking and saving accounts. A checking account has an overdraft limit, but a 
            savings account cannot be overdrawn.
*/

public class Prac5_CheckingAccount extends Prac1_Account {

    double overdraftLimit = 1000;
    @Override
    public void withdraw(double amt) {
        if(amt<=getBalance()+overdraftLimit)
            super.withdraw(amt);
        else
            System.out.println("Overdraft limit exceeds.");
    }
    
}
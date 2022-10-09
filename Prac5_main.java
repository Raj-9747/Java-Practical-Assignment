/*   ID   : 21CE027
     Name : Fachara Raj
     Aim  : According to question no 1, the Account class was defined to model a bank account. 
            An account has the properties account number, balance, annual interest rate, and date 
            created, and methods to deposit and withdraw funds. Create two subclasses for 
            checking and saving accounts. A checking account has an overdraft limit, but a 
            savings account cannot be overdrawn.
*/

public class Prac5_main {
    public static void main(String[] args) {
        Prac5_SavingAccount s = new Prac5_SavingAccount();
        System.out.println("***Saving Account***");
        s.setBalance(1000);
        s.withdraw(200);
        System.out.println("Balance = "+s.getBalance());

        Prac5_CheckingAccount c = new Prac5_CheckingAccount();
        System.out.println("***Checking Account***");
        c.setBalance(1000);
        c.withdraw(100);
        System.out.println("Balance = "+c.getBalance());
    }
}
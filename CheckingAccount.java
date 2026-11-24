import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckingAccount implements HasMenu{

    double balance=0;
    
    Scanner input = new Scanner(System.in);
    
    public void CheckingAccount(){
        
    }
    public void CheckingAccount(double balance){
        
        this.balance=balance;
    }  
    
    
    public String menu(){
        System.out.println("Account Menu");
        System.out.println();
        System.out.println("0) Exit");
        System.out.println("1) Check Balance");
        System.out.println("2) Make Withdrawal");
        System.out.println("3) Make Deposit");
        System.out.println();
        System.out.println("Enter choice");
        
        try {
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Checking balance...\n Balance: $");
                return getBalanceString();

            } else if (choice == 2) {
                System.out.println("How much do you want to withdraw?\n Enter: $");
                double amount = input.nextDouble();
                System.out.print("Withdrawing $" + amount);
                makeWithdraw(amount);

            } else if (choice == 3) {
                System.out.println("How much do you want to deposit?\n Enter: $");
                double amount = input.nextDouble();
                System.out.print("Depositing $" + amount);
                makeDeposit(amount);

            } else if (choice == 0) {

            }
        }catch (InputMismatchException e){
            System.out.println("Invalid Input");
        }
        return null;
    }
    public void start(){
        menu();

    }
    public double getBalance(){
        
        return balance; //temporary
    }
    
    public String getBalanceString(){
        
        return String.valueOf(getBalance()); //temporary
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void checkBalance(){
        
    }
    private double getDouble(){
        
        return 0.0;//balance(); //temporary
    }
    public void makeDeposit(double amount){
        balance+=amount; 
    
    }
    public void makeWithdraw(double amount){
        balance-=amount;
        
    }
    public static void main(String[] args) {
        
        CheckingAccount account = new CheckingAccount();
        System.out.println(account.menu());
        account.start();
        account.CheckingAccount();
        account.checkBalance();
        
    }
}

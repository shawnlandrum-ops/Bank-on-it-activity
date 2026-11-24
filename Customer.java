import java.util.Scanner;

public class Customer extends User {
    
    Scanner input = new Scanner(System.in);
    CheckingAccount checking = new CheckingAccount();
    SavingsAccount savings = new SavingsAccount();
    
    public Customer(){
        this.userName = "Alice";
        this.PIN = "1111";
    }
    public Customer(String userName, String PIN){
        
    }
    public void start(){
        
        menu();
    }
    public String menu(){
        System.out.println("Customer Menu");
        System.out.println();
        System.out.println("0) Exit");
        System.out.println("1) Checking Account");
        System.out.println("2) Savings Account");
        System.out.println("3) Get Report");
        System.out.println();
        System.out.println("Enter: ");
        String choice = input.nextLine();
        if (choice.equals("1")){
            checking.start();
            
        }   else if (choice.equals("2")){
            savings.start();
            
        }   else if (choice.equals("3")){
            getReport();
            
        }   else if (choice.equals("0")){
            return null;
        }
        return null; //temporary
    }
    public void changePIN(){
        System.out.println("Enter new PIN: ");
        String newPIN = input.nextLine();
        setPIN(newPIN);
        
    }
    public String getReport(){
        
        return getReport(); //temporary
    }
    
    public void main(String[] args) {
        Customer customer = new Customer();
        //customer.savings.start();
        start();
        //Customer customer = new Customer("Alice", "0000");
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Bank{
    Admin admin = new Admin();
    ArrayList customers = new ArrayList();
    
    public Bank(){
        
    }
    
    public void loadSampleCustomers(){
        Customer customer1 = new Customer("Alice","1111");
        Customer customer2 = new Customer("Bob","2222");
        Customer customer3 = new Customer("Chris","3333");
        
    }

    public void saveCustomers(){

    }

    public void loadCustomers(){
        for (Object customer : customers) {
            System.out.println(customer);
        }
        

    }

    public void reportAllUsers(){
        for (Object customer : customers) {                   
            System.out.println(customer);//temporary
        }

    }

    public void addUser(){
        customers.add(customers);

    }
    public void applyInterestRate(){
        for (Object customer : customers) {
            
        }
    }
    public void loginAsCustomer(){
        Customer customer = new Customer();
        customer.login();
        customer.start();

    }
    
    public String menu(){
        Scanner input = new Scanner(System.in);
        //System.out.println("Welcome to Bank");
        String choice="";
        System.out.println("Bank Menu\n" +
                "\n" +
                "0) Exit system\n" +
                "1) Login as admin\n" +
                "2) Login as customer\n" +
                "\n" +
                "Action:");
        choice = input.nextLine();
        if (choice.equals("2")){
            loginAsCustomer();
        } else if(choice.equals("1")){
            startAdmin();
        } else if (choice.equals("0")) {
            return null;
        }
        return null;
    }
    
    public void start(){
        
        menu();
    } 
    
    public void startAdmin(){
        admin = new Admin();
        admin.start();
        //admin.login();
    }
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.start();
    }
    
    
}

public class Admin extends User {
    
    public Admin(){
        this.userName = "admin";
        this.PIN = "0000";
    }
    public Admin(String userName, String PIN){
        
    }
    public String menu(){
        String choice="";
        
        System.out.println("Admin Menu");
        System.out.println();
        System.out.println("0) Exit");
        System.out.println("1) Ful customer report");
        System.out.println("2) Add user");
        System.out.println("3) Apply interest to savings accounts");
        System.out.println();
        System.out.println("Enter Choice:");
        try{
            choice=input.nextLine();
            if (choice.equals("1")){
                getReport();
            }   else if(choice.equals("2")){
                String newUserUsername="";
                String newUserPIN="";
                setUserName(input.nextLine());
                setPIN(input.nextLine());
            }   else if(choice.equals("3")){
                
            }   else if(choice.equals("0")){
                return null;
            }
            
        } catch(Exception e){
            System.out.println("invalid input");
        }
        
        return null;  // temporary
    }
    public void start(){
        login();
        menu();
    }
    public String getReport(){
        
        return getReport();   // temporary
    }
}

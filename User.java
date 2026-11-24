import java.io.Serializable;
import java.util.Scanner;

public abstract class User implements HasMenu, Serializable {
  
  Scanner input = new Scanner(System.in);
  String userName;
  String PIN;
  
  public boolean login(){
    System.out.println("Please enter user name and password:");
    System.out.print("  Username: ");
    String inputUserName=input.nextLine();
    System.out.print("  Password: ");
    String inputPIN=input.nextLine();
    return login(inputUserName,inputPIN);
  }
  public boolean login(String userName, String PIN){
    if(userName.equals(this.userName) && PIN.equals(this.PIN)){
      return true;

    }else {
      return false;
    }
  }
  public void setUserName(String userName){
    
    this.userName = userName;
  }
  public String getUserName(){
    
    return userName;
  }
  public void setPIN(String PIN){
    
    this.PIN = PIN;
  }
  public String getPIN(){
    
    return PIN;
  }
  public abstract String getReport();
  
  
}

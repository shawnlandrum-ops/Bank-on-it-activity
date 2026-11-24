public class SavingsAccount extends CheckingAccount {
    
    double InterestRate = 0.03;
    
    
    public void calcInterest(){
        double interest=balance*InterestRate;
        balance+=interest;
        System.out.println("Your balance is "+balance);
    }
    public void setInterestRate(double rate){
        
        this.InterestRate = rate;
    }
    public double getInterestRate(){
        
        return InterestRate;
    }

    public static void main(String[] args){
        SavingsAccount s=new SavingsAccount();
        s.CheckingAccount(2500);
        s.calcInterest();

    }
}
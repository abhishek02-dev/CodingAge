package Java_Practise_Set;

public class BankLoan {
String loanType;
double loanAmount;
double interestRate;
int tenure;

    public BankLoan(String loanType, double loanAmount, double interestRate, int tenure) {
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.tenure = tenure;
    }

    void applyForLoan(double amount){
this.loanAmount=amount;
        System.out.println("Applied loan Amount :"+this.loanAmount);
}
void updateInterestRate(double newRate){
 this.interestRate=newRate;
    System.out.println("Interest rate is updated so the new rate is :"+this.interestRate);
}
void LoanDetails(){
    System.out.println("Loan Type :"+loanType);
    System.out.println(("Loan amount :"+loanAmount));
    System.out.println("Interest rate :"+interestRate);
    System.out.println("Total tenure :"+tenure);
}
    public static void main(String[] args) {
        BankLoan b = new BankLoan("Bike Loan",12000,7.5,2);
        b.LoanDetails();
        b.updateInterestRate(8);
        b.applyForLoan(10000);
        b.LoanDetails();

    }
}

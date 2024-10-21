package Java_2ndPractise_Set;


public class Payment {

    public void makePayment(){
        System.out.println("Processing Payment");
    }
}
class CreditCard_Payment extends Payment{
    public  void makePayment(){
        System.out.println("Processing credit card payment.");
    }
}
class Cash_Payment extends Payment{
    public  void makePayment(){
        System.out.println("Processing cash payment.");
    }
}
class Pay{
    public static void main(String[] args) {
        Payment [] payments = new Payment[2];
        payments[0]=new CreditCard_Payment();
        payments[1]=new Cash_Payment();
        for (int i = 0; i <2 ; i++) {
            payments[i].makePayment();
        }
    }
}

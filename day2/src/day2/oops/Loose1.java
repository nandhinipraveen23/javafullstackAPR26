package day2.oops;

interface Payment{
public abstract	void pay(double amount);
}
class CreditCardPaymentt implements Payment {
	public void pay(double amount)
	{
		System.out.println("im creditcard  mode: "+amount);
	}
}
class gPayPaymentt implements Payment{
	public void pay(double amount)
	{
		System.out.println("im gPay mode  : "+amount);
	}
}
public class Loose1 {

	public static void main(String[] args) {
		 Payment payment;
		 
		 payment  = new CreditCardPaymentt();
		 payment.pay(12000);
		 
		 payment  = new gPayPaymentt();
		 payment.pay(20000);
		 
		 

	}

}

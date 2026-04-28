package day2.oops;


class CreditCardPayment{
	public void pay(double amount)
	{
		System.out.println("im creditcard  mode: "+amount);
	}
}
class gPayPayment{
	public void pay(double amount)
	{
		System.out.println("im gPay mode  : "+amount);
	}
}

class UpiPayment{
	public void pay(double amount)
	{
		System.out.println("im Upi mode  : "+amount);
	}
}
public class TightlyExample {

	public static void main(String[] args) {
		 
		CreditCardPayment c = new CreditCardPayment();
		c.pay(1000);
		
		gPayPayment g = new gPayPayment();
		g.pay(2000);
		
		UpiPayment u = new UpiPayment();
		u.pay(2300);
	}

}

package PrincipleOfOops;

public class BankDriver {
  public static void main(String args[])
  {
	  Bank b1=new Bank("IDBI","Nikita",1213232442l,"23rwef43",2234,234234234l,4234324234l);

	  
	  GooglePay gpay=new GooglePay("nikita@idbi", 1234,1213232442l, "IDBI", 2234, 1234545l, 234234234l, 123,
			"nikitaphapale@gmaul.com", "10/10/10",b1);
	  gpay.displayGooglePay();
	  gpay.upi.acc.displayBank();
	  gpay.upi.displayUPI();
	 
  }
}

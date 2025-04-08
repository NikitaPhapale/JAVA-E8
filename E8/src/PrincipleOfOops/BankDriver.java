package PrincipleOfOops;

public class BankDriver {
  public static void main(String args[])
  {
	  Bank b1=new Bank("IDBI","Nikita",1213232442l,"23rwef43",2234);
	  b1.credit(1213232442l, 2234, 200);
	 System.out.println( b1.getBalance(1213232442l, 2234));
	 b1.debit(1213232442l, 2234, 122);
	 System.out.println( b1.getBalance(1213232442l, 2234));
	 System.out.println(b1.getUserName());
	 
  }
}

package PrincipleOfOops;

public class UPI {
	String upiId;
	int upiPin;
	String bank;
	int bankPin;
	long phno;
	Bank acc;
	
	UPI(String upiId,int upiPin,String bank,int bankPin,long phno,Bank ref)
	{
		this.upiId=upiId;
		this.upiPin=upiPin;
		this.bank=bank;
		this.bankPin=bankPin;
		this.phno=phno;
		acc=ref;
		System.out.println("UPI linked");
		
	}
	public void displayUPI()
	{
		System.out.println(upiId);
		System.out.println(upiPin);
		System.out.println(bank);
		System.out.println(bankPin);
		System.out.println(phno);
		System.out.println("++++++++++++");
	}
}

package PrincipleOfOops;

public class GooglePay {
	String upiId;
	int upiPin;
	long accno;
	String bank;
	int bankPin;
	long cardNo;
	long phno;
	int cvv;
	String email;
	String expireDate;
	
	UPI upi;
	public GooglePay(String upiId, int upiPin, long accno, String bank, int bankPin, long cardNo, long phno, int cvv,
			String email, String expireDate,Bank ref) {
	
		this.upiId = upiId;
		this.upiPin = upiPin;
		this.accno = accno;
		this.bank = bank;
		this.bankPin = bankPin;
		this.cardNo = cardNo;
		this.phno = phno;
		this.cvv = cvv;
		this.email = email;
		this.expireDate = expireDate;
		
		
		if(validate(ref,accno, phno, bank,bankPin)) {
			upi=new UPI(upiId,upiPin,bank,bankPin,phno,ref);
			System.out.println("donne upi");
		}
		System.out.println("google pay opened!");
		
	}
	public void displayGooglePay()
	{
		System.out.println("UPi:"+upiId);
		System.out.println("bank:"+bank);
		System.out.println("card no:"+cardNo);
		System.out.println("account num:"+accno);
		System.out.println("phno:"+phno);
		System.out.println("*****************");
		
	}
	public boolean validate(Bank ref,long accno,long phno,String bank,int pin)
	{
		if(ref.getBankName()==bank && ref.getaccNo()==accno && ref.getphno()==phno && 
				ref.getPin()==pin)
		{
			return true;
		}
		return false;
	}
	
	
	
}


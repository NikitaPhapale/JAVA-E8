package PrincipleOfOops;

public class Bank {
	private String bankName;
	private String userName;
	private long accNo;
	private String ifsc;
	private int pin;
	private double balance;
	private long phno;
	private long addharno;
//	UPI upi;
	
	Bank(String bankName,String username,long accNo,String ifsc,int pin,long phno,long addharno)
	{
		this.bankName=bankName;
		this.accNo=accNo;
		userName=username;
		this.ifsc=ifsc;
		this.pin=pin;
		this.phno=phno;
		this.addharno=addharno;
		System.out.println("Bank Account Created!");;
	}
	public String getBankName()
	{
		return bankName;
	}
	public String getUserName()
	{
		return userName;
	}
	public long getaccNo()
	{
		return accNo;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public int getPin()
	{
		return pin;
	}
	public void setPin(long accNo,int oldPin ,int newPin)
	{
		if(this.accNo==accNo && pin==oldPin)
		{
			pin=newPin;
			System.out.println("New Pin Updated");
		}
		else
		{
			System.out.println("Invalid Credentials");
		
		}
	}
	public double getBalance(long accNo,int pin)
	{
		if(this.accNo==accNo && this.pin==pin)
		{
			return balance;
			
		}
		else
		{
			System.out.println("Invalid Credentials");
			return 0;
		}
		
	}
	public void credit(long accNo,int pin,double amt)
	{
		if(this.accNo==accNo && this.pin==pin)
		{
			if(amt>0) 
			{
				balance+=amt;
				System.out.println("Amount Credited");
			}
			else
			{
				System.out.println("Invalid Amount");
			}
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	public void debit(long accNo,int pin,double amt)
	{
		if(this.accNo==accNo && this.pin==pin)
		{
			if(amt>0)
			{
				if(balance>=amt)
				{
					balance-=amt;
					System.out.println("Amount debited");
				}
				else
				{
					System.out.println("Insuffientient balance");
				}
			
			}
			else
			{
				System.out.println("Invalid amount");
			}
			
		}
		else
		{
			System.out.println("Invalid credentials");
		}
	}
	public long getphno()
	{
		return phno;
	}
	public void setphno(long addharno,long newPhno)
	{
		if(this.addharno==addharno)
		{
			phno=newPhno;
			System.out.println("Phone number changed!");
		}
		else
		{
			System.out.println("Invalid Addhar");
		}
	}
	public long getAddhar()
	{
		return addharno;
	}
	
	public void displayBank()
	{
		
		System.out.println("Bank Name:"+bankName);
		System.out.println("Username:"+userName);
		System.out.println("account number:"+accNo);
		System.out.println("ifsc:"+ifsc);
		System.out.println("bank pin:"+pin);
		System.out.println("balance:"+balance);
		System.out.println("phno:"+phno);
		System.out.println("addhar:"+addharno);
		System.out.println("_____________");
	}
	
//	public void registerUpi(String upiId,int upiPin) {
//		upi=new UPI(upiId,upiPin,bankName,pin,phno,this);
//		System.out.println("UPI account created");
//		
//	}
}

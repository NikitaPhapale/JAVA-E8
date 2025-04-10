package PrincipleOfOops;

public class Bank {
	private String bankName;
	private String userName;
	private long accNo;
	private String ifsc;
	private int pin;
	private double balance;
	
	Bank(String bankName,String username,long accNo,String ifsc,int pin)
	{
		this.bankName=bankName;
		this.accNo=accNo;
		userName=username;
		this.ifsc=ifsc;
		this.pin=pin;
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
	
}

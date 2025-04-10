package PrincipleOfOops;

public class Refill {

	String color;
	double size;
	String type;
	
	public Refill()
	{
		
	}
	 
	Refill(String color,double size,String type)
	{
		this.color=color;
		this.size=size;
		this.type=type;
		System.out.println("Refill Created!");
	}
	
	public void displayRefill()
	{
		System.out.println(color);
		System.out.println(type);
		System.out.println(size);
	}
	
}

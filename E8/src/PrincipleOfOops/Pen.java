package PrincipleOfOops;

public class Pen {

	String type;
	double price;
	String brand;
	Refill ref;
	
	public Pen() {}
	
	Pen(String brand,double price,String type,String color,double size,String refType)
	{
		ref=new Refill(color,size,refType);
		this.brand=brand;
		this.price=price;
		this.type=type;
		System.out.println("Pen Created!");
	}
	
	public void displayPen()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(type);
	}
	
}

package PrincipleOfOops;

public class Computer {

	String brand;
	double weight;
	double size;
	double price;

	Ram r1;
	Rom r2;
	Processor c1;
	
	public Computer(){
		
	}
	
	Computer(String brand, double weight,double size,double price,
			double ramSpeed,double ramCapacity,String romType,String processorBrand,double processorVersion,
			 double processorSpeed,double cacheSize)
	{
		r1=new Ram(ramSpeed,ramCapacity);
		r2=new Rom(romType);
		c1=new Processor(processorBrand,processorVersion,processorSpeed,cacheSize);
		this.brand=brand;
		this.weight=weight;
		this.size=size;
		this.price=price;
		System.out.println("Computer doone!");
		
	}
	public void displayComputer()
	{
		System.out.println(brand);
		System.out.println(weight);
		System.out.println(size);
		System.out.println(price);
		
	}
	
}

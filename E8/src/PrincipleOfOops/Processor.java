package PrincipleOfOops;

public class Processor {

	String brand;
	double version;
	double speed;
	double cacheSize;
	
	public Processor() {
		
	}
	Processor(String brand,double version,double speed,double cacheSize)
	{
		this.brand=brand;
		this.version=version;
		this.speed=speed;
		this.cacheSize=cacheSize;
		System.out.println("Processor done!");
	}
	
	public void displayProcessor()
	{
		System.out.println(brand);
		System.out.println(version);
		System.out.println(speed);
		System.out.println(cacheSize);
	}
	
}

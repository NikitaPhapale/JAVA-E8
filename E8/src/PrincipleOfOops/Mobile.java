package PrincipleOfOops;

public class Mobile {
    String brand;
    String name;
    double price;
    String type;
    Sim s1;
    
    public Mobile()
    {
    	
    }
    Mobile(String brand,String name,double price,String type)
    {
    	this.brand=brand;
    	this.price=price;
    	this.name=name;
    	this.type=type;
    	System.out.println("MObile done");
    	
    }
    
    public void insertSim(String sp,String nt,String type,long simNo)
    {
    	s1=new Sim(sp,nt,type,simNo);
    	System.out.println("Sim Inserted");
    	
    }
    
    public void displayMobile()
    {
    	System.out.println(brand);
    	System.out.println(price);
    	System.out.println(name);
    	System.out.println(type);
    }
}

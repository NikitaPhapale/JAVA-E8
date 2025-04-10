package PrincipleOfOops;

public class Sim {

	String serviceProvider;
	String networkType;
	String type;
	long simNo;
	
	public Sim()
	{
		
	}
	Sim(String sp,String nt,String type,long simNo)
	{
		serviceProvider=sp;
		networkType=nt;
		this.type=type;
		this.simNo=simNo;
		
	}
	public void displaySim()
	{
		System.out.println(serviceProvider);
		System.out.println(networkType);
		System.out.println(type);
		System.out.println(simNo);
	}
	
	
}

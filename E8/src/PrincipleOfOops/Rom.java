package PrincipleOfOops;

public class Rom {
	String type;
	
	public Rom() {
		
	}
	Rom(String type)
	{
		this.type=type;
		System.out.println("ROM done");
	}
	
	public void displayRom()
	{
		System.out.println(type);
	}
	
}

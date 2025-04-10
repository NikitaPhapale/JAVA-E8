package PrincipleOfOops;

public class PenDriver {
	public static void main(String args[])
	{
		Pen p1=new Pen("Flair",10,"Gel pen","Blue",5.0,"Gel Point");
		p1.displayPen();
		p1.ref.displayRefill();
	}
}

package PrincipleOfOops;

public class MobileDriver {
  public static void main(String[] args) {
	Mobile m1=new Mobile("Samsung","s 23",150000.0,"5G");
	m1.displayMobile();
	m1.insertSim("jio", "5G", "prepaid",23443423233l);
	m1.s1.displaySim();
}
}

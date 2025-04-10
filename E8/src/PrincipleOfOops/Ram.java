package PrincipleOfOops;

public class Ram {
   double ramSpeed;
   double ramCapacity;
   
   public Ram() {
	   
   }
   
   Ram(double speed,double capacity)
   {
	   ramSpeed=speed;
	   ramCapacity=capacity;
	   System.out.println("Ram Created!");
   }
   
   public void displayRam()
   {
	   System.out.println(ramSpeed);
	   System.out.println(ramCapacity);
   }
   
}

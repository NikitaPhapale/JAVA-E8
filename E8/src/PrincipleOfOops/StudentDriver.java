package PrincipleOfOops;

public class StudentDriver {
	
		public static void main(String args[])
		{
			Student s1=new Student("Nikita","Java full stack","Deccan",0.0,"BE",8.88,86.60,91.00,9876543210l);
			System.out.println(s1.getBranch());
			s1.setBranch(true, "Pune");
			System.out.println(s1.getBranch());
		}

}

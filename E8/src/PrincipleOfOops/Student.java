package PrincipleOfOops;

public class Student {
	private String name;
	private String clgName;
	private String course;
	private int age;
	
	Student(String name,String college,String course,int age)
	{
		this.name=name;
		clgName=college;
		this.course=course;
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}

	public String getClg()
	{
		return clgName;
	}
	public String getCourse()
	{
		return course;
	}
	public int getAge()
	{
		return age;
	}
	
}


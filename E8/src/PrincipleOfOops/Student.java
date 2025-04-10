package PrincipleOfOops;

public class Student {
	private String institute="Qspiders";
	private String name;
	private String course;
	private String branch;
	private double fees ;
	private String degree;
	private double cgpa;
	private double sscPer;
	private double hscPer;
	private long phno;
	
	Student(String name,String course,String branch,double fees,
			String degree,double cgpa ,double sscPer,double hscPer,long phno)
	{
		this.name=name;
		this.course=course;
		this.branch=branch;
		this.fees=fees;
		this.degree=degree;
		this.cgpa=cgpa;
		this.sscPer=sscPer;
		this.hscPer=hscPer;
		this.phno=phno;
	}
	
	
	public String getName()
	{
		return name;
	}

	public String getCourse()
	{
		return course;
	}
	public String getBranch()
	{
		return branch;
	}
	public void setBranch(boolean permission,String branch)
	{
		if(permission)
		{
			this.branch=branch;
			System.out.println("Branch changed");
		}
		else
		{
			System.out.println("Permission denied");
		}
	}
	public double getFees()
	{
		return fees;
	}
	public String getDegree()
	{
		return degree;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	public double getSscPer()
	{
		return sscPer;
	}
	public double getHscPer()
	{
		return hscPer;
	}
	public long getPhno()
	{
		return phno;
	}
	
	public void setPhno(boolean id,long phno)
	{
		if(id)
		{
			this.phno=phno;
			System.out.println("Phone number updated!");
		}
		else
		{
			System.out.println("Invalid documents");
		}
	}
	
}


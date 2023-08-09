import java.util.Scanner;
class Emp
{
	String name;
	String dept;
	double sal;
	Scanner sc=new Scanner(System.in);
	Emp()
	{
		
	}
	{
		System.out.println("name");
		name=sc.nextLine();
		System.out.println("dept");
		dept=sc.nextLine();
		System.out.println("sal");
		sal=sc.nextInt();
	}
	public void display()
	{
		System.out.println("name : "+name);
		System.out.println("dept : "+dept);
		System.out.println("sal : "+sal);
	}
	public static void main(String[] args) 
	{
		Emp c1=new Emp();
		Emp c2=new Emp();
		Emp c3=new Emp();
		Emp c4=new Emp();
		Emp c5=new Emp();
		if (c1.sal>=1000.0)
		{
			c1.display();
		}
		if (c2.sal>=1000.0)
		{
			c2.display();
		}
		if (c3.sal>=1000.0)
		{
			c3.display();
		}
		if (c4.sal>=1000.0)
		{
			c4.display();
		}
		if (c5.sal>=1000.0)
		{
			c5.display();
		}

	}	
}
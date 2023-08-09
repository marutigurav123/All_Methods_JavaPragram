import java.util.Scanner;
class Pen
{
	String name;
	String color;
	int price;
	Scanner sc=new Scanner(System.in);
	{
		System.out.println("enter the name");
		name=sc.nextLine();
		System.out.println("enter the color");
		color=sc.nextLine();
		System.out.println("enter the price");
		iprice=sc.nextInt();
	}
	Pen()
	{
		
	}
	public void displayPen()
	{
			System.out.println("name : "+name);
			System.out.println("color : "+color);
			System.out.println("price : "+price);
	}
	public static void main(String[]args)
	{
		Pen p1=new Pen();
		Pen p2=new Pen();
		Pen p3=new Pen();
		if (p1.price>=10)
		{
			p1.displayPen();
		}
		if (p2.price>=10)
		{
			p2.displayPen();
		}
		if (p3.price>=10)
		{
			p3.displayPen();
		}
	}
}

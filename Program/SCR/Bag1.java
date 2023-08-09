import java.util.Scanner;
class Bag1 
{
	Pen1 p;
	Scanner sc=new Scanner(System.in);
	public void addPen()
	{
		if (p==null)
		{
			System.out.println("Enter pen name");
			String name=sc.next();
			System.out.println("Enter pen color");
			String color=sc.next();
			System.out.println("Enter laptop price");
			double price=sc.nextDouble();
			p=new Pen1(name,color,price);
			System.out.println("Pen is stored");
		}
		else
		{
			System.out.println("Pen already exist");
		}
	}
	public void removePen()
	{
		if (p!=null)
		{
			p=null;
			System.out.println("pen is removed");
		}
		else
		{
			System.out.println("Bag is empty");
		}
	}
	public void displayPen()
	{
		if (p==null)
		{
			System.out.println("add a pen");
		}
		else
		{
			System.out.println(p.name);
			System.out.println(p.color);
			System.out.println(p.price);
		}
	}
	public static void main(String[] args) 
	{
		Bag1 b=new Bag1();
		for (; ; )
		{
			System.out.println("1.add 2.remove 3.display 4.exit");
			switch (b.sc.nextInt())
			{
				case 1:
					{
						b.addPen();
						break;
					}
				case 2:
					{
						b.removePen();
						break;
					}
				case 3:
					{
						b.displayPen();
						break;
					}
				case 4:
					{
						System.exit(0);
					}
			}
		}
	}
}
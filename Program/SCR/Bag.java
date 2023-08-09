import java.util.Scanner;
class Bag 
{
	Laptop2 l;
	Scanner sc=new Scanner(System.in);
	public void addLaptop()
	{
		if (l==null)
		{
			System.out.println("Enter laptop name");
			String name=sc.next();
			System.out.println("Enter laptop price");
			double price=sc.nextDouble();
			l=new Laptop2(name,price);
			System.out.println("Laptop is stored");
		}
		else
		{
			System.out.println("laptop already exist");
		}
	}
	public void removeLaptop()
	{
		if (l!=null)
		{
			l=null;
			System.out.println("Laptop is removed");
		}
		else
		{
			System.out.println("Bag is empty");
		}
	}
	public void displayLaptop()
	{
		if (l==null)
		{
			System.out.println("add a laptop");
		}
		else
		{
			System.out.println(l.name);
			System.out.println(l.price);
		}
	}
	public static void main(String[] args) 
	{
		Bag b=new Bag();
		for (; ; )
		{
			System.out.println("1.add 2.remove 3.display 4.exit");
			switch (b.sc.nextInt())
			{
				case 1:
					{
						b.addLaptop();
						break;
					}
				case 2:
					{
						b.removeLaptop();
						break;
					}
				case 3:
					{
						b.displayLaptop();
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
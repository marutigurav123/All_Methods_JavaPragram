import java.util.Scanner;
class Book 
{
	String name;
	String author;
	int price;
	Scanner sc=new Scanner(System.in);
	Book()
	{
		
	}
	{
		System.out.println("name");
		name=sc.nextLine();
		System.out.println("author");
		author=sc.nextLine();
		System.out.println("price");
		price=sc.nextInt();
	}
	public void display()
	{
		System.out.println("name : "+name);
		System.out.println("author : "+author);
		System.out.println("price : "+price);
	}
	public static void main(String[] args) 
	{
		Book c1=new Book();
		Book c2=new Book();
		Book c3=new Book();
		Book c4=new Book();
		Book c5=new Book();
		if (c1.price>=100)
		{
			c1.display();
		}
		if (c2.price>=100)
		{
			c2.display();
		}
		if (c3.price>=100)
		{
			c3.display();
		}
		if (c4.price>=100)
		{
			c4.display();
		}
		if (c5.price>=100)
		{
			c5.display();
		}

	}	
}
import java.util.Scanner;
class User 
{
	static String name="Pranav";
	static int age=23;
	static char gender='m';
	static long adhaarNumber=123;
	static int accNumber=8125;
	static String pancard="abc133";
	static double bal=1000;
	static int pass=111;
	static Scanner sc=new Scanner(System.in);
	
	public static void withdraw()
	{
		System.out.println("enter accno");
		if (sc.nextInt()==accNumber)
		{
			System.out.println("enter pass");
			if (sc.nextInt()==pass)
			{
				double balance=sc.nextDouble();
				if (balance<=bal)
				{
					bal-=balance;
					System.out.println("Collect the cash");
				}
				else
				{
					System.out.println("insufficient balance");
				}

			}
			else
			{
				System.out.println("Invalid password");
			}
		}
		else
		{
			System.out.println("Invalid account number");
		}
	}
	public static void deposit()
	{
		System.out.println("enter accno");
		if (sc.nextInt()==accNumber)
		{
				bal+=sc.nextInt();
				System.out.println("amount deposited");
		}
		else
		{
			System.out.println("Invalid account number");
		}
	}
	public static void checkBalance()
	{
		System.out.println("enter accno");
		if (sc.nextInt()==accNumber)
		{
			System.out.println("enter pass");
			if (sc.nextInt()==pass)
			{
				System.out.println(bal);
			}
			else
			{
				System.out.println("Invalid password");
			}
		}
		else
		{
			System.out.println("Invalid account number");
		}
	}
}

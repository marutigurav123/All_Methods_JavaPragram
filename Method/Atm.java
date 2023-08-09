import java.util.Scanner;
class Atm 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter account num");
		int account=sc.nextInt();
		System.out.println("Enter amount inside the account");
		double amount=sc.nextDouble();
		System.out.println("Enter password");
		int password=sc.nextInt();
		for (;;)
		{
			System.out.println("1.withdraw");
			System.out.println("2.deposit");
			System.out.println("3.check balance");
			System.out.println("4.pin change");
			System.out.println("5.cancle");
			int choice=sc.nextInt();
			switch (choice)
			{
				case 1:
				{
					System.out.println("enter the account number");
					if (sc.nextInt()==account)
					{
						System.out.println("Enter password");
						int pass=sc.nextInt();
						System.out.println("Enter the amount to be withdrawn");
						double w=sc.nextInt();
						if (pass==password && w<=amount)
						{
							amount-=w;
							System.out.println("amount "+w+" withdrawn");
						}
						else if (pass!=password)
						{
							System.out.println("Invaid Password");
						}
						else if (w>amount)
						{
							System.out.println("insufficient balance");
						}
					}
					else
					{
						System.out.println("invalid account number");
					}
					break;
				}
				case 2:
				{
					System.out.println("enter the account number");
					if (sc.nextInt()==account)
					{
						System.out.println("Enter password");
						int pass=sc.nextInt();
						System.out.println("Enter the amount to be deposited");
						double d=sc.nextInt();
						if (pass==password)
						{
							amount+=d;
							System.out.println(d+" amount deposited");
						}
						else
						{
							System.out.println("Invalid Password");
						}
					}
					else
					{
						System.out.println("invalid account number");
					}
					break;
				}
				case 3:
				{
					System.out.println("enter the account number");
					if (sc.nextInt()==account)
					{
						System.out.println("Enter password");
						if (sc.nextInt()==password)
						{
							System.out.println("Balance ="+amount);
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
					break;
				}
				case 4:
				{
					System.out.println("enter the account number");
					if (sc.nextInt()==account)
					{
						System.out.println("Enter password");
						int pass=sc.nextInt();
						if (pass==password)
						{
							System.out.println("Enter new password");
							int newpass=sc.nextInt();
							System.out.println("Re enter new password");
							int repass=sc.nextInt();
							if (newpass==repass)
							{
								password=newpass;
							}
							else
							{
								System.out.println("Enter correct password");
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
					break;
				}
				case 5:
				{
					System.exit(0);
				}
			}
		}
	}
}
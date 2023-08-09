import java.util.Scanner;
class Atm 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for (; ; )
		{
			System.out.println("1.Withdraw 2.Deposit 3.Check balance 4.Exit");
			switch (sc.nextInt())
			{
				case 1:
				{
					User.withdraw();
					break;
				}
				case 2:
				{
					User.deposit();
					break;
				}
				case 3:
				{
					User.checkBalance();
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

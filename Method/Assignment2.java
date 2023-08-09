import java.util.Scanner;
class Assignment2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if (Methods.evenOrOdd(num))
		{
			boolean a=false;
			boolean b=false;
			int i=num;
			while (i>9)
			{
				int rem1=i%10;
				i/=10;
				int rem2=i%10;
				if (rem1<rem2)
				{
					a=true;
				}
				if (rem1>rem2)
				{
					b=true;
				}
				if (a&&b)
				{
					System.out.println("Its a Bouncy Number");
					return;
				}
			}
			System.out.println("Its a not Bouncy Number");
		}
		else
		{
			if (Methods.palindrome(num))
			{
				System.out.println("it is palindrome");
			}
			else
			{
				System.out.println("it is not palindrome");
			}
		}
	}
}

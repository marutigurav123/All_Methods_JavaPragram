import java.util.Scanner;
class MethodPalindrom 
{
	public static int rev(int num)
	{
		int rev=0;
		for (int i=num;i>0 ;i/=10 )
		{
			rev=rev*10+i%10;
		}
		return rev;
	}
	public static boolean palindrom(int num)
	{
		if (num==rev(num))
		{
			return true;
		}
		return false;
	}
	public static boolean evenOrOdd(int rev)
	{
		if (rev%2==0)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if (palindrom(num))
		{
			
			if (evenOrOdd(num))
			{
				System.out.println("Its an even Palindrom");
			}
			else
			{
				System.out.println("Its an odd Palindrom");
			}
		}
		else 
		{
			System.out.println("Its not an Palindrom");
		}
	}
}
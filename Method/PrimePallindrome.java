import java.util.Scanner;
class PrimePallindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Starting number");
		int start=sc.nextInt();
		System.out.println("Enter the Ending number");
		int end=sc.nextInt();
		for (int i=start;i<=end;i++ )
		{
			if (isPrime(i))
			{
				if (palindrome(i))
				{
					System.out.println(i);
				}
			}
		}
	}
	public static boolean isPrime(int a)
	{
		for (int i=2;i<=a/2 ;i++ )
		{
			if (a%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static int rev(int num)
	{
		int rev=0;
		for (int i=num;i>0 ;i/=10 )
		{
			rev*=10+i%10;
		}
		return rev;
	}
	public static boolean palindrome(int num)
	{
		if (num==rev(num))
		{
			return true;
		}
		return false;
	}
}

import java.util.Scanner;
class TwistedPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int ip=sc.nextInt();
		if (isPrime(ip)&&isPrime(rev(ip)))
		{
			System.out.println("Its a twisted prime number");
		}
		else
		{
			System.out.println("Its not a twisted prime number");
		}

	}
	public static int rev(int num)
	{
		int rev=0;
		for (int i=num;i>0 ;i/=10)
		{
			rev=rev*10+i%10
		}
			return rev;
	}
	public static boolean isPrime(int num)
	{
		for (int i=2;i<=num/2 ;i++ )
		{
			if (num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}

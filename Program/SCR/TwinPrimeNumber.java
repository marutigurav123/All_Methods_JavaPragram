import java.util.Scanner;
class TwinPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int ip1=sc.nextInt();
		int ip2=sc.nextInt();
		if (isPrime(ip1)&&isPrime(ip2))
		{
			if (ip2-ip1==2||ip1-ip2==2)
			{
				System.out.println("Its a twin prime number");
			}
			else
			{
				System.out.println("Its not a twin prime number");
			}
		}
		else
		{
			System.out.println("the number is not prime number");
		}
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

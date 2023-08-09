import java.util.Scanner;
class Programs1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for (int i=1;i<=5;)
		{
			int a=sc.nextInt();
			if (isCountNumberDigits(a)>=3)
			{
				if (m1(a))
				{
					if (bouncy(a))
					{
						System.out.println("Its bouncy");
					}
					else
					{
						System.out.println("Its not bouncy");
					}
				}
				else
				{
					if (isPrime(sum(a)))
					{
						System.out.println("Sum of Odd Number is Prime");
					}
					else
					{
						System.out.println("Sum of Odd Number is not Prime");
					}
				}
				i++;
			}
		}
	}
	public static int isCountNumberDigits(int num)
	{
		int count=0;
		while (num>0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	public static boolean m1(int num)
	{
		int i=num;
		for (;i>9 ;i/=10 )
		{
			//int rem=i%10;
		}
		if (i%2==0)
		{
			return true;
		}
		return false;
	}
	public static boolean bouncy(int num)
	{
		boolean a=false;
		boolean b=false;
		for (int i=num;i>9;)
		{
			int rem1=i%10;
			i/=10;// 
			int rem2=i%10;
			if (rem1>rem2)
			{
				a=true;
			}
			if (rem1<rem2)
			{
				b=true;
			}
			if (a&&b)
			{
				return true;
			}
		}
		return false;
	}
	public static int sum(int num)
	{
		int sum=0;
		for (int i=num;i>0 ;i/=10)
		{
			int rem=i%10;
			if (rem%2!=0)
			{
				sum+=rem;
			}
		}
		return sum;
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
}
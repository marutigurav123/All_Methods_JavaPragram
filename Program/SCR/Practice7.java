import java.util.Scanner;
class Practice7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int ip=sc.nextInt();
		if (Methods.evenOrOdd(Methods.count(ip)))
		{
			while (ip>0)
			{
				int a=ip%10;
				ip/=10;
				int b=ip%10;
				ip/=10;
				int c=(b*10)+a;
				System.out.println(c);
				if (Methods.isPrime(sum(c)))
				{
					System.out.println("its Prime");
				}
				else
				{
					System.out.println("its not Prime");
				}
			}
		}
		else
		{
			System.out.println("The count is not even");
		}
	}
	public static int m1(int temp)
	{
		int rem=temp%100;
		System.out.println(rem);
		return rem;
	}
	public static int sum(int num)
	{
		int sum=0;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem=i%10;
			sum+=rem;
		}
		return sum;
	}
	/*public static boolean isPrime(int num)
	{
		for (int i=2;i<=num/2;i++ )
		{
			if (num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static int count(int num)
	{
		int count=0;
		for (int i=num;i>0;i/=10 )
		{
			count++;
		}
		return count;
	}
	public static boolean evenOrOdd(int num)
	{
		if (Methods.count(num)%2==0)
		{
			return true;
		}
		return false;
	}*/
}

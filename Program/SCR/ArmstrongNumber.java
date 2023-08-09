import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int ip=sc.nextInt();
		int sum=0;
		for (int i=ip;i>0;i/=10 )
		{
			int rem=i%10;
			sum=sum+power(rem,count(ip));
		}
		if (ip==sum)
		{
			System.out.println("Armstrong number");
		}
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
	public static int power(int num,int raise)
	{
		int p=1;
		for (int i=1;i<=raise;i++ )
		{
			p*=num;
		}
		return p;
	}
}

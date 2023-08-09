import java.util.Scanner;
class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int ip=sc.nextInt();
		if (ip==Methods.sum(ip))
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("not a Strong number");
		}
	}
	/*public static int sum(int num)
	{
		int sum=0;
		while (num!=0)
		{
			int rem=num%10;
			sum+=fact(rem);
			num/=10;
		}
		return sum;
	}
	public static int fact(int num)
	{
		int fact=1;
		for (int i=num;i>0 ;i-- )
		{
			fact*=i;
		}
		return fact;
	}*/
}

import java.util.Scanner;
class BouncyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int ip=sc.nextInt();
		if (bouncy(ip))
		{
			System.out.println("Its a bouncy number");
		}
		else
		{
			System.out.println("Its not a bouncy number");
		}
	}
	public static boolean bouncy(int num)
	{
		boolean a=false;
		boolean b=false;
		int rem1=0;
		int rem2=0;
		for (int i=num;i>9;)
		{
			rem1=i%10;
			i/=10;
			rem2=i%10;
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
}

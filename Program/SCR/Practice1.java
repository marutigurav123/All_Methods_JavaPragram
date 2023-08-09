import java.util.Scanner;
class Practice1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int ip=sc.nextInt();
		int num=rev(ip);
		while (num>0)
		{
			int rem1=num%10;
			num/=10;
			for (int i=num;i>0;i/=10 )
			{
				int rem2=i%10;
				if (rem1==rem2)
				{
					System.out.println(rem1);
					return;
				}
			}
		}
		System.out.println("No duplicate number");
	}
	public static int rev(int num)
	{
		int rev=0;
		for (int i=num;i>0 ;i/=10 )
		{
			rev=rev*10+i%10;
		}
		return rev;
	}
}
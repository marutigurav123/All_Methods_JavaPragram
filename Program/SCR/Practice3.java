//1st unique without method
import java.util.Scanner;
class Practice3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int ip=a;
		for (int i=1;i<=9;i++)
		{
			ip=ip*i;
			int num=rev(ip);
			int temp=rev(ip);
			while (num>0)
			{
				int count=0;
				int rem1=num%10;
				num/=10;
				while (temp>0)
				{
					if (temp%10==rem1)
					{
						count++;
					}
					temp/=10;
				}
				temp=rev(ip);
				if (count==1)
				{
					System.out.println("In "+ip+" the 1st unique number is "+rem1);
					break;
				}
			}
		}
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
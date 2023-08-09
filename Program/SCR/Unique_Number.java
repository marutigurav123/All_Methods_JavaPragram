import java.util.Scanner;
class Unique_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int ip=sc.nextInt();//12345
		int temp=ip;//12345
		int num=ip;//12345
		while (num>0)
		{
			int count=0;//1
			int rem1=num%10;//5
			num/=10;
			while (temp>0)
			{
				int rem2=temp%10;//
				if (rem2==rem1)
				{
					count++;
				}
				temp/=10;
			}
			temp=ip;
			if (count!=1)
			{
				System.out.println("Its not unique number");
				return;
			}
		}
		System.out.println("Its unique number");
	}
}

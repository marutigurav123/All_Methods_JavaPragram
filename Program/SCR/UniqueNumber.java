import java.util.Scanner;
class UniqueNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int ip=sc.nextInt();
		int num1=ip;
		int num2=ip;
		boolean a=false;
		while (num1>0)
		{
			int count=0;
			int r1=num1%10;
			while (num2>0)
			{
				int r2=num2%10;
				if (r1==r2)
				{
					count++;
				}
				num2/=10;
			}
			num2=ip;
			num1/=10;
			if (count==1)
			{
				a=true;
			}
			else
			{
				a=false;
				break;
			}
		}
		if (a)
		{
			System.out.println("Its unique");
		}
		else
		{
			System.out.println("Its not unique");
		}
	}
}

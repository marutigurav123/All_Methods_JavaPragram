import java.util.Scanner;
class Method3 
{       
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int a=num;
		while (num>9)
		{
			num=sum(num);
		}	
		if (num==1)
		{
			System.out.println("magic number");
		}
		else
		{
			System.out.println("not magic number");
		}
	}
	public static int sum(int num)
	{
		int sum=0;
		for (;num>0 ;num/=10 )
		{
			sum+=num%10;
		}
		return sum;
	}
}
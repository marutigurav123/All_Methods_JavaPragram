import java.util.Scanner;
class HarshadNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int ip=sc.nextInt();
		if (ip%sum(ip)==0)
		{
			System.out.println("Harshad Number");
		}
		else
			System.out.println("Not a Harshad Number");
	}
	public static int sum(int num)
	{
		int sum=0;
		for (int i=num;i>0;i/=10 )
		{
			sum=sum+i%10;
		}
		return sum;
	}
}

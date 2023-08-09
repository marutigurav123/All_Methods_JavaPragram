import java.util.Scanner;
class RotatingNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		for (int i=0;i<count(num);i++ )
		{
			num=rotate(num);
			if (temp!=num)
			{
				System.out.println(num);
				if (temp==num)
				{
					break;
				}
			}
		}
	}
	public static int count (int num)
	{
		int count=0;
		while (num!=0)
		{
			num/=10;
			count++;
		}
		return count;
	}
	public static int power(int base,int raise)
	{
		int power=1;
		for (int i=1;i<raise;i++)
		{
			power=power*base;
		}
		return power;
	}
	public static int rotate(int num)
	{
		return (num%power(10,count(num))*10)+(num/=power(10,count(num)));
	}
}

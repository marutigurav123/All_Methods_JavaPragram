import java.util.Scanner;
class MethodEvenOrOdd 
{
	public static boolean evenOrOdd(int num)
	{
		if (num%2==0)
		{
			return true;	
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean ans = evenOrOdd(num);
		if (ans)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}

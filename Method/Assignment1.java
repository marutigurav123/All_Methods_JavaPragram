import java.util.Scanner;
class Assignment1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		while (true)
		{
			if (num==Methods.sum(num))
			{
				System.out.println(num);
				break;
			}
			num++;
		}
	}
}

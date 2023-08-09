import java.util.Scanner;
class Test3 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int a=2;
		int b=2;
		int c=0;
		System.out.println(0);
		for (;;)
		{
			for (int i=0;i<2;i++)
			{
				c+=a;
				System.out.println(c);
				count++;
			}
			a=2*b;
			b++;
			if (count==n)
			{
				break;
			}
			
		}
	}
}

import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the power");
		int p=sc.nextInt();
		int res=power(num,p);
		System.out.println(res);
	}
	public static int power(int a,int p)
	{	
		int ans=1;
		for (int i=1;i<=p ;i++ )
		{
			ans*=a;
		}
		return ans;
	}
}

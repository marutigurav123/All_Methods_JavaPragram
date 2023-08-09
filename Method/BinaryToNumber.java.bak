import java.util.Scanner;
class BinaryToNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary");
		int num=sc.nextInt();
		int ans=0;
		int pow=0;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem=i%10;
			ans=ans+(rem*power(2,pow++));
		}
		System.out.println("The number for the binary value "+num+" is "+ans);
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

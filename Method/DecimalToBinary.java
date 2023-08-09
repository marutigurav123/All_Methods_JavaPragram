import java.util.Scanner;
class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();//174
		int b=0;
		while (num>0)
		{
			b=b*10+num%2;
			num/=2;
		}
		int rev=0;
		while (b>0)
		{
			rev=rev*10+b%10;
			b/=10;
		}
		System.out.println(rev);
	}
}

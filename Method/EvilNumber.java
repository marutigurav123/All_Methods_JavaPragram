import java.util.Scanner;
class EvilNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int ip=sc.nextInt();
		String s="";
		while (ip>0)
		{
			s=(ip%2)+s;
			ip/=2;
		}
		int b=Integer.parseInt(s);
		System.out.println(b);
		int sum=0;
		for (int i=b;b>0 ;b/=10 )
		{
			sum=sum+b%10;
		}
		System.out.println(sum);
		if (sum%2==0)
		{
			System.out.println("Evil Number");
		}
		else
		{
			System.out.println("Odious Number");
		}
	}
}
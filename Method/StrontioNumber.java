import java.util.Scanner;
class StrontioNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int ip=sc.nextInt();
		int num=ip*2;
		int temp=num%1000;
		temp=temp/10;
		if (temp%10==temp/10)
		{
			System.out.println("Its a Strontio Number");
		}
		else
		{
			System.out.println("Its not a Strontio Number");
		}

	}
}

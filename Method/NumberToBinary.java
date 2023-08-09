import java.util.Scanner;
class NumberToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		String binary="";
		while (num>0)
		{
			binary=num%2+binary;
			num/=2;
		}
		System.out.println(binary);
	}
}

import java.util.Scanner;
class RotatingPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
		int j=i;
			if (Methods.isPrime(i))
			{
				i=Methods.rotate(i);
				while (j!=i)
				{
					if (Methods.isPrime(i))
					{
					i=Methods.rotate(i);
					}
					else
					{
						break;
					}
				}
				if (j==i)
				{
					System.out.println("its a rotating prime "+i);
				}
				else
				{
					System.out.println("its not rotating prime "+i);
				}
			}
			else
			{
				System.out.println("its not a prime "+i);
			}
		}
	}
}

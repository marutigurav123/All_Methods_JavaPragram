import java.util.Scanner;
class AcDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Ac a1=new Ac();
		a1.brand="LLyod";
		a1.price=50000.0;
		a1.capacity=1.5;
		a1.minTemp=14;
		a1.maxTemp=28;
		a1.ambientTemp=19;
		System.out.println("1.Specification 2.Temprature");
		int ip=sc.nextInt();
		if (ip==1)
		{
			a1.displayAc();
		}
		if (ip==2)
		{
			a1.displayAcTemp();
		}
	}
}

class Methods 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
//-------------------------------PRIME----------------------------------------
	public static boolean isPrime(int a)
	{
		for (int i=2;i<=a/2 ;i++ )
		{
			if (a%i==0)
			{
				return false;
			}
		}
		return true;
	}
//--------------------------------REVERSE---------------------------------------
	public static int rev(int num)
	{
		int rev=0;
		for (int i=num;i>0 ;i/=10 )
		{
			rev=rev*10+i%10;
		}
		return rev;
	}
//-------------------------------PALINDROME----------------------------------
	public static boolean palindrome(int num)
	{
		if (num==rev(num))
		{
			return true;
		}
		return false;
	}
//-------------------------------COUNT-----------------------------------------
	public static int count (int num)
		{
			int count=0;
			while (num!=0)
			{
				num/=10;
				count++;
			}
			return count;
		}
//-----------------------------POWER-------------------------------
	public static int power(int base,int raise)
	{
		int power=1;
		for (int i=1;i<raise;i++)
		{
			power=power*base;
		}
		return power;
	}
//----------------------------ROTATE------------------------------------
	public static int rotate(int num)
	{
		return (num%power(10,count(num))*10)+(num/=power(10,count(num)));
	}
//-----------------------SUM of FACTORIAL----------------------------------------
	public static int sum(int num)
	{
		int sum=0;
		while (num!=0)
		{
			int rem=num%10;
			sum+=fact(rem);
			num/=10;
		}
		return sum;
	}
	public static int fact(int num)
	{
		int fact=1;
		for (int i=num;i>0 ;i-- )
		{
			fact*=i;
		}
		return fact;
	}
//----------------------EVEN OR ODD--------------------------------------
	public static boolean evenOrOdd(int num)
	{
		if (num%2==0)
		{
			return true;	
		}
		return false;
	}
//----------------------------------------------------------------
}
	

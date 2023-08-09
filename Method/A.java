class A 
{
	public static void main(String[] args) 
	{
		int a=10;//20
		while (a++==100||++a<=15)
		{
			a++;
			a=a++;
			++a;
			a=a+2;
			a=2+a;
		}
		System.out.println(a);
	}
}

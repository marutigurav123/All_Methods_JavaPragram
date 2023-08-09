class Test4 
{
	public static void main(String[] args) 
	{
		char a='A';
		char b='a';
		for (int n=1;n<=26; )
		{
			for (int i=0;i<3;i++)
			{
				if (a>'Z')
				{
					break;
				}
				System.out.print(a++);
				b++;
				n++;
			}
			for (int i=0;i<3;i++)
			{
				if (b>'z')
				{
					break;
				}
				System.out.print(b++);
				a++;
				n++;
			}
			
		}
	}
}

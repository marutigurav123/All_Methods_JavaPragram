class Ac 
{
	String brand;
	double price;
	double capacity;
	int minTemp;
	int ambientTemp;
	int maxTemp;
	public void displayAc()
	{
		System.out.println("brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Capacity : "+capacity);
	}
	public void displayAcTemp()
	{
		System.out.println("Max temp : "+maxTemp);
		System.out.println("Min temp : "+minTemp);
		System.out.println("ambient temp : "+ambientTemp);
	}
}

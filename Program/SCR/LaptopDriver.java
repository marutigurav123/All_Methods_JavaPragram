class LaptopDriver 
{
	public static void main(String[] args) 
	{
		Laptop m1=new Laptop();
		m1.brand="HP";
		m1.price=60000.0;
		m1.processor="Intel i5";
		m1.ram=8;
		m1.ssd=512;
		m1.gd="Gtx 1650ti";

		m1.displayLaptop();

		Laptop m2=new Laptop();
		m2.brand="DEll";
		m2.price=55000.0;
		m2.processor="Intel i3";
		m2.ram=8;
		m2.ssd=512;
		m2.gd="Gtx 1650";

		m2.displayLaptop();

		Laptop m3=new Laptop();
		m3.brand="Lenovo";
		m3.price=80000.0;
		m3.processor="Intel i7";
		m3.ram=16;
		m3.ssd=1024;
		m3.gd="Gtx 2080";

		m3.displayLaptop();
	}
}

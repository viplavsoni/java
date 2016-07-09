class Box
{
	double w;
	double h;
	double d;

 	void volume()
	{
		System.out.println("volume is");
		System.out.println(w*h*d);
	}
}
class Boxdemo3
{
	public static void main(String args[])
	{
		Box mybox1 = new Box();
		Box mybox2 = new Box();
			
		mybox1.w=10;
		mybox1.h=10;
		mybox1.d=10;

		mybox1.volume();


		mybox2.w=2;
		mybox2.h=40;
		mybox2.d=30;

		mybox2.volume();
	}
}

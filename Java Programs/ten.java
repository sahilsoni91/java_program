class Ten
{
	int length,breadth;
	Ten()	//Default Constructer
	{
		length=0;
		breadth=0 ;
		System.out.println("\nDefault Constructer Is Fired");
	}
	Ten(int l,int b)	//Parametrised Constructer
	{
		int s;
		length=l;
		breadth=b ;
		System.out.println("Parametrised Constructer Is Fired");
		s=l+b;
		System.out.println("Sum="+s);
	}
	public static void main(String args[])
	{
		System.out.println("\n---: Constructors :---");
		Ten r1=new Ten();
		Ten r2=new Ten(6,7);
	}
}
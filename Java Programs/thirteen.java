class Thirteen
{
	public Thirteen(int a,int b)
	{
		int q;
		q=a+b;
		System.out.println("\nAddition Of Two Integers= "+q);
	}
	public Thirteen(int a,int b,int c)
	{
		int r;
		r=a+b+c;
		System.out.println("Addition Of Three Integers= "+r);
	}
	public Thirteen(String a,String b)
	{
		String s; 
		s=a+b;
		System.out.println("ConcatenationOf Two Strings= "+s);
	}
	public static void main(String args[])
	{
		System.out.println("\n---: Method Overloading :---");
		Thirteen ob1=new Thirteen(3,6);
		Thirteen ob2=new Thirteen(3,6,9);
		Thirteen ob3=new Thirteen("Core","Java");
	}
}
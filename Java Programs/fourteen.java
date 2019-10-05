class A
{
	public void Show()
	{
	System.out.println("A Class Method");
	}
}
	class B extends A
	{
		public void Show()
		{
			System.out.println("\nB Class Method");
			System.out.println("A Class's Method Is Overriden By B Class's Method");
		}	// Here the Show() method of parent class A is Overridden by
	}		//  Show() method of Child class B......
class Fourteen
{
	public static void main(String args[])
	{
		System.out.println("\n---: Method Overiding :---");
		B obj=new B();
		obj.Show();
	}
}
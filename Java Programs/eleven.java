class A
{
	public void showA()
	{
		System.out.println("Class A is Shown");	
	}
}
	class B extends A
	{
		public void showB()
		{
			System.out.println("Class B is Shown");	
		}
	}
class C extends B
{
	public void showC()
	{
		System.out.println("Class C is Shown");	
	}
}
class Eleven
{
	public static void main(String args[])
	{
		System.out.println("\n---: Polymorphism :---\n");
		C obj=new C();
		obj.showA();
		obj.showB();
		obj.showC();
	}
}
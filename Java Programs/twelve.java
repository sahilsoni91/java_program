class Parent
{
	public void Show()
	{
		int i=200000;
		System.out.println("\nParent Class");
	}
}
	class Child extends Parent      
	{
			
	}					
class Twelve
{
	public static void main(String args[])
	{
		System.out.println("\n---: Inheritance :---");
		Child obj=new Child();
		obj.Show();
		System.out.println("Children Takes Parent Features");
	}
}
import java.util.*;
class Three
{
	public static void main(String args[])    //throws IOException
	{
		Scanner cin=new Scanner(System.in);
		int choice;
		System.out.println("\n---: Temprature Conversion :---");
  		System.out.println("\n1- Centigrade to Fahrenheit\n2- Fahrenheit to Centigrade\n");
		System.out.print("Enter Choice=");
  		choice=cin.nextInt();
		if(choice==1)
		{
			Scanner cin1=new Scanner(System.in);
			System.out.print("\nEnter Temprature In Centigrade=");
			float c,f;
			c=cin1.nextFloat();
			f=(9*c+160)/5;
			System.out.println( "\nTemperature In Fahrenheit="+f);
		}
		else if(choice==2)
		{
			Scanner cin2=new Scanner(System.in);
			System.out.print("\nEnter Temprature In Fahrenheit=");
			float c,f;
			f=cin2.nextFloat();
			c=(5*f-160)/9;
			System.out.println( "\nTemperature In Centigrade="+c);
		}
		else
		{
			System.out.println("!!! Wrong Choice Try Again !!!!");
		}	
	}
}
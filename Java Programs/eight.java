import java.util.*;
class Eight
{
	public static void main(String[] args) 
	{
		System.out.println("\n---: Table Of A Number :---");
		Scanner cin=new Scanner(System.in); 
		System.out.print("\nEnter Number=");
		int n=cin.nextInt(); 
		System.out.println("\nMultiplication Table:");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i)); 
		} 
	} 
}
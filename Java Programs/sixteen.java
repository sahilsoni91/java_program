import java.util.*;
class Sixteen
{
	public static void main(String[] args) 
      	{
		Scanner cin=new Scanner(System.in);
        		String i;
		System.out.println("\n---: Swapping Of String :---");
		System.out.print("\nEnter First String=");
		i=cin.nextLine();
		Scanner cin1=new Scanner(System.in);
        		String j;
		System.out.print("\nEnter Second String=");
		j=cin1.nextLine();
		System.out.println("\nBefore Swapping:\n");
		System.out.println(i+"  "+j);
                       	swap(i,j);
	}
	static void swap(String i,String j) 
	{
	        	String temp;
		temp=i;
        		i=j;
        		j=temp;
		System.out.println("\nAfter Swapping:\n");
        	 	System.out.println(i+"  "+j);
	}
}
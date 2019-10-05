import java.util.*;
class Seven
{
	public static void main(String args[])
	{
		Scanner cin=new Scanner(System.in);
		int sum,a,d;
		System.out.println("\n---: Sum Of Digits Of An Integer :---");
		System.out.print("\nEnter Number=");
		a=cin.nextInt();
		sum = 0;
		while(a>0)
		{
			d=a%10;
			sum=sum+d;
			a=a/10;
		} 
		System.out.println("\nSum Of Digits="+sum);
	}
}
import java.util.*;
class Five
{
	public static void main(String args[])
	{
		System.out.println("\n---: Checking Grade :---\n");
		System.out.print("Enter Number From 0 To 100=");
		Scanner cin=new Scanner(System.in);
		int i;
		i=cin.nextInt();
		if(i>=81 && i<=100)
		{
			System.out.println("\nGrade=A");
		}
		else if(i>=61 && i<=80)
		{
			System.out.println("\nGrade=B");
		}
		else if(i>=41 && i<=60)
		{
			System.out.println("\nGrade=C");
		}
		else if(i>=0 && i<=40)
		{
			System.out.println("\nGrade=D");
		}
	}
}
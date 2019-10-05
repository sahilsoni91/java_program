class Four
{
	public static void main(String[] args)
	{
		int m,n,sum;
		sum=0;
		System.out.println("\n---: Numbers Divisible By 7 Between 100 To 200 :---\n");
		System.out.println("Numbers Divisible By 7:");
		for (int i=100; i<=200; i++)
		{
			if (i%7==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("Sum Of All Above Numbers="+sum);
	}
}
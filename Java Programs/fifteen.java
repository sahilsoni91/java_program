import java.util.*;
class Fifteen
{
	public static void main(String args[])
   	{
		int m,n,p,q,sum,c,d,k;
		sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("\n---: Matrix Multiplication :---");
		System.out.println("\nEnter Number Of Rows And Columns Of First Matrix:");
		m=in.nextInt();
		n=in.nextInt();
 		int first[][]=new int[m][n];
		System.out.println("\nEnter Number Of Rows And Columns Of Second Matrix:");
      		p=in.nextInt();
      		q=in.nextInt();
 		if(n!=p)
         			System.out.println("Matrices Multiplication Is Not Possible.");
      		else
      		{
         			System.out.println("\nEnter Elements Of First Matrix:");
 			for(c=0;c<m;c++)
			{
				for(d=0;d<n;d++)
					first[c][d]=in.nextInt();
			}
			int second[][]=new int[p][q];
         			int multiply[][]=new int[m][q];
 			System.out.println("\nEnter Elements Of Second Matrix:");
 			for(c=0;c<p;c++)
            			{
				for(d=0;d<q;d++)
					second[c][d]=in.nextInt();
			}
         			for(c=0;c<m;c++)
         			{
            				for(d=0;d<q;d++)
            				{   
               					for(k=0;k<p;k++)
               					{
                  					sum=sum+first[c][k]*second[k][d];
               					}
					multiply[c][d]=sum;
               					sum=0;
            				}
         			}
			System.out.println("\nProduct Of Both Matrices:");
 			for(c=0;c<m;c++)
         			{
            				for(d=0;d<q;d++)
               					System.out.print(multiply[c][d]+"\t");
 				System.out.print("\n");
         			}
      		}
   	}
}
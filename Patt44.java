import java.util.*;
class Patt44
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=i;j<n;j++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");
				System.out.println("");
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=i;j<n;j++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println("");
		}
	}
}
import java.util.*;
class Patt42
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
			for(j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n||j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
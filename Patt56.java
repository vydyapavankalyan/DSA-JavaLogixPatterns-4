import java.util.*;
class Patt56
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(j);
			for(l=i-1;l>=1;l--)
				System.out.print(l);
			System.out.println("");
		}
	}
}
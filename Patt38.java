import java.util.*;
class Patt38
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n,k=1;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			 {
				if(j%2==0)
					System.out.print("0");
				else
					System.out.print("1");
			} 
			System.out.println("");
		}
		

	}
}
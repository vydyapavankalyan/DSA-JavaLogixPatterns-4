import java.util.*;
class Patt47
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n;

		System.out.println("enter the value of n");
		//n=sc.nextInt();

		for(i=1;i<10;i++)
		{
			if(i<=5)
			{
				for(j=i;j<=5;j++)
					System.out.print("*");
				System.out.println("");
			}
			else
			{
				
				for(j=i;j>=5;j--)
					System.out.print("*");
				System.out.println("");
			}	
		}
	
	}
}
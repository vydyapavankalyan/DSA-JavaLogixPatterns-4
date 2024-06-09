import java.util.*;
class Patt29
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char i,j;

		System.out.println("enter the value of n");
		//n=sc.nextInt();

		for(i='E';i>='A';i--)
		{
			for(j=i;j>'A';j--)
				System.out.print(" ");
			for(j='E';j>=i;j--)
				System.out.print(i);
			System.out.println("");
		}

	}
}
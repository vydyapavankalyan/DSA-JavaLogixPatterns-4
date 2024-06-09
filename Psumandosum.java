import java.util.*;
class Psumandosum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int [][]=new int[10][10];

		int i,j,row,col,psum=0,osum=0;

		System.out.println("enter the order of matrix a");
		row=sc.nextInt();
		col=sc.nextInt();

		System.out.println("enter the elements of matrix a");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if(a[i][j]==a[i][col-i-1])//if(i+j==col-1)
					osum=osum+a[i][j];
				if(i==j)
					psum=psum+a[i][j];
			}
		}
		System.out.println("sum of principle diagonal="+psum);
		System.out.println("sum of other diagonal="+osum);
	}
}	
		
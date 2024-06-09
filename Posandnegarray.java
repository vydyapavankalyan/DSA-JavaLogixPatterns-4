import java.util.*;
class Posandnegarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a[]=new int[20];
		int i,n,psum=0,nsum=0;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		for(i=0;i<n;i++)
		  {
			if(a[i]>0)
			   psum=psum+a[i];
			else
			   nsum=nsum+a[i];
		  }

		System.out.println("sum of positive elements="+psum);
		System.out.println("sum of negative elements="+nsum);

	}
}

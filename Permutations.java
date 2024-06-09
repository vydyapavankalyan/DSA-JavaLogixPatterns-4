import java.util.*;
class Permutations
{
	public static void main(String args[])
	{
		String s="abc";
		char i,j,k;

		for(i='a';i<='c';i++)
		{
			for(j='a';j<='c';j++)
			{
				for(k='a';k<='c';k++)
				{
					if(i!=j && j!=k && k!=i)
						System.out.println(i+""+j+""+k);
				}
			}
		}

	}
}
public class Drishti
{
	static int fun(int n)
	{
	int[] a = new int[n];
	int p = 0;
	int q=0;
	
	for(int i=0;i<a.length-1;i++)
		{
		  p = i*i;
		  q = p%n;
		a[i] = q;
				
		}
	int max = Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++)
		{
		  if(a[i]>max)
			max = a[i];		
		}
	return max;
	
	}

public static void main(String ar[])
	{
	System.out.print(Drishti.fun(6));
	}

}



	
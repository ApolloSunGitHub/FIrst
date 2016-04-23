/**
 * Using the sorting method to calculate the prime number within 100
 * 
 * @author Apollo
 *		
 */
public class PrimeNumber
{
	@SuppressWarnings("null")
	public static void main(String args[])
	{
		int a[] = new int [101];
		int i,j;
		for(i = 1 ; i < 101 ; i++)
		{
			a[i] = i;
		}
		
		for(i=2;i<101;i++)
		{
			if(a[i]!=0)
			{
				for(j=i+i;j<101;)
				{
					if(j%i==0)
					{
						a[j]=0;
						j=j+i;
					}
				}
			}
		}
		for(i=1;i<101;i++)
		{
			if(a[i]!=0)
			{
				System.out.println(i);
			}
		}
	}
}

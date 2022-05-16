package practice;

public class Hollowfullpiramid {

	public static void main(String[] args) {

		/* i   j   k
		   
		   1   5   1
		   2   4   3
		   3   3   5
		   4   2   7
		   5   1   9
		   6   0   11 */
		
		for (int i=1;i<=5;i++) //outer loop
		{
			for(int j=0;j<(5-i);j++) 
			{
				System.out.print("  ");
			}
			
			for(int k=0;k<(i*2-1);k++)
			{
			System.out.print("* ");
			
		}
			System.out.println();
	}

	}
}

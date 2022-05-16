package practice;

public class Invertedfullpiramid {

	public static void main(String[] args) {

		/* i   j   k
		   
		   1   5   1
		   2   4   3
		   3   3   5
		   4   2   7
		   5   1   9
		   6   0   11 */
		
		
		for (int i=0;i<=6;i++) //outer loop
		{
			for(int j=0;j<i;j++) 
			{
				System.out.print(" ");
			}
			
			for(int j=i;j<6;j++)
			{
			System.out.print("* ");
			
		}
			System.out.println();
	}

	}
}

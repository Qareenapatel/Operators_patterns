package practice;

public class Fullpiramid {

	public static void main(String[] args) {

		/* i   j   k
		   
		   1   5   1
		   2   4   3
		   3   3   5
		   4   2   7
		   5   1   9
		   6   0   11 */
		int num = 7;
		for (int i=0;i<num;i++) //outer loop
		{
			for(int j=num-i;j>1;j++) 
			{
				System.out.print("  ");
			}
			
			for(int j=0;j<=i;j++)
			{
			if(j==0 ||j==i || i==num-1) {
				System.out.print("* ");
			}else
			{
				System.out.print("  ");
			}
			
		}
			System.out.println();
	}

	}
}

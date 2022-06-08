package diamondpattern;

public class Diamondpattern123 {

	public static void main(String[] args) {
		
		for (int i=0;i<4;i++) 
		{
			for(int j=i;j<=4;j++) 
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++)
			{
			System.out.print(i+" ");
			
		}
			System.out.println();
	}
	
		for (int i=1;i<=4;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(" ");
			}
			
			for(int j=i;j<=4;j++)
			{
			System.out.print(5-i +" ");
			
		}
			System.out.println();
	}
	}
}





import java.util.Scanner;

//15.Display Prime Numbers in the given range using nested for loops 

public class Pattern14 {

	public static void main(String[] args) {
		
		int count=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n value");
		int n= scan.nextInt();
		
		for ( int i=1;i<=n;i++) {
			
			
		if (i%2==0)
		{
			count++;
			System.out.println("prime");
		}else {
			System.out.println("not prime");
			
		}
		
	}
	}
}
		

		
				

		


	

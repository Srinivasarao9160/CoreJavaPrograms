//9.Write a program to print the following Pattern
//  A 
//  B C
//  D E F
//  G H I J
//  K L M N O

public class Pattern9 {

	public static void main(String[] args) {

		char ch = 65;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+ch++);
			}
			System.out.println();
		
		
	}

}
}

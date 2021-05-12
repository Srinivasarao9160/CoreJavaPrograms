import java.util.Scanner;

//13.Write a program to print the following Pattern
//          * 
//        * * * 
//      * * * * * 
//    * * * * * * *

public class Pattern13 {

	public static void main(String[] args) {

		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		n=scanner.nextInt();
		
		int space=n*2+1;
		int stars=-1;
		

		for(int i=1;i<=n;i++)
		{
			space=space-2;
			stars=stars+2;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
	}

}








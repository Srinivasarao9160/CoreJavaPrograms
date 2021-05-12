import java.util.Scanner;

//14.Display Multiplication Table in given range using Nested for loops

public class Pattern15 {

	public static void main(String[] args) 
	{
		int n;
		int start;
		int end;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the n value");
		n=scanner.nextInt();
		
		System.out.println("enter start value");
		start=scanner.nextInt();
		
		System.out.println("enter end value");
		end=scanner.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			
			System.out.println(n+" * "+ i +" = "+n*i);
		}
	}



}




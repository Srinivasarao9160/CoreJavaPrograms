package ojas;

public class Diff2value {

	public static void main(String[] args) {

		int  num = Integer.parseInt(args[0]);
		int  temp = num%10;
		int  sum = num/10;
		
		System.out.println("diff =" +(temp-sum));

	}

}


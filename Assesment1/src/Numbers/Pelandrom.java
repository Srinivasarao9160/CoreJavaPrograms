package Numbers;

public class Pelandrom {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		
		int remender = num % 10;
		
		int sum = num / 100;
		System.out.println(sum==remender);
		
		
		
	}

}

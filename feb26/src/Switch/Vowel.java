package Switch;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
       while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter char");
		Character ch = sc.next().toUpperCase().charAt(0);
	
		String res = " ";
		
		switch (ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + "chater is ovel");
          break;
          

		default:
			System.out.println(ch + "charter is not ovel");
			break;
		}
		System.out.println(res);
	}

}
}
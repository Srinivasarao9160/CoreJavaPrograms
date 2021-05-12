package conditional;

public class BigNum {

	public static void main(String[] args) {

		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		if (num1<num2) {
			num1 = num2;
		}
		num1 = Integer.parseInt(args[2]);
		if (num1<num2) {
			num1 = num2;
		}
		num1 = Integer.parseInt(args[3]);
		if (num1<num2) {
			num1 = num2;
		}
		num1 = Integer.parseInt(args[4]);
		if (num1<num2) {
			num1 = num2;
		}
		System.out.println(num1);

}
}

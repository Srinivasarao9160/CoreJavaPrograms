//2.Sum of the natural numbers using recursion?

package Assesment21programs;

public class SumofNatural {
	
	static int recuSum(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+recuSum(n-1);
		}
		
	}

	public static void main(String[] args) {

		int n = 5;
		System.out.println(recuSum(n));
	}

}

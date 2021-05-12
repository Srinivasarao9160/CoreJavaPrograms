//6.Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
//  	Example Test Cases:
//		diff21(19)  2
// 		diff21(10)  11
// 		diff21(21)  0
//		diff21(-1)  22
//		diff21(3)  18

package Olci2;

import java.util.Scanner;

public class Diffrence {

	static int diff21(int n) {
        if (n < 21) {
            return 21 - n;
        } else if (n >= 21) {
            return ((n - 21) * 2);
            }
        return n;
    }

 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(diff21(sc.nextInt()));
}
}
 


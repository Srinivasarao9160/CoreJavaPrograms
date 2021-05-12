//3.Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
//	maxBlock("hoopla")  2
//	maxBlock("abbCCCddBBBxx")  3
//	maxBlock("")  0

package Olci2;

import java.util.Scanner;

public class Block {

	static int maxBlock(String str) {
        String res = "";
        int length = str.length();
        int tcount = 0;
        int count = 0;

        if(length == 0) {
            return 0;
        }
        
        for(int i = 0; i < length; i++) {
            if(i < length - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count ++;
            }
            else {
                count = 1;
            }
            if(count > tcount )
                tcount = count;
        }
        return tcount;
    }

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        System.out.println(maxBlock(sc.next()));

 

    }

 

}


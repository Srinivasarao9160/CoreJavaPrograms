package Arrays;

import java.util.Scanner;

public class StudentMarks {
	static boolean isPass(int marks[]) {
		boolean b = false;
		int count = 0;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>=35) {
				count ++;
			}
		}
			if(count==marks.length) {
			b=true;
		}
		
		return b;
		}
	static int caltotal(int marks[]) {
		int sum = 0;
		for(int x : marks) {
			sum += x;
		}
		return sum;
	}
	static String findGrade(int marks[]) {
		String res = "";
		
		if(isPass(marks)) {
			res += "is passes";
			int total = caltotal(marks);
			int avrg = total/marks.length;
			res += "total marks" +total+"\n";
			res += "average is " +avrg+"\n";
			    if(avrg>=75) {
			    res += "you got dist";	
			    }
			    else if(avrg>=60) {
				    res += "you got first";	
				    }
			    else if(avrg>=75) {
				    res += "you got second";	
				    }
			    else {
				    res += "you got third";	
				    }
		}else {
			
		res += "you fail";
		}
		
		return res;
		} 
     public static void main(String[] args) {
		
		int marks[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 values");
		for(int i=0; i<marks.length;i++)
		marks[i]= sc.nextInt();
		System.out.println(findGrade(marks));
		}

}

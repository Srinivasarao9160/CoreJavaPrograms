package com.mocktests;

import java.util.Scanner;



public class MockTest2 {
//	public static void main(String args[]) {
//		int var1 = 5;
//		int var2 = 6;
//		int var3;
//		var3 = ++var2 * var1 / var2 + var2;
//		System.out.print(var3);
//	}
//
//}

//int x;
//
//int y;
//
//void add(int a) {
//
//x = a + 1;
//
//}
//
//void add(int a, int b) {
//
//x = a + 2;
//
//}
//
//public static void main(String[] args) {
//
//MockTest obj = new MockTest();
//
//int a = 0;
//
//obj.add(6);
//
//System.out.println(obj.x);
//
//}}

//	public static void main(String[] args) {  
//
//		String a = "rooman";  
//
//		String b = "rooman";  
//
//		String c = new String("rooman");  
//
//		System.out.print(a==b);  
//
//		System.out.print(a==c);  
//
//		System.out.print(b.equals(c));  
//
//		System.out.print(b.equals(a));
//	}}

//
//static Byte b;  
//
//public static void main(String [] args){  
//
//b=10;  
//
//b+=10;  
//
//System.out.println(b);  
//
//} }  

//	public static void main(String[] args) {
//		System.out.println("www." + test() + ".com");
//	}
//
//	static void test() {
//		System.out.println("rooman");
//	}
//}

//	int num = 100; 
//
//	public void calc(int num) { 
//
//	this.num = num * 10; 
//
//	} 
//
//	public void printNum(){ 
//
//	System.out.println(num); 
//
//	} 
//
//	public static void main(String[] args) { 
//
//	MockTest2 obj = new MockTest2 (); 
//
//	obj.calc(2); 
//
//	obj.printNum(); 
//
//	} 
//
//	} 
//	public static void main(String[] args) {
//
//		String[] sa = { "tom ", "jerry " };
//
//		for (int x = 0; x < 3; x++) {
//
//			for (String s : sa) {
//
//				System.out.print(x + " " + s);
//
//				if (x == 1) {
//					break;
//				}
//			}
//		}
//	}
//}

//	public static void main(String[] args) {
//		
//		String reverse = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the name");
//		String orignal = sc.next();
//		
//		for(int i=orignal.length()-1;i>=0;i--){
//			reverse += orignal.charAt(i);
//			}
//			System.out.println(reverse);
//		
//		
//		if(orignal.equals(reverse)) {
//			System.out.println("Given name is Palandrom");
//		}else {
//			System.out.println("Given name is Not Palandrom");
//		}
//		}
//		
//		
//		
//		
//		
//	}
	// Factiorial Number
//	int fact(int num) {
//		if(num==1)
//			return 1;
//		int x = num * fact(num-1);
//		return x;
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number");
//		int num = sc.nextInt();
//		MockTest2 m = new MockTest2();
//		 int result =m.fact(num);
//		 System.out.println(result);
//		
//		
//		
//	}}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter start value");
		int start = sc.nextInt();
        System.out.println("enter end value");
		int end = sc.nextInt();
	
		for(int i=start;i>end;i++) {
			System.out.println(i);
		}
	
	
	
	
	}}




	
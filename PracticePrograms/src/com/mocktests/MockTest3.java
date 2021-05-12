package com.mocktests;

public class MockTest3 {
//==	public static void main(String[] args) { 
//		int[] a[]; 
//		int b[3]; 
//		int []c[]; 
//		int[] d[]; 
//		}
//	public static void main(String[] args) {  
//
//		String entries[] = {"entry1","entry2"};  
//
//		int count=0;  
//
//		while (entries [count++]!=null){  
//
//		System.out.println(count);  
//
//		}  
//
//		System.out.println(count);  
//
//		}  
	

		static void go(int z){  

		System.out.println("int");  

		}  

		static void go(Object z){  

		System.out.println("Object");  

		}  

		static void go(Double z){  

		System.out.println("Double");  

		}  

		static void go(Number z){  

		System.out.println("Number");  

		}  

		public static void main(String... args) {  

		Integer i = 6; go(i);  

		}  

		} 
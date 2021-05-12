package DataStructers;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SelectionSort {
	static void selectSort(int num[]) {
	
		int min,temp;
	
	for(int i=0;i<num.length;i++) {
		     min = i;
		for(int j=i+1;j<num.length;j++) {
			if (num[j] > num[i]) {
				min = j;
				}
			temp = num[j];
			num[j] = num[min];
			num[min]= temp;
		}
		
			
		}
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
		
	}
	}

	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter 5 elements");
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		selectSort(num);

		
		}
	   
	}


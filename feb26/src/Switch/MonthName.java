package Switch;

import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {

		String res = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter month ");
		 String  month = sc.next();
		 
		 switch (month) {
		   case "jan":
			res = month+"31 days";
			break;
		   case "feb":
			   res = month+"28 days";
			   break;
		   case "march":
			   res = month+"30 days";
			   break;
		   case "april":
				res = month+"31 days";
				break;
			   case "may":
				   res = month+"28 days";
				   break;
			   case "june":
				   res = month+"30 days";
				   break;
			   case "july":
					res = month+"31 days";
					break;
				   case "aug":
					   res = month+"31 days";
					   break;
				   case "sept":
					   res = month+"30 days";
					   break;
				   case "oct":
						res = month+"31 days";
						break;
					   case "nov":
						   res = month+"30 days";
						   break;
					   case "dec":
						   res = month+"31 days";
						   break;
		                   default:
			                   break;
		}
		 System.out.println(res);
		 
	}

}

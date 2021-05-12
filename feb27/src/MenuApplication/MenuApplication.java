package MenuApplication;

import java.util.Scanner;

public class MenuApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String menu = "main manu application \n";
		       menu += "1.Addition\n";
		       menu += "2.substrtion\n";
		       menu += "3.multification\n";
		       menu += "4.division\n";
		       menu += "5.exit\n";
		       menu += "select any option";
		       System.out.println(menu);
		       String res = "";
		       
		       int choice= sc.nextInt();
		       
		       switch(choice) {
		       case 1:
		    	   System.out.println("enter two values");
		    	   res += "sum"+(sc.nextInt()+sc.nextInt());
		    	   break;
		       case 2:
		    	   System.out.println("enter two values");
		    	   res += "sum"+(sc.nextInt()-sc.nextInt());
		    	   break;
		       case 3:
		    	   System.out.println("enter two values");
		    	   res += "sum"+(sc.nextInt()*sc.nextInt());
		    	   break;
		       case 4:
		    	   System.out.println("enter two values");
		    	   res += "sum"+(sc.nextInt()%sc.nextInt());
		    	   break;
		       case 5:
		    	   System.exit(0);
		    	   break;
		    	   default:
		    		   res ="invalid option";
		       }
		       System.out.println(res);
		       
		       }

}

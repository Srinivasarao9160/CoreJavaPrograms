package Numbers;

public class ListFactors {

	public static void main(String[] args) {

	
		int num = Integer.parseInt(args[0]);
		
		if (num>0) {
		   
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				
				}
			
			
		} 
		}else{
			System.out.println("Error");
		}
		
		
	}
	}







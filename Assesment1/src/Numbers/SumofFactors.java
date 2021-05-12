package Numbers;

public class SumofFactors {

	public static void main(String[] args) {

int num = Integer.parseInt(args[0]);
		
		if (num>0) {
		int count = 0;
		   
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				
				count = count +i;
				}
			
			
		} 
		System.out.println(" sum of list factors is "+count);
		
			
		}else{
			System.out.println("Error");
		}
		
		
	}

}

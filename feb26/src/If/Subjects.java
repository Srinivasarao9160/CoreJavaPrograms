package If;

public class Subjects {

	public static void main(String[] args) {
		
		int telugu = Integer.parseInt(args[0]);
		int english = Integer.parseInt(args[1]);
		int math = Integer.parseInt(args[2]);
		int hindi = Integer.parseInt(args[3]);
		int science = Integer.parseInt(args[4]);
		
		int total = telugu+english+math+hindi+science;
		System.out.println(total + "is total");
		int avrg = total/5;
		System.out.println(avrg + "is average");
		
		if (telugu >35 && english >35 && math >35 && hindi > 35 && science > 35) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}


}

}

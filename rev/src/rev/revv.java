package rev;

import java.util.Scanner;

public class revv {

	
	
	public static void main(String[] args) {
	
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
		String num = obj.nextLine();
		

		StringBuffer re = new StringBuffer(String.valueOf(num));
		
		System.out.println(re.reverse());
		
	}

}

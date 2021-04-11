package B1_01_inout_arithmetic;

import java.util.Scanner;

public class B1_11_2588_Multiplication {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String b = scan.next();

		System.out.println(a*Integer.parseInt(b.substring(2)));

		System.out.println(a*Integer.parseInt(b.substring(1,2)));
		
		System.out.println(a*Integer.parseInt(b.substring(0,1)));

		System.out.println(a*Integer.parseInt(b));
	}

}

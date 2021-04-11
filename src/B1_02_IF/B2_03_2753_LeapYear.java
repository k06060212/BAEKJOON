package B1_02_IF;

import java.util.Scanner;

public class B2_03_2753_LeapYear {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int y = scan.nextInt();
		
		if(y%4 == 0 && y%100 != 0 || y%400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}

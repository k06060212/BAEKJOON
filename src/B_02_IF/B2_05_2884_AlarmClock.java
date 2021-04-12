package B_02_IF;

import java.util.Scanner;

public class B2_05_2884_AlarmClock {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if(h > 0 && m-45 < 0 ) {
			System.out.println(h-1);
			System.out.println(m-45+60);
		}else if(h == 0 && m-45 <0) {
			System.out.println(h-1+24);
			System.out.println(m-45+60);
		}else {
			System.out.println(h);
			System.out.println(m-45);
		}
	}
}

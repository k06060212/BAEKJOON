package B1_inout_arithmetic;

import java.util.Scanner;

public class B1_10_10430_The_rest {

	public static void main(String[] args) {
		
//		문제
//		(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

//		(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
			
//		세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		
//		입력
//		첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

//		출력
//		첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}
}

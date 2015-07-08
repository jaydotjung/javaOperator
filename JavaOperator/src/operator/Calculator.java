package operator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		/*
		 * order
		 * 스캐너로 두 값을 입력받아서 사칙연산 결과가 나오도록 하시오
		 * 예)20 + 7 = 27
		 *	 20 * 7 = 140	 
		 */
		
		// 선언
		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0;
		
		//연산
		System.out.println("첫번째 값을 입력");
		a = scanner.nextInt();
		System.out.println("두번째 값을 입력");
		b = scanner.nextInt();
		
		
		//출력
		//System.out.println(x+ "+" + y + " = " + (x+y));
		//System.out.println(x+ "+" + y+ " = " + (x+y));
		System.out.println("add:\t"+ (a+b));
		System.out.println("sub:\t"+ (a-b));
		System.out.println("gob:\t"+ a*b);
		System.out.println("mok:\t"+ a/b);
		System.out.println("nmg:\t"+ a%b);
		
		
		
		
	}
}

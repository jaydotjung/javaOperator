package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : Me
 * @ Story : 사칙연산 계산 프로그램
 */
/*
 * 오더: 
 -사칙연산 계산기
 -뎃셈, 뺄셈, 곱셈, 나눗셈(몫 : (), 나머지 ())
 -사칙연산 기호도 입력 받습니다. : +, -, *, /
	출력결과:
 === 심플 계산기 ===
 5 x 5 = 25
 5 + 5 = 10
 6 ÷ 5 = 1 (1)
 5 - 6 = -1
 */


public class ArithmeticCalc {
	public void calc(){
		
		// 선언
		String opcode = "";
		int a = 0, b = 0, result = 0, remain = 0; //gob = 0, sum = 0, mok = 0, nmg = 0, sub = 0;
	    String 기호 = "";
	    Scanner scanner = new Scanner(System.in);
	    
	    // 연산
		System.out.println("첫번째 숫자 입력");
		a = scanner.nextInt();
		System.out.println("연산기호 입력");
		opcode = scanner.next();
		System.out.println("두번째 숫자 입력");
		b = scanner.nextInt();
		System.out.println("=== 심플 계산기 ===");
		
		if (opcode.equals("+")) {
			result = a + b;//덧셈
			System.out.println(a + opcode + b + "=" + result);
			
		} else if(opcode.equals("-")) {
			result = a - b;//뺄셈
			System.out.println(a + opcode + b + "=" + result);
		} else if(opcode.equals("*")){
			result = (a*b); //곱셈
			System.out.println(a + opcode + b + "=" + result);
		} else if(opcode.equals("/")){
			result = (a/b);
			remain = (a%b);
			//나눗셈
			System.out.println(a + opcode + b + "=" + result+"\t"+(remain));
		}else{
			System.out.println("입력된 값이 올바르지 않습니다.");
		}
	
		
	}
		
	
}

package loop;

import java.util.Scanner;

/*
 * 입력 받은 수 1 부터 입력받은 수 10 까지의 수중에서 가각 짝수의 합과 홀수의 합을 분리해서 출력하시오
 */
public class EvenOddSum {
	public void calc() {
		int a=0, b=0, evenSum=0, oddSum=0; //지변초기화
		Scanner scanner = new Scanner(System.in);
		System.out.println("시작값을 입력하세요");
		a = scanner.nextInt();
		System.out.println("한계값을 입력하세요");
		b = scanner.nextInt();
		
		// 오더: 범위내에세 연산 값의 출력이라면,
		for (int i = a; i <= b; i++) {
			if ((i % 2) == 0) { // a 와 b는 고정된 상수. i 는 회전때마다 바뀌는 인덱스 변수 
				evenSum += i;
				
			} else {
				oddSum += i;

			}
			
		}
		System.out.println(a+" 부터 "+ b +" 까지의 정수 중에서 \n"
				+ "짝수의 합은 "+evenSum+" 이고 \n"
				+ "홀수의 합은 "+oddSum+" 이다.");
		
	}
}

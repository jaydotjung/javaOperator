package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : Me
 * @ Story : int 형 배열에서 입력값 중 최대값 구하기
 */

		//배열 선언 및 초기화 
		// for-loop 으로 입력받고
		// 비교로직은 if를 쓴다. 
		
public class InputMax {
	public static void main(String[] args) {
		int max=0;
		System.out.println("3개의 점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int [3]; 
		
		
		//연산부
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		if (arr[i]>max) {
			max = arr[i];
			
			}
		
		}
		
		System.out.println("1등은"+max+"점입니다.");
	}
}

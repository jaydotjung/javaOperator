package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : Me
 * @ Story : int 형 배열 입력예제
 */
public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0, avg=0;
		//int a=0, b=0, c=0;
		System.out.println("3개의 숫자를 입력하세요");
		int[] arr = new int[3]; // 3개 숫자 저장 공간
		// 배열에 값을 입력하라고 하면 무조건 for Ctrl + sapce
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		} 
		// 입력된 값을 합산 보세요
		for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr[i] + "\t");
			sum += arr[i]; 
			avg = (sum/3); 
		}
		System.out.println("합 :" + sum);
		System.out.println("평균 :" + sum/arr.length);
			
		
	}
}

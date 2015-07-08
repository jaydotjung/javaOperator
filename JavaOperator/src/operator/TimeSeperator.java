package operator;

import java.util.Scanner;

public class TimeSeperator {
	public static void main(String[] args) {
		/*
		 * 입력받은 초를 시간 분 초로 환산하는 프로그램
		 */
		// 변수의 선언
		Scanner scanner = new Scanner(System.in);
		int input= 0, second = 0, minutes = 0, hour=0;
		System.out.println("구하고자 하는 시간(초) 입력 :");
		input = scanner.nextInt();
		// 입력받은 초가 500이라 한다면, 500초를 60으로 나눈 나머지가 초
		//윗 연산에서 나온 몫을 다시 60으로 나눈 나머지가 분 
		//윗 연산에서 나온 몫이 시간
		second = input % 60;
		minutes = (input/60) % 60;
		hour = (input / 60) /60;
		
		System.out.println("입력하신 "+input+"는 "+hour+"시간 "+minutes+"분 "+second+"초입니다");
		
	}
}

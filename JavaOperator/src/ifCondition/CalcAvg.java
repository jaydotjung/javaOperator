package ifCondition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : Me
 * @ Story : if-else 예제
 * 	프로그램을 하나 개발.
 * 오더: 학생	  국어  영어   수학	총점	평균	합격여부
 * -------------------------------------
 * 	  (홍길동) (90) (90) (90) (270) (90) (합격)
 * 평군이 90점 이상이면 장학생
 * 평균이 70점 이상 - 90 미만이면 합격
 * 평균이 70점 미만이면 불합격
 * */
public class CalcAvg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		 String student = "학생";
		int Kor=0, Eng=0, Math=0, Sum=0, Avg=0; 
		
		
		System.out.println("학생 이름을 입력");
		student = scanner.next();
		System.out.println("국어 점수를 입력");
		Kor = scanner.nextInt();
		System.out.println("영어 점수를 입력");
		Eng = scanner.nextInt();
		System.out.println("수학 점수를 입력");
		Math = scanner.nextInt();
		Sum = Kor+Eng+Math;
		Avg = (Kor+Eng+Math)/3;
		System.out.println(student+"의");
		System.out.println("총점:"+Sum);
		System.out.println("평균:"+Avg);
		
		if (Avg>90) {
			System.out.println("장학생");
			
		}else if ((Avg>70) && (Avg<90)){
			System.out.println("합격");
			
			
		}
		 
				
	}
	
	

}

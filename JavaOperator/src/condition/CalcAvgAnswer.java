package condition;

import java.util.Scanner;

public class CalcAvgAnswer {
	public void calcAvgAnswer(){

		// 선언부
			String name = "", msg="";
			// 점수는 연산을 해야되서 int 타입으로 정해져야 한다.
		int Kor=0, Eng=0, Math=0, Sum=0, Avg=0;
		
		// 연산부
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 :");
		name = scanner.next(); 
		System.out.println("국어 :");
		Kor = scanner.nextInt();
		System.out.println("영어 :");
		Eng = scanner.nextInt();
		System.out.println("수학 :");
		Math = scanner.nextInt();
		Sum = Kor + Eng + Math;
		Avg = (int)Sum/3;
		
		if (Avg >= 90) {
			msg = "장학생";
			
		} else if ((Avg >= 70) && (Avg < 90)) {
			msg = "합격";
		} else {
			msg = "불합격";
		}{

		}
			
		// 출력부
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------");
		System.out.println(name +"\t"+ Kor +"\t"+ Eng +"\t" + Sum +"\t" + Avg +"\t" + msg);
	}
}

package condition;
/*
 * @ Date : 2015.07.10
 * @ Author : Me
 * @ Story : switch 예제 (합격여부 구하기)
 */
import java.util.Scanner;

public class SwitchAvg {
	public  void calc() {
		// 선언부
					String name = "", msg="";
					// 점수는 연산을 해야되서 int 타입으로 정해져야 한다.
				int Kor=0, Eng=0, Math=0, Sum=0, Avg=0, flag=0;
				
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
				//아래부분을 switch-case로 전
				
				flag = Avg/10;
					
				
				switch (Avg/10) {
				case 10:case 9: msg="장학생"; break;
				case 8: case 7: msg="합격"; break;
				default:msg="불합격";break;
				}
				
				// 출력부
				System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
				System.out.println("-----------------------------------------------------------");
				System.out.println(name +"\t"+ Kor +"\t"+ Eng +"\t" +Math + "\t" + Sum +"\t" + Avg +"\t" + msg);
	}

}

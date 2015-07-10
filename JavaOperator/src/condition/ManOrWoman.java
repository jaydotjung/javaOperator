package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.10
 * @ Author : Me
 * @ Story : switch 예제 (성 판결)
 */
public class ManOrWoman {
	public void ssn() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(예800101-2123456)");
		String ssn = scanner.next(), msg=""; 
		/*
		 charAt(n) 이 메소드는 0부터 시작하여 n번째 글자 하나만 출력하는데, 출력결과를 프로그래밍에서는 '리턴' 값이라고 한다. 
		 위 예 같은 상황에서는 리턴값이 2가 된다.
		*/
		char ch = ssn.charAt(7);
		
		switch (ch) {
		case '1':case '3': msg="남자"; break;
		case '2':case '4': msg="여자"; break;
		case '5': msg="외국인"; break;
		default:msg="잘못 입력한 값입니다.";break;
		}
		System.out.println("입력하신 SSN은 "+msg+"입니다.");
	}
}

package demo;

import java.util.Scanner;

public class SimpleAccountMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SimpleAccountVO simpleAccountVO = new SimpleAccountVO();
		String inputName = scanner.next();
		int inputMoney = scanner.nextInt();
		String name = simpleAccountVO.name(inputName);
		int jango = simpleAccountVO.jango(inputMoney);

		System.out.println(name + "씨" + inputMoney + "만원 입금되었습니다." + "잔고는"
				+ jango + "만원입니다.");
	}
}

package starbucks;

import java.util.Scanner;

public class Angel {
	public static void main(String[] args) {
		AngelCoffee kim = new AngelCoffee();
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("설탕 첨가 여부를 묻는다 (1번은 무설탕 2번은 설탕)");
		kim.prepare(scanner.nextInt());*/
		AngelTea lee = new AngelTea();
		System.out.println("티백 첨가 여부를 묻는다 (3번은 레몬티 4번은 자몽티)");
		lee.prepare(scanner.nextInt());
	}
}

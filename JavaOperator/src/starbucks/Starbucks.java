package starbucks;

import java.util.Scanner;

public class Starbucks {
	public static void main(String[] args) {
		/*
		 인터페이스를 구현한 클래스의 객체 생성문법
		 인터페이스 인스턴스 = new 생성자 (); 
		 * */
		Recipe coffee = new Coffee();
		coffee.boilWater();
		coffee.brew();
		coffee.pourInCup();
		System.out.println("설탕 첨가 여부를 묻는다 (1번은 무설탕 2번은 설탕)");
		Scanner scanner = new Scanner(System.in);
		coffee.select(scanner.nextInt());
		coffee.serve();
		
		Recipe tea = new Tea();
		tea.boilWater();
		tea.brew();
		tea.pourInCup();
		System.out.println("티백 첨가 여부를 묻는다 (3번은 레몬티 4번은 자몽티)");
		tea.select(scanner.nextInt());
		tea.serve();
	}
}

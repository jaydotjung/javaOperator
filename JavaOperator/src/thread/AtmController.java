package thread;

public class AtmController {
	public static void main(String[] args) {
		
		Atm atm = new Atm(); 
		/*
		 인터페이스타입 객체 = new 임프리먼트클래스 이름();
		 */
		Runnable kim = new AtmUser(atm, "김유신"); 
		Runnable lee = new AtmUser(atm, "이순신"); 
		Runnable kang = new AtmUser(atm, "강감찬"); 
		Runnable hong = new AtmUser(atm, "홍길동");
		// 디자인패턴 : 데코레이션 패턴
		// 케익 + 과일 => 과일케익
		// thread란 케익에 kim이라는 데코를 올린 모양. 
		Thread t1 = new Thread(kim);
		t1.start(); // start()를 호출해야 콜백메소드인 run()을 호출한다. 
		Thread t2 = new Thread(lee);
		t2.start();
		Thread t3 = new Thread(kang);
		t3.start();
		Thread t4 = new Thread(hong);
		t4.start();
	}
}

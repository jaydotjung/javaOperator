package encapsulation;
/*
 * @ Date : 2015.07.15
 * @ Author : Me
 * @ Story : 생성자 문법 
 * 생성자는 setter를 통해 값을 할당하는 기능을 보강하여, 
 * 객체가 만들어짐과 동시에 값을 할당하도록 특수하게 만들어진 ★★★메소드. 
 */
public class CardBean {
	/*===== field =====*/ 
	private String name,name2; //멤변은 초기화 하지 않음
	private int number,number2; 
	/*===== constructor =====*/ 
		// 생성자 위치는 (멤버)필드와 메소드 영역 사이에 위치
		// 생성자 모양
		// public 클래스 이름(){}
	public CardBean(){} // 디폴트 생성자 
	public CardBean(String name) {
		// setter 역할을 겸용하는 생성자. 
		this.name = name; 
		this.number = (int) ((Math.random()*13)+1);; 
	}
	// 디폴트 생성자는 개발자가 직접 만들지 않아도 프로그램 내부에서는 생성되있는 것으로 인식한다. 
	// 그런데, 이것을 꺼내든 이유는, 
	// new 키워드를 통한 객체생성 역할뿐 아니라
	// 생성과 동시에 값을 할당하는 기능을 추가 시키기 위해서... 
	
	
	/*===== Method =====*/
	public String getName(){
		return name;
	}
	public int getNumber() {
		return number;
	}
	public String getWinner() {
		//getter에서 문제해결 패턴 
		//제일 먼저 리턴타입을 카피 
		String winner = "";//this를 안하면 멤변에 있는 number를 표기함
		if (this.number > this.number2) {
			winner = name + "승리"; 
			
		} else if(this.number2 > this.number){
			winner = name2 + "승리"; 

		} else{
			winner = "비김"; //winner는 위에서 string값으로 지정했음 
		}
		return winner;
	}
	@Override
	public String toString() {
		return "["+name+" : "+number+"] vs ["+name2+" : "+number2+"]\n"
				 +this.getWinner()+" 승리";
	}
	
}

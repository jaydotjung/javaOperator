package encapsulation;

public class CardBean2 {
	
	private String name,name2; //멤변은 초기화 하지 않음
	private int number,number2; 
	
	public void setName(String name) { //() 안에 값을 파라미터라 하고 소속은 지변 (스캐너로 받아들인 값) 
		this.name = name;
		// this.name 은 인스턴스변수(멤변)이고 
		// = name은 파라미터로 넘어온 지변(스캐너가 받은 값) 
		// 스캐너가 받아 논 값을 가진 지변 값을 멤변 name에 할당하라. 
		// 파라미터값과 멤변값의 이름은 달라도 상관없다. 
		// 단, 데이터타입 (String, int)은 반드시 일치해야한다. 
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
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

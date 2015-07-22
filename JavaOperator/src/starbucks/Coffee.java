package starbucks;

public class Coffee implements Recipe{
//필드
	private String coffee; // coffee 인스턴스 변수
//생성자
//멤버메소드	
	@Override
	public void boilWater() {
		System.out.println("물을 끓인다");
	}

	@Override
	public void brew() {
		System.out.println("커피를 내린다");
		
	}

	@Override
	public void pourInCup() {
		System.out.println("물을 컵에 붓는다");
		
	}

	@Override
	public void select(int option) {
		
		
		 
		switch (option) { // option은 지역변수 
		case 1 : this.coffee = "블랙"; break;
		case 2 : this.coffee = "밀크"; break;

		default: this.coffee = "선택오류";
			break;
		}
		
	}

	@Override
	public void serve() {
		System.out.println("고객님 " + this.coffee + " 커피가 나왔습니다.");
	}

}

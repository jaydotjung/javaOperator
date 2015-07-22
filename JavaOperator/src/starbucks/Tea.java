package starbucks;

public class Tea implements Recipe{
private String tea;
	@Override
	public void boilWater() {
		System.out.println("물을 끓인다");
	}

	@Override
	public void brew() {
		System.out.println("티백을 넣는다");
	}

	@Override
	public void pourInCup() {
		System.out.println("물을 컵에 붓는다");
		
	}

	@Override
	public void select(int option) {
		switch (option) {
		case 3: this.tea = "레몬"; break;
		case 4: this.tea = "자몽"; break;

		default:
			break;
		}
		
	}

	@Override
	public void serve() {
		System.out.println("고객님 " + this.tea + "티가 나왔습니다.");
		
	}
	

}

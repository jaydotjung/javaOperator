package condition;

public class OnlyIf {
	public static void main(String[] args) {
		int x = 1, y = 2; // 지변 초기화
		if ((x==1) && (y == 1)) { // && 엔퍼센트라 읽는다 (연산자)
			System.out.println("x는 1 이면서, y도 2 이다.");
		}
		if ((x==1)||(y==1)) { // || 컬럼이라 읽는다 (연산자)
			System.out.println("x는 1 이거나, y는 2 이다.");
		}
	}

}

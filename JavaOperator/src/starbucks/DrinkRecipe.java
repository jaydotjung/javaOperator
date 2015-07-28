package starbucks;
/*
 추상클래스
 - 추상메소드를 가지고 있는 것은
    인터페이스와 동일하나, 구상메소드({}를 가지고 있는것) 
    도 추가로 가질 수 있고,
    객체 생성시 개발자 마음대로 메소드를 추가하여도
    문제가 없다. 
 * */

public abstract class DrinkRecipe {
	public void prepare(int option){
		boilWater();
		brew();
		pourInCup();
		select(option);
		serve();		
	}
	private void boilWater(){ // abstract과 같은 맥락인데 다른 문법이다.
		System.out.println("물을 끓인다");
	}
	abstract void brew(); // ****추상메소드는 private이 허용되지 않는다. 
						  // ****외부에서 접근 금지를 하려면 디폴트상태로 둔다!!! 
	private void pourInCup(){
		System.out.println("컵에 물을 붓는다");
	}
	abstract void select(int option);
	abstract void serve();
	
}

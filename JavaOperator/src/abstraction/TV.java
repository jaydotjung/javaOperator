package abstraction;

public class TV extends ProductSpec{
	// 주어진 것만 하라고 했으면 ProductSpec에서 마무리했을텐데, 
	// 그런데, 추가정보를 더하라고 했으면 상속. 
	private String screenSize;
	private String screenType;
	//write info + show info 단축키
	

	public void writeInfo(String Company, 
			String name, 
			String serialNo,
			String screenSize,
			String screenTrype) {
		super.writeInfo(Company, name, serialNo);
		// 부모에게 선언된 public 메소드에 접근, 사용 가능
		// 어떻게? super라는 키워드를 통해서... 
		this.screenSize = screenSize;
		this.screenType = screenTrype;
		
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("스크린 사이즈 :" + this.screenSize);
		System.out.println("스크린 타입 :" + this.screenType);
	}

}

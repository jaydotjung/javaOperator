package abstraction;

public class ShieldRobot extends BasicBot{

/*=== 필드 ===*/
	private int shieldpoint;
	/*=== 생성자 ===*/
	/*===멤버메소드===*/
@Override
	public void status() {
		super.status();
		System.out.println("방어력 :" + this.shieldpoint);
	}

public void setShieldpoint(int shieldpoint) {
	this.shieldpoint = shieldpoint;
	}


}

package abstraction;

public class GunRobot extends BasicBot{
	private int attackpoint; // 공격력
	
	public void setAttackpoint(int attackpoint) {
		this.attackpoint = attackpoint;
	}
	@Override
	public void status() {
	
		super.status();
		System.out.println("로봇 공격력 :" + this.attackpoint );
	}
	
	
	
}

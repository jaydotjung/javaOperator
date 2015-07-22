package abstraction;

import java.util.Iterator;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 GunRobot
		 ShieldRobot
		 
		 출력
		 건로봇은 속도는 10, 에너지는 10, 공격력은 50
		 -공격력은 인스턴스 변수로 int attackPoint
		 쉴드로봇은 속도는 20, 에너지는 20, 방어력은 50
		 -방어력은 인스턴스 변수로 int shieldPoint 
		 * */
		GunRobot g = new GunRobot();
		g.charge(10);
		g.run(10);
		g.setAttackpoint(50);
	//  g.status();
		ShieldRobot s = new ShieldRobot();
		s.charge(20);
		s.run(20);
		s.setShieldpoint(50);
	//	s.status();
		Robot[] robots = new Robot[2];
		robots[0] = g;
		robots[1] = s;
		// 확장된 for 문
		for (Robot robot : robots) {
			robot.status();
		}	
	}
}

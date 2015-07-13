package Controller;
/*
 * @ Date : 2015.07.09
 * @ Author : Me
 * @ Story : OperatorControlloer
 */
import loop.EvenOddSum;
import condition.ArithmeticCalc;
import condition.CalcAvgAnswer;
import condition.ManOrWoman;
import condition.SwitchAvg;

//불러올때는 메인이 없는 코드를 이용해야함. 

public class OperatorController {
	public static void main(String[] args) {
		//2015.07.09 성적 계산기
		CalcAvgAnswer avg = new CalcAvgAnswer(); 
		//avg.calcAvgAnswer();
		
		//2015.07.09 사칙 연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc ();
		//	calc.calc();	
		
		//2015.07.10 스위치 성적 계산기
		SwitchAvg avg2 = new SwitchAvg();
		//avg2.calc(); 
		
		//2015.07.10
		ManOrWoman manOrWoman = new ManOrWoman();
		//manOrWoman.ssn(); //ssn() 원 클래스의 메소드 이름이다. 
		
		//2015.7.13
		EvenOddSum evenOddSum = new EvenOddSum();
		evenOddSum.calc(); // 객체가 메소드를 호출한다. 
			
	}
}

package Controller;
/*
 * @ Date : 2015.07.09
 * @ Author : Me
 * @ Story : OperatorControlloer
 */
import ifCondition.ArithmeticCalc;
import ifCondition.CalcAvgAnswer;

//불러올때는 메인이 없는 코드를 이용해야함. 

public class OperatorController {
	public static void main(String[] args) {
		//2015.07.09 성적 계산기
		CalcAvgAnswer avg = new CalcAvgAnswer(); 
		//avg.calcAvgAnswer();
		
		//2015.07.09 사칙 연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc ();
		calc.calc();
		
	}
}

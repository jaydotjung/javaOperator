package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.10
 * @ Author : Me
 * @ Story : if-else 예제 (큰 수 구하기)
import java.util.Scanner;
*/
public class BigNumber {
	public static void main(String[] args) {
		/*
		 * 문제) 학생 세명의 점수를 입력받아서 1등 출력 (0점~100점)
		 * 결과:1등은 98점입니다.
		 * 힌트: a 와 b 비교, b 와 c 를 비교, a 와 c 를 비교  
		 */
		// 선언
		Scanner scanner = new Scanner(System.in);
		int a=0, b=0, c=0, top=0; 
		
		// 연산
		System.out.println("첫번째 점수 입력");
		a = scanner.nextInt();
		System.out.println("두번째 점수 입력");
		b = scanner.nextInt();
		System.out.println("세번째 점수 입력");
		c = scanner.nextInt();
		
		// 출력
		  if(a>b && a>c){
	            top = a;
	            
	        } else if (a<b && b>c){
	           top = b;
	        
	        }else if (c>a && c>b) {
	        	top = c;
				
			}
	        else {
	            System.out.println("동점자가 존재합니다.");
	        }
		  System.out.println("1등은 "+top+"점입니다");	
	}

}

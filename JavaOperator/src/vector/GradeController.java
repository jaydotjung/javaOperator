package vector;

import java.util.Scanner;

public class GradeController {
public static void main(String[] args) {
	GradeService service = new GradeServiceImpl();
	
	while (true){
		System.out.println("1. 성적입력 2. 성적조회(학번) 3. 성적");
		input = Scanner.nextInt 
				Scanner scanner = new Scanner(System.in);
				if(input ! = 0){
					switch(key){
					case 1: // 성적 입력
						System.out.println("학번 :");
						String hakbun = scanner.next(); 
						System.out.println("이름 :");
						String name = scanner.next();
						System.out.println("국어 :");
						int kor = scanner.nextInt();
						System.out.println("영어 :");
						int eng = scanner.nextInt();
						System.out.println("수학 :");
						int math = scanner.nextInt();
						Grade grade = new Grade(hakbun, name, kor, eng, math);
						service.input(grade);
						break;
					case 2: //성적 조회(학번)
						System.out.println("학번 :");
						System.out.println(service.searchGradeByHakbun(scanner.next()));
						break; 
					case 3: //성적조회(이름)
						System.out.println("학번 :");
						System.out.println(service.searchGradesByName(scanner.next()));
						break;
					case 4: //전체성적
						service.printList();
					case 5: //성적순
						
						break;
					case 6: //이름순
						break;
					default: System.out.println("에러발생");
					
						
					}
				}
	}
}
}

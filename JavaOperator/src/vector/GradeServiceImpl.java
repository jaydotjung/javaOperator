package vector;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
public class GradeServiceImpl implements GradeService{
	 private Vector<Grade> grades = new Vector<Grade>();
	    private Grade grade;
	    
	    /*
	     * 파라미터 타입이 객체 자체이므로, 개발자 국어, 영어 이런 값들을
	     * 핸들링 할 필요가 없다.
	     * */
	    @Override
	    public void input(Grade grade) {
	        grades.add(grade);
	    //    grades.addElement(grade);
	        
	    }
	 
	    @Override
	    public void printList() {
	        /*
	         * 벡터 내부에 toString() 을 호출하면
	         * 요소(엘리머트) 내부에 정의된 toString() 을
	         * 각각 호출해 준다.
	         * */
	        System.out.println(grades.toString());
	        
	    }
	 
	    @Override
	    public String searchGradeByHakbun(String hakbun) {
	        String  msg = "";
	        String searchedHakbun = "",name=""; // 검색하려는 학번
	        int kor = 0,eng=0,math=0;
	        for (int i = 0; i < grades.size(); i++) {
	            searchedHakbun = grades.elementAt(i).getHak();
	            if (hakbun.equals(searchedHakbun)) {
	                name = grades.elementAt(i).getName();
	                kor = grades.elementAt(i).getKor();
	                eng = grades.elementAt(i).getEng();
	                math = grades.elementAt(i).getMath();
	                // 객체를 이루는 필드값을 다 알아낸 다음...
	                grade = new Grade(searchedHakbun, name, kor, eng, math);
	                msg = grade.toString();
	                break;
	            } else {
	                msg = "검색하려는 학번이 없습니다.";
	            }
	        }
	        return msg;
	    }
	 
	    @Override
	    public Vector<Grade> searchGradesByName(String name) {
	    	Vector<Grade> temp = new Vector<Grade>();
	    	Grade grade = null;
	    	for (int i = 0; i < vec.size(); i++) {
				if (condition) {
					
				} else {

				}
			}
	        return temp;
	    }

		@Override
		public void descByTotal() {
			//Java API 중에서 정렬담당 클래스 Comparator
			//comparator
			//인터페이스를 구현한 익명 내부 클래스
			//anonymous inner class
			Comparator<Grade> desc = new Comparator<Grade>() {
				
				@Override
				public int compare(Grade g1, Grade g2) {
					//삼항연산자
					/*
					 if (condition) {
					 --> true 면 statement실행
					 } else{
					 --> false면 statement 실행
					 }
					 
					 (condition) ? 참 : 거짓; 
					 
					 */
					/*if ((g1.getTotal()<g2.getTotal())) {
						return 1;
						
					}else {
						if (g1.getTotal()==g2.getTotal()){
							return 0;
						}else{
							return -1;
						}
					}*/
				return (g1.getTotal()<g2.getTotal()) ? 1 : 
						(g1.getTotal()==g2.getTotal()) ? 0 :-1 ;
				}
			}; 
			Collections.sort(vec,desc);
			System.out.println(vec.toString);
		}

		@Override
		public void ascByName() {
			Comparator<Grade> asc = new Comparator<Grade>(){

				@Override
				public int compare(Grade g1, Grade g2) {
					//값<value> 이 int 타입이 아니고
					//string 타입의 우선순위 결정할 때는
					//compareTo() 메소드를 사용해야 한다. 
					return g1.getName().compareTo(g2.getName());
				}
				
			};
			Collections.sort(vec, asc);
			System.out.println();
		}
}

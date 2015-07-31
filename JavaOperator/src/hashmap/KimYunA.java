package hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
// integer와 while 
public class KimYunA {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		/*
		 키값이 스트링이고, 벨류가 숫자인 헤시맵 객체를 생성
		 list 계열은 add
		 map 계열은 put
		 */
		map.put("김연아", new Integer(98)); //int 타입은 맵에 들어올수없다
		map.put("아사다 마오", new Integer(60));
		map.put("소트니코바", new Integer(30));
		/*
		 디자인패턴 23가지 중에서 Iterator 패턴을 사용해서 맵의 값을 출력합니다. 
		 */
		/*
		 지금까지는 객체를 생성하라고 하면
		 Set set = new Set(); 으로 만들었는데 Set, Iterator 는 
		 이처럼 생성하지 않고
		 다른 객체를 통해 리턴받는 방식으로 생성을 하고
		 이를 팩토리 패턴이라고 한다. 
		 */
		/*1. 키와 밸류를 동시에 출력*/
		Set set = map.entrySet();
		// Iterator 순환기 => 지하철 2호선과 같은 개념 
		Iterator it = set.iterator();
		// it.hasNext() 은 밸류(값)가 커서 (이터레이터) 다음에
		// 있는지 없는지를 따져서 있으면 while 룹을 계속 돌리고 
		// 없으면 스톱한다. 
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("참가자 :" + e.getKey()+", 점수 :" + e.getValue());
		}
		
		/*2.키만(<k,v>) 출력하는경우*/
		set = map.keySet();
		System.out.println("참가자 명단 :" + set);
		//set은 toString() 이 내부적으로 오버라이딩 되어있다.
		//따라서 set.toString() 하지 않아도 출력
		
		/*3.밸류만 (<k,v>) 출력하는 경우 */
		Collection values = map.values();
		Iterator it2 = values.iterator();
		int total = 0; // 지변이니깐 디폴트값으로 초기화. 
		while (it2.hasNext()) {
			//맵 내부에서는 int가 기본형이라 올 수 없고
			//반드시 Integer(=기본형 int 의 Wrapper래퍼클래스) 타입으로 와야한다. 
			Integer i = (Integer) it2.next();
			total += i.intValue(); //각 선수들의 점수 합계
		} 
		System.out.println("이번 대회 평균점수 :" + total/set.size());
		System.out.println("최고점수 :" + Collections.max(values));
		System.out.println("최저점수 :" + Collections.min(values));
		//위쪽에 있는 Collection은 인터페이스
		//아래쪽에 있는 Collections는 클래스 
		//클래스.메소드() 이런 형태로 나오면 이 메소드는 클래스메소드라고 부르고 다른말로는 
		//static method 라고 부른다. 
	}
}

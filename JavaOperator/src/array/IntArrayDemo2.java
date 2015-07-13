package array;
/*
 * @ Date : 2015.07.13
 * @ Author : Me
 * @ Story : int 형 배열 예제
 */
public class IntArrayDemo2 {
	public static void main(String[] args) {
		/*
		 * 자바 배열의 특징
		   1. 배열의 0부터 인덱스 번호가 시작된다.
		   2. 배열의 크기 = 배열의 요소의 갯수
		   3. 배열은 크기가 고정되어 있으며 요소를 추가할 수 없다. 
		   4. 배열은 한가지 타입만 지정할 수 있다. 
		 */
		
		int[] arr = new int[3]; // 여기서 3은 요소의 갯수 = 배열의 크기 
		arr[0] = 1; // 배열 첫 번째칸에 숫자 1을 담는다. 
		arr[1] = 2; // 배열 두 번째칸에 숫자 2를 담는다.
		arr[2] = 3; // 배열 세 번째칸에 숫자 3을 담는다. 
	//	arr[3] = 4; // 이것은 지금은 에러표시를 하지 않지만 돌리면 에러가 발생. 
		for (int i = 0; i < arr.length; i++) {
			// arr 은 바로 직전에 선언한 객체[배열] 이름
			// 배열객체.length 는 배열의 크기입니다.
			System.out.print(i + "\t");
			
		}
	}
}

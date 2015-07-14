package encapsulation;

public class PayBean {
	// 메소드는 선언부, 연산부, 출력부 이렇게 나누고 
	// Bean 클래스라면 멤버필드 + 멤버메소드

	//멤버필드
	private String name; // 멤버필드 변수는 초기화 하지 않는다!!
	private int salary, tax, revenue;
	
	//멤버메소드 영역이 시작
	//스캐너로 받는 영역은 set, 받아야하는건 get
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getTax() {
		int tax=0; // 지변은 초기화
		tax = (int) (salary * 0.1); 
		return tax;
	}
	
	/*
	 * this는 이 클래스 내부에 있는 "~~~" 의미
	 */
	
	public int getRevenue() {
		int revenue=0; 
		revenue = (salary - this.getTax()); // 그냥 tax를 적으면 메버필드의 tax가 들어오기때문에  getTax를 이용.
		return revenue;
	}
	
	@Override
	public String toString() {
	return	"["+this.name+" 실급여]\n" 
				+ "월급 : "+this.salary+"만원 \n"
						+ " 세금 : "+this.getTax()+"만원 \n "
								+ "실급여: "+this.getRevenue()+"만원";
		
	}
}

package bank;

public class Bank implements BankRole{
	// 필드
	// 생성자
	// 멤버메소드
	// 계좌계설
	@Override
	public void openAccount(String accountNo, String OwnerName,
			String password, int restMoney) {
		// TODO Auto-generated method stub
		
	}
	@Override
	// 계좌검색 (계좌번호) -> 리턴결과 : 한개
	public Account searchAccountByAccountNo(String accountNo) {
		Account account = null;
		return account;
	}
	// 계좌검색 (이름) -> 리턴결과 : 계좌 여러개
	@Override
	public Account[] searchAccountByName(String ownerName) {
		Account[] accounts = null;
		return accounts;
	}
	// 계좌검색 (이름) -> 리턴결과 : 숫자
	@Override
	public int serachCountByName(String name) {
		int count = 0;
		return count;
	}
	// 계좌해지 -> 리턴결과 : true or false
	@Override
	public boolean closeAccount(String accountNo) {
		boolean flag = false; 
		if (flag) {
			
		} else {

		}
		return flag;
	}

}

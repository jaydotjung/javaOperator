package bank;
/*
 사용자 입장에서 계좌 관리하는 기능
 * */
public interface Account {
	public void setPass(int pass); //비밀번호 입력
	public void deposit(int money); //예금
	public abstract void withdraw(int money); //출금 
	public String showAccount(); //계좌출력
}

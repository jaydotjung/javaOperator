package bank;

public class BankBook{
	public static String Bank;
	private int bankbookNo;
	private String name;
	private int money;
	private int pass;
	private String msg;
	
	public static String getBank() {
		return Bank;
	}

	public int getBankbookNo() {
		return bankbookNo;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	public int getPass() {
		return pass;
	}

	public String getMsg() {
		return msg;
	}

	public static void setBank(String bank) {
		Bank = bank;
	}

	public void setBankbookNo(int bankbookNo) {
		this.bankbookNo = bankbookNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public BankBook(String name){
		this.Bank="아이티뱅크";
		this.bankbookNo = (int) ((Math.random()*99999)+10000);
		this.name = name; 
	}
	
	public String showAccount(){
		return "";
	}

	public void setPass(int pass){
		this.pass = pass; 
	}
	
	public void deposit(int money) {
		// TODO Auto-generated method stub
		
	}

	
	public void withdraw(int money) {
		// TODO Auto-generated method stub
		
	}

}


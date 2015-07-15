package encapsulation;

public class CardGame {
	// 생성자 단축키
	// CTRL + space
	private String winner; // 멤변선언

	public CardGame() {
	} // 디폴트 생성자

	public CardGame(CardBean bean1, CardBean bean2) {
		// getter에서 문제해결 패턴
		// 제일 먼저 리턴타입을 카피
		String winner = "";// this를 안하면 멤변에 있는 number를 표기함
		if (bean1.getNumber() > bean2.getNumber()) {
			winner = bean1.getName() + "승리";

		} else if (bean2.getNumber() > bean1.getNumber()) {
			winner = bean2.getName() + "승리";

		} else {
			winner = "비김"; // winner는 위에서 string값으로 지정했음
		}
		this.winner = winner;
	}

	public String getWinner() {
		return winner; 
	}
}

package Chapter6;

public class StarCoffee {
	int money;

	public String brewing(int money) {
		this.money += money;
		if (money == 4000) {
			return "별 다방 아메리카노를 구입했습니다";
		} else {
			return money == 4300 ? "별 다방 라떼를 구입했습니다" : null;
		}
	}
}
package Chapter6;

public class BeanCoffee {
	int money;

	public String brewing(int money) {
		this.money += money;
		if (money == 4100) {
			return "콩 다방 아메리카노를 구입했습니다";
		} else {
			return money == 4500 ? "콩 다방 라떼를 구입했습니다" : null;
		}
	}
}
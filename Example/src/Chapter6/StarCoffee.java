package Chapter6;

public class StarCoffee {
	int money;

	public String brewing(int money) {
		this.money += money;
		if (money == 4000) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�";
		} else {
			return money == 4300 ? "�� �ٹ� �󶼸� �����߽��ϴ�" : null;
		}
	}
}
package stream;

public class TravelCustomer {
	private String name;				// 고객이름
	private int age;						// 나이
	private int price;					// 가격

	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getPrice() {
		return this.price;
	}

	public String toString() {
		return "name: " + this.name + "age: " + this.age + "price: " + this.price;
	}
}
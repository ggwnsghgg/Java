package sec01.exam05;

public class SmartTelelvisonExample {
	public static void main(String[] args) {
		SmartTelevison tv = new SmartTelevison();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
}

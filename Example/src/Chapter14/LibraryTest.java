package Chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class LibraryTest {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList();
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		int totalPrice = bookList.stream().mapToInt((b) -> {
			return b.getPrice();
		}).sum();
		System.out.println("��� å ������ ���� " + totalPrice + "�� �Դϴ�");
		bookList.stream().filter((b) -> {
			return b.getPrice() >= 20000;
		}).map((b) -> {
			return b.getName();
		}).sorted().forEach((s) -> {
			System.out.println(s);
		});
	}
}
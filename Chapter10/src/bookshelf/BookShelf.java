package bookshelf;

public class BookShelf extends Shelf implements Queue {
	
	// �迭�� ��� �߰�
	@Override
	public void enQueue(String title) {
		shelf.add(title);
		
	}
	
	// �� ó�� ��Ҹ� �迭���� �����ϰ� ��ȯ
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	// �迭 ��� ���� ��ȯ
	@Override
	public int getSize() {
		return getCount();
	}
		
}
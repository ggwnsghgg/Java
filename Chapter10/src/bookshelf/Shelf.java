package bookshelf;

import java.util.ArrayList;

public class Shelf {
		//�ڷḦ ������� ������ ArrayList ����
		protected ArrayList<String> shelf;
		
		//����Ʈ �����ڷ� Shelf Ŭ������ �����ϸ� ArrayList�� ������
		public Shelf() {
			shelf = new ArrayList<String>();
		}
		
		public ArrayList<String>getShelf() {
			return shelf;
		}
		
		public int getCount() {
			return shelf.size();
			}
	}

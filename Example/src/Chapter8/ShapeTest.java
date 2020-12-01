package Chapter8;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapeTest {
	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList();
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Rectangle());
		Iterator var3 = list.iterator();

		while (var3.hasNext()) {
			Shape s = (Shape) var3.next();
			s.draw();
		}

	}
}
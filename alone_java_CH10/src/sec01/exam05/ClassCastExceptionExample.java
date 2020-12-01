package sec01.exam05;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	
	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
		Dog dog = (Dog) animal;		//ClassCastException �߻�
		System.out.println("DOG Ÿ�� ��ȯ �Ϸ�");
		}else if (animal instanceof Cat) {
			Cat cat = (Cat)animal;
			System.out.println("CAT Ÿ�� ��ȯ �Ϸ�");
		}else {
			System.out.println("����");
		}
	}

}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
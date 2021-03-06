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
		Dog dog = (Dog) animal;		//ClassCastException 발생
		System.out.println("DOG 타입 변환 완료");
		}else if (animal instanceof Cat) {
			Cat cat = (Cat)animal;
			System.out.println("CAT 타입 변환 완료");
		}else {
			System.out.println("예외");
		}
	}

}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
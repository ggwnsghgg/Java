package Chapter7;

public class DogTest {
	public static void main(String[] args) {
		Dog[] dogArray = new Dog[]{new Dog("�۸���", "ġ�ƿ�"), new Dog("�ǻ�", "������"), new Dog("������", "��찳"),
				new Dog("ö��", "����Ƽ��"), new Dog("����", "Ǫ��")};

		for (int i = 0; i < dogArray.length; ++i) {
			System.out.println(dogArray[i].showDogInfo());
		}

		Dog[] var5 = dogArray;
		int var4 = dogArray.length;

		for (int var3 = 0; var3 < var4; ++var3) {
			Dog dog = var5[var3];
			System.out.println(dog.showDogInfo());
		}

	}
}

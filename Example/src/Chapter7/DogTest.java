package Chapter7;

public class DogTest {
	public static void main(String[] args) {
		Dog[] dogArray = new Dog[]{new Dog("¸Û¸ÛÀÌ", "Ä¡¾Æ¿Í"), new Dog("»Ç»ß", "Áøµ¾°³"), new Dog("¼ø½ÉÀÌ", "»ð»ì°³"),
				new Dog("Ã¶ÀÌ", "¸¶¸£Æ¼½º"), new Dog("»ßÂÞ", "Çªµé")};

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

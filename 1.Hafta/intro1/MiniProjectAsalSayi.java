package intro1;

public class MiniProjectAsalSayi {

	public static void main(String[] args) {
		int number = 29;

		boolean isPrime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}

		}
		if (isPrime) {
			System.out.println("Asal sayidir.");
		}
		if (isPrime != true) {
			System.out.println("Sayi asal degildir.");

		}

	}

}

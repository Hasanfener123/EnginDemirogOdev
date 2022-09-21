package intro1;

public class ReCapDemo2 {

	public static void main(String[] args) {
		double[] myList = { 1.2,1.4,1.6,1.8 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			total=total+number;
			if (max < number) {
				max = number;
				}
			

		}
		System.out.println("Toplam=" + total);
		System.out.println("En buyuk sayi: " + max);

	}

}

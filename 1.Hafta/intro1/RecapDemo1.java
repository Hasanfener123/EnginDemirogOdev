package intro1;

public class RecapDemo1 {

	public static void main(String[] args) {
		int sayi1=26;
		int sayi2=25;
		int sayi3=2;
		
		int enBuyukSayi=sayi3;
		if(sayi2>enBuyukSayi) {
			enBuyukSayi=sayi2;
		}
		if(sayi1>enBuyukSayi) {
			enBuyukSayi=sayi1;
		}
		System.out.println("En Buyuk sayi budur:"+enBuyukSayi);

	}

}

package methods2;

public class Main {

	public static void main(String[] args) {
	String mesaj="Bugün hava çok güzel.";
	
	System.out.println("Iki sayinin toplami budur:"+topla(5,3));
	int toplam=topla2(5,4,3,2,1,15);
	System.out.println(toplam);
	
		
		
	}
	public static void ekle() {
		System.out.println("Eklendi.");
	}
	public static void sil() {
		System.out.println("Silindi.");
	}
	public static void guncelle() {
		System.out.println("Güncellendi.");
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
		
	}
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;  
	} 
	

}

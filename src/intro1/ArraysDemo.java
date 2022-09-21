package intro1;

public class ArraysDemo {

	public static void main(String[] args) {
		String ogrenci1="Engin";
		String ogrenci2="Derin";
		String ogrenci3="Salih";
		String ogrenci4="Hasan";
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		
		System.out.println("--------------------");
		
		String[] ogrenciler=new String[4];
		ogrenciler[0]="Hasan";
		ogrenciler[1]="Mehmet";
		ogrenciler[2]="Omer";
		ogrenciler[3]="Veli";
		
		System.out.println("1. Ogrenci:"+ogrenciler[0]);
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
			
		}
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}

package intro1;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		String[][] sehirler=new String[3][3];
		sehirler[0][0]="Istanbul";
		sehirler[0][1]="Kesan";
		sehirler[0][2]="Malkara";
		sehirler[1][0]="Tekirdag";
		sehirler[1][1]="Afyon";
		sehirler[1][2]="Antep";
		sehirler[2][0]="Denizli";
		sehirler[2][1]="Marmara";
		sehirler[2][2]="Bilecik";
		
		for(int i=0;i<=2;i++) {
			System.out.println("----------");
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}

	}

	} }

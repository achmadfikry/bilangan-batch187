package bilangan.soal;

public class Soal32T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ganjil
		Integer nganjil = 9;
		Integer[] deretganjil = new Integer[nganjil]; //Inisiasi jumlah indeks array
		Integer ganjil = 1;
		
		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil; //menambah angka
			ganjil = ganjil + 2;
		}
		//1 variabel
		Integer n = nganjil;
		Integer [] bilderet = new Integer[n];
		Integer deret = 0;
//		Integer hasil = 0;
		Integer bilke = 1;
		
		//2 pola
		for (int i = 0; i < bilderet.length; i++) {
			if (bilke == 1) {
				deret = deretganjil[i] * -1;
				bilke = bilke + 1;
			
			} else if (bilke == 2) {
				deret = deretganjil[i];
				bilke = 1;
			
			}else {

			}
			bilderet[i] = deret;
		}
		
		Integer nderet2 = n + 1;
		Integer [] bilderet2 = new Integer[nderet2];
		Integer deret2 = 0;
		Integer hasil = 0;		
		
		for (int i = 0; i < bilderet2.length; i++) {
			if (i < n) {
				deret2 = bilderet[i];
				if (i > 0) {
					hasil = hasil + deret2;
				} else {
					hasil = deret2;
				}
			} else {
				deret2 = hasil;
			}
			bilderet2[i] = deret2;
		}
		
		//3 cetak
		for (int i = 0; i < bilderet2.length; i++) {
			System.out.printf("%5s",bilderet2[i]);
		}

}
}
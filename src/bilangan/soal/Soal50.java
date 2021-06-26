package bilangan.soal;

public class Soal50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ganjil
		Integer n = 5;
		Integer[] deretganjil = new Integer[n]; //Inisiasi jumlah indeks array
		Integer ganjil = 1;
		
		//2 pola
		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil; //menambah angka
			ganjil = ganjil + 2;
		}

		Integer nderet = 9; 
		Integer [] bilderet = new Integer [nderet];
		Integer deret = 1;
		Integer idxganjil = 0;
		Integer bilke = 1;
		
		//2 pola
		for (int i = 0; i < bilderet.length; i++) {
			if (bilke == 1) {
				deret = deretganjil[idxganjil];
				idxganjil = idxganjil + 1;
				bilke = bilke + 1;
			} else if (bilke == 2) {
				deret = 5;
				bilke = 1;
			} else {

			}
			bilderet[i] = deret; //
		}

		Integer nderet2 = nderet + 1;
		Integer[] bilderet2 = new Integer[nderet2];
		Integer deret2 = 0;
		Integer hasil = 0;

		for (int i = 0; i < bilderet2.length; i++) {
			if (i < nderet) {
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

		
		for (int i = 0; i < bilderet2.length; i++) {
			System.out.printf("%4s", bilderet2[i]);
		}

		
	}

}

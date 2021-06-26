package bilangan.soal;

public class Soal49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ganjil
		Integer n = 9;
		Integer[] deretganjil = new Integer[n]; // Inisiasi jumlah indeks array
		Integer ganjil = 1;

		// 2 pola
		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil; // menambah angka
			ganjil = ganjil + 2;
		}

		Integer nderet = (n * 2) - 1;
		Integer[] bilderet = new Integer[nderet];
		Integer deret = 1;
		Integer idxganjil = 0;
		Integer bilke = 1;

		// 2 pola
		for (int i = 0; i < bilderet.length; i++) {
			if (bilke == 1) {
				deret = deretganjil[idxganjil];
				idxganjil = idxganjil + 1;
				bilke = bilke + 1;
			} else if (bilke == 2) {
				deret = n;
				bilke = 1;
			} else {

			}
			bilderet[i] = deret; //
		}

		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%4s", bilderet[i]);
		}

	}

}

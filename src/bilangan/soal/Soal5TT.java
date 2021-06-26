package bilangan.soal;

public class Soal5TT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 3 -5 99 9 11 -13 99 17 19
		// ganjil
		Integer n = 10;
		Integer[] deretganjil = new Integer[n]; // Inisiasi jumlah indeks array
		Integer ganjil = 1;

		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil; // menambah angka
			ganjil = ganjil + 2;
		}

		// deret
		Integer[] bilderet = new Integer[n];
		Integer deret = 0;
		Integer bilke = 1; // hanya ada 1 atau 2

		for (int i = 0; i < bilderet.length; i++) { // pengisian bil deret menggunakan bil ganjil
			if (bilke == 1) {
				deret = deretganjil[i];
				bilke = bilke + 1;
			} else if (bilke == 2) {
				deret = deretganjil[i];
				bilke = bilke + 1;
			} else if (bilke == 3) {
				deret = deretganjil[i] * -1;
				bilke = bilke + 1;
			} else if (bilke == 4) {
				deret = 99;
				bilke = 1;
			} else {

			}
			bilderet[i] = deret; //
		}

		// cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s", bilderet[i]);
		}
	}

}

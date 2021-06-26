package bilangan.soal;

public class Soal5TTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 3 10 -7 9 11 10-15 17 19
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
				deret = 10;
				bilke = bilke + 1;
			} else if (bilke == 4) {
				deret = deretganjil[i] * -1;
				bilke = 1;
			} else {

			}
			bilderet[i] = deret; //
		}

		// 3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%3s", bilderet[i]);
		}

	}

}

package bilangan.soal;

public class Soal32TT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ganjil
		Integer n = 10;
		Integer[] deretganjil = new Integer[n]; // Inisiasi jumlah indeks array
		Integer ganjil = 1;

		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil; // menambah angka
			ganjil = ganjil + 2;
		}

		Integer[] bilderet = new Integer[n];
		Integer deret = 0;
		Integer bilke = 1; // hanya ada 1 atau 2
		
		for (int i = 0; i < bilderet.length; i++) { // pengisian bil deret menggunakan bil ganjil
				if (bilke == 1) {
					deret = deretganjil[i] * -1;
					bilke = bilke + 1;
				} else if (bilke == 2) {
					deret = deretganjil[i];
					bilke = 1;
				} else {

				}
				bilderet[i] = deret;
		}

		Integer jumlah = 0;

		for (int i = 0; i < bilderet.length; i++) {
			if (i <= n - 2) {
				jumlah = jumlah + bilderet[i];
			} else {
				bilderet[i] = jumlah;
			}
		}

		//cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);
		}

	}

}

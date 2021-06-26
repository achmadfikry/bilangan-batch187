package bilangan.soal;

public class Soal20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 variabel
		Integer n = 9;
		Integer ganjil = 44;
		Integer[] bilderet = new Integer[n];

		Integer deret = 0;
		Integer bilke = 1; // hanya ada 1 atau 2

		// 2 pola
		for (int i = 0; i < bilderet.length; i++) { // pengisian bil deret menggunakan bil ganjil
			if (bilke == 1) {
				deret = ganjil;
				ganjil = ganjil - 3;
				bilke = bilke + 1;

			} else if (bilke == 2) {
				deret = ganjil;
				ganjil = ganjil + 6;
				bilke = 1;
			} else {

			}
			bilderet[i] = deret;
		}

		// 3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s", bilderet[i]);
		}

	}

}

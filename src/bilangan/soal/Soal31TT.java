package bilangan.soal;

public class Soal31TT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//genap
		Integer n = 10;
		Integer[] deretgenap = new Integer[n]; //Inisiasi jumlah indeks array
		Integer genap = 2;

		for (int i = 0; i < deretgenap.length; i++) {
		deretgenap[i] = genap;
		genap = genap + 2;
		}

		//deret
		Integer[] bilderet = new Integer[n];
		Integer deret = 0;
		Integer bilke = 1; // hanya ada 1 atau 2

		for (int i = 0; i < bilderet.length; i++) { // pengisian bil deret menggunakan bil genap
			if (bilke == 1) {
				deret = deretgenap[i];
				bilke = bilke + 1;
			} else if (bilke == 2) {
				deret = deretgenap[i] * -1;
				bilke = 1;
			} else {

			}
			bilderet[i] = deret; //
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

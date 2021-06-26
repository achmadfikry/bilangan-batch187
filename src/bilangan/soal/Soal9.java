package bilangan.soal;

public class Soal9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// -2 x 100 -8 x 100 -14 x 100 -20
		// genap
		Integer n = 10;
		Integer[] bilgenap = new Integer[n];
		Integer genap = 2;

		for (int i = 0; i < bilgenap.length; i++) {
			bilgenap[i] = genap;
			genap = genap + 2;
		}

		// deret
		String[] bilderet = new String[n];
		String deret = null;
		Integer bilke = 1; // hanya ada 1 atau 2

		for (int i = 0; i < bilderet.length; i++) { // pengisian bil deret menggunakan bil g
			if (bilke == 1) {
				deret = String.valueOf(bilgenap[i] * -1);
				bilke = bilke + 1;
			} else if (bilke == 2) {
				deret = "x";
				bilke = bilke + 1;
			} else if (bilke == 3) {
				deret = "100";
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

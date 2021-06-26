package bilangan.soal;

public class Soal20T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 44 41 47 44 50 47 53 50 56
		// 1 variabel
		Integer n = 9;
		Integer[] bilderet = new Integer[n];
		Integer genap = 44;

		Integer deret = 0;
		Integer bilke = 1;

		// 2 pola
		for (int i = 0; i < bilderet.length; i++) {
			if (bilke == 1) {
				deret = genap;
				genap = genap - 3;
				bilke = bilke + 1;
			} else if (bilke == 2) {
				deret = genap;
				genap = genap + 6;
				bilke = 1;
			} else {

			}
			bilderet[i] = deret; //
		}

		// 3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s", bilderet[i]);
		}

	}

}

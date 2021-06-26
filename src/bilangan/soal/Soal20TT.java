package bilangan.soal;

public class Soal20TT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 variabel		
		Integer n = 9;
		Integer genap = 40;
		Integer[] bilderet = new Integer[n];

		Integer deret = 40;
		Integer bilke = 1; // hanya ada 1 atau 2

		for (int i = 0; i < bilderet.length; i++) { // pengisian bil deret menggunakan bil genap
			if (bilke <= 2) {
				deret = genap;
				genap = genap + 2;
				bilke = bilke + 1;

			} else if (bilke == 3) {
				deret = genap;
				genap = genap - 3;
				bilke = 1;
			} else {

			}
			bilderet[i] = deret;
		}
		
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);
		}
		
	}

}

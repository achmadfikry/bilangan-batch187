package bilangan.soal;

public class Soal11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// genap
		Integer n = 9;
		Integer[] bilgenap = new Integer[n];
		Integer genap = 2;

		for (int i = 0; i < bilgenap.length; i++) {
			bilgenap[i] = genap;
			genap = genap + 2;
		}

		// deret
		Integer[] bilderet = new Integer[n];
		Integer deret = 1;

		for (int i = 0; i < bilderet.length; i++) {
			bilderet[i] = deret;
			deret = deret + bilgenap[i];
		}

		// 3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s", bilderet[i]);

		}

	}
}
package bilangan.soal;

public class Soal28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 3 5 7 9 11 13 15 17 81
		// 1 variabel
		Integer n = 10;
		Integer[] bilderet = new Integer[n];
		Integer deret = 1;
		Integer jumlah = 0;

		// 2 pola
		for (int i = 0; i < bilderet.length; i++) {
			if (i <= n - 2) {
				bilderet[i] = deret;
				jumlah = bilderet[i] + jumlah;
				deret = deret + 2;

			} else {
				bilderet[i] = jumlah;
			}
		}

		// 3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%3s", bilderet[i]);
		}
	}

}

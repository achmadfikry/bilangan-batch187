package bilangan.soal;

public class soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 3 -5 7 9 -11 13 15 -17
		// 1 variabel
		Integer n = 9;
		Integer[] bilderet = new Integer[n];
		Integer deret = 1;

		// 2 pola
		for (int i = 0; i < bilderet.length; i++) {
			bilderet[i] = deret;
			if (i % 3 == 2) {
				bilderet[i] = bilderet[i] * -1;
			} else {
				bilderet[i] = bilderet[i];
			}

			deret = deret + 2;
		}

		// 3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s", bilderet[i]);
		}
	
	}

}

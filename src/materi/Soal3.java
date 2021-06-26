package materi;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// genap
		Integer nGenap = 9;
		Integer[] bilGenap = new Integer[nGenap]; // Inisiasi jumlah indeks array
		Integer genap = 2;
		Integer idxGenap = 0;

		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap = genap + 2;
		}

		// 1 variabel
		Integer n = 9;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// 2 variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == j || i + j == n - 1) {
					if (i > n / 2) {
						pola[i][j] = "x";
					} else {
						pola[i][j] = String.valueOf(bilGenap[idxGenap]);
					}
				} else {
					pola[i][j] = " ";
				}
			}
			idxGenap = idxGenap + 1;

		}

		// 3 cetak
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%3s", pola[i][j]);
			}
			System.out.println();
		}

	}

}

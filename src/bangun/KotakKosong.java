package bangun;

public class KotakKosong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 variabel
		Integer n = 9;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// 2 variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == 0) {
					// x x x
					pola[i][j] = "x";
				} else if (j == n-1) {
					//     x
					//     x
					//     x
					pola[i][j] = "x";
				}else if (i == n-1) {
					//
					//
					// x x x
					pola[i][j] = "x";
				}else if (j == 0) {
					// x
					// x
					// x
					pola[i][j] = "x";
				}else {
					pola[i][j] = " ";
				}
			}
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

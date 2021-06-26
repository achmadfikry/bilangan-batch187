package materi;

public class Soal11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n = 9;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// 2 variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == j) {
					pola[i][j] =  +i+"."+j;
				} else if (j == 0) {
					pola[i][j] =  +i+"."+j;
				}else if (i == 8) {
					pola[i][j] =  +i+"."+j;
				}else {
					pola[i][j] = " ";
				}
			}
		}

		// 3 cetak
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%5s", pola[i][j]);
			}
			System.out.println();
		}
	}
}

package materi;

public class Soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1 variabel
		Integer n = 9;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == j) {
					pola[i][j] = "x";
				} else if (i + j == n-1) {
					pola[i][j] = "x";					
				}else if (j == n/2) {
					pola[i][j] = "x";
				}else if (i == n/2) {
					pola[i][j] = "x";
				}else {
					pola[i][j] = " ";
				}
			}
		}
		
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%3s", pola[i][j]);
			}
			System.out.println();
		}
	}

}

package logic1arah;

public class Bb6 {

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
				if (j % 2 == 0) {
					pola [i][j] = "x";
				} else {
					pola [i][j] = " ";
				}
			}
		}
		
		//3 cetak
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%3s",pola[i][j]);
			}
			System.out.println();
		}
		
	}

}

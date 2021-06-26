package logic1arah;

public class ArahIsi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 variabel
		Integer n = 9;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i % 2 == 0) {
					pola[i][j] = "x";
				} else if (i == 1 && j == 0) {
					pola[i][j] = "1";
				}else if (i == 3 && j == 8) {
					pola[i][j] = "1";
				}else if (i == 5 && j == 0) {
					pola[i][j] = "1";
				}else if (i == 7 && j == 8) {
					pola[i][j] = "1";
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

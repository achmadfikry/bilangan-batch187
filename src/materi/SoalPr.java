package materi;

public class SoalPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ganjil
		Integer n = 9;
		Integer[] bilGanjil = new Integer[n]; //Inisiasi jumlah indeks array
		Integer ganjil = 1;
		Integer idxGanjil = 0;
		
		//2 pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil; //menambah angka
			ganjil = ganjil + 2;
		}

		// 1 variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == j) {
					pola[i][j] = String.valueOf(bilGanjil[i]);
				} else if (i + j == n-1) {
					pola[i][j] = String.valueOf(bilGanjil[i]);
				}else if (j == n/2) {
					pola[i][j] = String.valueOf(bilGanjil[i]);
				}else if (i == n/2) {
					pola[i][j] = String.valueOf(bilGanjil[idxGanjil]);
					idxGanjil = idxGanjil + 1;
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

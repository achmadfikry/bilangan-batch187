package logic1arah.arahplusisi;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 variabel
		Integer n = 9;
		Integer ni = n;
		Integer nj = n;
		String [][] pola = new String [ni][nj];
		String arah = "kiri";
		
		//2 variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i % 2 == 0) { 		//genap
					pola[i][j] = "x";
				} else {				//ganjil
					pola[i][j] = " ";
					if (arah.equals("kiri")) { //kalo kondisinya string
						if (j == 0) {
							pola[i][j] = "1";							
						} else {
							pola[i][j] = " ";
						}
					} else { 			//kanan
						if (j == n-1) {
							pola[i][j] = "1";							
						} else {
							pola[i][j] = " ";
						}
					}
				}
			}
			if (i % 2 == 0) { 			//genap
				
			} else {					//ganjil
				if (arah.equals("kiri")) {
					arah = "kanan";
				} else {
					arah = "kiri";
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

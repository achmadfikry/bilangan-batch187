package logic1arah.arahplusisi;

public class Soal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n = 9;
		//ganjil
		Integer nGanjil = n/2 + 1;
		Integer[] bilganjil = new Integer[nGanjil]; //Inisiasi jumlah indeks array
		Integer ganjil = 1;
		Integer idxGanjil = 0;
		
		//2 pola
		for (int i = 0; i < bilganjil.length; i++) {
			bilganjil[i] = ganjil; //menambah angka
			ganjil = ganjil + 2;
		}

		
		//genap
		Integer nGenap = n / 2;
		Integer[] bilGenap = new Integer[nGenap]; //Inisiasi jumlah indeks array
		Integer genap = 2;
		
		Integer idxGenap = 0;
		
		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap = genap + 2;
		}
		
		//1 variabel
		Integer ni = n;
		Integer nj = n;
		String [][] pola = new String [ni][nj];
		String arah = "kiri";
		Integer geser = 0;
		
		//2 variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i % 2 == 0) { 		//genap
					pola[i][j] = String.valueOf(bilganjil[idxGanjil]);
				} else {				//ganjil
					pola[i][j] = " ";
					if (arah.equals("kiri")) { //kalo kondisinya string
						if (j == 0 + geser) {	//geser
							pola[i][j] = String.valueOf(bilGenap[idxGenap]);							
						} else {
							pola[i][j] = " ";
						}
					} else { 			//kanan
						if (j == (n-1) - geser ){
							pola[i][j] = String.valueOf(bilGenap[idxGenap]);							
						} else {
							pola[i][j] = " ";
						}
					}
				}
			}
			if (i % 2 == 0) { 			//genap
				
			} else {					//ganjil
				idxGenap = idxGenap + 1;
				idxGanjil = idxGanjil + 1;
				geser = geser + 1;
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

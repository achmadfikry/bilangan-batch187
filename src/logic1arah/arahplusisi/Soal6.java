package logic1arah.arahplusisi;

public class Soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n = 9;
		//Ganjil
		Integer nGanjil = n / 2;
		Integer[] bilGanjil = new Integer[nGanjil]; //Inisiasi jumlah indeks array
		Integer Ganjil = 3;
		
		Integer idxGanjil = 3;
		
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = Ganjil;
			Ganjil = Ganjil + 2;
		}
		
		//1 variabel
		Integer ni = n;
		Integer nj = n;
		String [][] pola = new String [ni][nj];
		String arah = "kanan";
		Integer geser = 0;
		
		//2 variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i % 2 == 0) { 		//Ganjil
					pola[i][j] = "x";
				} else {				//ganjil
					pola[i][j] = " ";
					if (arah.equals("kanan")) { //kalo kondisinya string
						if (j == (n-1) - geser) {	//geser
							pola[i][j] = String.valueOf(bilGanjil[idxGanjil]);							
						} else {
							pola[i][j] = " ";
						}
					} else { 			//kanan
						if (j == 0 + geser ){
							pola[i][j] = String.valueOf(bilGanjil[idxGanjil]);							
						} else {
							pola[i][j] = " ";
						}
					}
				}
			}
			if (i % 2 == 0) { 			//Ganjil
				
			} else {					//ganjil
				idxGanjil = idxGanjil - 1;
				geser = geser + 1;
				if (arah.equals("kanan")) {
					arah = "kiri";
				} else {
					arah = "kanan";
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

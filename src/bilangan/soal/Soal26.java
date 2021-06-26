package bilangan.soal;

public class Soal26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//genap
		Integer ngenap = 9;
		Integer[] deretgenap = new Integer[ngenap]; //Inisiasi jumlah indeks array
		Integer genap = 2;
			
		for (int i = 0; i < deretgenap.length; i++) {
			deretgenap[i] = genap; //menambah angka
			genap = genap + 2;
		}

		//ganjil
		Integer nganjil = 9;
		Integer[] deretganjil = new Integer[nganjil]; //Inisiasi jumlah indeks array
		Integer ganjil = 1;
		
		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil; //menambah angka
			ganjil = ganjil + 2;
		}
		
		//deret
		Integer n = 9;
		Integer [] bilderet = new Integer[n]; //bilderet hasil dari bilgenap
		Integer deret = 2;
		Integer bilke = 0;

		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilke);
			System.out.println(" ");
			if (bilke < n) {
				for (int j = 1; j < deretgenap[i]; j++) { //isi kotak sebanyak bilgenap nya
					System.out.printf("%5s",bilke);
					deret = deretgenap[i]; //masukkan bilgenap ke deret
					bilderet[bilke] = deret; //masukkan deret ke bilderet
					bilke = bilke + 1; //bilke tambahin
				}
			}else {
			
			}
			
		}
		
		//3 cetak
//		for (int i = 0; i < bilderet.length; i++) {
//			System.out.printf("%5s",bilderet[i]);
//		}
		

	}

}

package bilangan.soal;

public class Soal40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// genap
		Integer ngenap = 9;
		Integer[] deretgenap = new Integer[ngenap]; // Inisiasi jumlah indeks array
		Integer genap = 2;

		for (int i = 0; i < deretgenap.length; i++) {
			deretgenap[i] = genap; // menambah angka
			genap = genap + 2;
		}
		
		//1 variabel
		Integer n = 5; 
		Integer [] bilderet = new Integer [n];
		Integer deret = 0;
		Integer nbalik = n/2; //balik pas di urutan 3 (n = 2)
		Integer idxgenap = 3; //ambil angka 8

		//2 pola
		for (int i = 0; i < bilderet.length; i++) {
			deret = deretgenap[idxgenap];
			bilderet[i] = deret;
			if (i < nbalik) {
				idxgenap = idxgenap - 1;
			} else {
				idxgenap = idxgenap + 1;
			}
		}
		
		Integer nderet2 = n + 1;
		Integer [] bilderet2 = new Integer [nderet2];
		Integer deret2 = 0;
		Integer hasil = 0;

		for (int i = 0; i < bilderet2.length; i++) {
			if (i < n) {
				deret2 = bilderet[i];
				if (i > 0) {
					hasil = hasil + deret2;
				} else {
					hasil = deret2;
				}
			} else {
				deret2 = hasil;
			}
			bilderet2[i] = deret2;
		}

		
		//3 cetak
		for (int i = 0; i < bilderet2.length; i++) {
			System.out.printf("%3s",bilderet2[i]);
		}
			
	}

}

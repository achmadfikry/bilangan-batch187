package bilangan.soal;

public class Soal35T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ganjil
		Integer nganjil = 9;
		Integer[] deretganjil = new Integer[nganjil]; // Inisiasi jumlah indeks array
		Integer ganjil = 1;

		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil; // menambah angka
			ganjil = ganjil + 2;
		}

		//1 variabel
		Integer n = 9;
		Integer [] bilderet = new Integer [n];
		Integer deret = 0;
		Integer ntengah = n/2;
		Integer idxganjil = 0;
		
		//2 pola
		for (int i = 0; i < bilderet.length; i++) {
			deret = deretganjil[idxganjil];
			bilderet[i] = deret;
			if (i < ntengah) {
				idxganjil = idxganjil + 1;
			} else {
				idxganjil = idxganjil - 1;
			}
		}
		
		//3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%3s",bilderet[i]);
		}
	}

}

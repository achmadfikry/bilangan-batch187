package bilangan.soal;

public class Soal35TT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ganjil
		Integer n = 9;
		Integer[] deretganjil = new Integer[n]; //Inisiasi jumlah indeks array
		Integer ganjil = 1;
		
		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil; //menambah angka
			ganjil = ganjil + 2;
		}

		//deret
		Integer [] bilderet = new Integer[n];
		Integer deret = 0;
		Integer idxganjil = 0; // minta index awal yaitu 0
		Integer ntengah = n/2;
		
		for (int i = 0; i < bilderet.length; i++) {
			deret = deretganjil[idxganjil];
			bilderet[i] = deret;
			if (i < n / 2) {
				idxganjil = idxganjil + 1;
			} else {
				idxganjil = idxganjil - 1;
			}
		}
		
		//cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%4s",bilderet[i]);

		}
	}

}

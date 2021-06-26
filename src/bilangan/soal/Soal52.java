package bilangan.soal;

public class Soal52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// genap
		Integer n = 9;
		Integer[] deretgenap = new Integer[n]; // Inisiasi jumlah indeks array
		Integer genap = 2;

		for (int i = 0; i < deretgenap.length; i++) {
			deretgenap[i] = genap; // menambah angka
			genap = genap + 2;
		}

		// ganjil
		Integer[] deretganjil = new Integer[n]; // Inisiasi jumlah indeks array
		Integer ganjil = 1;

		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil; // menambah angka
			ganjil = ganjil + 2;
		}

		//ganjil balik
		Integer[] bilderet = new Integer[n];
		Integer deret = 0;
		Integer idxgenap = n - 1; // indeks terakhir, yaitu 8 bukan 9

		for (int i = 0; i < bilderet.length; i++) {
			deret = deretgenap[idxgenap];
			bilderet[i] = deret;
			idxgenap = idxgenap - 1;
		}

		//genap balik
		Integer[] bilderet2 = new Integer[n];
		Integer deret2 = 0;
		Integer idxganjil = n - 1; // indeks terakhir, yaitu 8 bukan 9

		for (int i = 0; i < bilderet2.length; i++) {
			deret = deretganjil[idxganjil];
			bilderet2[i] = deret;
			idxganjil = idxganjil - 1;
		}

		//pola
		Integer[] bilderet3 = new Integer[n];
		Integer jumlah = 0;

		for (int i = 0; i < bilderet3.length; i++) {
			jumlah = deretgenap[i] - deretganjil[i] - bilderet[i] - bilderet2[i];
			bilderet3[i] = jumlah;
		}

		//cetak
		for (int i = 0; i < deretgenap.length; i++) {
			System.out.printf("%4s", deretgenap[i]);
		}

		System.out.println("");

		for (int i = 0; i < deretganjil.length; i++) {
			System.out.printf("%4s", deretganjil[i]);
		}

		System.out.println("");

		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%4s", bilderet[i]);
		}

		System.out.println("");

		for (int i = 0; i < bilderet2.length; i++) {
			System.out.printf("%4s", bilderet2[i]);
		}

		System.out.println("");

		for (int i = 0; i < bilderet3.length; i++) {
			System.out.printf("%4s", bilderet3[i]);
		}

	}

}

package bilangan.soal;

public class Soal21T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		// ganjil
		Integer n = 9;
		Integer[] bilganjil = new Integer[n]; // Inisiasi jumlah indeks array
		Integer ganjil = 1;

		for (int i = 0; i < bilganjil.length; i++) {
			bilganjil[i] = ganjil; // menambah angka
			ganjil = ganjil + 2;
		}

		// deret
		Integer[] bilderet = new Integer[n]; // bilderet hasil dari bilganjil
		Integer deret = 1;
		Integer bilke = 0;

		for (int i = 0; i < bilderet.length; i++) {
			if (bilke < n) {
				for (int j = 0; j < bilganjil[i]; j++) { // isi kotak sebanyak bilganjil nya
					deret = bilganjil[i]; // masukkan bilganjil ke deret
					bilderet[bilke] = deret; // masukkan deret ke bilderet
					bilke = bilke + 1; // bilke tambahin
				}
			} else {
		
			}

		}

		// 3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%3s", bilderet[i]);
		}

	}

}

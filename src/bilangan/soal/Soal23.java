package bilangan.soal;

public class Soal23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ganjil
		Integer n = 9;
		Integer[] deretganjil = new Integer[n]; // Inisiasi jumlah indeks array
		Integer ganjil = 3;

		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil; // menambah angka
			ganjil = ganjil + 3;
		}

		// deret
		Integer[] bilderet = new Integer[n]; // bilderet hasil dari bilganjil
		Integer deret = 1;
		Integer bilke = 0;

		for (int i = 0; i < bilderet.length; i++) {
			if (bilke < n) {
				for (int j = 0; j < deretganjil[i]; j++) { // isi kotak sebanyak bilganjil nya
					deret = deretganjil[i]; // masukkan bilganjil ke deret
					bilderet[bilke] = deret; // masukkan deret ke bilderet
					bilke = bilke + 1; // bilke tambahin
				}
			} else {
			}

		}
		
		// cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);
		}
	}

}

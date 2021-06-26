package bilangan;

public class Soal25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5 5 5 5 5 10 10 10 10
		// ganjil
		Integer n = 9;
		Integer[] deretganjil = new Integer[n]; // Inisiasi jumlah indeks array
		Integer ganjil = 5;

		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil; // menambah angka
			ganjil = ganjil + 5;
		}

		// deret
		Integer[] bilderet = new Integer[n + 6]; // tambahan sesuai kebutuhan
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

		for (int i = 0; i < bilderet.length - 6; i++) { //kurangi sesuai kebutuhan
			System.out.printf("%5s", bilderet[i]);
		}
	}

}

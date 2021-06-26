package bilangan.soal;

public class Soal24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// genap
		Integer n = 9;
		Integer[] deretgenap = new Integer[n]; // Inisiasi jumlah indeks array
		Integer genap = 4;

		for (int i = 0; i < deretgenap.length; i++) {
			deretgenap[i] = genap;
			genap = genap + 4;
		}

		// deret
		Integer[] bilderet = new Integer[n + 3]; // bilderet hasil dari bilgenap
		Integer deret = 1;
		Integer bilke = 0;

		for (int i = 0; i < bilderet.length; i++) {
			if (bilke < n) {
				for (int j = 0; j < deretgenap[i]; j++) { // isi kotak sebanyak bilgenap nya
					deret = deretgenap[i]; // masukkan bilgenap ke deret
					bilderet[bilke] = deret; // masukkan deret ke bilderet
					bilke = bilke + 1; // bilke tambahin
				}
			} else {
			
			}
		}

		//cetak
		for (int i = 0; i < bilderet.length - 3; i++) { //tambahin
			System.out.printf("%5s",bilderet[i]);
		}
	}

}

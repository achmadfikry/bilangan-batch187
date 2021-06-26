package bilangan.soal;

public class Soal22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//genap
		Integer n = 9;
		Integer[] bilgenap = new Integer[n]; // Inisiasi jumlah indeks array
		Integer genap = 2; // inisiasi angka di awal deret

		for (int i = 0; i < bilgenap.length; i++) {
			bilgenap[i] = genap; // menambah angka
			genap = genap + 2;
		}

		//deret
		Integer[] bilderet = new Integer[n + 3]; // bilderet hasil dari bilgenap
		Integer deret = 1;
		Integer bilke = 0;

		for (int i = 0; i < bilderet.length; i++) {
			if (bilke < n) {
				for (int j = 0; j < bilgenap[i]; j++) { // isi kotak sebanyak bilgenap nya
					deret = bilgenap[i]; // masukkan bilgenap ke deret
					bilderet[bilke] = deret; // masukkan deret ke bilderet
					bilke = bilke + 1; // bilke tambahin
				}
			} else {
			}

		}

		// 3 cetak
		for (int i = 0; i < (bilderet.length - 3); i++) { //tambahin
			System.out.printf("%3s", bilderet[i]);
		}

	}

}

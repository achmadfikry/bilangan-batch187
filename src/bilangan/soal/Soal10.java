package bilangan.soal;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 variabel
		Integer n = 10;
		Integer[] bilgenap = new Integer[n];
		Integer genap = 2;

		for (int i = 0; i < bilgenap.length; i++) {
			bilgenap[i] = genap;
			genap = genap + 2;
		}

		// deret
		String[] bilderet = new String[n];
		String deret = null;
		Integer bilke = 1;
		Integer idxgenap = 0;
		
		for (int i = 0; i < bilderet.length; i++) { // pengisian bil deret menggunakan bil ganjil
			if (bilke == 1) {
				deret = String.valueOf(bilgenap[idxgenap]);
				bilke = bilke + 1;
				idxgenap = idxgenap + 1;
			} else if (bilke == 2) {
				deret = "x";
				bilke = bilke + 1;
			} else if (bilke == 3) {
				deret = "100";
				bilke = 1;
			}else {

			}
			bilderet[i] = deret; //
		}

		// 3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s", bilderet[i]);
		}

	}

}

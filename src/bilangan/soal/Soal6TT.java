package bilangan.soal;

public class Soal6TT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// genap
		Integer n = 10;
		Integer[] deretgenap = new Integer[n]; // Inisiasi jumlah indeks array
		Integer genap = 2;

		for (int i = 0; i < deretgenap.length; i++) {
			deretgenap[i] = genap;
			genap = genap + 2;
		}
		
		//deret
		Integer[] bilderet = new Integer[n];
		Integer deret = 0;
		Integer bilke = 1; // hanya ada 1 atau 2

		for (int i = 0; i < bilderet.length; i++) { // pengisian bil deret menggunakan bil genap
			if (bilke == 1) {
				deret = deretgenap[i] * -1;
				bilke = bilke + 1;
			} else if (bilke == 2) {
				deret = deretgenap[i];
				bilke = bilke + 1;
			} else if (bilke == 3) {
				deret = 10;
				bilke = 1;
			}else {

			}
			bilderet[i] = deret; //
		}
	
		//cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%4s",bilderet[i]);
		}
	}

}

package bilangan.soal;

public class Soal9TT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2 -4 6 x 100 12 -14 16 x 100 ...
		//genap
		Integer n = 10;
		Integer[] deretgenap = new Integer[n]; //Inisiasi jumlah indeks array
		Integer genap = 2;
				
		for (int i = 0; i < deretgenap.length; i++) {
		deretgenap[i] = genap;
		genap = genap + 2;
		}
		
		//deret
		String[] bilderet = new String[n];
		String deret = null;
		Integer bilke = 1; // hanya ada 1 atau 2

		for (int i = 0; i < bilderet.length; i++) { // pengisian bil deret menggunakan bil genap
			if (bilke == 1) {
				deret = String.valueOf(deretgenap[i] * -1);
				bilke = bilke + 1;
			} else if (bilke == 2) {
				deret = String.valueOf(deretgenap[i]);
				bilke = bilke + 1;
			} else if (bilke == 3) {
				deret = String.valueOf(deretgenap[i]);
				bilke = bilke + 1;
			}else if (bilke == 4) {
				deret = "x";
				bilke = bilke + 1;
			}else if (bilke == 5) {
				deret = "100";
				bilke = 1;
			}else {

			}
			bilderet[i] = deret; //
		}
	
		//cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);
		}
	}

}

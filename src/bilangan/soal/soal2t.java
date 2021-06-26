package bilangan.soal;

public class soal2t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 -3 5 -7 9 -11 13 -15 17
		// 1 variabel
		Integer n = 9;
		Integer[] bilganjil = new Integer[n];
		Integer ganjil = 1;

		Integer[] bilderet = new Integer[n];
		Integer deret = 0;
		Integer bilke = 1; //// hanya ada 1 atau 2
		Integer kotakke = 1;

		// 2 pola
		for (int i = 0; i < bilganjil.length; i++) {
			bilganjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		for (int i = 0; i < bilderet.length; i++) { // pengisian bil deret menggunakan bil ganjil
			if (bilke == 1) {
				deret = bilganjil[i];
				bilke = bilke + 1;

			} else if (bilke == 2) {
				deret = bilganjil[i] * -1;
				bilke = 1;

			} else {

			}
			bilderet[i] = deret; //
		}

		// 3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s", bilderet[i]);
		}
	
	}

}

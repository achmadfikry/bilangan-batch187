package bilangan.soal;

public class Soal31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 variabel
		Integer n = 10;
		Integer [] bilderet = new Integer[n];
		Integer deret = 2;
		
		Integer jumlah = 0;

		//2 pola
		for (int i = 0; i < bilderet.length; i++) {
			bilderet[i] = deret;
			if (i%2 == 1) {
				bilderet[i] = bilderet[i] * -1;
			} else {
				bilderet[i] = bilderet [i];
			}
			deret = deret + 2;
		}
		
		for (int i = 0; i < bilderet.length; i++) {
			if (i <= 8) {
				jumlah = jumlah + bilderet[i]; 
			} else {
				bilderet[i] = jumlah;
			}
		}
		
//		for (int i = 0; i < bilderet.length; i++) { //pengisian bil deret menggunakan bil genap
//			bilderet[i] = deret; //
			
//		}

		
		//3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);
		}

		
}

}
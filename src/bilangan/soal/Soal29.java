package bilangan.soal;

public class Soal29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  2  4  6  8 10 12 14 16 18 90
		//1 variabel
		Integer n = 10;
		Integer[] bilderet = new Integer[n];
		Integer deret = 2;
		Integer jumlah = 0;
		
		//2 pola
		for (int i = 0; i < bilderet.length; i++) {			
			if (i <= n - 2) {
				bilderet[i] = deret;
				jumlah = jumlah + bilderet[i];
				deret = deret + 2;
			} else {
				bilderet[i] = jumlah;
			}
		}
		
		//3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%3s",bilderet[i]);
		}
	}

}

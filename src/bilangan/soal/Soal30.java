package bilangan.soal;

public class Soal30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//   1   3   5   7   9  11  13  15  17 -79
		//1 variabel
		Integer n = 10;
		Integer[] bilderet = new Integer[n];
		Integer deret = 1;
		Integer jumlah = 2;
		
		//2 pola
		for (int i = 0; i < bilderet.length; i++) {
			
			if (i <= n - 1) {
				bilderet[i] = deret;
				deret = deret + 2;
				jumlah = jumlah - bilderet[i];
			} else {
				bilderet[i] = jumlah;
			}
			
		}
		
		//3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%4s",bilderet[i]);
		}
	}

}

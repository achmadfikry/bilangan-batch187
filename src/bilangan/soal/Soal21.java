package bilangan.soal;

public class Soal21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 variabel
		Integer n = 9;
		Integer [] bilderet = new Integer[n];
		Integer deret = 1;
		Integer idx = 0;
				
		//2 pola
		for (int i = 0; i < bilderet.length; i++) {
		if (idx < deret) {
			bilderet[i] = deret;
			idx = idx + 1;
		} else {
			deret = deret + 2;
			idx = 0;
			bilderet[i] = deret;
		}
		
		}
		
		
		//3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);
		}
	}

}

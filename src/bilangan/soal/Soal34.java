package bilangan.soal;

public class Soal34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer ngenap = 9;
		Integer [] deretgenap = new Integer[ngenap];
		Integer genap = 2;
	
		//2 pola
		for (int i = 0; i < deretgenap.length; i++) {
			deretgenap[i] = genap;
			genap = genap + 2;
		}

		Integer n = ngenap;
		Integer [] bilderet = new Integer[n];
		Integer deret = 0;
		Integer idxgenap = n - 1; //indeks terakhir, yaitu 8 bukan 9		

		for (int i = 0; i < bilderet.length; i++) {
			deret = deretgenap[idxgenap];
			bilderet[i] = deret;
			idxgenap = idxgenap - 1;
		}		
		
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);
		}
	}

}

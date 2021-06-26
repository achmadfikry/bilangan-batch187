package bilangan.soal;

public class Soal11T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//soal 11: 1 3 7 13
		//1 variabel
		Integer n = 9;
		Integer [] bilgenap = new Integer[n];
		Integer genap = 2;
		Integer [] bilderet = new Integer[n];
		Integer deret = 1;
		
		//2 pola
		for (int i = 0; i < bilgenap.length; i++) {
			bilgenap[i] = genap;
			genap = genap + 2;
		}
		for (int i = 0; i < bilderet.length; i++) {
			bilderet[i] = deret;
			deret = deret + bilgenap[i];
		}
		//3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);

		}	
	}

}

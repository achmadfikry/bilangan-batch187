package bilangan.soal;

public class Soal44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// genap
		Integer ngenap = 9;
		Integer[] deretgenap = new Integer[ngenap]; // Inisiasi jumlah indeks array
		Integer genap = 0;

		for (int i = 0; i < deretgenap.length; i++) {
			deretgenap[i] = genap; // menambah angka
			genap = genap + 2;
		}
		
		//1 variabel
		Integer n = 5; 
		Integer [] bilderet = new Integer [n];
		Integer deret = 0;
		Integer idxgenap = 4;

		//2 pola
		for (int i = 0; i < bilderet.length; i++) {
			deret = deretgenap[idxgenap];
			bilderet[i] = deret;
			idxgenap = idxgenap - 1;
		}

		//3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);
		}
	}

}

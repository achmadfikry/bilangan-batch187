package bilangan.soal;

public class Soal18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//ganjil
		Integer n = 9;
		Integer [] bilganjil = new Integer[n];
		Integer ganjil = 3;
		
		for (int i = 0; i < bilganjil.length; i++) {
			bilganjil[i] = ganjil;
			ganjil = ganjil + 3;
		}

		//deret
		Integer [] bilderet = new Integer[n];
		Integer deret = 1;

		for (int i = 0; i < bilderet.length; i++) {
			bilderet[i] = deret;
			deret = deret - bilganjil[i];
		}
		
		//3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);

		}
	}

}

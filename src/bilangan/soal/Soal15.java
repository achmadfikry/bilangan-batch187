package bilangan.soal;

public class Soal15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 ganjil
		Integer n = 9;
		Integer [] bilganjil = new Integer[n];
		Integer ganjil = 5;
		
		for (int i = 0; i < bilganjil.length; i++) {
			bilganjil[i] = ganjil;
			ganjil = ganjil + 5;
		}

		//deret
		Integer [] bilderet = new Integer[n];
		Integer deret = 1;
		
		for (int i = 0; i < bilderet.length; i++) {
			bilderet[i] = deret;
			deret = deret + bilganjil[i];
		}

		// cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);

		}
	
	}

}

package bilangan.soal;

public class Soal33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 variabel
		Integer n = 9;
		Integer [] bilganjil = new Integer[n];
		Integer ganjil = 17;
	
		//2 pola
		for (int i = 0; i < bilganjil.length; i++) {
			bilganjil[i] = ganjil;
			ganjil = ganjil - 2;
		}
		
		//3 cetak
		for (int i = 0; i < bilganjil.length; i++) {
			System.out.printf("%5s",bilganjil[i]);
		}


		
	}

}

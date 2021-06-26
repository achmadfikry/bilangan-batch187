package bilangan.soal;

public class Soal33T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ganjil
		Integer nganjil = 9;
		Integer[] deretganjil = new Integer[nganjil];
		Integer ganjil = 1;
		
		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		
		//1 variabel
		Integer n = nganjil;
		Integer [] bilderet = new Integer[n];
		Integer deret = 0;
		Integer idxganjil = n - 1; //indeks terakhir, yaitu 8 bukan 9		
	
		
		//2 pola
		for (int i = 0; i < bilderet.length; i++) {
			deret = deretganjil[idxganjil];
			bilderet[i] = deret;
			idxganjil = idxganjil - 1;
		}
		
		
		//3 deret
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);
		}
	
	
	}

}

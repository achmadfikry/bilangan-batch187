package bilangan;

public class BilanganGanjil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1 3 5 7 9 11 15 17 19 21
		
		//1 variabel
		Integer n = 10;
		Integer[] deretganjil = new Integer[n]; //Inisiasi jumlah indeks array
		Integer ganjil = 1;
		
		//2 pola
		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil; //menambah angka
			ganjil = ganjil + 2;
		}
	
		//3 cetak
		for (int i = 0; i < deretganjil.length; i++) {
			System.out.printf("%3s",deretganjil[i]);
		}
	}
	

}

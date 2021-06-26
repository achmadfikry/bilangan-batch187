package bilangan;

public class BilanganLipat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4 8 12 16 20 24 28 32 36 40
		
		//1 variabel
		Integer n = 10;
		Integer[] deretlipat = new Integer[n]; //Inisiasi jumlah indeks array
		Integer lipat = 4;
				
		//2 pola
		for (int i = 0; i < deretlipat.length; i++) {
		deretlipat[i] = lipat;
		lipat = lipat + 4;
		}
			
		//3 cetak
		for (int i = 0; i < deretlipat.length; i++) {
		System.out.printf("%3s",deretlipat[i]);
		}
	
		
		
	}

}

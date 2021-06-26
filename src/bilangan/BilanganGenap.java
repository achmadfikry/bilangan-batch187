package bilangan;

public class BilanganGenap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 0 2 4 6 8 10 12 14 16 18
		
		//1 variabel
		Integer n = 10;
		Integer[] deretgenap = new Integer[n]; //Inisiasi jumlah indeks array
		Integer genap = 0;
				
		//2 pola
		for (int i = 0; i < deretgenap.length; i++) {
		deretgenap[i] = genap;
		genap = genap + 2;
		}
			
		//3 cetak
		for (int i = 0; i < deretgenap.length; i++) {
		System.out.printf("%3s",deretgenap[i]);
		}
	
		
	}

}

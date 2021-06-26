package bilangan;

public class BilanganPangkatBalik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1 variabel
		Integer n = 10;
		Integer[] deretpangkat = new Integer[n]; //Inisiasi jumlah indeks array
		Integer pangkatatas = 2;
		Integer pangkatbawah = 0;
		Integer pangkat = 0;
		
		//2 pola
		for (int i = 0; i < deretpangkat.length; i++) {
			pangkat = (int) Math.pow(pangkatbawah, pangkatatas);
			deretpangkat[i] = pangkat;
			pangkatbawah = pangkatbawah + 1;
		}
			
		//3 cetak
		for (int i = 0; i < deretpangkat.length; i++) {
		System.out.printf("%5s",deretpangkat[i]);
		}		

	}

}

package bilangan;

public class BilanganCacah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 1 2 3 4 5 6 7 8 9 10
		//1 variabel
		Integer n = 10;
		Integer[] deretcacah = new Integer[n]; //Inisiasi jumlah indeks array
		Integer cacah = 0;
		
		//2 pola		
		for (int i = 0; i < deretcacah.length; i++) {
			deretcacah[i] = cacah; //menambah angka
			cacah = cacah + 1;
		}
		
		//3 cetak
		for (int i = 0; i < deretcacah.length; i++) {
			System.out.printf("%3s",deretcacah[i]);
		}
	
	}

}

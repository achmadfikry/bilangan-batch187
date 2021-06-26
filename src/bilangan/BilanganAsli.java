package bilangan;

public class BilanganAsli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1 2 3 4 5 6 7 8 9
		
		//1 variabel
		Integer n = 9;
		Integer[] deretasli = new Integer[n]; //Inisiasi jumlah indeks array
		Integer asli = 1;
		
		//2 pola
		for (int i = 0; i < deretasli.length; i++) {
			deretasli[i] = asli; //menambah angka
			asli = asli + 1;
		}
		
		//3 cetak
		for (int i = 0; i < deretasli.length; i++) {
			//System.out.printf("%3s",deretasli[i]);
			System.out.println(deretasli[i]);
		}
	}

}

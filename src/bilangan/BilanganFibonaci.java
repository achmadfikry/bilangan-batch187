package bilangan;

public class BilanganFibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 variabel
		Integer n = 10;
		Integer[] deretfibonaci = new Integer[n]; //Inisiasi jumlah indeks array
		Integer nilai1 = 0;
		Integer nilai2 = 1;
		Integer nilai3 = 1;
		
		//2 pola
		for (int i = 0; i < deretfibonaci.length; i++) {
		deretfibonaci[i] = nilai3;
		nilai3 = nilai1 + nilai2;
		nilai1 = nilai2;
		nilai2 = nilai3;
		}

//		3 cetak
		for (int i = 0; i < deretfibonaci.length; i++) {
		System.out.printf("%3s",deretfibonaci[i]);
		System.out.println(" ");
		}

	}

}

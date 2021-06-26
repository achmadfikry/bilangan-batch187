package bilangan;

public class BilanganTribonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 variabel
		Integer n = 10;
		Integer[] derettribonaci = new Integer[n]; //Inisiasi jumlah indeks array
		Integer nilai = 1;

		//2 pola
		for (int i = 0; i < derettribonaci.length; i++) {
		if (i<3) {
			derettribonaci[i] = nilai;
		} else {
			nilai = derettribonaci[i-1] + derettribonaci[i-2] + derettribonaci[i-3];
			derettribonaci[i]=nilai;
		}
		}

		//3 cetak
		for (int i = 0; i < derettribonaci.length; i++) {
		System.out.printf("%5s",derettribonaci[i]);
		}

	}

}

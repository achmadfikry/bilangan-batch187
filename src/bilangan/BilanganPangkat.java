package bilangan;

public class BilanganPangkat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//    1    2    4    8   16   32   64  128  256  512
		//1 variabel
		Integer n = 10;
		Integer[] deretpangkat = new Integer[n]; //Inisiasi jumlah indeks array
		Integer pangkatatas = 0;
		Integer pangkatbawah = 2;
		Integer pangkat = 0;
		
		//2 pola
		for (int i = 0; i < deretpangkat.length; i++) {
			pangkat = (int) Math.pow(pangkatbawah, pangkatatas);
			deretpangkat[i] = pangkat;
			pangkatatas = pangkatatas + 1;
		}
			
		//3 cetak
		for (int i = 0; i < deretpangkat.length; i++) {
		System.out.printf("%5s",deretpangkat[i]);
		}		
	}

}

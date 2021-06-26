package bilangan.latihan;

public class lat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//-1 -3 -9 -27 -81
		//1 variabel
		Integer n = 9;
		Integer[] deretpangkat = new Integer[n]; //Inisiasi jumlah indeks array
		Integer pangkatatas = 0;
		Integer pangkatbawah = 3;
		Integer pangkat = 0;
		
		//2 pola
		for (int i = 0; i < deretpangkat.length; i++) {
			pangkat = (int) Math.pow(pangkatbawah, pangkatatas);
			deretpangkat[i] = pangkat * -1;
			pangkatatas = pangkatatas + 1;
		}
			
		//3 cetak
		for (int i = 0; i < deretpangkat.length; i++) {
		System.out.printf("%7s",deretpangkat[i]);
		}		

	
	
	}

}

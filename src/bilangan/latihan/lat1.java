package bilangan.latihan;

public class lat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//-1 -2 -3 -4 -5 -6 -7 -8 -9
		//1 variabel
		Integer n = 9;
		Integer[] bilderet = new Integer[n];
		Integer deret = -1;
		
		//2 pola
		for (int i = 0; i < bilderet.length; i++) {
			bilderet[i] = deret;
			deret = deret - 1;
		}
		
		//3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%3s",bilderet[i]);
		}
	}

}

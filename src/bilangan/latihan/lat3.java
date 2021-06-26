package bilangan.latihan;

public class lat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//-2 -4 -6 -8 -10
	//1 variabel
		
		Integer n = 9;
		Integer [] bilderet = new Integer[n];
		Integer deret = -2;
		
	//2 pola
		for (int i = 0; i < bilderet.length; i++) {
			bilderet[i] = deret;
			deret = deret - 2;
		}
		
	//3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);
		}
		
	}

}

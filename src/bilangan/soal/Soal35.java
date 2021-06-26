package bilangan.soal;

public class Soal35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//    1    3    5    7    9    7    5    3    1
	//1 variabel
	Integer n = 9;
	Integer [] bilderet = new Integer[n];
	Integer deret = 1;
	Integer hasil = 0;
	
	//2 pola
	for (int i = 0; i < bilderet.length; i++) {
		bilderet[i] = deret;
		if (i <= 3) {
			deret = deret + 2;
		} else {
			deret = deret - 2;

		}
//		deret = deret + 2;

	}

	//3 cetak
	for (int i = 0; i < bilderet.length; i++) {
		System.out.printf("%5s",bilderet[i]);
	}
	
	}

}

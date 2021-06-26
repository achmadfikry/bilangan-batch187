package bilangan.soal;

public class Soal30T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ganjil
		Integer nganjil = 9;
		Integer[] deretganjil = new Integer[nganjil];
		Integer ganjil = 1;
		
		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		
		//1 variabel
		Integer n = nganjil + 1;
		Integer [] bilderet = new Integer[n];
		Integer deret = 0;
		Integer hasil = 0;
		
		//2 pola
		for (int i = 0; i < bilderet.length; i++) {
			if (i < nganjil) {  //kotak ke 1 - 9
				deret = deretganjil[i];
				if (i > 0) { //kotak ke 2 baru dikurang
					hasil = hasil - deret; 
				}
				else { //kotak pertama masukkin doang
					hasil = deret;
				}
			
			} else {
				deret = hasil;
			}
			bilderet[i] = deret;
		}
		
		//3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);
		}
		
		
	}

}

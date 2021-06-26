package bilangan.soal;

public class Soal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//1 variabel
		Integer n = 10;
		Integer [] bilgenap = new Integer[n];
		Integer genap = 2; //angka awal
		
		Integer [] bilderet = new Integer[n];
		Integer deret = 0;
		Integer bilke = 1; //hanya ada 1 atau 2
		
		Integer idxgenap = 0; //idx
		
		//2 pola
		for (int i = 0; i < bilgenap.length; i++) {
			bilgenap[i] = genap;
			genap = genap + 2;
		}
		for (int i = 0; i < bilderet.length; i++) { //pengisian bil deret menggunakan bil g
			if (bilke == 1) {
				deret = bilgenap[idxgenap];
				bilke = bilke + 1;
				idxgenap = idxgenap + 1; 	//menahan idx
			}else if (bilke ==2) {
				deret = bilgenap[idxgenap] * -1;
				bilke = bilke + 1;
				idxgenap = idxgenap + 1; 	//menahan idx
			} else if (bilke == 3) {
				deret = 100;
				bilke = 1;					//menahan idx
			}
			else {

			}
			bilderet[i] = deret; //
		}
		
	//3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%5s",bilderet[i]);
		}

	
	}

}

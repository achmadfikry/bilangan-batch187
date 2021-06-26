package bilangan.soal;

public class Soal27T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Alphabet
		Integer nhuruf = 26;
		String[] derethuruf = new String[nhuruf]; //membuat array deret huruf sebanyak n data
		Integer huruf = 0;
		
		for (char i = 'a'; i <= 'z'; i++) {
			derethuruf [huruf] = String.valueOf(i);	
			huruf = huruf + 1;
		}
		
		//ganjil
		Integer nganjil = 9;
		Integer[] deretganjil = new Integer[nganjil]; //Inisiasi jumlah indeks array
		Integer ganjil = 1;
		
		for (int i = 0; i < deretganjil.length; i++) {
			deretganjil[i] = ganjil; //menambah angka
			ganjil = ganjil + 2;
		}
		
		//1 variabel
		Integer n = 9;
		String [] bilderet = new String[n];
		String deret = "";
		Integer bilke = 0;
		
		//2 pola
		for (int i = 0; i < bilderet.length; i++) {
//			bilderet[i] = deret;
			if (bilke < n) {
				for (int j = 0; j < deretganjil[i]; j++) { //isi kotak sebanyak bilganjil nya
					deret = derethuruf[i]; //masukkan bilganjil ke deret
					bilderet[bilke] = deret; //masukkan deret ke bilderet
					bilke = bilke + 1; //bilke tambahin
				}
			}else {
			}

		}
		
		//3 cetak
		for (int i = 0; i < bilderet.length; i++) {
			System.out.printf("%3s",bilderet[i]);
		}
	}

}

package bilangan;

public class BilanganHuruf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 variabel
		Integer n = 26;
		String[] derethuruf = new String[n]; // membuat array deret huruf sebanyak n data
		Integer huruf = 0;

		// 2 pola
		for (char i = 'a'; i <= 'z'; i++) {
			derethuruf[huruf] = String.valueOf(i);
			huruf = huruf + 1;
		}

		// 3 cetak
		for (int i = 0; i < derethuruf.length; i++) {
			System.out.printf("%3s", derethuruf[i]);
		}

	}

}

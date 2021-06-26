package dasar;

public class Kelas2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variabel non array
		String mahasiswa = "Indomie";
		System.out.println(mahasiswa);
		System.out.println();

		// variabel 1 dimensi
		String[] karyawan = new String[2];
		karyawan[0] = "warteg";
		karyawan[1] = "padang";

		for (int i = 0; i < karyawan.length; i++) {
			System.out.printf("%10s", karyawan[i]);
		}
		System.out.println();
		System.out.println();

		// variabel array 2 dimensi
		String[][] pengusaha = new String[2][2];
		pengusaha[0][0] = "warteg";
		pengusaha[0][1] = "padang";
		pengusaha[1][0] = "restoran";
		pengusaha[1][1] = "kafe";

		for (int i = 0; i < pengusaha.length; i++) {
			for (int j = 0; j < pengusaha.length; j++) {
				System.out.printf("%10s", pengusaha[i][j]);
			}
			System.out.println();
		}

	}

}

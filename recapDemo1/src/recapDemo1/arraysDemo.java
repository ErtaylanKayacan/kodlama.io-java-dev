package recapDemo1;

public class arraysDemo {

	public static void main(String[] args) {

		String[] ogrenciler = new String[6];

		ogrenciler[0] = "Ertaylan";
		ogrenciler[1] = "Ayşe";
		ogrenciler[2] = "Fatma";
		ogrenciler[3] = "Taylan";
		ogrenciler[4] = "Mehmet";
		ogrenciler[5] = "Ali";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("----------------------------------------");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}

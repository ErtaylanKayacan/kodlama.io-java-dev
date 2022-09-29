package recapDemo1;

public class forDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti");
		int i = 1;
		while (i < 10) {

			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti");
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j <= 10);
		System.out.println("DoWhile döngüsü bitti");

	}

}

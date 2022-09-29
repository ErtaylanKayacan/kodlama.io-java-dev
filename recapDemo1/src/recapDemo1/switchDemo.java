package recapDemo1;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'g';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel geçtiniz ");
			break;
		case 'B':
			System.out.println(" Çok İyi geçtiniz ");
			break;
		case 'C':
			System.out.println("İyi geçtiniz ");
			break;
		case 'D':
			System.out.println("Fena Değil geçtiniz ");
			break;
		case 'F':
			System.out.println("Malesef kaldınız ");
			break;
		default:
			System.out.println("Geçersiz bir not girdiniz!!!!");
		}
	}

}

package recapDemo1;

public class tinyProjectPrimeNumbers {

	public static void main(String[] args) {
		int number = -1;
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Gimiş olduğunuz sayı asal bir sayı değildir");
			return;
		}
		
		if(number < 2) {
			System.out.println("Gimiş olduğunuz sayı geçersizdir.");
			return;
		}
		
		for (int i = 2 ; i < number;i++) {
			if(number % i == 0) {
				isPrime = false;
			}
			//		int	remaider = number % i;
//			
//			if (remaider = 0) {
//				System.out.println("Girmiş Olduğunuz sayı asal bir sayıdır");	
//			}else{
//				System.out.println("Gimiş olduğunuz sayı asal bir sayı değildir");
//			}kendi denemem
			
		}
		
		if(isPrime) {
			System.out.println("Girmiş Olduğunuz sayı asal bir sayıdır");
		}else{
			System.out.println("Gimiş olduğunuz sayı asal bir sayı değildir");
		}
		
	}

}

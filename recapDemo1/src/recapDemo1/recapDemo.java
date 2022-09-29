package recapDemo1;

public class recapDemo {

	public static void main(String[] args) {
		int sayı1 = 24;
		int sayı2 = 23;
		int sayı3 = 12;
		int enbüyük = sayı1;
		
		if(enbüyük < sayı2) {
			enbüyük = sayı2;
		} 
		if(enbüyük < sayı3) {
			enbüyük = sayı3;
		}
		
		System.out.println("En büyük sayı ="+  enbüyük);
	}

}

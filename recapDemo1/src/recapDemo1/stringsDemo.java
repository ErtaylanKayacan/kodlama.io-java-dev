package recapDemo1;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel.";
		System.out.println(mesaj);
		/*
		System.out.println("Eleman sayısı = " + mesaj.length());
		System.out.println("5. elemean= " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" yaşasın!"));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("."));
	
		char[] karakterler = new char[5];
		mesaj.getChars(0,5, karakterler, 0);
	    System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("a")); */
		
		System.out.println(mesaj.replace(" ", "-"));
		System.out.println(mesaj.substring(5,8));	
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.trim());// Baştakı ve sondaki boşluları siler
	
		}
	}


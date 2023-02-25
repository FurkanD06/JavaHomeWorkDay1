package javaKampHomeWorkDay1.sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranan = 6;
		boolean varMi = false;
		
	    for (int sayi : sayilar) {
			if (sayi == aranan) {
				varMi = true;
				break;
			}
		}
	    
	    if (varMi) {
			System.out.println("Sayı mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir");
		}

	}

}

package javaKampHomeWorkDay1.sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'h';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");
		}

	}

}

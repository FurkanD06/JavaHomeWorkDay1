package javaKampHomeWorkDay1.arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[2];
		ogrenciler[0] = "Furkan";
		ogrenciler[1] = "İrem";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
				
	}

}

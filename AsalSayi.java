package javaProject;

import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sayi;
		System.out.print("Bir sayi girin: ");
		sayi =scan.nextInt();
		
		boolean sayi1 = true;
		
		for(int i=2; i<sayi; i++) {
			
			if(sayi % i == 0) {
				
				sayi1 = false;
				break;
				
			}			
		}
		
		if(sayi1) {
			System.out.println("Sayi Asal");
		}
		else {
			System.out.println("Sayi Asal Degil");
		}

	}

}

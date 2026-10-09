package nedelja04;

import java.util.Scanner;
import java.util.Random;

public class Zadatak01 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Unesite duzinu niza: ");
		
		int duzinaNiza = s.nextInt();
		float [] noviNiz = new float[duzinaNiza];
		
		for (int i = 0; i < duzinaNiza; i++) {
			noviNiz [i] = r.nextInt(100);	
		}
		
		for (int i = 0; i < duzinaNiza; i++) {
			System.out.println(noviNiz[i]);
		}
		
		for (int i = 0; i < duzinaNiza; i++) {
			if(noviNiz[i] % 2 == 0) {
				noviNiz[i] *= -1;
			} else {
				noviNiz[i] = 1 / noviNiz [i];
			}
		}
		
		for (int i = 0; i < duzinaNiza; i++) {
			System.out.println(noviNiz[i]);
		}
	}
	
}

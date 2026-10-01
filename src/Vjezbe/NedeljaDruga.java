// prvi zadatak

package Vjezbe;
import java.util.Scanner;
public class NedeljaDruga {
	
	
	public static int sifra(int n) {
		
		int stotina = n / 100;
		int desetica = (n/10) % 10;
		int jedinica = n % 10;
		
		int proizvod = stotina + desetica + jedinica;
		int zbir = stotina + desetica + jedinica;
		
		int sifra = proizvod - zbir;
		return sifra;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Unesite trocifreni broj: ");
		int broj = sc.nextInt();
		int rezultat = sifra(broj);
		System.out.println(rezultat);
	}

}


// drugi zadatak


	public static boolean zavjesaPrekrivaProzor (int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		
		if (x3 >= x1 & y3 <= y1 & x4 <= x2 & y2 <= y4) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner (System.in);
		System.out.print("Unesite koordinate zavjese: ");
		int x1 = ulaz.nextInt();
		int y1 = ulaz.nextInt();
		int x2 = ulaz.nextInt();
		int y2 = ulaz.nextInt();
		System.out.println("Unesite koordinate prozora: ");
		int x3 = ulaz.nextInt();
		int y3 = ulaz.nextInt();
		int x4 = ulaz.nextInt();
		int y4 = ulaz.nextInt();
		
		boolean pokriva = zavjesaPrekrivaProzor(x1, y1, x2, y2, x3, y3, x4, y4);
		System.out.println(pokriva);
		
		
// treci zadatak
		
	
	static double povrsina(double d, double a, double b) {
		double k = Math.sqrt(d*d/(a*a+b*b));
		double stranicaA = a*k;
		double stranicaB = b*k;
		return stranicaA * stranicaB;
	}
	
	// zatim ide pozivanje funkcije	
	
	{
	double a = 16;
	double b = 9;
	double d = 12;
	double rezultat = povrsina(d, a, b);
	System.out.println(rezultat);
	}



// cetvrti zadatak
	
	public static int stepen(int x, int n) {
		
		int rezultat = 1;
		
		for (int i = 0; i < n; i++) {
			rezultat = rezultat * x;
		}
		
		return rezultat;
		
	}
	
	// pozivanje funkcije, ne mora u scanner nego pod main
	
	int x = 3;
	int n = 4;
	
	int rezultat = stepen (x, n);
	System.out.println(rezultat);
	
	
// peti zadatak
	
	public static int max(int a, int b, int c) {
		int maksimum = a + b;
		if (a + c > maksimum) {
			maksimum = a + c;
		}
		
		if (b + c > maksimum) {
			maksimum = b + c;
		}
		
		return maksimum;
		}
	}
	
	
// sesti zadatak
	
	public static void brCifara(int n) {
		
		String num = n + "";
		double sum = 0;
		
		for(int i = 0; i < num.length(); i++)
		{
			sum += Math.pow(Character.getNumericValue(num.charAt(i)), num.length());
		}
		
		if(n == sum)
		{
			System.out.println("Da");
		}
		
		else
			System.out.println("Ne");
		}
	
	// laksi nacin
	
	public static int brCifara(int n) {
		int brCifara = 0;
		
		while(n > 0) {
			brCifara += 1;
			
			n = n / 10;
		}
		
		return brCifara;
	}
	
	public static boolean isNarcistic(int n) {
		int brcif = brCifara(n);
		int suma = 0;
		
		while (n > 0) {
			int cifra = n % 10;
			suma += Math.pow(cifra, brcif);
			n = n / 10;
		}
		
		if (n == suma) {
			return true;
		}	else {
				return false;
			}
		}
	
	
// sedmi zadatak
	
	public static double dronudaljenost(int x, int y, int z, int [] px, int [] py, int[] pz) {
	double rastojanje = 0;
	for (int i = 0; i < px.length; i++) {
		if (px[i] > 0 && py[i] > 0) {
			int dx = px[i] - x;
			int dy = py[i] - y;
			int dz = pz[i] - z;
			double distanca = Math.sqrt(dx * dx + dy * dy + dz * dz);
			rastojanje += distanca * 2;
		}
	return rastojanje;
	}
	
// osmi zadatak
	
	
	
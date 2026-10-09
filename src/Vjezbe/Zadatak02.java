package nedelja03;

// Zaposleni zadatak

public class Zadatak02 {
	private String ime;
	private String prezime;
	private int godineStaza;
	private float plata;
	
	public Zadatak02(String ime, String prezime, int godineStaza, float plata) {
		this.ime = ime;
		this.prezime = prezime;
		this.godineStaza = godineStaza; //odje je validno da stavimo seter unutar konstruktora da setujemo vrijednost
		this.plata = plata;
	}

	
	
	public String getIme() {
		return ime;
	}



	public void setIme(String ime) {
		this.ime = ime;
	}



	public String getPrezime() {
		return prezime;
	}



	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}



	public int getGodineStaza() {
		return godineStaza;
	}



	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}



	public float getPlata() {
		return plata;
	}



	public void setPlata(float plata) {
		this.plata = plata;
	}

	public void stampa() {
		System.out.println("Ime zaposlenog:" + this.ime);
		System.out.println("Prezime:" + this.prezime);
		System.out.println("Godine staza:" + this.godineStaza);
		System.out.println("Plata:" + this.plata);
	}
	
	public void azuriranjePlate() {
		if (this.godineStaza > 10) {
			if (this.plata < 800) {
				plata = plata + plata * 0.06f;
			}
				
		}
	}

	public static void main(String[] args) {
		Zadatak02 zaposleni1 = new Zadatak02("Ivan", "Ivanovic", 10, 1500);
		Zadatak02 zaposleni2 = new Zadatak02("Petar", "Ivanovic", 12, 750);
		Zadatak02 zaposleni3 = new Zadatak02("Milica", "Ivanovic", 5, 900);
		
		zaposleni1.stampa();
		System.out.println();
		
		zaposleni2.stampa();
		System.out.println();
		
		zaposleni3.stampa();
		System.out.println();
		
		zaposleni2.azuriranjePlate();
		zaposleni2.stampa();
		
	}

}


public class PierwszaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] tablica = { -2};
		
		
		Punkt mojPierwszyPunkt = new Punkt();
		 mojPierwszyPunkt.x = 1;
		 mojPierwszyPunkt.y = 3;
		 
		 Punkt drugi = new Punkt();
		 drugi.x = 1;
		 drugi.y = 3;
		 double odleglosc = mojPierwszyPunkt.obliczOdleglosc(drugi);
		
		 
		 
		 System.out.println("Wspolrzedne " + mojPierwszyPunkt.x + mojPierwszyPunkt.y);
		 
		 System.out.println(odleglosc);
		 
		 
		 System.out.println(mojPierwszyPunkt.equals(drugi)); // nie jest taki sam 
		 
		 
	}
		/*
		System.out.println("tablica " + tablica[0]);
		
		modyfikujObiekt(tablica);
		System.out.println("tablica " + tablica[0]);
		
		Double doubledouble = 1.3; // - to jest obiekt teraz
		doubledouble.hashCode(); // mozna wywolac metody
		
		String wyraz = "Moj pierwszy wyraz";
		System.out.println(wyraz);
		

	}
	
	public static void modyfikujObiekt(int[] tablica)
	{
		tablica[0] = 12;
	}
	
	//public static void modyfikujNieobiekt(int nieobiekt)

*/
}


public class DrugaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int liczba = 1;
		int liczba2 = 2;
		
		if (liczba==liczba2) {
			System.out.println("Rowne");
		}
		
		String tekst = "tekst";
		String tekst2 = new String("tekst");
		
		System.out.println(tekst == tekst2); // tak nie mozna bo nie mozna porownywac obiektow (nie ta sama reka)
		
		System.out.println(tekst.equals(tekst2));

	}

}

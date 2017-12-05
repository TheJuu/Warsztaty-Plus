
public class Punkt {
	
	int x;
	int y;
	
	
	public double obliczOdleglosc(Punkt p) 
	{
		double odlegloscX = this.x - p.x; //po prawej stronie this tu bedzie mojPierwszyPunkt a p to wartosc z punktu podanego w metodzie
		double odlegloscY = this.y - p.y;
		
		return Math.sqrt(odlegloscX * odlegloscX + odlegloscY* odlegloscY);
	}

}

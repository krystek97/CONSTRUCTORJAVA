package constructor.sportcode.pl;

public class Firma 
{
	public static void main(String[] args)
	{
		Pracownik Stefan = new Pracownik(45 , 1400);
		System.out.println("Pracownik Stefan ma "+Stefan.wiek+"lat\n") ;
		System.out.println("Pracownik zarabia "+Stefan.wyplata+"na miesiac") ; 
	}
}


public class Ausgabe {
	
	public static void einzelZahl(int x, int nr) {
		System.out.println("Die " + nr + " Zahl lautet: " + x);
	}
	
	public static void gesamtZahlen(int[] x) {
		System.out.println("Hier noch alle Lottozahlen auf einen Blick");
		for(int i=0; i<6; i++) {
			System.out.print(x + ", ");
		}
	}
	
}

import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		int[] lottozahlen = new int[6];
		int[] tippzahlen = new int[6];
		int x;
		int y;
		boolean treffer = false;
		int versuche = 0;
		
		
		
		
		for(int j = 0; j<6; j++) {					// Starten der Schleife für 6 Lottozahlen
			x = Zufallszahl.zufallsZahl();			// Erstellen erster Zufallszahl und speichern in x
			for(int i=0; i<6; i++) {				// Starten der Schleife für 6 Überprüfungen
				if(lottozahlen[i] == x) {			// Prüfe ob die Zufallszahl schon im Array an Platz i vorhanden ist
					i = 0;							// falls bereits vorhanden setze i auf 0 um die Überprüfung des gesamten Arrays erneut durch  zu führen
					x= Zufallszahl.zufallsZahl();	// Aufruf der Funktion zufallsZahl für die erstellung einer Zufallszahl und speicher diese in x
				}									// Schließe Überprüfung
			}										// Schließe Prüfungsschleife
			Ausgabe.einzelZahl(x, j);				// Ausgabe der noch nicht vorhandenen Lottozahl
			lottozahlen[j] = x;						// Speichere Zufallszahl an nächste freie Stelle
		}
		
		Arrays.sort(lottozahlen); 

		System.out.println("Hier noch alle Lottozahlen auf einen Blick");	// Ausgabe der zufälligen Lottozahlen
		for(int i=0; i<6; i++) {
			System.out.print(lottozahlen[i] + ", ");
		}
		
		while(treffer == false) {
			for(int j = 0; j<6; j++) {					// Starten der Schleife für 6 Lottozahlen
				y = Zufallszahl.zufallsZahl();			// Erstellen erster Zufallszahl und speichern in x
				for(int i=0; i<6; i++) {				// Starten der Schleife für 6 Überprüfungen
					if(tippzahlen[i] == y) {			// Prüfe ob die Zufallszahl schon im Array an Platz i vorhanden ist
						i = 0;							// falls bereits vorhanden setze i auf 0 um die Überprüfung des gesamten Arrays erneut durch  zu führen
						y= Zufallszahl.zufallsZahl();	// Aufruf der Funktion zufallsZahl für die erstellung einer Zufallszahl und speicher diese in x					
					}									// Schließe Überprüfung
				}										// Schließe Prüfungsschleife
				tippzahlen[j] = y;						// Speichere Zufallszahl an nächste freie Stelle
			}
			
			Arrays.sort(tippzahlen); 					// Sortiert das Array der Größe nach
			
			System.out.println("Hier noch alle Tippzahlen auf einen Blick");	// Ausgabe der zufälligen Tippzahlen
			for(int i=0; i<6; i++) {
				System.out.print(tippzahlen[i] + ", ");
			}
			
			treffer = Arrays.equals( lottozahlen, tippzahlen );	// Überprüfen der Arrays auf die selben Zahlen
			System.out.println(treffer);				// Ausgabe von treffer (false/true)
			versuche++;									// Zählen der Versuche
			
		}
		
		System.out.println("treffer!!! Mit " + versuche + " versuchen!");
		
		System.exit(1);									// Beenden des Programms
	}

}

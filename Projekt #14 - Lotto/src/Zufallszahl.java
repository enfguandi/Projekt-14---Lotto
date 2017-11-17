import java.util.*;

public class Zufallszahl {

	public static int zufallsZahl() {
		int zahl = 0;
		double zufallsZahl = 0;
		boolean zahlRichtig = false;
		
		while(zahlRichtig == false) {
		
			zufallsZahl = Math.random();
			zufallsZahl = zufallsZahl*100;
			
			// System.out.println(zufallsZahl);
			
			if((zufallsZahl<=50) && (zufallsZahl >0)) {
				zahlRichtig=true;
			}
		}
		
		zahl = (int) zufallsZahl;
		// System.out.println("Final " + zahl);
		return zahl;
	}
}

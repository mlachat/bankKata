package de.lv1871.bank.model;

import de.lv1871.bank.Kontobewegung;

public class Konto {
	
	Kontostand kontostand = new Kontostand();
	
	public void druckeKontoauszug(Kontobewegung bewegung) {
		
		kontostand.druckeKontostand(bewegung);
	}
	
	public void ueberweiseGeldAuf(Konto zielKonto, Ueberweisung ueberweisung) {
		zielKonto.addUeberweisung(ueberweisung);
	}

	private void addUeberweisung(Ueberweisung ueberweisung) {
		kontostand.addUeberweisung(ueberweisung);
	}

}

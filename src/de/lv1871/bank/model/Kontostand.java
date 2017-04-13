package de.lv1871.bank.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.lv1871.bank.Kontobewegung;

import static java.lang.System.out;

public class Kontostand {
	
	List<Ueberweisung> ueberweisungen = new ArrayList<>();
	
	public void addUeberweisung(Ueberweisung ueberweisung) {
		ueberweisungen.add(ueberweisung);
	}

	public void druckeKontostand(Kontobewegung kontobewegung) {
		Collections.sort(ueberweisungen);
		switch (kontobewegung) {
		case Alle:
			out.println("date       | credit   | debit    | balance");
			Betrag kontostand = new Betrag(0);
			for (Ueberweisung ueberweisung : ueberweisungen) {
				kontostand = ueberweisung.add(kontostand);
				out.println(ueberweisung + " | " + kontostand.getFormattedBetrag());
			}
			break;
		case Einzahlung:
			

		default:
			break;
		}
		
			
	}
}

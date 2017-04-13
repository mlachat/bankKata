package de.lv1871.bank.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ueberweisung implements Comparable<Ueberweisung> {	
	Betrag betrag;

	public Ueberweisung(Betrag betrag, Date datum) {
		this.betrag = betrag;
		this.datum = datum;
	}

	Date datum;
	
	public Betrag add(Betrag betrag) {
		return this.betrag.addBetrag(betrag);
	}

	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String datumAsString = sdf.format(datum);
		return datumAsString + " | " + betrag.druckeDichFuerKontoauszug();
	}

	@Override
	public int compareTo(Ueberweisung o) {
		return datum.compareTo(o.datum);
	}

}

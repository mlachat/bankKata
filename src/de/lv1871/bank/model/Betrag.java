package de.lv1871.bank.model;

import java.text.DecimalFormat;

public class Betrag {
	
	int betragInCent;

	public Betrag(int amountInCent) {
		this.betragInCent = amountInCent;
	}

	public String druckeDichFuerKontoauszug() {
		if (betragInCent < 0) return String.format("         | %1$-8s", getFormattedBetrag(-betragInCent));
		return String.format("%1$-9s|         ", getFormattedBetrag());
	}

	public String getFormattedBetrag() {
		return getFormattedBetrag(betragInCent);
	}

	public String getFormattedBetrag(int betragInCent) {
		DecimalFormat df = new DecimalFormat("#.00"); 
		return df.format((double) betragInCent / 100d);
	}

	public Betrag addBetrag(Betrag betrag){
		return new Betrag(betragInCent + Integer.valueOf("" + betrag));
	}

	@Override
	public String toString() {
		return String.valueOf(betragInCent);
	}
}

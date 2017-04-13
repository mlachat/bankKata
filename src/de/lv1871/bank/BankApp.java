package de.lv1871.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import de.lv1871.bank.model.Betrag;
import de.lv1871.bank.model.Konto;
import de.lv1871.bank.model.Ueberweisung;

public class BankApp {

	public static void main(String[] args) throws ParseException {
		Konto konto = new Konto();
		Konto zielKonto = new Konto();
		
		konto.ueberweiseGeldAuf(zielKonto, erstelleUeberweisung("12-04-2017", 10005));
		zielKonto.ueberweiseGeldAuf(zielKonto, erstelleUeberweisung("01-04-2017", 12006));
		konto.ueberweiseGeldAuf(zielKonto, erstelleUeberweisung("10-04-2017", -5001));
		zielKonto.druckeKontoauszug(Kontobewegung.Alle);
	}

	private static Ueberweisung erstelleUeberweisung(String datum, int betragInCent) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Betrag betrag = new Betrag(betragInCent);
		Date date = sdf.parse(datum);
		Ueberweisung ueberweisung = new Ueberweisung(betrag, date);
		return ueberweisung;
	}

}

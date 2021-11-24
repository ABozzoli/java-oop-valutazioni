package it.corso.valutazioni;

public class CalcolaValutazione {

	// attributi
	int idStudente;
	int assenze;
	float mediaVoti;
	
	// costruttori
	CalcolaValutazione(int idStudente, int assenze, float mediaVoti){
		this.idStudente = idStudente;
		this.assenze = assenze;
		this.mediaVoti = mediaVoti;
	}
	
	// metodi
	boolean promosso() {
		boolean promosso;
		
		if(assenze > 50) {
			promosso = false; // bocciato
		} else if (25 < assenze && assenze < 50 && mediaVoti <= 2) { 
			promosso = false; // bocciato
		} else if (25 < assenze && assenze < 50 && mediaVoti > 2) {
			promosso = true; // promosso
		} else if (assenze < 25 && mediaVoti >= 2) {
			promosso = true; // promosso
		} else {
			promosso = false; // bocciato
		}
		
		return promosso;
	}
	
}

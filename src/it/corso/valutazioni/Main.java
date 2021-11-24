package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		CalcolaValutazione[] studenti = new CalcolaValutazione[20]; // dichiaro array vuoto
		
		// Random init
		Random randomGenerator = new Random();
		
		// variabili
		int idStudente = 0;
		int assenze;
		float mediaVoti;
		boolean promosso;
		
		for(int i = 0; i < studenti.length; i++) {
			
			// genera dati studente
			idStudente++;
			assenze = randomGenerator.nextInt(101);
			mediaVoti = randomGenerator.nextInt(6);
			
			// assegna dati a posiz. attuale array
			studenti[i] = new CalcolaValutazione(idStudente, assenze, mediaVoti);
			
			// calcola se promosso
			promosso = studenti[i].promosso();
			
			// stampa risultati
			if (promosso) {
				System.out.println("Lo studente con ID: " + idStudente + " è promosso.");
			} else {
				System.out.println("Lo studente con ID: " + idStudente + " è bocciato.");
			}
			
		}
		
	}

}

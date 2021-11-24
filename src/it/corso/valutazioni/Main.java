package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		CalcolaValutazione[] studenti = new CalcolaValutazione[20]; // dichiaro array vuoto
		
		// Random init
		Random randomGenerator = new Random();
		
		// variabili
		int idStudente;
		int assenze;
		float mediaVoti;
		
		for(int i = 0; i < studenti.length; i++) {
			idStudente = randomGenerator.nextInt(20) + 1;
			assenze = randomGenerator.nextInt(101);
			mediaVoti = randomGenerator.nextInt(6);
			System.out.println("ID:" + idStudente + "   assenze:" + assenze + "%   media voti:" + mediaVoti);
		}
		
	}

}

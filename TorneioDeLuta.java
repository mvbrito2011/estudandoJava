package RepositorioGit.estudandoJava;

public class TorneioDeLuta {

	public static void main(String[] args) {
	Lutador card[] = new Lutador[6];
		
		card[0] = new Lutador("John Jones", "EUA", 26, 1.78, 100, 28, 3, 1);		
		
		card[1] = new Lutador("Anderson Silva", "BRA", 30, 1.80, 110, 30, 5, 0);
		
		card[2] = new Lutador("Crocop", "EUA", 35, 1.70, 72, 32, 9, 4);
		
		card[3] = new Lutador("Nistelroy", "HOL", 27, 1.76, 75, 20, 3, 1);
		
		Luta COMBATE01 = new Luta();
		COMBATE01.marcarLuta(card[0], card[1]);
		COMBATE01.lutar();
		
		card[0].status();
		card[1].status();
		
		System.out.println("------------------PRÓXIMA LUTA!------------------------");
		
		Luta COMBATE02 = new Luta();
		COMBATE02.marcarLuta(card[2], card[3]);
		COMBATE02.lutar();
		
		card[2].status();
		card[3].status();
		
		
		
	}

}

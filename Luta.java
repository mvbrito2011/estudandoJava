package RepositorioGit.estudandoJava;

import java.util.Random;

public class Luta {
	//Nesse construtor temos um relacionamento entre classes (Lutador e Luta), num processo de agregação de objetos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	

	public void marcarLuta(Lutador l1 , Lutador l2 ) {
		
		
		if(l1.getCategoria().equals(l2.getCategoria()) && l1.getNome() != l2.getNome()) {
			
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
			System.out.println("A luta está marcada! Vamos as apresentações");
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
			System.out.println("A luta não pode ocorrer! ");
		}
	}
		
	public void lutar() {
		if(this.isAprovada() == true) {
			System.out.println("########          IT'S TIME!!!!!!         ###########");
			System.out.println("######## DO MEU LADO DIREITO, O DESAFIADO ###########");
			desafiado.apresentar();
			System.out.println("######## DO MEU LADO DIREITO, O DESAFIADO ###########");
			desafiante.apresentar();
			System.out.println("#####################################################");
			System.out.println("A luta está bastante disputada! Quem vai se sair melhor nos rounds?! ");
			System.out.println("O juiz vai anunciar o resultado! ");
			System.out.println("#####################################################");
			Random sorte = new Random();
			int vencedor = sorte.nextInt(3);
			switch (vencedor) {
			case 0:
				System.out.println("O resultado da luta foi Empate! ");
				System.out.println("#####################################################");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
				
			case 1:
				System.out.println("O desafiante " + this.desafiante.getNome() + " venceu! ");
				System.out.println("#####################################################");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			case 2:
				System.out.println("O desafiado " + this.desafiado.getNome() + " venceu! ");
				System.out.println("#####################################################");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
				
			default:
				
				break;
			}
			
			
		}
	}

	private Lutador getDesafiado() {
		return desafiado;
	}

	private void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	private Lutador getDesafiante() {
		return desafiante;
	}

	private void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	private int getRounds() {
		return rounds;
	}

	private void setRounds(int rounds) {
		this.rounds = rounds;
	}

	private boolean isAprovada() {
		return aprovada;
	}

	private void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	 

}

package RepositorioGit.estudandoJava;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//construtor para receber as informações
	public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
		
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}


//metodos 

	public void apresentar() {
	System.out.println("E aqui temos o lutador " + this.getNome());	
	System.out.println("com " + this.getIdade() + " anos");	
	System.out.println("Altura de: " + this.getAltura() + " m");	
	System.out.println("Pesando "+ this.getPeso() +" Kg");	
	System.out.println("Possui "+ this.getVitorias() + " Vitórias");	
	System.out.println("Possui "+ this.getDerrotas() + " Derrotas");
	System.out.println("Possui "+ this.getEmpates() + " Empates");
	System.out.println("-----------------------------------------------");
	}

	
	
	public void status() {
	System.out.println("O lutador " + this.getNome() + " é um peso " + this.getCategoria() + " com " + this.getVitorias() + " vitórias ");
	System.out.println(this.getDerrotas() + " derrotas e " + this.getEmpates()+ " empates!");
	}
	
	
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
		
	
	}
	
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}	
	
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}
//metodos get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		
		if(this.getPeso() < 52.2) {
			this.categoria = "Inválido";
//			System.out.println("O lutador está abaixo do peso e não pode lutar");
		} else if(this.getPeso()>= 52.2 && this.getPeso()<=70.3) {
			this.categoria = "Leve";
//			System.out.println("O lutador esta na categoria :" + this.getCategoria());
		} else if(this.getPeso()>70.3 && this.getPeso()<=83.9) {
			this.categoria = "Médio";
//			System.out.println("O lutador esta na categoria : "+ this.getCategoria());
		} else if (this.getPeso()>83.9 && this.getPeso()<=120.2) {
			this.categoria = "Pesado";
//			System.out.println("O lutador esta na categoria : "+ this.getCategoria());
		} else {
			this.categoria = "Inválido";
//			System.out.println("O lutador está acima do peso e não pode lutar");
		}
		
	}
	

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}	
	
	//fim do get e set
	

	
//fim da classe
}

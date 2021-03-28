//Autor Victor Hugo
//Código Abertura e fechamento de conta em Banco e ações de depósito e saque 
public class ContaBanco {
	//Atributos necessários
	public int numConta;
	protected String tipo;   //pode ser CC ou CP
	private String dono;    
	private double saldo;
	private boolean status;   //Verdadeiro ou falso
	
	//Construtor
	public ContaBanco() {
	this.saldo = 0;
	this.status = false;
	}
	
	
	
	//Metodos get e set**********************************************************************************************************
	
	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int n) {
		this.numConta = n;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String t) {
		this.tipo = t;
	}


	public String getDono() {
		return dono;
	}
	

	public void setDono(String dono) {
		this.dono = dono;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public boolean getStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	//Métodos para modeficar a conta*************************************************************************

	public  void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if(t == "cc") {
			this.setSaldo(50);	
			System.out.println("Você ganhou 50 reais! Seu saldo na conta agora é " + this.getSaldo());
		}else if (t == "cp"){
			this.setSaldo(150);
			System.out.println("Você ganhou 150 reais! Seu saldo na conta agora é " + this.getSaldo());
		}
		System.out.println("Conta aberta!");
	}
	
	public void fecharConta() {
		if(saldo > 0) {
			System.out.println("A conta ainda tem dinheiro, não é possível fechar a conta");
		} else if(saldo < 0) {
			System.out.println("Você está em débito com o banco, não é possível fechar a conta");
		}else {
			System.out.println("A conta foi fechada");
		}
		
	}
	
	
	
	public void depositar(double deposito){
		if(getStatus() == true) {
			this.setSaldo(this.getSaldo() + deposito);
			System.out.println("Deposito de "+deposito+" realizado");
			System.out.println("Seu saldo na conta agora é " + this.getSaldo());
		} else if(getStatus() == false) {
			System.out.println("Você ainda não abriu uma conta");
		}	
		
	}
	
	
	
	public void sacar(double saque){
		if(this.getStatus() == true) {
			
			if(saque <= getSaldo()) {
				
				this.setSaldo(this.getSaldo() - saque);
				System.out.println("Saque de "+saque+" realizado");
				System.out.println("Seu saldo na conta agora é " + this.getSaldo());
				
			}else {
							System.out.println("Você não tem saldo suficiente");
			}
		
		} else if(this.getStatus() == false) {
				System.out.println("Você ainda não abriu uma conta");
		}
	}
	
	public void pagarMensal(){
		if(this.getStatus() == true) {
			
			if( this.getSaldo()>0 ) {
				if(this.getTipo()=="cc") {
				this.setSaldo(this.getSaldo() - 12);
				System.out.println("Mensalidade paga com sucesso da conta Corrente");
				System.out.println("Seu saldo na conta agora é " + this.getSaldo());
				}else if(this.getTipo()=="cp"){
				this.setSaldo(this.getSaldo() - 20);
				System.out.println("Mensalidade paga com sucesso da conta Poupança");
				System.out.println("Seu saldo na conta agora é " + this.getSaldo());
				}
			}else {
			System.out.println("Você não tem saldo suficiente");
			}
		
		}else if(this.getStatus() == false) {
				System.out.println("Você ainda não abriu uma conta");
		}	
		
	}
	
	public void dadosCompletosDoCliente() {
		System.out.println("                               ");
		System.out.println("                               ");
		System.out.println("Informação completa do cliente: ");
		System.out.println("Nome: "+this.getDono());
		System.out.println("Número de conta: "+this.getNumConta());
		System.out.println("Status da conta: "+this.getStatus());
		System.out.println("Tipo da conta: "+this.getTipo());
		System.out.println("Saldo atual: "+this.getSaldo());
		
	}
	
	
	
	
	
}

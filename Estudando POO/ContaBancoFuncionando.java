
public class ContaBancoFuncionando {

	public static void main(String[] args) {
		ContaBanco nubank = new ContaBanco();
		nubank.abrirConta("cc");
		nubank.numConta = 12345678;
		nubank.depositar(100);
		nubank.sacar(10);
		nubank.pagarMensal();
		nubank.setDono("Victor");
		nubank.dadosCompletosDoCliente();
		
		
		
	}

}

package banco_superior;

public class Conta_Investimento extends Conta{
	
	static final float rendimento = 0.0036f;
	
	public Conta_Investimento(String numeroConta, String agencia, String nome, String cpf, String dataAbertura) {
		
		super(numeroConta, agencia, nome, cpf, dataAbertura);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void transferir(Conta contaDestino, float valor) {
		// TODO Auto-generated method stub
		if (contaDestino instanceof Conta_Corrente || contaDestino instanceof Conta_Poupanca ) {
			
			this.sacar(valor + (valor * Conta.TAXA_ADM));
			contaDestino.depositar(valor);
		}
		else {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
		
	}

}

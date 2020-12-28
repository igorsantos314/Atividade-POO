package banco_superior;

public abstract class Conta {
	
	String numeroConta;
	String agencia;
	String nome;
	String cpf;
	private float saldo;
	private boolean status;
	String dataAbertura;
	
	//ATRIBUTO DE CLASSE QUE É UMA CONSTANTE
	static final float TAXA_ADM = 0.02f;
	
	public Conta(String numeroConta, String agencia, String nome, String cpf, String dataAbertura) {

		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0f;
		this.status = true;
		this.dataAbertura = dataAbertura;
	}
	
	public float getSaldo() {
		return saldo;
	}

	public boolean isStatus() {
		return status;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [numeroConta=" + numeroConta + ", agencia=" + agencia + ", nome=" + nome + ", cpf=" + cpf
				 + ", saldo=" + saldo + ", status=" + status + ", dataAbertura="
				+ dataAbertura + "]";
	}
	
	public void depositar(float valor) {
		
		if (this.isStatus() && valor > 0) 
			//ATUALIZA O SALDO
			this.saldo += valor;
		
	}
	
	public void sacar(float valor) {
		
		if(this.saldo >= valor && valor > 0 && this.status) {
			this.saldo -= valor;
		}
		
	}
	
	public void ativarConta() {
		this.status = true;
	}
	
	public void desativarConta() {
		this.status = false;
	}
	
	public abstract void transferir(Conta contaDestino, float valor);
		
}

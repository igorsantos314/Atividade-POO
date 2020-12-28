package banco_superior;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta_Poupanca p1 = new Conta_Poupanca("1234", "001", "Igor", "0000", "10/12/2020");
		Conta_Poupanca p2 = new Conta_Poupanca("1234", "001", "Santos", "0000", "10/12/2020");
		
		Conta_Corrente c1 = new Conta_Corrente("4321", "002", "Jose", "0500", "10/12/2020");
		
		Conta_Investimento i1 = new Conta_Investimento("0201", "003", "Maria", "0110", "12/12/2020");
		Conta_Investimento i2 = new Conta_Investimento("0201", "003", "Josefa", "0110", "12/12/2020");
		
		
		p1.depositar(100);
		c1.depositar(100);
		i1.depositar(100);
		
		c1.transferir(p1, 10);
		
		System.out.println(c1);
		System.out.println(p1);
		
		i1.transferir(p1, 20);
		
		System.out.println(i1);
		System.out.println(p1);
		
		p1.transferir(p2, 9.8f);
		
		System.out.println(p1);
		System.out.println(p2);
		
		i1.transferir(i2, 9.6f);
		
		System.out.println(i1);
		System.out.println(i2);
		
		Conta Contas[] = new Conta[100];  
		
		System.out.println(Contas[0]);
	}

}

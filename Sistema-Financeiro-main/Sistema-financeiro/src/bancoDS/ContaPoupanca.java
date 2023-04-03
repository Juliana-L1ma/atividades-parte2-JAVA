package bancoDS;
//extende a classe mãe
//o método está na classe mãe, isso evita repetição de código
//as condições qu forem específicas podem ficar aqui
//a unica coisa que ela não herda é o construtor 
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(int conta, int agencia, double saldo) {
		super(conta, agencia, saldo);
	}

}

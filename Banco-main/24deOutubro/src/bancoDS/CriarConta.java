package bancoDS;

public class CriarConta {
	public static void main (String [] args) {
		
		ContaCorrente cc1 = new ContaCorrente (2222, 33333, "Julia Soares" , 1000.0 );
		
		System.out.println("Conta Corrente do(a) " + cc1.getCliente());
		System.out.println();
		System.out.println("Conta: " + cc1.getConta() + "\nAgência: " + cc1.getAgencia() + "\ncliente: " + cc1.getCliente() + "\nSaldo: " + cc1.getSaldo());
	
		System.out.println();
		
		ContaPoupanca cp1 = new ContaPoupanca (2022, 33333, "Julia Soares" , 30100.50 );
		System.out.println("Conta Poupança do(a) " + cc1.getCliente());
		System.out.println();
		System.out.println("Conta: " + cp1.getConta() + "\nAgência: " + cp1.getAgencia() + "\ncliente: " + cp1.getCliente() + "\nSaldo: " + cp1.getSaldo());
		System.out.println("*********************************************");
		System.out.println();
		
		ContaCorrente cc2 = new ContaCorrente (5555, 11111 , "Eduardo Lima" , 1000.0 );
		System.out.println("Conta Corrente do(a) " + cc2.getCliente());
		System.out.println();
		System.out.println("Conta: " + cc2.getConta() + "\nAgência: " + cc2.getAgencia() + "\ncliente: " + cc2.getCliente() + "\nSaldo: " + cc2.getSaldo());
	
		System.out.println();
		ContaPoupanca cp2 = new ContaPoupanca (5505, 11111 , "Eduardo Lima" , 5000.55 );
		System.out.println("Conta poupança do(a) " + cc2.getCliente());
		System.out.println();
		System.out.println("Conta: " + cp2.getConta() + "\nAgência: " + cp2.getAgencia() + "\ncliente: " + cp2.getCliente() + "\nSaldo: " + cp2.getSaldo());
		System.out.println("*********************************************");
		
		//saldo do cliente 1 antes dodepósito
		 System.out.println("Saldo de Júlia Soares" + cc1.getSaldo());
		
		//fazendo o depósito para o cliente 1 
	    cc1.deposito(2000);
	    //saldo pós depósito
	    System.out.println("Saldo de Júlia Soares após depósito" + cc1.getSaldo());
	    System.out.println();
	    
	    //fazendo uma transferencia de Paulo para jos�
		boolean transferenciaJulia = cc1.transferir(1000, cc2);
		if (transferenciaJulia) {
			System.out.println("transferência realizada com sucesso");
		}
		else {
			System.out.println("Saldo insuficiênte, transferência não realizada");
		}
		
		
		
	}
}

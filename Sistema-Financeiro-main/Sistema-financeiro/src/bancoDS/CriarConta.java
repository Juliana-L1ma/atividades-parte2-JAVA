package bancoDS;

import java.util.Scanner;

import cartaoCredito.CartaoVisa;

public class CriarConta {
	public static void main (String [] args) {
	   Scanner in = new Scanner (System.in);
	   
		ContaCorrente cc1 = new ContaCorrente (2222, 33333, 10000.0 );
		ContaCorrente cc2 = new ContaCorrente (5555, 11111 , 6000.0 );
		
		ContaPoupanca cp1 = new ContaPoupanca (2222, 33333, 10000.0);
		ContaPoupanca cp2 = new ContaPoupanca (5555, 11111 , 6000.0);
		
		Cadastro cliente1 = new Cadastro();
		Cadastro cliente2 = new Cadastro();
		
		cc1.cliente = cliente1;
		cc2.cliente = cliente2;
		
		CartaoVisa cartaoAbel = new CartaoVisa(cliente1);
		
		//inserindo dados do cliente 1
		cliente1.setNome("Abel Ferreira");
		cliente1.setCpf("156 324 984 55");
		cliente1.setTelefone(11654884);
		cliente1.setSalario(10000.0);
		 
		//inserindo dados do cliente 2
		cliente2.setNome("Bene Duarte");
		cliente2.setCpf("156 324 984 55");
		cliente2.setTelefone(11654884);
		cliente2.setSalario(6000);
		
		System.out.println("Abertura de conta corrente para " + cliente1.getNome());
		System.out.println("Saldo inicial de " + cliente1.getSalario());
		
		System.out.println();
		
		System.out.println("Abertura de conta corrente para " + cliente2.getNome());
		System.out.println("Saldo inicial de " + cliente2.getSalario());
	
		System.out.println();
		
		System.out.println("Digite o valor que você quer transferir:");
		
		double valorTransferencia = in.nextDouble();
	
		
		System.out.println("*********************************************");
		
	    
	    
	    //fazendo uma transferencia de Abel para Bene
		boolean transferencia = cp1.transferir(valorTransferencia,  cp2);
		if (transferencia) {
			System.out.println( cliente1.getNome() + " transferiu " + valorTransferencia +  " para a poupança de " + cliente2.getNome() );
		} else{
			System.out.println("Transferência não realizada, contate seu banco.");
		}
		
		System.out.println("Saldo de " + cliente1.getNome() + ": R$" + cp1.getSaldo() );
	    System.out.println("Saldo de " + cliente2.getNome() + ": R$" + cp2.getSaldo() );
	    System.out.println();
		System.out.println("*********************************************");
		System.out.println();
		
		//fazendo uma transferencia de  Bene  para Abel
			System.out.println("Digite o valor que você quer transferir:");
			
	
	            boolean transferencia2 = cp2.transferir(valorTransferencia,  cp1);
				if (transferencia2) {
					System.out.println( cliente2.getNome() + " transferiu " + valorTransferencia +  " para a poupança de " + cliente1.getNome() );
				} else{
					System.out.println("Transferência não realizada, contate seu banco.");
				}
				
				System.out.println("Saldo de " + cliente1.getNome() + ": R$" + cp1.getSaldo() );
			    System.out.println("Saldo de " + cliente2.getNome() + ": R$" + cp2.getSaldo() );
			    System.out.println();
				System.out.println("*********************************************");
				System.out.println();
				
				System.out.println("Cartão de crédito para " + cliente1.getNome());
				System.out.println("Salário de  " + cliente1.getSalario());
				System.out.println("Limite de " + ( cliente1.getSalario()*0.6 ));
		
		
		GerenteGeral gG1= new GerenteGeral(1, 1, 1.2);
				System.out.println("Digite a senha de segurança para ter acesso");
				gG1.setSenha(in.nextInt());
				
				SistemaDeSeguranca si = new SistemaDeSeguranca(0, 0, 0);
				si.senhaAcessoSeguro(gG1);
		               
	
		
		
				
		
		
	}
}

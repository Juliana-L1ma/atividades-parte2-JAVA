package controleEcatalogo;


public class GeracaoDeCatalogo {
//m�todo main
	public static void main(String[] args) {
		
		//direcionando onde est� a instanci�vel e criando o objeto
		ControleDePedidos controle = new ControleDePedidos ();
		
		//imprimindo dados do cliente pegando os dados que est�o armazenados na inst�ncia
		System.out.println("Cliente: " + controle.getNome());
		System.out.println("Telefone: " + controle.getTelefone() );
		System.out.println("CPF: " + controle.getCpf() );
		System.out.println();
		
		//vari�veis para fazer o calculo do pedido do suco
		double pedidoSucoUva;
		double pedidoSucoLaranja;
		double pedidoSucoGoiaba;
		double pedidoSucoLimao;
		double total;
		
		//atribuindo valores a essas vari�veis, j� fazemos o c�lculo aqui para facilitar
		pedidoSucoUva = controle.sucoDeUva600ml*100;
		//note que ele pega os valores dos sucos que est�o na inst�ncia e multiplica pela quantidade que o cliente quer de unidades
		pedidoSucoLaranja = controle.sucoDeLaranja600ml*200;
		pedidoSucoGoiaba = controle.sucoDeGoiaba600ml*300;
		pedidoSucoLimao = controle.sucoDeLimao600ml*200;
		total = pedidoSucoUva + pedidoSucoLaranja + pedidoSucoGoiaba + pedidoSucoLimao;
		
		
		//imprimindo o pedido j� com o valor do c�lculo
		System.out.println("Pedido : " );
		System.out.println("100 unidades de suco de uva 600ml -- R$" + pedidoSucoUva);
		System.out.println("200 unidades de suco de laranja 600ml -- R$" +  pedidoSucoLaranja);
		System.out.println("300 unidades de suco de goiaba 600ml -- R$" + pedidoSucoGoiaba);
		System.out.println("100 unidades de suco de uva 600ml -- R$" + pedidoSucoLimao );
		System.out.println();
		System.out.println("Total da compra: R$" + (total ));
	   
		//m�todo para calcular o desconsto
		
		
		//se o valor for maior que 3000
		 if (total > 3000 ) {
	        	System.out.println("Desconto de 6%");
	        	System.out.println("Total a pagar: R$" + (total - 0.06*total));
	        	return;
	        }
		 
		 //se o valor for maior que 2000 e menor que 3000
		 if (total > 2000 ) {
        	System.out.println("Desconto de 4%");
        	System.out.println("Total a pagar: R$" + (total - 0.04*total));
        	return;
        }
	    
		 //se o valor for maior que 1000 e menor que 2000
	    if (total > 1000 ) {
	        	System.out.println("Desconto de 2%");
	        	System.out.println("Total a pagar: R$" + (total - 0.02*total));
	    }
		
		 
		}

}

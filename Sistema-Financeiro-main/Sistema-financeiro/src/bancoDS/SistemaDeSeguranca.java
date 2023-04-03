package bancoDS;

public class SistemaDeSeguranca extends Conta {
	
	public SistemaDeSeguranca(int conta, int agencia, double saldo) {
		super(conta, agencia, saldo);
	}
	private int Senha=2235;
	
	public void senhaAcessoSeguro (GerenteGeral g) {
		if (g.senhaSeguranca(this.Senha)) {
			System.out.println("Acesso permitido.");
		}else {
			System.out.println("Acesso negado.");
		}
		
	}

}


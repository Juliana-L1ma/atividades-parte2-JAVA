package bancoDS;

public class GerenteGeral extends SistemaDeSeguranca {
	
	private int senha;
	
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public GerenteGeral(int conta, int agencia, double saldo) {
		super(conta, agencia, saldo);
	}


	public boolean senhaSeguranca (int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

}

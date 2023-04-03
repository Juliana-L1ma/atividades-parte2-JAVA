package bancoDS;



//classe mãe 
//a classe mãe não pode ser muito expecífica ela deve servir para diferentes classes que tenham condições parecidas
public class Conta {
	
	private String cliente;
	private int conta;
	private int agencia;
	private double saldo;
	
    public Conta (int conta, int agencia, String cliente, double saldo) {
    	this.conta = conta;
    	this.agencia = agencia;
    	this.cliente = cliente;
    	this.saldo = saldo;
    }

	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//metodo deposito
	public void deposito(double valor){
		this.saldo += valor ;
	}
	
	//metodo saca
	public boolean saca (double valor) {
			if (saldo >= valor) {
				this.saldo -= valor;
				return true;
			}
			else {
				return false;
			}
	}
	
	public boolean transferir(double valor, Conta destino) {
		if(saca (valor)) {	
			destino.deposito(valor);
			
			return true;
		}else {
			
			return false;
		}
	
	
	}
}

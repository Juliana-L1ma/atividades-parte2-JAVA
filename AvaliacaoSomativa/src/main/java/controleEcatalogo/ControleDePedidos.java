package controleEcatalogo;
//instancia 

public class ControleDePedidos {
   //guardando os dados do cliente
    private String nome="Marcos Soares";
    private String telefone = "(11)91234-5678";
    private String cpf = "123.456.789.10";
    
    //gerando get e set porque armazenamos esses dados como privados então para resgatar vamos usar isso aqui
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//guardamos os valores dos sucos aqui, por não ser um dados pessoal não tem a necessidade de ser privado
	double sucoDeUva600ml = 5.00;
    double sucoDeLaranja600ml = 6.00;
    double sucoDeGoiaba600ml = 4.00;
    double sucoDeLimao600ml = 4.00;
    
    
    
    
}

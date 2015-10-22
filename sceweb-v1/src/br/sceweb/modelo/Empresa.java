package br.sceweb.modelo;

public class Empresa {
	private String CNPJ;
	private String NomeDaEmpresa;
	private String NomeFantasia;
	private String Endereco;
	private String Telefone;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getNomeDaEmpresa() {
		return NomeDaEmpresa;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		NomeDaEmpresa = nomeDaEmpresa;
	}

	public String getNomeFantasia() {
		return NomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		NomeFantasia = nomeFantasia;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

}

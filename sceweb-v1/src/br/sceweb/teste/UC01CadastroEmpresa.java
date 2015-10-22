package br.sceweb.teste;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastroEmpresa {

	static EmpresaDAO empresaDAO;
	static Empresa empresa;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		empresa.setCNPJ("teste");
		empresa.setEndereco("teste");
		empresa.setNomeDaEmpresa("teste");
		empresa.setNomeFantasia("teste");
		empresa.setTelefone("teste");
	}

	@Test
	public void test() {
		assertEquals(1, empresaDAO.Adiciona(empresa));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		empresaDAO = null;
		empresa = null;
	}

}

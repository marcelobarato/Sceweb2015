package br.sceweb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmpresaDAO {
	PreparedStatement ps;
	int codigoRetorno = 0;

	public int Adiciona(Empresa empresa) {
		try (Connection conn = new FabricaDeConexoes().getConnection()) {
			ps = conn.prepareStatement(
					"insert into empresa (cnpj, nomeDaEmpresa,nomeFantasia,endereco,telefone) values (?,?,?,?,?)");
			ps.setString(1, empresa.getCNPJ());
			ps.setString(2, empresa.getNomeDaEmpresa());
			ps.setString(3, empresa.getNomeFantasia());
			ps.setString(4, empresa.getEndereco());
			ps.setString(5, empresa.getTelefone());
			codigoRetorno = ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return codigoRetorno;
	}

}

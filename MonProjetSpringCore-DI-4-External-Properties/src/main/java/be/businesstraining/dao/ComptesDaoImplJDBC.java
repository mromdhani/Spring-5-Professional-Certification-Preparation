package be.businesstraining.dao;


import be.businesstraining.domain.Compte;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;


public class ComptesDaoImplJDBC implements IComptesDao {

	private DataSource dataSource;

	public void setDataSource(DataSource datasource) {
		this.dataSource = datasource;
	}

	@Override
	public void create(Compte compte) {

		String sql = "INSERT INTO COMPTES (Numero, Proprietaire, Solde) VALUES (?, ?, ?)";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, compte.getNumero());
			ps.setString(2, compte.getProprietaire());
			ps.setBigDecimal(3, compte.getSolde());
			ps.executeUpdate();
			ps.close();

		} catch (Exception e) {
			System.out.println("LOG : Il ya eu l'exception : " + e);
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	@Override
	public Compte findById(String id) {

		Compte a_retourner = null;
		String sql = "SELECT * FROM COMPTES WHERE NUMERO = ?";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				a_retourner = new Compte(rs.getString("NUMERO"),
						rs.getString("PROPRIETAIRE"), rs.getBigDecimal("SOLDE"));
			}
			rs.close();
			ps.close();
			return a_retourner;
		} catch (Exception e) {
			System.out.println("LOG : Il ya eu l'exception : " + e);
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}
}

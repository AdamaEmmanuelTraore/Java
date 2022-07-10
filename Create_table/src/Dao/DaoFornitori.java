package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.Fornitore;

public class DaoFornitori implements IDao {
	@Override
	public List<Fornitore> getFornitori() {
		List<Fornitore> fornitori = new ArrayList<Fornitore>();
		String sql = "SELECT * from Fornitori";
		try(Connection conn = DriverManager.getConnection(DBADDRESS, USER, PWD);
				PreparedStatement pr = conn.prepareStatement(sql);
				) {
		// PER OTTENERE TUTTI I RISULTATI DELLE QUERY
			ResultSet rs = pr.executeQuery();
			while(rs.next()) {
				fornitori.add(new Fornitore(rs.getInt("CodiceFornitore"), rs.getString("Nome"), rs.getString("Indirizzo"), rs.getString("Citta")));
			}
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return fornitori;
	}

	
	@Override
	public Fornitore getFornitore(int CodiceFornitore) {
		Fornitore f = null;
		String sql = "SELECT * from Fornitori where CodiceFornitore = ?;";
		try(Connection conn = DriverManager.getConnection(DBADDRESS, USER, PWD);
				PreparedStatement pr = conn.prepareStatement(sql);
				) {
// ASSEGNO UN PARAMETRO
			pr.setInt(1, CodiceFornitore);
// PER OTTENERE IL RISULTATO DELLA QUERY
			ResultSet rs = pr.executeQuery();
			if(rs.next()) {
				f = new Fornitore(rs.getInt("CodiceFornitore"), rs.getString("Nome"), rs.getString("Indirizzo"), rs.getString("Citta"));
			}
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	
	@Override
	public boolean insertFornitore(Fornitore f, int CodiceFornitore) {
		boolean res = false;
		String sql = "INSERT into Fornitori (Nome, Indirizzo, Citta) values (?, ?, ?);";
		try(Connection conn = DriverManager.getConnection(DBADDRESS, USER, PWD);
				PreparedStatement pr = conn.prepareStatement(sql);
				) {
// ASSEGNO I PARAMETRI
			pr.setString(1, f.getNome());
			pr.setString(2, f.getIndirizzo());
			pr.setString(3, f.getCitta());
// PER OTTENERE IL RISULTATO DELLA QUERY
			pr.execute();
			res = true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}
}

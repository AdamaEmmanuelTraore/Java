package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.Auto_class;


public class DaoAuto implements IDao {
	public List<Auto_class> getAutos() {
		List<Auto_class> auto = new ArrayList<Auto_class>();
		String sql = "SELECT * from Auto";
		try(Connection conn = DriverManager.getConnection(DBADDRESS, USER, PWD);
				PreparedStatement pr = conn.prepareStatement(sql);
				) {
		// PER OTTENERE TUTTI I RISULTATI DELLE QUERY
			ResultSet rs = pr.executeQuery();
			while(rs.next()) {
				auto.add(new Auto_class(rs.getInt("id"), rs.getString("marchio"), rs.getString("nazione"), rs.getInt("fatturato"), rs.getInt("dipendenti")));
			}
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return auto;
	}

	
	@Override
	public Auto_class getAuto(int id) {
		Auto_class a = null;
		String sql = "SELECT * from Auto where id = ?;";
		try(Connection conn = DriverManager.getConnection(DBADDRESS, USER, PWD);
				PreparedStatement pr = conn.prepareStatement(sql);
				) {
// ASSEGNO UN PARAMETRO
			pr.setInt(1, id);
// PER OTTENERE IL RISULTATO DELLA QUERY
			ResultSet rs = pr.executeQuery();
			if(rs.next()) {
				a = new Auto_class(rs.getInt("id"), rs.getString("marchio"), rs.getString("nazione"), rs.getInt("fatturato"), rs.getInt("dipendenti"));
			}
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return a;
	}
	

	@Override
	public boolean insertAuto(Auto_class a, int id) {
		boolean res = false;
		String sql = "INSERT into Auto (marchio, nazione, fatturato, dipendenti) values (?, ?, ?, ?);";
		try(Connection conn = DriverManager.getConnection(DBADDRESS, USER, PWD);
				PreparedStatement pr = conn.prepareStatement(sql);
				) {
// ASSEGNO I PARAMETRI
			pr.setString(1, a.getMarchio());
			pr.setString(2, a.getNazione());
			pr.setInt(3, a.getFatturato());
			pr.setInt(4, a.getDipendenti());
// PER OTTENERE IL RISULTATO DELLA QUERY
			pr.execute();
			res = true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}

}
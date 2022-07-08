package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.Prodotto;

public class DaoProdotti implements IDao {

	@Override
	public List<Prodotto> getProdotti() {
		
		List<Prodotto> prodotti = new ArrayList<Prodotto>();
		
		String sql = "SELECT * from Prodotti";
		
		try(Connection conn = DriverManager.getConnection(DBADDRESS, USER, PWD);
				PreparedStatement pr = conn.prepareStatement(sql);
				) {
			
// PER OTTENERE TUTTI I RISULTATI DELLE QUERY
			ResultSet rs = pr.executeQuery();
			
			while(rs.next()) {
				
				prodotti.add(new Prodotto(rs.getInt("id"), rs.getString("marca"), rs.getDouble("prezzo"), rs.getString("tipo")));
				
			}
			
			rs.close();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return prodotti;
	}

	
	@Override
	public Prodotto getProdotto(int id) {
		Prodotto p = null;
		
		String sql = "SELECT * from Prodotti where id = ?;";
		
		try(Connection conn = DriverManager.getConnection(DBADDRESS, USER, PWD);
				PreparedStatement pr = conn.prepareStatement(sql);
				) {
			
// ASSEGNO UN PARAMETRO
			pr.setInt(1, id);
			
// PER OTTENERE IL RISULTATO DELLA QUERY
			ResultSet rs = pr.executeQuery();
			
			if(rs.next()) {
				
				p = new Prodotto(rs.getInt("id"), rs.getString("marca"), rs.getDouble("prezzo"), rs.getString("tipo"));
				
			}
			
			rs.close();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return p;
	}
	

	@Override
	public boolean insertProdotto(Prodotto p, int id) {
		boolean res = false;
		
		String sql = "INSERT into Prodotti (marca, prezzo, tipo) values (?, ?, ?);";
		
		try(Connection conn = DriverManager.getConnection(DBADDRESS, USER, PWD);
				PreparedStatement pr = conn.prepareStatement(sql);
				) {
			
// ASSEGNO I PARAMETRI
			pr.setString(1, p.getMarca());
			pr.setDouble(2, p.getPrezzo());
			pr.setString(3, p.getTipo());
			
// PER OTTENERE IL RISULTATO DELLA QUERY
			pr.execute();
			
			res = true;
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return res;
	}
	

	@Override
	public boolean updateProdotto(Prodotto p, int id) {
		boolean res = false;
		
		String sql = "UPDATE Prodotti set marca = ?, prezzo = ?, tipo = ? where id = ?;";
		
		try(Connection conn = DriverManager.getConnection(DBADDRESS, USER, PWD);
				PreparedStatement pr = conn.prepareStatement(sql);
				) {
			
// ASSEGNO I PARAMETRI
			pr.setString(1, p.getMarca());
			pr.setDouble(2, p.getPrezzo());
			pr.setString(3, p.getTipo());
			pr.setInt(4, id);
			
// PER OTTENERE IL RISULTATO DELLA QUERY
			pr.execute();
			
			res = true;
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return res;
	}


	@Override
	public boolean deleteProdotto(int id) {
		boolean res = false;
		
		String sql = "DELETE from Prodotti where id = ?;";
		
		try(Connection conn = DriverManager.getConnection(DBADDRESS, USER, PWD);
				PreparedStatement pr = conn.prepareStatement(sql);
				) {
			
// ASSEGNO IL PARAMETRO
			pr.setInt(1, id);
			
// PER OTTENERE IL RISULTATO DELLA QUERY
			pr.execute();
			
			res = true;
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return res;
	}
	
}

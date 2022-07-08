package Dao;

import java.util.List;

import Model.Prodotto;

public interface IDao {
//QUI CREO DELLE COSTANTI PER CONNETTERE L'APP JAVA AL DB
	public final static String DBADDRESS = "jdbc:mysql://localhost:3306/Negozio";
	
	public final static String USER = "root";
	
	public final static String PWD = "root";
	
// PER AVERE TUTTI I PRODOTTI
	public List<Prodotto> getProdotti();
	
// PER AVERE UN SOLO PRODOTTO
	public Prodotto getProdotto(int id);
	
// PER CREARE/AGGIUNGERE UN NUOVO PRODOTTO
	public boolean insertProdotto (Prodotto p, int id);
	
// PER MODIFICARE/AGGIORNARE UN PRODOTTO
	public boolean updateProdotto (Prodotto p, int id);
	
// PER ELIMINARE UN PRODOTTO
	public boolean deleteProdotto (int id);

}

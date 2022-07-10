package Dao;

import java.util.List;

import Model.Fornitore;

public interface IDao {
	
	//QUI CREO DELLE COSTANTI PER CONNETTERE L'APP JAVA AL DB
		public final static String DBADDRESS = "jdbc:mysql://localhost:3306/Industria";
		
		public final static String USER = "root";
		
		public final static String PWD = "root";
		
	// PER AVERE TUTTI I FORNITORI
		public List<Fornitore> getFornitori();
		
	// PER AVERE UN SOLO FORNITORE
		public Fornitore getFornitore(int CodiceFornitore);
		
	// PER CREARE/AGGIUNGERE UN NUOVO FORNITORE
		public boolean insertFornitore (Fornitore f, int CodiceFornitore);
		
/*	// PER MODIFICARE/AGGIORNARE UN FORNITORE
		public boolean updateFornitore (Fornitore f, int CodiceFornitore);
		
	// PER ELIMINARE UN FORNITORE
		public boolean deleteFornitore (int CodiceFornitore); */

}

package Dao;

import java.util.List;

import Model.Auto_class;


public interface IDao {
	
	//QUI CREO DELLE COSTANTI PER CONNETTERE L'APP JAVA AL DB
	public final static String DBADDRESS = "jdbc:mysql://localhost:3306/Aziende_automobilistiche";
	
	public final static String USER = "root";
	
	public final static String PWD = "root";
	
// PER AVERE TUTTI I FORNITORI
	public List<Auto_class> getAutos();
	
// PER AVERE UN SOLO FORNITORE
	public Auto_class getAuto(int id);
	
// PER CREARE/AGGIUNGERE UN NUOVO FORNITORE
	public boolean insertAuto (Auto_class a, int id);

}

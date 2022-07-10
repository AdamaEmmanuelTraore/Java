package Create_table_Fornitori;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Dao.DaoFornitori;
import Model.Fornitore;


public class MainApp {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
// DATI D'ACCESSO AL DB
		final String DBADDRESS = "jdbc:mysql://localhost:3306/Industria";
		final String USER = "root";
		final String PWD = "root";
		
/* STEP 1: REGISTRARE JDBC
		try {
			Class.forName("com.mysql.jdbcDriver");
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC non registrato!");
			return;
		}
		System.out.println("JDBC registrato!"); */
		
// STEP 2: CONNESSIONE AL DATABASE
		System.out.println("Connessione al DataBase in corso...");
		try {
			conn = DriverManager.getConnection(DBADDRESS, USER, PWD);
		} catch (SQLException e) {
			System.out.println("Il DataBase mySQL non è stato connesso!");
		}
		if(conn != null) {
			System.out.println("SUCCESSO! Il DataBase è connesso");
		}
		
/* STEP 3: CREAZIONE TABELLA
		System.out.println("Creazione tabella...");
		try {
		stmt = conn.createStatement();
		String sql = "CREATE TABLE Fornitori(CodiceFornitore int not null auto_increment,"
				+ "Nome varchar(50),"
				+ "Indirizzo varchar(50),"
				+ "Citta varchar(50),"
				+ "primary key(CodiceFornitore))";
		stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("La tabella non è stata creata");
			return;
		}
		System.out.println("Tabella creata con successo");	*/
		
		
		DaoFornitori dao = new DaoFornitori();
		Fornitore forn1, forn2, forn3 = null;		
// PER AGGIUNGERE UN NUOVO FORNITORE
		forn1 = new Fornitore(1, "Paolo", "via Milano", "Milano");
		dao.insertFornitore(forn1, 1);
		
		forn2 = new Fornitore(2, "Rosa", "via Torino", "Torino");
		dao.insertFornitore(forn2, 2);
		
		forn3 = new Fornitore(3, "Sara", "via Roma", "Roma");
		dao.insertFornitore(forn3, 3);
/* PER AVERE TUTTI I PRODOTTI
		List<Fornitore> Fornitori = dao.getFornitori();
		for(Fornitore f: Fornitori) {
			System.out.println(f.toString());	
		}	*/
/* PER VISUALIZZARE UN SINGOLO PRODOTTO
		Fornitore f = dao.getFornitore(4);
		System.out.println(f.toString());	*/
		
	}

}

package Auto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Dao.DaoAuto;
import Model.Auto_class;

public class Auto {

	public static void main(String[] args) {
		Connection conn = null;
		Statement create_table = null;
		
// DATI D'ACCESSO AL DB
		final String DBADDRESS = "jdbc:mysql://localhost:3306/Aziende_automobilistiche";
		final String USER = "root";
		final String PWD = "root";
		
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
			create_table = conn.createStatement();
			String sql = "CREATE TABLE Auto(id int not null auto_increment,"
					+ "marchio varchar(50),"
					+ "nazione varchar(50),"
					+ "fatturato int,"
					+ "dipendenti int,"
					+ "primary key(id))";
			create_table.executeUpdate(sql);
			} catch (SQLException e) {
				System.out.println("La tabella non è stata creata");
				return;
			}
		System.out.println("Tabella creata con successo");	*/
		
// STEP 4: AGGIUNGO LE TUPLE DI OGNI RECORD
		DaoAuto dao = new DaoAuto();
		Auto_class A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12 = null;
		
		A1 = new Auto_class(1, "Mercedes", "Germania", 450, 180000);
		dao.insertAuto(A1, 1);
		A2 = new Auto_class(2, "BMW", "Germania", 400, 200000);
		dao.insertAuto(A2, 2);
		A3 = new Auto_class(3, "Seat", "Spagna", 150, 120000);
		dao.insertAuto(A3, 3);
		A4 = new Auto_class(4, "Volvo", "Svezia", 180, 150000);
		dao.insertAuto(A4, 4);
		A5 = new Auto_class(5, "Fiat", "Italia", 250, 220000);
		dao.insertAuto(A5, 5);
		A6 = new Auto_class(6, "Jaguar", "Inghilterra", 120, 80000);
		dao.insertAuto(A6, 6);
		A7 = new Auto_class(7, "Toyota", "Giappone", 380, 280000);
		dao.insertAuto(A7, 7);
		A8 = new Auto_class(8, "Nissan", "Giappone", 380, 170000);
		dao.insertAuto(A8, 8);
		A9 = new Auto_class(9, "Ford", "USA", 500, 240000);
		dao.insertAuto(A9, 9);
		A10 = new Auto_class(10, "WolksWagen", "Germania", 420, 210000);
		dao.insertAuto(A10, 10);
		A11 = new Auto_class(11, "Peugeot", "Francia", 200, 180000);
		dao.insertAuto(A11, 11);
		A12 = new Auto_class(12, "Renault", "Francia", 160, 140000);
		dao.insertAuto(A12, 12);
		
		System.out.println("Dati aggiunti con successo! Bravo!");
		
		List<Auto_class> auto = dao.getAutos();
		for(Auto_class a: auto) {
			System.out.println(a.toString());
		}
	}
}

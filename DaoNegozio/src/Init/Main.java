package Init;

import java.util.List;

import Dao.DaoProdotti;
import Model.Prodotto;

public class Main {

	public static void main(String[] args) {
		
		DaoProdotti dao = new DaoProdotti();
		Prodotto prod, prod2 = null;
/*		
// PER AGGIUNGERE UN NUOVO PRODOTTO
		prod = new Prodotto("Samsung", 500, "Telefono Android");
		dao.insertProdotto(prod);
*/
		
// PER AGGIORNARE/MODIFICARE UN PRODOTTO
		prod2 = new Prodotto("Hp", 700, "Pc");
		dao.updateProdotto(prod2, 12);
		
// PER ELIMINARE UN PRODOTTO
		dao.deleteProdotto(20);
		
// PER AVERE TUTTI I PRODOTTI
		List<Prodotto> prodotti = dao.getProdotti();
		
		for(Prodotto p: prodotti) {
			
			System.out.println(p.toString());
			
		} 
/*
// PER VISUALIZZARE UN SINGOLO PRODOTTO
		Prodotto p = dao.getProdotto(4);
		
		System.out.println(p.toString());
*/
	}

}

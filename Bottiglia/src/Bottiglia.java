/*Scrivere una classe Bottiglia che mi consenta di modellare il suo stato
(quantit‡ e contenuto, esempio: acqua, cocacola, Fanta). Tale classe mi
consente di compiere delle azioni ìbeviî o ìriempiî su una bottiglia e sapere
il suo stato attuale (quantit‡ e contenuto).*/

public class Bottiglia{

    // ATTRIBUTI
    private double quantit‡;
    private String contenuto;

    // COSTRUTTORE
    public Bottiglia(double quantit‡, String contenuto){
        this.quantit‡ = quantit‡;
        this.contenuto = contenuto;
    }


    // AZIONI/METODI
    public void Bevi(double quantit‡Bevuta) {
        quantit‡ -= quantit‡Bevuta;
    }

    public void Riempi(double quantit‡Riempita) {
        quantit‡ += quantit‡Riempita;
    }

    public String StatoAttuale(){
        return "quantit‡: " + quantit‡ + " contenuto: " + contenuto;
    }
    
    }


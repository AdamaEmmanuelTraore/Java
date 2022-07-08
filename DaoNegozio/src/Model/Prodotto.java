package Model;

public class Prodotto {
	private int id;
	private String marca;
	private double prezzo;
	private String tipo;
	
	public Prodotto(int id, String marca, double prezzo, String tipo) {
		super();
		this.id = id;
		this.marca = marca;
		this.prezzo = prezzo;
		this.tipo = tipo;
	}

	public Prodotto(String marca, double prezzo, String tipo) {
		super();
		this.marca = marca;
		this.prezzo = prezzo;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Prodotto [ID = " + id + ", MARCA = " + marca + ", PREZZO = " + prezzo + ", TIPO = " + tipo + "]";
	}
	
	

	
}

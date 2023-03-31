package EjerciciosClases;

public class Barco {
	//Atributos
	private String nombreBarco;
	private int tamano;
	private int numerosPalos;
	//Constructor
		//click derecho a la clase - Source - Constructor fields/Setter and Getter - Elijo los que quiero.
	public Barco(String nombreBarco, int tamano, int numerosPalos) {
		super();
		this.nombreBarco = nombreBarco;
		this.tamano = tamano;
		this.numerosPalos = numerosPalos;
	}
	//ejemplo de polimorfismo: Vamos a sobrecargar el constructor
	public Barco(String nombreBarco) {
		super();
		this.nombreBarco = nombreBarco;
	}
	
	public String getNombreBarco() {
		return nombreBarco;
	}
	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	public int getNumerosPalos() {
		return numerosPalos;
	}
	public void setNumerosPalos(int numerosPalos) {
		this.numerosPalos = numerosPalos;
	}
	
	
}

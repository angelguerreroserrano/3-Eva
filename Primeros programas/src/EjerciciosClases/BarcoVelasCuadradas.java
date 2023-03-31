package EjerciciosClases;

public class BarcoVelasCuadradas extends Barco {
	private boolean tieneVelasCuadradas;
	public BarcoVelasCuadradas(String nombreBarco, int tamano, int numerosPalos, boolean tieneVelasCuadradas) {
		super(nombreBarco, tamano, numerosPalos);
		this.tieneVelasCuadradas=tieneVelasCuadradas;
		// TODO Auto-generated constructor stub
	}
	public boolean isTieneVelasCuadradas() {
		return tieneVelasCuadradas;
	}
	public void setTieneVelasCuadradas(boolean tieneVelasCuadradas) {
		this.tieneVelasCuadradas = tieneVelasCuadradas;
	}
	

}

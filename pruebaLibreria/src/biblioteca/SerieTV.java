package biblioteca;

import java.util.Arrays;

public class SerieTV implements Coleccionable {

	// Atributo
	private String serie;
	private int temporadas;
	private int[] capTemporada;

	// Constructor con parámetros

	public SerieTV(String serie, int temporadas, int[] capTemporada) {
		super();
		this.serie = serie;
		this.temporadas = temporadas;
		this.capTemporada = capTemporada;
	}

	// Constructor por defecto

	public SerieTV() {
		super();

	}

	// Getters and setters

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public int[] getCapTemporada() {
		return capTemporada;
	}

	public void setCapTemporada(int[] capTemporada) {
		this.capTemporada = capTemporada;
	}

	public String mostrar() {
		return Coleccionable.SERIE_TV + "\n--------------------" + "\nSerie: " + serie + "\nTemporadas: " + temporadas
				+ "\nCapitulos: " + Arrays.toString(capTemporada);
	}

}

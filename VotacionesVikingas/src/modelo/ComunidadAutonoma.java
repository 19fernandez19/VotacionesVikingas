package modelo;

public class ComunidadAutonoma {

	// Votos de la CA dependiendo del rango de edad
	public int[] votantesPP = new int [4];
	public int[] votantesPSOE = new int [4];
	public int[] votantesVOX = new int [4];
	public int[] votantesPODEMOS = new int [4];
	String nombreComunidad;
	boolean calculada = false;

	public ComunidadAutonoma(String nombreComunidad) {
		super();
		this.nombreComunidad = nombreComunidad;
		
	}

	public ComunidadAutonoma() {

	}

	public String getNombreComunidad() {
		return nombreComunidad;
	}

	public void setNombreComunidad(String nombreComunidad) {
		this.nombreComunidad = nombreComunidad;
	}

	public int[] getVotantesPP() {
		return votantesPP;
	}

	public void setVotantesPP(int[] votantesPP) {
		this.votantesPP = votantesPP;
	}

	public int[] getVotantesPSOE() {
		return votantesPSOE;
	}

	public void setVotantesPSOE(int[] votantesPSOE) {
		this.votantesPSOE = votantesPSOE;
	}

	public int[] getVotantesVOX() {
		return votantesVOX;
	}

	public void setVotantesVOX(int[] votantesVOX) {
		this.votantesVOX = votantesVOX;
	}

	public int[] getVotantesPODEMOS() {
		return votantesPODEMOS;
	}

	public void setVotantesPODEMOS(int[] votantesPODEMOS) {
		this.votantesPODEMOS = votantesPODEMOS;
	}
	
	public boolean isCalculada() {
		return calculada;
	}

	public void setCalculada(boolean calculada) {
		this.calculada = calculada;
	}

}

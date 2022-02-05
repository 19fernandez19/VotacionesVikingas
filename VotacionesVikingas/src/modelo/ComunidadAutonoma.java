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
	
	public void sumarPP(int[] lista) {
		votantesPP[0] += lista[0];
		votantesPP[1] += lista[1];
		votantesPP[2] += lista[2];
		votantesPP[3] += lista[3];
	}
	
	public void sumarPSOE(int[] lista) {
		votantesPSOE[0] += lista[0];
		votantesPSOE[1] += lista[1];
		votantesPSOE[2] += lista[2];
		votantesPSOE[3] += lista[3];
	}
	
	public void sumarVOX(int[] lista) {
		votantesVOX[0] += lista[0];
		votantesVOX[1] += lista[1];
		votantesVOX[2] += lista[2];
		votantesVOX[3] += lista[3];
	}
	
	public void sumarPODEMOS(int[] lista) {
		votantesPODEMOS[0] += lista[0];
		votantesPODEMOS[1] += lista[1];
		votantesPODEMOS[2] += lista[2];
		votantesPODEMOS[3] += lista[3];
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

package modelo;

public class ComunidadAutonoma {

	// Votos de la CA dependiendo del rango de edad
	public int[] votantesPP;
	public int[] votantesPSOE;
	public int[] votantesVOX;
	public int[] votantesPODEMOS;
	
	private static Object object = new Object();

	public ComunidadAutonoma(int[] votantesPP, int[] votantesPSOE, int[] votantesVOX, int[] votantesPODEMOS) {
		super();
		this.votantesPP = votantesPP;
		this.votantesPSOE = votantesPSOE;
		this.votantesVOX = votantesVOX;
		this.votantesPODEMOS = votantesPODEMOS;
	}
	
	public ComunidadAutonoma() {
		
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
	
	public void votar () {
		
		int votoCiudadano = 100000;
		int habitantesCA = 5000000;
		double porcentajeHab = habitantesCA / 14;
		double numVotos = porcentajeHab / votoCiudadano;
		
		synchronized (object) {
			while (numVotos <= 3) {
				System.out.println("El ciudadano entre el rango de edad 18-25 años ha votado a ");
			}
			
		}
	}
}

package modelo;

public class Ciudadano extends Thread {

	public int votoAleatorio; // voto al partido que ha votado el ciudadano
	public int rangoEdad; // 18 a 25, 26 a 40 ...
	ComunidadAutonoma comunidadAutonoma;

	public Ciudadano(int rangoEdad, ComunidadAutonoma comunidadAutonoma) {
		super();
		this.votoAleatorio = (int) (0+Math.random()*100);
		this.rangoEdad = rangoEdad;
		this.comunidadAutonoma = comunidadAutonoma;
	}
	
	public Ciudadano() {
		
	}

	public int getVotoAleatorio() {
		return votoAleatorio;
	}

	public void setVotoAleatorio(int votoAleatorio) {
		this.votoAleatorio = votoAleatorio;
	}

	public int getRangoEdad() {
		return rangoEdad;
	}

	public void setRangoEdad(int rangoEdad) {
		this.rangoEdad = rangoEdad;
	}

	@Override
	public void run() {
		
		// si el rangoEdad es 1 es entre 18-25
		// si el rangoEdad es 2 es entre 26-40
		
		int [] arrayAuxiliar = new int [4];
		
		if (rangoEdad == 1) {
			if (votoAleatorio >= 0 && votoAleatorio <= 30) {
				System.out.println("Has votado al PP");
				arrayAuxiliar = comunidadAutonoma.getVotantesPP();
				arrayAuxiliar[0]+=1;
				comunidadAutonoma.setVotantesPP(arrayAuxiliar);
				System.out.println(arrayAuxiliar[0]);
			}else if (votoAleatorio >= 31 && votoAleatorio <= 50) {
				System.out.println("Has votado al PSOE");
				arrayAuxiliar = comunidadAutonoma.getVotantesPSOE();
				arrayAuxiliar[0] += 1;
				comunidadAutonoma.setVotantesPSOE(arrayAuxiliar);
				System.out.println(arrayAuxiliar[0]);
			}else if (votoAleatorio >= 51 && votoAleatorio <= 70) {
				System.out.println("Has votado a VOX");
				arrayAuxiliar = comunidadAutonoma.getVotantesVOX();
				arrayAuxiliar[0] += 1;
				comunidadAutonoma.setVotantesVOX(arrayAuxiliar);
				System.out.println(arrayAuxiliar[0]);
			}else {
				System.out.println("Has votado a PODEMOS");
				arrayAuxiliar = comunidadAutonoma.getVotantesPODEMOS();
				arrayAuxiliar[0] += 1;
				comunidadAutonoma.setVotantesPODEMOS(arrayAuxiliar);
				System.out.println(arrayAuxiliar[0]);
			}
		}else if (rangoEdad == 2) {
			if (votoAleatorio >= 0 && votoAleatorio <= 20) {
				System.out.println("Has votado al PP");
				arrayAuxiliar = comunidadAutonoma.getVotantesPP();
				arrayAuxiliar[1] += 1;
				comunidadAutonoma.setVotantesPP(arrayAuxiliar);
				System.out.println(arrayAuxiliar[1]);
			}else if (votoAleatorio >= 21 && votoAleatorio <= 55) {
				System.out.println("Has votado al PSOE");
				arrayAuxiliar = comunidadAutonoma.getVotantesPSOE();
				arrayAuxiliar[1] += 1;
				comunidadAutonoma.setVotantesPSOE(arrayAuxiliar);
				System.out.println(arrayAuxiliar[1]);
			}else if (votoAleatorio >= 56 && votoAleatorio <= 85) {
				System.out.println("Has votado a VOX");
				arrayAuxiliar = comunidadAutonoma.getVotantesVOX();
				arrayAuxiliar[1] += 1;
				comunidadAutonoma.setVotantesVOX(arrayAuxiliar);
				System.out.println(arrayAuxiliar[1]);
			}else {
				System.out.println("Has votado a PODEMOS");
				arrayAuxiliar = comunidadAutonoma.getVotantesPODEMOS();
				arrayAuxiliar[1] += 1;
				comunidadAutonoma.setVotantesPODEMOS(arrayAuxiliar);
				System.out.println(arrayAuxiliar[1]);
			}
		}else if (rangoEdad == 3) {
			if (votoAleatorio >= 0 && votoAleatorio <= 20) {
				System.out.println("Has votado al PP");
				arrayAuxiliar = comunidadAutonoma.getVotantesPP();
				arrayAuxiliar[2] += 1;
				comunidadAutonoma.setVotantesPP(arrayAuxiliar);
				System.out.println(arrayAuxiliar[2]);
			}else if (votoAleatorio >= 21 && votoAleatorio <= 55) {
				System.out.println("Has votado al PSOE");
				arrayAuxiliar = comunidadAutonoma.getVotantesPSOE();
				arrayAuxiliar[2] += 1;
				comunidadAutonoma.setVotantesPSOE(arrayAuxiliar);
				System.out.println(arrayAuxiliar[2]);
			}else if (votoAleatorio >= 56 && votoAleatorio <= 85) {
				System.out.println("Has votado a VOX");
				arrayAuxiliar = comunidadAutonoma.getVotantesVOX();
				arrayAuxiliar[2] += 1;
				comunidadAutonoma.setVotantesVOX(arrayAuxiliar);
				System.out.println(arrayAuxiliar[2]);
			}else {
				System.out.println("Has votado a PODEMOS");
				arrayAuxiliar = comunidadAutonoma.getVotantesPODEMOS();
				arrayAuxiliar[2] += 1;
				comunidadAutonoma.setVotantesPODEMOS(arrayAuxiliar);
				System.out.println(arrayAuxiliar[2]);
			}
		}else {
			if (votoAleatorio >= 0 && votoAleatorio <= 20) {
				System.out.println("Has votado al PP");
				arrayAuxiliar = comunidadAutonoma.getVotantesPP();
				arrayAuxiliar[3] += 1;
				comunidadAutonoma.setVotantesPP(arrayAuxiliar);
				System.out.println(arrayAuxiliar[3]);
			}else if (votoAleatorio >= 21 && votoAleatorio <= 55) {
				System.out.println("Has votado al PSOE");
				arrayAuxiliar = comunidadAutonoma.getVotantesPSOE();
				arrayAuxiliar[3] += 1;
				comunidadAutonoma.setVotantesPSOE(arrayAuxiliar);
				System.out.println(arrayAuxiliar[3]);
			}else if (votoAleatorio >= 56 && votoAleatorio <= 85) {
				System.out.println("Has votado a VOX");
				arrayAuxiliar = comunidadAutonoma.getVotantesVOX();
				arrayAuxiliar[3] += 1;
				comunidadAutonoma.setVotantesVOX(arrayAuxiliar);
				System.out.println(arrayAuxiliar[3]);
			}else {
				System.out.println("Has votado a PODEMOS");
				arrayAuxiliar = comunidadAutonoma.getVotantesPODEMOS();
				arrayAuxiliar[3] += 1;
				comunidadAutonoma.setVotantesPODEMOS(arrayAuxiliar);
				System.out.println(arrayAuxiliar[3]);
			}
		}
		
		
		
	}

}

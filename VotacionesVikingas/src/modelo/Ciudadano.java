package modelo;

public class Ciudadano extends Thread {

	public int votoAleatorio; // voto al partido que ha votado el ciudadano
	public int rangoEdad; // 18 a 25, 26 a 40 ...
	ComunidadAutonoma comunidadAutonoma;

	public Ciudadano(int votoAleatorio, int rangoEdad) {
		super();
		this.votoAleatorio = (int) (0+Math.random()*100);
		this.rangoEdad = rangoEdad;
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
		
		
		if (rangoEdad == 1) {
			if (votoAleatorio >= 0 && votoAleatorio <= 30) {
				System.out.println("Has votado al PP");
			}else if (votoAleatorio >= 31 && votoAleatorio <= 50) {
				System.out.println("Has votado al PSOE");
			}else if (votoAleatorio >= 51 && votoAleatorio <= 70) {
				System.out.println("Has votado a VOX");
			}else {
				System.out.println("Has votado a PODEMOS");
			}
		}else if (rangoEdad == 2) {
			if (votoAleatorio >= 0 && votoAleatorio <= 20) {
				System.out.println("Has votado al PP");
			}else if (votoAleatorio >= 21 && votoAleatorio <= 55) {
				System.out.println("Has votado al PSOE");
			}else if (votoAleatorio >= 56 && votoAleatorio <= 85) {
				System.out.println("Has votado a VOX");
			}else {
				System.out.println("Has votado a PODEMOS");
			}
		}else if (rangoEdad == 3) {
			if (votoAleatorio >= 0 && votoAleatorio <= 10) {
				System.out.println("Has votado al PP");
			}else if (votoAleatorio >= 10 && votoAleatorio <= 55) {
				System.out.println("Has votado al PSOE");
			}else if (votoAleatorio >= 56 && votoAleatorio <= 90) {
				System.out.println("Has votado a VOX");
			}else {
				System.out.println("Has votado a PODEMOS");
			}
		}else {
			if (votoAleatorio >= 0 && votoAleatorio <= 25) {
				System.out.println("Has votado al PP");
			}else if (votoAleatorio >= 26 && votoAleatorio <= 60) {
				System.out.println("Has votado al PSOE");
			}else if (votoAleatorio >= 61 && votoAleatorio <= 95) {
				System.out.println("Has votado a VOX");
			}else {
				System.out.println("Has votado a PODEMOS");
			}
		}
		
		
		
	}

}

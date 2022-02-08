package modelo;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

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
		String votoPartido = "";
		if (rangoEdad == 1) {
			if (votoAleatorio >= 0 && votoAleatorio <= 30) {
				votoPartido = "PP";
				System.out.println("Has votado al PP");
				arrayAuxiliar = comunidadAutonoma.getVotantesPP();
				arrayAuxiliar[0]+=1;
				comunidadAutonoma.setVotantesPP(arrayAuxiliar);
				System.out.println(arrayAuxiliar[0]);
			}else if (votoAleatorio >= 31 && votoAleatorio <= 50) {
				votoPartido = "PSOE";
				System.out.println("Has votado al PSOE");
				arrayAuxiliar = comunidadAutonoma.getVotantesPSOE();
				arrayAuxiliar[0] += 1;
				comunidadAutonoma.setVotantesPSOE(arrayAuxiliar);
				System.out.println(arrayAuxiliar[0]);
			}else if (votoAleatorio >= 51 && votoAleatorio <= 70) {
				votoPartido = "VOX";
				System.out.println("Has votado a VOX");
				arrayAuxiliar = comunidadAutonoma.getVotantesVOX();
				arrayAuxiliar[0] += 1;
				comunidadAutonoma.setVotantesVOX(arrayAuxiliar);
				System.out.println(arrayAuxiliar[0]);
			}else {
				votoPartido = "PODEMOS";
				System.out.println("Has votado a PODEMOS");
				arrayAuxiliar = comunidadAutonoma.getVotantesPODEMOS();
				arrayAuxiliar[0] += 1;
				comunidadAutonoma.setVotantesPODEMOS(arrayAuxiliar);
				System.out.println(arrayAuxiliar[0]);
			}
		}else if (rangoEdad == 2) {
			if (votoAleatorio >= 0 && votoAleatorio <= 20) {
				votoPartido = "PP";
				System.out.println("Has votado al PP");
				arrayAuxiliar = comunidadAutonoma.getVotantesPP();
				arrayAuxiliar[1] += 1;
				comunidadAutonoma.setVotantesPP(arrayAuxiliar);
				System.out.println(arrayAuxiliar[1]);
			}else if (votoAleatorio >= 21 && votoAleatorio <= 55) {
				votoPartido = "PSOE";
				System.out.println("Has votado al PSOE");
				arrayAuxiliar = comunidadAutonoma.getVotantesPSOE();
				arrayAuxiliar[1] += 1;
				comunidadAutonoma.setVotantesPSOE(arrayAuxiliar);
				System.out.println(arrayAuxiliar[1]);
			}else if (votoAleatorio >= 56 && votoAleatorio <= 85) {
				votoPartido = "VOX";
				System.out.println("Has votado a VOX");
				arrayAuxiliar = comunidadAutonoma.getVotantesVOX();
				arrayAuxiliar[1] += 1;
				comunidadAutonoma.setVotantesVOX(arrayAuxiliar);
				System.out.println(arrayAuxiliar[1]);
			}else {
				votoPartido = "PODEMOS";
				System.out.println("Has votado a PODEMOS");
				arrayAuxiliar = comunidadAutonoma.getVotantesPODEMOS();
				arrayAuxiliar[1] += 1;
				comunidadAutonoma.setVotantesPODEMOS(arrayAuxiliar);
				System.out.println(arrayAuxiliar[1]);
			}
		}else if (rangoEdad == 3) {
			if (votoAleatorio >= 0 && votoAleatorio <= 20) {
				votoPartido = "PP";
				System.out.println("Has votado al PP");
				arrayAuxiliar = comunidadAutonoma.getVotantesPP();
				arrayAuxiliar[2] += 1;
				comunidadAutonoma.setVotantesPP(arrayAuxiliar);
				System.out.println(arrayAuxiliar[2]);
			}else if (votoAleatorio >= 21 && votoAleatorio <= 55) {
				votoPartido = "PSOE";
				System.out.println("Has votado al PSOE");
				arrayAuxiliar = comunidadAutonoma.getVotantesPSOE();
				arrayAuxiliar[2] += 1;
				comunidadAutonoma.setVotantesPSOE(arrayAuxiliar);
				System.out.println(arrayAuxiliar[2]);
			}else if (votoAleatorio >= 56 && votoAleatorio <= 85) {
				votoPartido = "VOX";
				System.out.println("Has votado a VOX");
				arrayAuxiliar = comunidadAutonoma.getVotantesVOX();
				arrayAuxiliar[2] += 1;
				comunidadAutonoma.setVotantesVOX(arrayAuxiliar);
				System.out.println(arrayAuxiliar[2]);
			}else {
				votoPartido = "PODEMOS";
				System.out.println("Has votado a PODEMOS");
				arrayAuxiliar = comunidadAutonoma.getVotantesPODEMOS();
				arrayAuxiliar[2] += 1;
				comunidadAutonoma.setVotantesPODEMOS(arrayAuxiliar);
				System.out.println(arrayAuxiliar[2]);
			}
		}else {
			if (votoAleatorio >= 0 && votoAleatorio <= 20) {
				votoPartido = "PP";
				System.out.println("Has votado al PP");
				arrayAuxiliar = comunidadAutonoma.getVotantesPP();
				arrayAuxiliar[3] += 1;
				comunidadAutonoma.setVotantesPP(arrayAuxiliar);
				System.out.println(arrayAuxiliar[3]);
			}else if (votoAleatorio >= 21 && votoAleatorio <= 55) {
				votoPartido = "PSOE";
				System.out.println("Has votado al PSOE");
				arrayAuxiliar = comunidadAutonoma.getVotantesPSOE();
				arrayAuxiliar[3] += 1;
				comunidadAutonoma.setVotantesPSOE(arrayAuxiliar);
				System.out.println(arrayAuxiliar[3]);
			}else if (votoAleatorio >= 56 && votoAleatorio <= 85) {
				votoPartido = "VOX";
				System.out.println("Has votado a VOX");
				arrayAuxiliar = comunidadAutonoma.getVotantesVOX();
				arrayAuxiliar[3] += 1;
				comunidadAutonoma.setVotantesVOX(arrayAuxiliar);
				System.out.println(arrayAuxiliar[3]);
			}else {
				votoPartido = "PODEMOS";
				System.out.println("Has votado a PODEMOS");
				arrayAuxiliar = comunidadAutonoma.getVotantesPODEMOS();
				arrayAuxiliar[3] += 1;
				comunidadAutonoma.setVotantesPODEMOS(arrayAuxiliar);
				System.out.println(arrayAuxiliar[3]);
			}
		}
		
		try {
			Connection connection = crearConexion();
			insertarVoto(connection, comunidadAutonoma.getNombreComunidad(), votoPartido, rangoEdad);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void insertarVoto(Connection connection, String comunidadAutonoma, String votoPartido, int rangoEdad) throws SQLException {
		
		// Consulta SQL
		String consultaSQL = "INSERT INTO votosCiudadanos (nombreComunidad, rangoEdad, votoPartido) VALUES (?,?,?)";
		
		PreparedStatement preparedStatement = null;
		ResultSet generatedKeys = null;
		try {
			preparedStatement = connection.prepareStatement(consultaSQL);
			
			preparedStatement.setString(1, comunidadAutonoma);
			preparedStatement.setInt(2, rangoEdad);
			preparedStatement.setString(3, votoPartido);
			preparedStatement.executeUpdate();
	
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			//cerramos todos los resources
			if (null != generatedKeys) {
				try {
					generatedKeys.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != preparedStatement) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			try {
				disconnect(connection);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	//metodo para crear la conexion con la base de datos
		public Connection crearConexion() {

			Connection conexion = null;
			FileReader reader = null;

			try {
				Properties propiedades = new Properties();
				reader = new FileReader("src/resources/database.properties");

				propiedades.load(reader);
				String driver = propiedades.getProperty("database.driver");
				String url = propiedades.getProperty("database.url");
				String user = propiedades.getProperty("database.user");
				String password = propiedades.getProperty("database.password");

				//obtenemos el driver es decir el mysql connector
				Class.forName(driver);
				//creamos la conexion con la bbdd obteniendo la url de la bbdd la contraseña y el usuario para poder entrar a la bbdd
				conexion = DriverManager.getConnection(url, password, user);

				conexion.setAutoCommit(false);

			} catch (Exception e) {
				e.printStackTrace();
			}
			return conexion;
		}
		
		//metodo para desconectarse de la base de datos de mySQL
		public void disconnect(Connection conexion) throws SQLException {

			if (null != conexion) {
				try {
					conexion.close();
					conexion = null;
				} catch (SQLException e) {
					e.printStackTrace();
					throw e;
				}
			}
		}

}

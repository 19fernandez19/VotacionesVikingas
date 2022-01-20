package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import modelo.ComunidadAutonoma;
import vista.Vista;

public class Controlador {
	
	//METODO MAIN
	public static void main(String[] args) {

		Vista frame = new Vista();
		frame.setVisible(true);
		Controlador controlador = new Controlador();

		// metodos
		controlador.colorJPaneles(frame);

		frame.botonMadrid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cogerHabitantes("Madrid");
			}
		});
		
		frame.botonBarcelona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cogerHabitantes("Barcelona");
			}
		});
	}
	
	public void cogerHabitantes(String comunidadAutonoma) {
		String consulta = "SELECT NOMBRE_COMUNIDAD, TOTAL_HABITANTES, RANGO_18_25, RANGO_26_40, RANGO_41_65, RANGO_MAS_66 FROM PORCENTAJES_RANGOEDAD WHERE NOMBRE_COMUNIDAD = ?";
		
		Connection conexion = null;
		PreparedStatement sentencia = null;
		ResultSet resultado = null;
		
		try {
			
			conexion = crearConexion();
			sentencia = conexion.prepareStatement(consulta);
			sentencia.setString(1, comunidadAutonoma);
			resultado = sentencia.executeQuery();
	
			while (resultado.next()) {
				int totalHabitantes = resultado.getInt("TOTAL_HABITANTES");
				int rango18_25 = resultado.getInt("RANGO_18_25");
				int rango26_40 = resultado.getInt("RANGO_26_40");
				int rango41_65 = resultado.getInt("RANGO_41_65");
				int rangoMas66 = resultado.getInt("RANGO_MAS_66");
				
				System.out.println(rango18_25);
				System.out.println(rango26_40);
				System.out.println(rango41_65);
				System.out.println(rangoMas66);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//cerramos todos los resources
			if (null != resultado) {
				try {
					resultado.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != sentencia) {
				try {
					sentencia.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				disconnect(conexion);
			} catch (SQLException e) {
				e.printStackTrace();
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
	
	// metodo de los colores de los jpanel de los partidos
	public void colorJPaneles(Vista vista) {
		vista.cuadradoPP.setBackground(Color.blue);
		vista.cuadradoPSOE.setBackground(Color.red);
		vista.cuadradoVOX.setBackground(Color.green);
		vista.cuadradoPODEMOS.setBackground(Color.pink);
	}

}

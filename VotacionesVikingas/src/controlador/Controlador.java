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

import javax.swing.JProgressBar;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import modelo.Ciudadano;
import modelo.ComunidadAutonoma;
import vista.Vista;

public class Controlador {
	static ComunidadAutonoma madrid = new ComunidadAutonoma("Madrid");
	static ComunidadAutonoma Catalunia = new ComunidadAutonoma("Catalunia");
	static ComunidadAutonoma Galicia = new ComunidadAutonoma("Galicia");
	static ComunidadAutonoma Asturias = new ComunidadAutonoma("Asturias");
	static ComunidadAutonoma Cantabria = new ComunidadAutonoma("Cantabria");
	static ComunidadAutonoma PaisVasco = new ComunidadAutonoma("Pais Vasco");
	static ComunidadAutonoma Navarra = new ComunidadAutonoma("Navarra");
	static ComunidadAutonoma CLM = new ComunidadAutonoma("Castilla La Mancha");
	static ComunidadAutonoma CyL = new ComunidadAutonoma("Castilla y Leon");
	static ComunidadAutonoma Andalucia = new ComunidadAutonoma("Andalucia");
	static ComunidadAutonoma Extremadura = new ComunidadAutonoma("Extremadura");
	static ComunidadAutonoma Murcia = new ComunidadAutonoma("Murcia");
	static ComunidadAutonoma Aragon = new ComunidadAutonoma("Aragon");
	static ComunidadAutonoma Valencia = new ComunidadAutonoma("Comunidad Valenciana");
	static ComunidadAutonoma Canarias = new ComunidadAutonoma("Canarias");
	static ComunidadAutonoma Baleares = new ComunidadAutonoma("Baleares");
	static ComunidadAutonoma Melilla = new ComunidadAutonoma("Melilla");
	static ComunidadAutonoma Ceuta = new ComunidadAutonoma("Ceuta");
	static ComunidadAutonoma Rioja = new ComunidadAutonoma("La Rioja");
	//METODO MAIN
	public static void main(String[] args) {

		Vista frame = new Vista();
		frame.setVisible(true);
		Controlador controlador = new Controlador();

		// metodos
		controlador.colorJPaneles(frame);

		frame.botonMadrid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (madrid.isCalculada() == false) {
					controlador.cogerHabitantes(madrid);
					madrid.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, madrid);
			}
		});
		
		frame.botonBarcelona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Catalunia.isCalculada() == false) {
					controlador.cogerHabitantes(Catalunia);
					Catalunia.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Catalunia);
			}
		});
		
		frame.botonAndalucia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Andalucia.isCalculada() == false) {
					controlador.cogerHabitantes(Andalucia);
					Andalucia.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Andalucia);
			}
		});
		
		frame.botonAragon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Aragon.isCalculada() == false) {
					controlador.cogerHabitantes(Aragon);
					Aragon.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Aragon);
			}
		});
		
		frame.botonBaleares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Baleares.isCalculada() == false) {
					controlador.cogerHabitantes(Baleares);
					Baleares.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Baleares);
			}
		});
		
		frame.botonCanarias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Canarias.isCalculada() == false) {
					controlador.cogerHabitantes(Canarias);
					Canarias.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Canarias);
			}
		});
		
		frame.botonCantabria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Cantabria.isCalculada() == false) {
					controlador.cogerHabitantes(Cantabria);
					Cantabria.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Cantabria);
			}
		});
		
		frame.botonCLM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CLM.isCalculada() == false) {
					controlador.cogerHabitantes(CLM);
					CLM.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, CLM);
			}
		});
		
		frame.botonRioja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Rioja.isCalculada() == false) {
					controlador.cogerHabitantes(Rioja);
					Rioja.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Rioja);
			}
		});
		
		frame.botonMelilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Melilla.isCalculada() == false) {
					controlador.cogerHabitantes(Melilla);
					Melilla.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Melilla);
			}
		});
		
		frame.botonCyL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CyL.isCalculada() == false) {
					controlador.cogerHabitantes(CyL);
					CyL.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, CyL);
			}
		});
		
		frame.botonNavarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Navarra.isCalculada() == false) {
					controlador.cogerHabitantes(Navarra);
					Navarra.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Navarra);
			}
		});
		
		frame.botonValencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Valencia.isCalculada() == false) {
					controlador.cogerHabitantes(Navarra);
					Navarra.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Valencia);
			}
		});
		
		frame.botonExtremadura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Extremadura.isCalculada() == false) {
					controlador.cogerHabitantes(Extremadura);
					Extremadura.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Extremadura);
			}
		});
		
		frame.botonGalicia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Galicia.isCalculada() == false) {
					controlador.cogerHabitantes(Galicia);
					Galicia.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Galicia);
			}
		});
		
		frame.botonPaisVasco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PaisVasco.isCalculada() == false) {
					controlador.cogerHabitantes(PaisVasco);
					PaisVasco.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, PaisVasco);
			}
		});
		
		frame.botonAsturias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Asturias.isCalculada() == false) {
					controlador.cogerHabitantes(Asturias);
					Asturias.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Asturias);
			}
		});
		
		frame.botonMurcia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Murcia.isCalculada() == false) {
					controlador.cogerHabitantes(Murcia);
					Murcia.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Murcia);
			}
		});
		
		frame.botonCeuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Ceuta.isCalculada() == false) {
					controlador.cogerHabitantes(Ceuta);
					Ceuta.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Ceuta);
			}
		});
	}
	
	public void cogerHabitantes(ComunidadAutonoma comunidadAutonoma) {
		String consulta = "SELECT NOMBRE_COMUNIDAD, TOTAL_HABITANTES, RANGO_18_25, RANGO_26_40, RANGO_41_65, RANGO_MAS_66 FROM PORCENTAJES_RANGOEDAD WHERE NOMBRE_COMUNIDAD = ?";
		
		Connection conexion = null;
		PreparedStatement sentencia = null;
		ResultSet resultado = null;
		
		try {
			
			conexion = crearConexion();
			sentencia = conexion.prepareStatement(consulta);
			sentencia.setString(1, comunidadAutonoma.getNombreComunidad());
			resultado = sentencia.executeQuery();
			
			double totalHabitantes = 0;
			double rango18_25 = 0;
			double rango26_40 = 0;
			double rango41_65 = 0;
			double rangoMas66 = 0;
			
			while (resultado.next()) {
				totalHabitantes = resultado.getInt("TOTAL_HABITANTES");
				rango18_25 = resultado.getInt("RANGO_18_25");
				rango26_40 = resultado.getInt("RANGO_26_40");
				rango41_65 = resultado.getInt("RANGO_41_65");
				rangoMas66 = resultado.getInt("RANGO_MAS_66");
				
				
				System.out.println("Rango de 18 a 25 años: " + rango18_25 + "%");
				System.out.println("Rango de 26 a 40 años: " + rango26_40 + "%");
				System.out.println("Rango de 41 a 65 años: " + rango41_65 + "%");
				System.out.println("Rango de mas de 66 años " + rangoMas66 + "%");
				System.out.println("El total de Habitantes son: " + totalHabitantes);
			}
			
			double numeroHilos = totalHabitantes * (rango18_25/100)/100000;
			System.out.println("El total de votos que hay que hacer entre 18 a 25 años: " + numeroHilos);
			double numeroHilos2 = totalHabitantes * (rango26_40/100)/100000;
			System.out.println("El total de votos que hay que hacer entre 26 a 40 años: " + numeroHilos2);
			double numeroHilos3 = totalHabitantes * (rango41_65/100)/100000;
			System.out.println("El total de votos que hay que hacer entre 41 a 65 años: " + numeroHilos3);
			double numeroHilos4 = totalHabitantes * (rangoMas66/100)/100000;
			System.out.println("El total de votos que hay que hacer de mayor de 66 años: " + numeroHilos4);
			
			int [] listaEdades = new int [4];
			listaEdades [0] = (int)  Math.round(numeroHilos);
			listaEdades [1] = (int)  Math.round(numeroHilos2);
			listaEdades [2] = (int)  Math.round(numeroHilos3);
			listaEdades [3] = (int)  Math.round(numeroHilos4);
			
			for (int i = 0; i < listaEdades.length; i++) {
				for (int j = 0; j < listaEdades[i]; j++) {
					Ciudadano ciudadano = new Ciudadano(i+1, comunidadAutonoma);
					ciudadano.start();
					ciudadano.join();
				}
				
			}
			
			int [] votosPP = comunidadAutonoma.getVotantesPP();
			int [] votosPSOE = comunidadAutonoma.getVotantesPSOE();
			int [] votosVOX = comunidadAutonoma.getVotantesVOX();
			int [] votosPODEMOS = comunidadAutonoma.getVotantesPODEMOS();
			
			int contadorPP = 0;
			int contadorPSOE =0;
			int contadorVOX =0;
			int contadorPODEMOS =0;
			
			for (int i = 0; i < listaEdades.length; i++) {
				System.out.println("Hay " + votosPP[i] + " personas que han votado a PP");
				contadorPP = contadorPP + votosPP[i];
			}
			System.out.println("Total de votos de PP: " + contadorPP);
			for (int i = 0; i < listaEdades.length; i++) {
				System.out.println("Hay " + votosPSOE[i] + " personas que han votado a PSOE");
				contadorPSOE = contadorPSOE + votosPSOE[i];
			}
			System.out.println("Total de votos de PSOE: " + contadorPSOE);
			for (int i = 0; i < listaEdades.length; i++) {
				System.out.println("Hay " + votosVOX[i] + " personas que han votado a VOX");
				contadorVOX = contadorVOX + votosVOX[i];
			}
			System.out.println("Total de votos de VOX: " + contadorVOX);
			for (int i = 0; i < listaEdades.length; i++) {
				System.out.println("Hay " + votosPODEMOS[i] + " personas que han votado a PODEMOS");
				contadorPODEMOS = contadorPODEMOS + votosPODEMOS[i];
			}
			System.out.println("Total de votos de PODEMOS: " + contadorPODEMOS);
			int votosTotal = contadorPP + contadorPSOE + contadorVOX + contadorPODEMOS;
			System.out.println("Total de votos: " + votosTotal);
			
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
	
	public void actualizarProgressBar(Vista frame, ComunidadAutonoma comunidadAutonoma) {
		
		JProgressBar [] barraProgreso = new JProgressBar [4];
		barraProgreso [0] = frame.barraProgreso18a25;
		barraProgreso [1] = frame.barraProgreso26a40;
		barraProgreso [2] = frame.barraProgreso41a65;
		barraProgreso [3] = frame.barraProgreso66Mas;
		
		for (int i = 0; i < barraProgreso.length; i++) {
			if (comunidadAutonoma.getVotantesPP()[i] >= comunidadAutonoma.getVotantesPSOE()[i] && comunidadAutonoma.getVotantesPP()[i] >= comunidadAutonoma.getVotantesVOX()[i] && comunidadAutonoma.getVotantesPP()[i] >= comunidadAutonoma.getVotantesPODEMOS()[i]) {
				double resultado = comunidadAutonoma.getVotantesPP()[i] + comunidadAutonoma.getVotantesPSOE()[i] + comunidadAutonoma.getVotantesVOX()[i] + comunidadAutonoma.getVotantesPODEMOS()[i];
				double resultado2 = (comunidadAutonoma.getVotantesPP()[i] / resultado)*100;
				barraProgreso[i].setValue((int)resultado2);
				barraProgreso[i].setForeground(Color.BLUE);
			}else if (comunidadAutonoma.getVotantesPSOE()[i] >= comunidadAutonoma.getVotantesPP()[i] && comunidadAutonoma.getVotantesPSOE()[i] >= comunidadAutonoma.getVotantesVOX()[i] && comunidadAutonoma.getVotantesPSOE()[i] >= comunidadAutonoma.getVotantesPODEMOS()[i]) {
				double resultado = comunidadAutonoma.getVotantesPP()[i] + comunidadAutonoma.getVotantesPSOE()[i] + comunidadAutonoma.getVotantesVOX()[i] + comunidadAutonoma.getVotantesPODEMOS()[i];
				double resultado2 = (comunidadAutonoma.getVotantesPSOE()[i] / resultado)*100;
				barraProgreso[i].setValue((int)resultado2);
				barraProgreso[i].setForeground(Color.RED);
			}else if (comunidadAutonoma.getVotantesVOX()[i] >= comunidadAutonoma.getVotantesPP()[i] && comunidadAutonoma.getVotantesVOX()[i] >= comunidadAutonoma.getVotantesPSOE()[i] && comunidadAutonoma.getVotantesVOX()[i] >= comunidadAutonoma.getVotantesPODEMOS()[i]) {
				double resultado = comunidadAutonoma.getVotantesPP()[i] + comunidadAutonoma.getVotantesPSOE()[i] + comunidadAutonoma.getVotantesVOX()[i] + comunidadAutonoma.getVotantesPODEMOS()[i];
				double resultado2 = (comunidadAutonoma.getVotantesVOX()[i] / resultado)*100;
				barraProgreso[i].setValue((int)resultado2);
				barraProgreso[i].setForeground(Color.GREEN);
			}else {
				double resultado = comunidadAutonoma.getVotantesPP()[i] + comunidadAutonoma.getVotantesPSOE()[i] + comunidadAutonoma.getVotantesVOX()[i] + comunidadAutonoma.getVotantesPODEMOS()[i];
				double resultado2 = (comunidadAutonoma.getVotantesPODEMOS()[i] / resultado)*100;
				barraProgreso[i].setValue((int)resultado2);
				barraProgreso[i].setForeground(new Color(148, 0, 211));
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
		vista.cuadradoPODEMOS.setBackground(new Color(148, 0, 211));
	}

}

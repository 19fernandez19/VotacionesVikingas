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

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.prism.Graphics;

import modelo.Ciudadano;
import modelo.ComunidadAutonoma;
import vista.Vista;
import vista.Vista3;



public class Controlador {
	
	static ComunidadAutonoma [] comunidadesAutonomas = new ComunidadAutonoma[19];
	
	//METODO MAIN
	public static void main(String[] args) {
		//array de comunidades autonomas
		comunidadesAutonomas[0]= new ComunidadAutonoma("Madrid");
		comunidadesAutonomas[1] = new ComunidadAutonoma("Catalunia");
		comunidadesAutonomas[2] = new ComunidadAutonoma("Galicia");
		comunidadesAutonomas[3] = new ComunidadAutonoma("Asturias");
		comunidadesAutonomas[4] = new ComunidadAutonoma("Cantabria");
		comunidadesAutonomas[5] = new ComunidadAutonoma("Pais Vasco");
		comunidadesAutonomas[6] = new ComunidadAutonoma("Navarra");
		comunidadesAutonomas[7] = new ComunidadAutonoma("Castilla La Mancha");
		comunidadesAutonomas[8] = new ComunidadAutonoma("Castilla y Leon");
		comunidadesAutonomas[9] = new ComunidadAutonoma("Andalucia");
		comunidadesAutonomas[10] = new ComunidadAutonoma("Extremadura");
		comunidadesAutonomas[11] = new ComunidadAutonoma("Murcia");
		comunidadesAutonomas[12] = new ComunidadAutonoma("Aragon");
		comunidadesAutonomas[13] = new ComunidadAutonoma("Comunidad Valenciana");
		comunidadesAutonomas[14] = new ComunidadAutonoma("Canarias");
		comunidadesAutonomas[15] = new ComunidadAutonoma("Baleares");
		comunidadesAutonomas[16] = new ComunidadAutonoma("Melilla");
		comunidadesAutonomas[17] = new ComunidadAutonoma("Ceuta");
		comunidadesAutonomas[18] = new ComunidadAutonoma("La Rioja");
		ComunidadAutonoma españa = new ComunidadAutonoma("España");
		
		Controlador controlador = new Controlador();
		
		//Para que se te vea el JFrame
		Vista frame = new Vista();
		frame.setVisible(true);
		
		controlador.verCandidatos(frame);
		
		//para que te salga centrado la ventana
		frame.setLocationRelativeTo(null);
		
		// metodos
		controlador.colorJPaneles(frame);
		controlador.imagenesPartidos(frame);
		
		frame.botonAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (frame.comboBox.getSelectedItem().equals("Madrid")) {
					if (comunidadesAutonomas[0].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[0], frame);
						comunidadesAutonomas[0].setCalculada(true);
					}
					//actualizamos el progressbar
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[0]);
					//actualizamos la grafica
					controlador.totalVotantesPartido(comunidadesAutonomas[0], frame);
					//actualizamos la imagen ganadora
					controlador.imagenGanadora(frame, comunidadesAutonomas[0]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Catalunia")) {
					if (comunidadesAutonomas[1].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[1], frame);
						comunidadesAutonomas[1].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[1]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[1], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[1]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Galicia")) {
					if (comunidadesAutonomas[2].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[2], frame);
						comunidadesAutonomas[2].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[2]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[2], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[2]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Asturias")) {
					if (comunidadesAutonomas[3].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[3], frame);
						comunidadesAutonomas[3].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[3]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[3], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[3]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Cantabria")) {
					if (comunidadesAutonomas[4].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[4], frame);
						comunidadesAutonomas[4].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[4]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[4], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[4]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Pais Vasco")) {
					if (comunidadesAutonomas[5].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[5], frame);
						comunidadesAutonomas[5].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[5]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[5], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[5]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Navarra")) {
					if (comunidadesAutonomas[6].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[6], frame);
						comunidadesAutonomas[6].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[6]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[6], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[6]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Castilla La Mancha")) {
					if (comunidadesAutonomas[7].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[7], frame);
						comunidadesAutonomas[7].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[7]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[7], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[7]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Castilla y Leon")) {
					if (comunidadesAutonomas[8].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[8], frame);
						comunidadesAutonomas[8].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[8]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[8], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[8]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Andalucia")) {
					if (comunidadesAutonomas[9].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[9], frame);
						comunidadesAutonomas[9].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[9]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[9], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[9]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Extremadura")) {
					if (comunidadesAutonomas[10].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[10], frame);
						comunidadesAutonomas[10].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[10]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[10], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[10]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Murcia")) {
					if (comunidadesAutonomas[11].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[11], frame);
						comunidadesAutonomas[11].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[11]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[11], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[11]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Aragon")) {
					if (comunidadesAutonomas[12].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[12], frame);
						comunidadesAutonomas[12].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[12]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[12], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[12]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Comunidad Valenciana")) {
					if (comunidadesAutonomas[13].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[13], frame);
						comunidadesAutonomas[13].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[13]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[13], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[13]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Canarias")) {
					if (comunidadesAutonomas[14].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[14], frame);
						comunidadesAutonomas[14].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[14]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[14], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[14]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Baleares")) {
					if (comunidadesAutonomas[15].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[15], frame);
						comunidadesAutonomas[15].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[15]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[15], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[15]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Melilla")) {
					if (comunidadesAutonomas[16].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[16], frame);
						comunidadesAutonomas[16].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[16]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[16], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[16]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Ceuta")) {
					if (comunidadesAutonomas[17].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[17], frame);
						comunidadesAutonomas[17].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[17]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[17], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[17]);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("La Rioja")) {
					if (comunidadesAutonomas[18].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[18], frame);
						comunidadesAutonomas[18].setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, comunidadesAutonomas[18]);
					
					controlador.totalVotantesPartido(comunidadesAutonomas[18], frame);
					controlador.imagenGanadora(frame, comunidadesAutonomas[18]);
					frame.repaint();
				}
			}
		});
		
		//boton de españa
		frame.botonEspana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int votosPP = 0;
				int votosPSOE = 0;
				int votosVOX = 0;
				int votosPODEMOS = 0;
				
				//recorre todas las comunidades autonomas
				for (int i = 0; i < comunidadesAutonomas.length; i++) {
					if (comunidadesAutonomas[i].isCalculada() == false) {
						controlador.cogerHabitantes(comunidadesAutonomas[i], frame);
						comunidadesAutonomas[i].setCalculada(true);
					}
					
					//recorre comunidad a comunidad y se van guardando los votos en cada variable especificamente (0 PP, 1 PSOE, 2 VOX Y 3 PODEMOS)
					votosPP += controlador.recogerVotosComunidad(comunidadesAutonomas[i])[0];
					votosPSOE += controlador.recogerVotosComunidad(comunidadesAutonomas[i])[1];
					votosVOX += controlador.recogerVotosComunidad(comunidadesAutonomas[i])[2];
					votosPODEMOS += controlador.recogerVotosComunidad(comunidadesAutonomas[i])[3];
					
					//guardamos en españa todos los votos de PP de todas las comunidades, y asi con PSOE, VOX y PODEMOS
					españa.sumarPP(comunidadesAutonomas[i].getVotantesPP());
					españa.sumarPSOE(comunidadesAutonomas[i].getVotantesPSOE());
					españa.sumarVOX(comunidadesAutonomas[i].getVotantesVOX());
					españa.sumarPODEMOS(comunidadesAutonomas[i].getVotantesPODEMOS());
	
				}
				
				//se guarda el numero de votos de PP, para luego actualizar la grafica
				frame.setVotosPP(votosPP);
				frame.setVotosPSOE(votosPSOE);
				frame.setVotosVOX(votosVOX);
				frame.setVotosPODEMOS(votosPODEMOS);
				
				//se dibuja la grafica
				frame.repaint();
				
				controlador.actualizarProgressBar(frame, españa);
				controlador.imagenGanadora(frame, españa);
				
			}
		});
	}
	//fotos del jframe Vista3
	public void verCandidatos(Vista frame) {
		frame.botonCandidatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vista3 frame3 = new Vista3();
				frame3.setVisible(true);
				
				ImageIcon imagenEspana = new ImageIcon("src/imagenes/españa.png");
				frame3.imagenEspana.setIcon(imagenEspana);
				frame3.imagenEspana.setVisible(true);
				
				ImageIcon pabloCasado = new ImageIcon("src/imagenes/imagenCasado358.jpg");
				frame3.imagenCasado.setIcon(pabloCasado);
				frame3.imagenCasado.setVisible(true);
				
				ImageIcon imagenPP = new ImageIcon("src/imagenes/imagenPP777.png");
				frame3.imagenPP.setIcon(imagenPP);
				frame3.imagenPP.setVisible(true);
				
				ImageIcon pedroSanchez = new ImageIcon("src/imagenes/pedro24.png");
				frame3.imagenSanchez.setIcon(pedroSanchez);
				frame3.imagenSanchez.setVisible(true);
				
				ImageIcon imagenPSOE = new ImageIcon("src/imagenes/imagenPSOE777.png");
				frame3.imagenPSOE.setIcon(imagenPSOE);
				frame3.imagenPSOE.setVisible(true);
				
				ImageIcon santiagoAbascal = new ImageIcon("src/imagenes/santiago2019.jpg");
				frame3.imagenAbascal.setIcon(santiagoAbascal);
				frame3.imagenAbascal.setVisible(true);
				
				ImageIcon imagenVOX = new ImageIcon("src/imagenes/imagenVOX1000.png");
				frame3.imagenVOX.setIcon(imagenVOX);
				frame3.imagenVOX.setVisible(true);
				
				ImageIcon pabloIglesias = new ImageIcon("src/imagenes/ionebelarra778.jpg");
				frame3.imagenIglesias.setIcon(pabloIglesias);
				frame3.imagenIglesias.setVisible(true);
				
				ImageIcon imagenPODEMOS = new ImageIcon("src/imagenes/9887.png");
				frame3.imagenPODEMOS.setIcon(imagenPODEMOS);
				frame3.imagenPODEMOS.setVisible(true);
				
			}
		});
	}
	
	//añadimos esos valores y se actualiza la grafica circular
	public void totalVotantesPartido (ComunidadAutonoma comunidadAutonoma, Vista frame) {
		frame.setVotosPP(recogerVotosComunidad(comunidadAutonoma)[0]);
		frame.setVotosPSOE(recogerVotosComunidad(comunidadAutonoma)[1]);
		frame.setVotosVOX(recogerVotosComunidad(comunidadAutonoma)[2]);
		frame.setVotosPODEMOS(recogerVotosComunidad(comunidadAutonoma)[3]);
	}
	
	//sumar todos los votos de cada partido y de cada rango de edad en la array
	public int[] recogerVotosComunidad (ComunidadAutonoma comunidadAutonoma) {
		int [] listaVotos = new int[4];
		
		listaVotos[0] = comunidadAutonoma.getVotantesPP()[0] + comunidadAutonoma.getVotantesPP()[1] + comunidadAutonoma.getVotantesPP()[2] + comunidadAutonoma.getVotantesPP()[3];
		listaVotos[1] = comunidadAutonoma.getVotantesPSOE()[0] + comunidadAutonoma.getVotantesPSOE()[1] + comunidadAutonoma.getVotantesPSOE()[2] + comunidadAutonoma.getVotantesPSOE()[3];
		listaVotos[2] = comunidadAutonoma.getVotantesVOX()[0] + comunidadAutonoma.getVotantesVOX()[1] + comunidadAutonoma.getVotantesVOX()[2] + comunidadAutonoma.getVotantesVOX()[3];
		listaVotos[3] = comunidadAutonoma.getVotantesPODEMOS()[0] + comunidadAutonoma.getVotantesPODEMOS()[1] + comunidadAutonoma.getVotantesPODEMOS()[2] + comunidadAutonoma.getVotantesPODEMOS()[3];
		
		return listaVotos;
		
	}
	
	//sacar la imagen ganadora
	public void imagenGanadora(Vista frame, ComunidadAutonoma comunidadAutonoma) {
		int [] votos = recogerVotosComunidad(comunidadAutonoma);
		double totalVotos = votos[0] + votos[1] + votos[2] + votos[3];
		if (frame.getVotosPP() >= frame.getVotosPSOE() && frame.getVotosPP() >= frame.getVotosVOX() && frame.getVotosPP() >= frame.getVotosPODEMOS()) {
			frame.presidenteGanador.setText("PABLO CASADO");
			ImageIcon imagenPP = new ImageIcon("src/imagenes/pp1234.png");
			frame.imagenGanadora.setIcon(imagenPP);
			frame.imagenGanadora.setVisible(true);
			double porcentaje = ((votos[0]/ totalVotos)*100);
			frame.textoGanador.setText("Ha ganado el PP"  + "\n" + "en " + comunidadAutonoma.getNombreComunidad() + "\ncon un porcentaje de " + (int) porcentaje + "%");
		}else if (frame.getVotosPSOE() >= frame.getVotosPP() && frame.getVotosPSOE() >= frame.getVotosVOX() && frame.getVotosPSOE() >= frame.getVotosPODEMOS()) {
			frame.presidenteGanador.setText("PEDRO SANCHEZ");
			ImageIcon imagenPSOE = new ImageIcon("src/imagenes/psoe1234.png");
			frame.imagenGanadora.setIcon(imagenPSOE);
			frame.imagenGanadora.setVisible(true);
			double porcentaje = ((votos[1]/ totalVotos)*100);
			frame.textoGanador.setText("Ha ganado el PSOE"  + "\n" + "en " + comunidadAutonoma.getNombreComunidad() + "\ncon un porcentaje de " + (int) porcentaje + "%");
		}else if (frame.getVotosVOX() >= frame.getVotosPP() && frame.getVotosVOX() >= frame.getVotosPSOE() && frame.getVotosVOX() >= frame.getVotosPODEMOS()) {
			frame.presidenteGanador.setText("SANTIAGO ABASCAL");
			ImageIcon imagenVOX = new ImageIcon("src/imagenes/vox1234.png");
			frame.imagenGanadora.setIcon(imagenVOX);
			frame.imagenGanadora.setVisible(true);
			double porcentaje = ((votos[2]/ totalVotos)*100);
			frame.textoGanador.setText("Ha ganado VOX"  + "\n" + "en " + comunidadAutonoma.getNombreComunidad() + "\ncon un porcentaje de " + (int) porcentaje + "%");
		}else if(frame.getVotosPODEMOS() >= frame.getVotosPP() && frame.getVotosPODEMOS() >= frame.getVotosPSOE() && frame.getVotosPODEMOS() >= frame.getVotosPP()){
			frame.presidenteGanador.setText("IONE BELARRA");
			ImageIcon imagenPODEMOS = new ImageIcon("src/imagenes/podemos1234.png");
			frame.imagenGanadora.setIcon(imagenPODEMOS);
			frame.imagenGanadora.setVisible(true);
			double porcentaje = ((votos[3]/ totalVotos)*100);
			frame.textoGanador.setText("Ha ganado PODEMOS"  + "\n" + "en " + comunidadAutonoma.getNombreComunidad() + "\ncon un porcentaje de " + (int) porcentaje + "%");
			
		}else {//desempate
			int ganador = 0;
			  if (frame.getVotosPP()==frame.getVotosPSOE()) {
                  ganador= 1 + (int) (Math.random()*2);
              }else if (frame.getVotosPP()==frame.getVotosVOX()) {
                  ganador= 1 + (int) (Math.random()*2);
                  if (ganador==2) {
                      ganador=3;
                  }
              }else if(frame.getVotosPP()==frame.getVotosPODEMOS()) {
                  ganador= 1 + (int) (Math.random()*2);
                  if (ganador==2) {
                      ganador=4;
                  }
              }else if (frame.getVotosPSOE()==frame.getVotosVOX()) {
                  ganador= 2 + (int) (Math.random()*2);

              }else if(frame.getVotosPSOE()==frame.getVotosPODEMOS()) {
                  ganador= 1 + (int) (Math.random()*2);
                  if (ganador==1) {
                      ganador=4;
                  }
              }else if (frame.getVotosVOX()==frame.getVotosPODEMOS()) {
                  ganador= 3 + (int) (Math.random()*2);
              }
          }
		}
	
	//metodo de ver las imagenes de al lado de la grafica circular
	public void imagenesPartidos(Vista frame) {
		ImageIcon imagenPP = new ImageIcon("src/imagenes/imagenPP3.png");
		frame.labelImagenPP.setIcon(imagenPP);
		frame.labelImagenPP.setVisible(true);
	
		ImageIcon imagenVOX = new ImageIcon("src/imagenes/imagenVOX777.png");
		frame.labelImagenVOX.setIcon(imagenVOX);
		frame.labelImagenVOX.setVisible(true);
		
		ImageIcon imagenPSOE = new ImageIcon("src/imagenes/imagenPSOE2.png");
		frame.labelImagenPSOE.setIcon(imagenPSOE);
		frame.labelImagenPSOE.setVisible(true);
		
		ImageIcon imagenPODEMOS = new ImageIcon("src/imagenes/imagenPODEMOS2.png");
		frame.labelImagenPODEMOS.setIcon(imagenPODEMOS);
		frame.labelImagenPODEMOS.setVisible(true);

	}
	
	//metodo de recoger los votos, calcular el numero de votos, que se creen y que se guarden
	public void cogerHabitantes(ComunidadAutonoma comunidadAutonoma, Vista frame) {
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
			if (numeroHilos < 1 && numeroHilos2 < 1 && numeroHilos3 < 1 && numeroHilos4 < 1) {
				listaEdades [0] = 1;
				listaEdades [1] = 1;
				listaEdades [2] = 1;
				listaEdades [3] = 1;
			}else {
				listaEdades [0] = (int)  Math.round(numeroHilos);
				listaEdades [1] = (int)  Math.round(numeroHilos2);
				listaEdades [2] = (int)  Math.round(numeroHilos3);
				listaEdades [3] = (int)  Math.round(numeroHilos4);
			}
			
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
			int contadorPSOE = 0;
			int contadorVOX = 0;
			int contadorPODEMOS = 0;
			
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
	
	//metodo para actualizar las barras barras de progreso dependiendo el rango de edad
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

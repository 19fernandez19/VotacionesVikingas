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
import vista.Vista2;
import vista.Vista3;



public class Controlador {
	//objetos comunidad autonoma
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
		
		Controlador controlador = new Controlador();
		
		//Vista2 frame2 = new Vista2();
		//controlador.ventanaInicioSesion(frame2);
		//frame2.setVisible(true);
		//Para que se te vea el JFrame
		Vista frame = new Vista();
		frame.setVisible(true);
		
		controlador.verCandidatos(frame);
		
		//controlador.fotosElecciones(frame2);
		//para que te salga centrado la ventana
		frame.setLocationRelativeTo(null);

		// metodos
		controlador.colorJPaneles(frame);
		controlador.imagenesPartidos(frame);
		
		frame.botonAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (frame.comboBox.getSelectedItem().equals("Madrid")) {
					if (madrid.isCalculada() == false) {
						controlador.cogerHabitantes(madrid, frame);
						madrid.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, madrid);
					
					controlador.totalVotantesPartido(madrid, frame);
					controlador.imagenGanadora(frame, madrid);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Catalunia")) {
					if (Catalunia.isCalculada() == false) {
						controlador.cogerHabitantes(Catalunia, frame);
						Catalunia.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Catalunia);
					
					controlador.totalVotantesPartido(Catalunia, frame);
					controlador.imagenGanadora(frame, Catalunia);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Galicia")) {
					if (Galicia.isCalculada() == false) {
						controlador.cogerHabitantes(Galicia, frame);
						Galicia.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Galicia);
					
					controlador.totalVotantesPartido(Galicia, frame);
					controlador.imagenGanadora(frame, Galicia);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Asturias")) {
					if (Asturias.isCalculada() == false) {
						controlador.cogerHabitantes(Asturias, frame);
						Asturias.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Asturias);
					
					controlador.totalVotantesPartido(Asturias, frame);
					controlador.imagenGanadora(frame, Asturias);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Cantabria")) {
					if (Cantabria.isCalculada() == false) {
						controlador.cogerHabitantes(Cantabria, frame);
						Cantabria.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Cantabria);
					
					controlador.totalVotantesPartido(Cantabria, frame);
					controlador.imagenGanadora(frame, Cantabria);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Pais Vasco")) {
					if (PaisVasco.isCalculada() == false) {
						controlador.cogerHabitantes(PaisVasco, frame);
						PaisVasco.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, PaisVasco);
					
					controlador.totalVotantesPartido(PaisVasco, frame);
					controlador.imagenGanadora(frame, PaisVasco);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Navarra")) {
					if (Navarra.isCalculada() == false) {
						controlador.cogerHabitantes(Navarra, frame);
						Navarra.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Navarra);
					
					controlador.totalVotantesPartido(Navarra, frame);
					controlador.imagenGanadora(frame, Navarra);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Castilla La Mancha")) {
					if (CLM.isCalculada() == false) {
						controlador.cogerHabitantes(CLM, frame);
						CLM.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, CLM);
					
					controlador.totalVotantesPartido(CLM, frame);
					controlador.imagenGanadora(frame, CLM);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Castilla y Leon")) {
					if (CyL.isCalculada() == false) {
						controlador.cogerHabitantes(CyL, frame);
						CyL.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, CyL);
					
					controlador.totalVotantesPartido(CyL, frame);
					controlador.imagenGanadora(frame, CyL);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Andalucia")) {
					if (Andalucia.isCalculada() == false) {
						controlador.cogerHabitantes(Andalucia, frame);
						Andalucia.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Andalucia);
					
					controlador.totalVotantesPartido(Andalucia, frame);
					controlador.imagenGanadora(frame, Andalucia);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Extremadura")) {
					if (Extremadura.isCalculada() == false) {
						controlador.cogerHabitantes(Extremadura, frame);
						Extremadura.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Extremadura);
					
					controlador.totalVotantesPartido(Extremadura, frame);
					controlador.imagenGanadora(frame, Extremadura);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Murcia")) {
					if (Murcia.isCalculada() == false) {
						controlador.cogerHabitantes(Murcia, frame);
						Murcia.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Murcia);
					
					controlador.totalVotantesPartido(Murcia, frame);
					controlador.imagenGanadora(frame, Murcia);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Aragon")) {
					if (Aragon.isCalculada() == false) {
						controlador.cogerHabitantes(Aragon, frame);
						Aragon.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Aragon);
					
					controlador.totalVotantesPartido(Aragon, frame);
					controlador.imagenGanadora(frame, Aragon);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Comunidad Valenciana")) {
					if (Valencia.isCalculada() == false) {
						controlador.cogerHabitantes(Valencia, frame);
						Valencia.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Valencia);
					
					controlador.totalVotantesPartido(Valencia, frame);
					controlador.imagenGanadora(frame, Valencia);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Canarias")) {
					if (Canarias.isCalculada() == false) {
						controlador.cogerHabitantes(Canarias, frame);
						Canarias.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Canarias);
					
					controlador.totalVotantesPartido(Canarias, frame);
					controlador.imagenGanadora(frame, Canarias);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Baleares")) {
					if (Baleares.isCalculada() == false) {
						controlador.cogerHabitantes(Baleares, frame);
						Baleares.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Baleares);
					
					controlador.totalVotantesPartido(Baleares, frame);
					controlador.imagenGanadora(frame, Baleares);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Melilla")) {
					if (Melilla.isCalculada() == false) {
						controlador.cogerHabitantes(Melilla, frame);
						Melilla.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Melilla);
					
					controlador.totalVotantesPartido(Melilla, frame);
					controlador.imagenGanadora(frame, Melilla);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("Ceuta")) {
					if (Ceuta.isCalculada() == false) {
						controlador.cogerHabitantes(Ceuta, frame);
						Ceuta.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Ceuta);
					
					controlador.totalVotantesPartido(Ceuta, frame);
					controlador.imagenGanadora(frame, Ceuta);
					frame.repaint();
				}else if (frame.comboBox.getSelectedItem().equals("La Rioja")) {
					if (Rioja.isCalculada() == false) {
						controlador.cogerHabitantes(Rioja, frame);
						Rioja.setCalculada(true);
					}
					controlador.actualizarProgressBar(frame, Rioja);
					
					controlador.totalVotantesPartido(Rioja, frame);
					controlador.imagenGanadora(frame, Rioja);
					frame.repaint();
				}
			}
		});
		
		
		
		//boton madrid
	/*	frame.botonMadrid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (madrid.isCalculada() == false) {
					controlador.cogerHabitantes(madrid, frame);
					madrid.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, madrid);
				
				frame.setVotosPP(madrid.getVotantesPP()[0] + madrid.getVotantesPP()[1] + madrid.getVotantesPP()[2] + madrid.getVotantesPP()[3]);
				frame.setVotosVOX(madrid.getVotantesVOX()[0] + madrid.getVotantesVOX()[1] + madrid.getVotantesVOX()[2] + madrid.getVotantesVOX()[3]);
				frame.setVotosPSOE(madrid.getVotantesPSOE()[0] + madrid.getVotantesPSOE()[1] + madrid.getVotantesPSOE()[2] + madrid.getVotantesPSOE()[3]);
				frame.setVotosPODEMOS(madrid.getVotantesPODEMOS()[0] + madrid.getVotantesPODEMOS()[1] + madrid.getVotantesPODEMOS()[2] + madrid.getVotantesPODEMOS()[3]);
				
				frame.repaint();
				
			}
		});*/
		//boton barcelona
		/*frame.botonBarcelona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Catalunia.isCalculada() == false) {
					controlador.cogerHabitantes(Catalunia, frame);
					Catalunia.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Catalunia);
				frame.repaint();
			}
		});
		
		//boton andalucia
		frame.botonAndalucia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Andalucia.isCalculada() == false) {
					controlador.cogerHabitantes(Andalucia, frame);
					Andalucia.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Andalucia);
				frame.repaint();
			}
		});
		
		//boton aragon
		frame.botonAragon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Aragon.isCalculada() == false) {
					controlador.cogerHabitantes(Aragon, frame);
					Aragon.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Aragon);
				frame.repaint();
			}
		});
		//boton baleares
		frame.botonBaleares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Baleares.isCalculada() == false) {
					controlador.cogerHabitantes(Baleares, frame);
					Baleares.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Baleares);
				frame.repaint();
			}
		});
		
		//boton canarias
		frame.botonCanarias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Canarias.isCalculada() == false) {
					controlador.cogerHabitantes(Canarias, frame);
					Canarias.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Canarias);
				frame.repaint();
			}
		});
		
		//boton cantabria
		frame.botonCantabria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Cantabria.isCalculada() == false) {
					controlador.cogerHabitantes(Cantabria, frame);
					Cantabria.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Cantabria);
				frame.repaint();
			}
		});
		
		//boton castilla la mancha
		frame.botonCLM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CLM.isCalculada() == false) {
					controlador.cogerHabitantes(CLM, frame);
					CLM.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, CLM);
				frame.repaint();
			}
		});
		
		//boton la rioja
		frame.botonRioja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Rioja.isCalculada() == false) {
					controlador.cogerHabitantes(Rioja, frame);
					Rioja.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Rioja);
				frame.repaint();
			}
		});
		
		//boton melilla
		frame.botonMelilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Melilla.isCalculada() == false) {
					controlador.cogerHabitantes(Melilla, frame);
					Melilla.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Melilla);
				frame.repaint();
			}
		});
		
		//boton castilla y leon
		frame.botonCyL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CyL.isCalculada() == false) {
					controlador.cogerHabitantes(CyL, frame);
					CyL.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, CyL);
				frame.repaint();
			}
		});
		
		//boton navarra
		frame.botonNavarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Navarra.isCalculada() == false) {
					controlador.cogerHabitantes(Navarra, frame);
					Navarra.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Navarra);
				frame.repaint();
			}
		});
		
		//boton valencia
		frame.botonValencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Valencia.isCalculada() == false) {
					controlador.cogerHabitantes(Valencia, frame);
					Valencia.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Valencia);
				frame.repaint();
			}
		});
		
		//boton extremadura
		frame.botonExtremadura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Extremadura.isCalculada() == false) {
					controlador.cogerHabitantes(Extremadura, frame);
					Extremadura.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Extremadura);
				frame.repaint();
			}
		});
		
		//boton galicia
		frame.botonGalicia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Galicia.isCalculada() == false) {
					controlador.cogerHabitantes(Galicia, frame);
					Galicia.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Galicia);
				frame.repaint();
			}
		});
		
		//boton pais vasco
		frame.botonPaisVasco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PaisVasco.isCalculada() == false) {
					controlador.cogerHabitantes(PaisVasco, frame);
					PaisVasco.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, PaisVasco);
				frame.repaint();
			}
		});
		
		//boton asturias
		frame.botonAsturias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Asturias.isCalculada() == false) {
					controlador.cogerHabitantes(Asturias, frame);
					Asturias.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Asturias);
				frame.repaint();
			}
		});
		
		//boton murcia
		frame.botonMurcia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Murcia.isCalculada() == false) {
					controlador.cogerHabitantes(Murcia, frame);
					Murcia.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Murcia);
				frame.repaint();
			}
		});
		
		//boton ceuta
		frame.botonCeuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Ceuta.isCalculada() == false) {
					controlador.cogerHabitantes(Ceuta, frame);
					Ceuta.setCalculada(true);
				}
				controlador.actualizarProgressBar(frame, Ceuta);
				frame.repaint();
			}
		});*/
		
		frame.botonEspana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	public void verCandidatos(Vista frame) {
		frame.botonCandidatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vista3 frame3 = new Vista3();
				frame3.setVisible(true);
				
				ImageIcon pabloCasado = new ImageIcon("src/imagenes/pabloCasado.jpg");
				frame3.imagenCasado.setIcon(pabloCasado);
				frame3.imagenCasado.setVisible(true);
				
				ImageIcon imagenPP = new ImageIcon("src/imagenes/pp234.png");
				frame3.imagenPP.setIcon(imagenPP);
				frame3.imagenPP.setVisible(true);
				
				ImageIcon pedroSanchez = new ImageIcon("src/imagenes/777.png");
				frame3.imagenSanchez.setIcon(pedroSanchez);
				frame3.imagenSanchez.setVisible(true);
				
				ImageIcon imagenPSOE = new ImageIcon("src/imagenes/psoe234.png");
				frame3.imagenPSOE.setIcon(imagenPSOE);
				frame3.imagenPSOE.setVisible(true);
				
				ImageIcon santiagoAbascal = new ImageIcon("src/imagenes/santiagoAbascal6.png");
				frame3.imagenAbascal.setIcon(santiagoAbascal);
				frame3.imagenAbascal.setVisible(true);
				
				ImageIcon imagenVOX = new ImageIcon("src/imagenes/vox234.png");
				frame3.imagenVOX.setIcon(imagenVOX);
				frame3.imagenVOX.setVisible(true);
				
				ImageIcon pabloIglesias = new ImageIcon("src/imagenes/pabloIglesias.jpg");
				frame3.imagenIglesias.setIcon(pabloIglesias);
				frame3.imagenIglesias.setVisible(true);
				
				ImageIcon imagenPODEMOS = new ImageIcon("src/imagenes/podemos234.png");
				frame3.imagenPODEMOS.setIcon(imagenPODEMOS);
				frame3.imagenPODEMOS.setVisible(true);
				
			}
		});
	}
	
	public void totalVotantesPartido (ComunidadAutonoma comunidadAutonoma, Vista frame) {
		frame.setVotosPP(comunidadAutonoma.getVotantesPP()[0] + comunidadAutonoma.getVotantesPP()[1] + comunidadAutonoma.getVotantesPP()[2] + comunidadAutonoma.getVotantesPP()[3]);
		frame.setVotosVOX(comunidadAutonoma.getVotantesVOX()[0] + comunidadAutonoma.getVotantesVOX()[1] + comunidadAutonoma.getVotantesVOX()[2] + comunidadAutonoma.getVotantesVOX()[3]);
		frame.setVotosPSOE(comunidadAutonoma.getVotantesPSOE()[0] + comunidadAutonoma.getVotantesPSOE()[1] + comunidadAutonoma.getVotantesPSOE()[2] + comunidadAutonoma.getVotantesPSOE()[3]);
		frame.setVotosPODEMOS(comunidadAutonoma.getVotantesPODEMOS()[0] + comunidadAutonoma.getVotantesPODEMOS()[1] + comunidadAutonoma.getVotantesPODEMOS()[2] + comunidadAutonoma.getVotantesPODEMOS()[3]);
	}
	
	public void imagenGanadora(Vista frame, ComunidadAutonoma comunidadAutonoma) {
		if (frame.getVotosPP() > frame.getVotosPSOE() && frame.getVotosPP() > frame.getVotosVOX() && frame.getVotosPP() > frame.getVotosPODEMOS()) {
			frame.presidenteGanador.setText("PABLO CASADO");
			ImageIcon imagenPP = new ImageIcon("src/imagenes/pp1234.png");
			frame.imagenGanadora.setIcon(imagenPP);
			frame.imagenGanadora.setVisible(true);
			frame.textoGanador.setText("Ha ganado el PP"  + "\n" + "en " + comunidadAutonoma.getNombreComunidad());
		}else if (frame.getVotosPSOE() > frame.getVotosPP() && frame.getVotosPSOE() > frame.getVotosVOX() && frame.getVotosPSOE() > frame.getVotosPODEMOS()) {
			frame.presidenteGanador.setText("PEDRO SANCHEZ");
			ImageIcon imagenPSOE = new ImageIcon("src/imagenes/psoe1234.png");
			frame.imagenGanadora.setIcon(imagenPSOE);
			frame.imagenGanadora.setVisible(true);
			frame.textoGanador.setText("Ha ganado el PSOE"  + "\n" + "en " + comunidadAutonoma.getNombreComunidad());
		}else if (frame.getVotosVOX() > frame.getVotosPP() && frame.getVotosVOX() > frame.getVotosPSOE() && frame.getVotosVOX() > frame.getVotosPODEMOS()) {
			frame.presidenteGanador.setText("SANTIAGO ABASCAL");
			ImageIcon imagenVOX = new ImageIcon("src/imagenes/vox1234.png");
			frame.imagenGanadora.setIcon(imagenVOX);
			frame.imagenGanadora.setVisible(true);
			frame.textoGanador.setText("Ha ganado VOX"  + "\n" + "en " + comunidadAutonoma.getNombreComunidad());
		}else {
			frame.presidenteGanador.setText("PABLO IGLESIAS");
			ImageIcon imagenPODEMOS = new ImageIcon("src/imagenes/podemos1234.png");
			frame.imagenGanadora.setIcon(imagenPODEMOS);
			frame.imagenGanadora.setVisible(true);
			frame.textoGanador.setText("Ha ganado PODEMOS"  + "\n" + "en " + comunidadAutonoma.getNombreComunidad());
		}
	}
	
	public void ventanaInicioSesion(Vista2 vista2) {
		vista2.botonIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vista vista = new Vista();
				vista.setVisible(true);
				
				
			}
		});
		
	
	}
	
	public void fotosElecciones (Vista2 vista2) {
		ImageIcon imagenElecciones = new ImageIcon("src/imagenes/imagenElecciones2.png");
		vista2.labelElecciones.setIcon(imagenElecciones);
		vista2.labelElecciones.setVisible(true);
	}

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

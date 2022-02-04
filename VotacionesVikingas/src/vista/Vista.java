package vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;



import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class Vista extends JFrame {
	public static int votosPP;
	public static int votosVOX;
	public static int votosPSOE;
	public static int votosPODEMOS;
	
	public JTextArea textoGanador;
	
	public JComboBox comboBox;
	public JButton botonAplicar;
	public static int getVotosPP() {
		return votosPP;
	}

	public static void setVotosPP(int votosPP) {
		Vista.votosPP = votosPP;
	}

	public static int getVotosVOX() {
		return votosVOX;
	}

	public static void setVotosVOX(int votosVOX) {
		Vista.votosVOX = votosVOX;
	}

	public static int getVotosPSOE() {
		return votosPSOE;
	}

	public static void setVotosPSOE(int votosPSOE) {
		Vista.votosPSOE = votosPSOE;
	}

	public static int getVotosPODEMOS() {
		return votosPODEMOS;
	}

	public static void setVotosPODEMOS(int votosPODEMOS) {
		Vista.votosPODEMOS = votosPODEMOS;
	}

	public JPanel panelPrincipal;
	
	public JPanel cuadradoPP;
	public JPanel cuadradoPSOE;
	public JPanel cuadradoVOX;
	public JPanel cuadradoPODEMOS;
	
	//progressBar que calcula el ganador de cada rango de cada comunidad autonoma
	public JProgressBar barraProgreso18a25;
	public JProgressBar barraProgreso26a40;
	public JProgressBar barraProgreso41a65;
	public JProgressBar barraProgreso66Mas;
	
	public JLabel labelImagenPP;
	public JLabel labelImagenVOX;
	public JLabel labelImagenPSOE;
	public JLabel labelImagenPODEMOS;
	public JLabel labelGanador;
	public JLabel imagenGanadora;
	private JButton botonEspana;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void paint(Graphics g){
        super.paint(g);
        
            
            double int_rojo = votosPSOE;
            double int_verde = votosVOX;
            double int_azul = votosPP;
            double int_morado = votosPODEMOS;
            
            double total_votos = int_rojo + int_verde + int_azul + int_morado;
            
            double grados_rojo = Math.round(int_rojo * 360 / total_votos);
            double grados_verde = Math.round(int_verde * 360 / total_votos);
            double grados_azul = Math.round(int_azul * 360 / total_votos);
            double grados_morado = Math.round(int_morado * 360 / total_votos);
            
            
            
            g.setColor(new Color(255, 0, 0));
            g.fillArc(145, 90, 400, 400, 0, (int) grados_rojo);
            
            g.setColor(new Color(0, 130, 0));
            g.fillArc(145, 90, 400, 400, (int) grados_rojo, (int)grados_verde);
        
            g.setColor(new Color(0, 0, 255));
            g.fillArc(145, 90, 400, 400, (int)grados_rojo + (int)grados_verde, (int)grados_azul);
           
            g.setColor(new Color(156, 41, 161));
            g.fillArc(145, 90, 400, 400, (int)grados_rojo + (int)grados_verde + (int)grados_azul,(int) grados_morado);

    }

	/**
	 * Create the frame.
	 */
	public Vista() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 671);
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(169, 169, 169));
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		barraProgreso18a25 = new JProgressBar();
		barraProgreso18a25.setBounds(95, 521, 146, 23);
		panelPrincipal.add(barraProgreso18a25);
		
		barraProgreso26a40 = new JProgressBar();
		barraProgreso26a40.setBounds(372, 521, 146, 23);
		panelPrincipal.add(barraProgreso26a40);
		
		barraProgreso41a65 = new JProgressBar();
		barraProgreso41a65.setBounds(95, 581, 146, 23);
		panelPrincipal.add(barraProgreso41a65);
		
		barraProgreso66Mas = new JProgressBar();
		barraProgreso66Mas.setBounds(372, 581, 146, 23);
		panelPrincipal.add(barraProgreso66Mas);
		
		JLabel labelPP = new JLabel("18-25");
		labelPP.setHorizontalAlignment(SwingConstants.CENTER);
		labelPP.setFont(new Font("Agency FB", Font.BOLD, 24));
		labelPP.setBounds(32, 521, 49, 23);
		panelPrincipal.add(labelPP);
		
		JLabel lblVox = new JLabel("41-65");
		lblVox.setHorizontalAlignment(SwingConstants.CENTER);
		lblVox.setFont(new Font("Agency FB", Font.BOLD, 24));
		lblVox.setBounds(32, 581, 49, 23);
		panelPrincipal.add(lblVox);
		
		JLabel lblPsoe = new JLabel("26-40");
		lblPsoe.setHorizontalAlignment(SwingConstants.CENTER);
		lblPsoe.setFont(new Font("Agency FB", Font.BOLD, 24));
		lblPsoe.setBounds(274, 521, 71, 23);
		panelPrincipal.add(lblPsoe);
		
		JLabel lblPodemos = new JLabel("66+");
		lblPodemos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPodemos.setFont(new Font("Agency FB", Font.BOLD, 24));
		lblPodemos.setBounds(274, 581, 71, 23);
		panelPrincipal.add(lblPodemos);
		
		JPanel panelComunidadesAutonomas = new JPanel();
		panelComunidadesAutonomas.setBackground(new Color(211, 211, 211));
		panelComunidadesAutonomas.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "COMUNIDADES AUTONOMAS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelComunidadesAutonomas.setBounds(584, 10, 312, 121);
		panelPrincipal.add(panelComunidadesAutonomas);
		panelComunidadesAutonomas.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Agency FB", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Madrid", "Cataluna", "Galicia", "Asturias", "Cantabria", "Pais Vasco", "Aragon", "Rioja", "Castilla La Mancha", "Castilla y Leon", "Comunidad Valenciana", "Baleares", "Canarias", "Andalucia", "Extremadura", "Ceuta", "Melilla", "Murcia", "Navarra"}));
		comboBox.setBounds(37, 48, 244, 29);
		panelComunidadesAutonomas.add(comboBox);
		
		botonAplicar = new JButton("APLICAR");
		botonAplicar.setBounds(116, 87, 85, 21);
		panelComunidadesAutonomas.add(botonAplicar);
		
		JPanel panelEdades = new JPanel();
		panelEdades.setBackground(new Color(211, 211, 211));
		panelEdades.setBorder(new TitledBorder(null, "Rangos de Edad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEdades.setBounds(10, 493, 558, 121);
		panelPrincipal.add(panelEdades);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "TOTAL VOTOS DE LOS PARTIDOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 10, 558, 466);
		panelPrincipal.add(panel);
		panel.setLayout(null);
		
		labelImagenPP = new JLabel("");
		labelImagenPP.setBounds(49, 77, 50, 50);
		panel.add(labelImagenPP);
		
		cuadradoPP = new JPanel();
		cuadradoPP.setBounds(6, 77, 33, 50);
		panel.add(cuadradoPP);
		
		labelImagenVOX = new JLabel("");
		labelImagenVOX.setBounds(49, 157, 50, 50);
		panel.add(labelImagenVOX);
		
		cuadradoVOX = new JPanel();
		cuadradoVOX.setBounds(6, 157, 33, 50);
		panel.add(cuadradoVOX);
		
		labelImagenPSOE = new JLabel("");
		labelImagenPSOE.setBounds(49, 248, 50, 50);
		panel.add(labelImagenPSOE);
		
		cuadradoPSOE = new JPanel();
		cuadradoPSOE.setBounds(6, 248, 33, 50);
		panel.add(cuadradoPSOE);
		
		labelImagenPODEMOS = new JLabel("");
		labelImagenPODEMOS.setBounds(49, 342, 50, 50);
		panel.add(labelImagenPODEMOS);
		
		cuadradoPODEMOS = new JPanel();
		cuadradoPODEMOS.setBounds(6, 342, 33, 50);
		panel.add(cuadradoPODEMOS);
		
		botonEspana = new JButton("ESPA\u00D1A");
		botonEspana.setFont(new Font("Agency FB", Font.BOLD, 24));
		botonEspana.setBounds(431, 20, 103, 38);
		panel.add(botonEspana);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "GANADOR", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(584, 141, 311, 472);
		panelPrincipal.add(panel_1);
		panel_1.setLayout(null);
		
		labelGanador = new JLabel("GANADOR");
		labelGanador.setHorizontalAlignment(SwingConstants.CENTER);
		labelGanador.setFont(new Font("Agency FB", Font.BOLD, 24));
		labelGanador.setBounds(10, 20, 291, 55);
		panel_1.add(labelGanador);
		
		imagenGanadora = new JLabel("");
		imagenGanadora.setBounds(51, 123, 207, 182);
		panel_1.add(imagenGanadora);
		
		textoGanador = new JTextArea();
		textoGanador.setEditable(false);
		textoGanador.setFont(new Font("Agency FB", Font.BOLD, 24));
		textoGanador.setBackground(new Color(211, 211, 211));
		textoGanador.setBounds(51, 315, 207, 117);
		panel_1.add(textoGanador);
		
	}
}

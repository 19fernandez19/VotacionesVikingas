package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class Vista extends JFrame {

	public JPanel contentPane;
	
	public JPanel cuadradoPP;
	public JPanel cuadradoPSOE;
	public JPanel cuadradoVOX;
	public JPanel cuadradoPODEMOS;
	
	//botones del panel derecho
	public JButton botonMadrid;
	public JButton botonBarcelona;
	public JButton botonAndalucia;
	public JButton botonAragon;
	public JButton botonBaleares;
	public JButton botonCanarias;
	public JButton botonCantabria;
	public JButton botonCLM;
	public JButton botonCyL;
	public JButton botonNavarra;
	public JButton botonValencia;
	public JButton botonExtremadura;
	public JButton botonGalicia;
	public JButton botonPaisVasco;
	public JButton botonAsturias;
	public JButton botonMurcia;
	public JButton botonRioja;
	public JButton botonMelilla;
	public JButton botonCeuta;
	
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

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cuadradoPP = new JPanel();
		cuadradoPP.setBounds(10, 10, 33, 31);
		contentPane.add(cuadradoPP);
		
		cuadradoPSOE = new JPanel();
		cuadradoPSOE.setBounds(96, 10, 33, 31);
		contentPane.add(cuadradoPSOE);
		
		cuadradoVOX = new JPanel();
		cuadradoVOX.setBounds(198, 10, 33, 31);
		contentPane.add(cuadradoVOX);
		
		cuadradoPODEMOS = new JPanel();
		cuadradoPODEMOS.setBounds(284, 10, 33, 31);
		contentPane.add(cuadradoPODEMOS);
		
		JLabel textoPP = new JLabel("PP");
		textoPP.setFont(new Font("Agency FB", Font.BOLD, 22));
		textoPP.setBounds(53, 10, 33, 31);
		contentPane.add(textoPP);
		
		JLabel textoPSOE = new JLabel("PSOE");
		textoPSOE.setFont(new Font("Agency FB", Font.BOLD, 22));
		textoPSOE.setBounds(139, 10, 49, 31);
		contentPane.add(textoPSOE);
		
		JLabel textoVOX = new JLabel("VOX");
		textoVOX.setFont(new Font("Agency FB", Font.BOLD, 22));
		textoVOX.setBounds(241, 10, 33, 31);
		contentPane.add(textoVOX);
		
		JLabel textoPODEMOS = new JLabel("PODEMOS");
		textoPODEMOS.setFont(new Font("Agency FB", Font.BOLD, 22));
		textoPODEMOS.setBounds(327, 10, 77, 31);
		contentPane.add(textoPODEMOS);
		
		JProgressBar barraProgresoPP = new JProgressBar();
		barraProgresoPP.setBounds(85, 521, 146, 23);
		contentPane.add(barraProgresoPP);
		
		JProgressBar barraProgresoPSOE = new JProgressBar();
		barraProgresoPSOE.setBounds(372, 521, 146, 23);
		contentPane.add(barraProgresoPSOE);
		
		JProgressBar barraProgresoVOX = new JProgressBar();
		barraProgresoVOX.setBounds(85, 581, 146, 23);
		contentPane.add(barraProgresoVOX);
		
		JProgressBar barraProgresoPODEMOS = new JProgressBar();
		barraProgresoPODEMOS.setBounds(372, 581, 146, 23);
		contentPane.add(barraProgresoPODEMOS);
		
		JLabel labelPP = new JLabel("PP");
		labelPP.setFont(new Font("Agency FB", Font.BOLD, 24));
		labelPP.setBounds(32, 521, 43, 23);
		contentPane.add(labelPP);
		
		JLabel lblVox = new JLabel("VOX");
		lblVox.setFont(new Font("Agency FB", Font.BOLD, 24));
		lblVox.setBounds(32, 581, 43, 23);
		contentPane.add(lblVox);
		
		JLabel lblPsoe = new JLabel("PSOE");
		lblPsoe.setFont(new Font("Agency FB", Font.BOLD, 24));
		lblPsoe.setBounds(274, 521, 43, 23);
		contentPane.add(lblPsoe);
		
		JLabel lblPodemos = new JLabel("PODEMOS");
		lblPodemos.setFont(new Font("Agency FB", Font.BOLD, 24));
		lblPodemos.setBounds(274, 581, 88, 23);
		contentPane.add(lblPodemos);
		
		JPanel panelComunidadesAutonomas = new JPanel();
		panelComunidadesAutonomas.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "COMUNIDADES AUTONOMAS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelComunidadesAutonomas.setBounds(545, 10, 369, 594);
		contentPane.add(panelComunidadesAutonomas);
		panelComunidadesAutonomas.setLayout(null);
		
		botonMadrid = new JButton("Madrid");
		botonMadrid.setBounds(24, 38, 85, 21);
		panelComunidadesAutonomas.add(botonMadrid);
		
		botonBarcelona = new JButton("Barcelona");
		botonBarcelona.setBounds(24, 88, 85, 21);
		panelComunidadesAutonomas.add(botonBarcelona);
		
		botonAndalucia = new JButton("Andalucia");
		botonAndalucia.setBounds(24, 137, 85, 21);
		panelComunidadesAutonomas.add(botonAndalucia);
		
		botonAragon = new JButton("Arag\u00F3n");
		botonAragon.setBounds(24, 188, 85, 21);
		panelComunidadesAutonomas.add(botonAragon);
		
		botonBaleares = new JButton("Baleares");
		botonBaleares.setBounds(24, 238, 85, 21);
		panelComunidadesAutonomas.add(botonBaleares);
		
		botonCanarias = new JButton("Canarias");
		botonCanarias.setBounds(24, 290, 85, 21);
		panelComunidadesAutonomas.add(botonCanarias);
		
		botonCantabria = new JButton("Cantabria");
		botonCantabria.setBounds(24, 346, 85, 21);
		panelComunidadesAutonomas.add(botonCantabria);
		
		botonCLM = new JButton("CLM");
		botonCLM.setBounds(24, 396, 85, 21);
		panelComunidadesAutonomas.add(botonCLM);
		
		botonCyL = new JButton("CyL");
		botonCyL.setBounds(197, 38, 85, 21);
		panelComunidadesAutonomas.add(botonCyL);
		
		botonNavarra = new JButton("Navarra");
		botonNavarra.setBounds(197, 88, 85, 21);
		panelComunidadesAutonomas.add(botonNavarra);
		
		botonValencia = new JButton("Valencia");
		botonValencia.setBounds(197, 137, 85, 21);
		panelComunidadesAutonomas.add(botonValencia);
		
		botonExtremadura = new JButton("Extremadura");
		botonExtremadura.setBounds(197, 188, 85, 21);
		panelComunidadesAutonomas.add(botonExtremadura);
		
		botonGalicia = new JButton("Galicia");
		botonGalicia.setBounds(197, 238, 85, 21);
		panelComunidadesAutonomas.add(botonGalicia);
		
		botonPaisVasco = new JButton("Pais Vasco");
		botonPaisVasco.setBounds(197, 290, 85, 21);
		panelComunidadesAutonomas.add(botonPaisVasco);
		
		botonAsturias = new JButton("Asturias");
		botonAsturias.setBounds(197, 346, 85, 21);
		panelComunidadesAutonomas.add(botonAsturias);
		
		botonMurcia = new JButton("Murcia");
		botonMurcia.setBounds(197, 396, 85, 21);
		panelComunidadesAutonomas.add(botonMurcia);
		
		botonRioja = new JButton("Rioja");
		botonRioja.setBounds(24, 449, 85, 21);
		panelComunidadesAutonomas.add(botonRioja);
		
		botonCeuta = new JButton("Ceuta");
		botonCeuta.setBounds(197, 449, 85, 21);
		panelComunidadesAutonomas.add(botonCeuta);
		
		botonMelilla = new JButton("Melilla");
		botonMelilla.setBounds(113, 513, 85, 21);
		panelComunidadesAutonomas.add(botonMelilla);
	}
}

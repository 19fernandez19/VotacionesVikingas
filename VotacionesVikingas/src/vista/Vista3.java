package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class Vista3 extends JFrame {

	private JPanel contentPane;
	public JLabel imagenCasado;
	public JLabel imagenSanchez;
	public JLabel imagenAbascal;
	public JLabel imagenIglesias;
	public JLabel nombreCasado;
	public JLabel nombreSanchez;
	public JLabel nombreAbascal;
	public JLabel nombreIglesias;
	public JLabel imagenPP;
	public JLabel imagenPSOE;
	public JLabel imagenVOX;
	public JLabel imagenPODEMOS;
	public JLabel imagenEspana;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista3 frame = new Vista3();
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
	public Vista3() {
		setBounds(100, 100, 651, 563);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(20, 10, 600, 116);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CANDIDATOS A GANAR LAS ELECCIONES");
		lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 597, 116);
		panel.add(lblNewLabel);
		
		imagenEspana = new JLabel("");
		imagenEspana.setBounds(0, 0, 597, 116);
		panel.add(imagenEspana);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBorder(new TitledBorder(null, "PARTIDO POPULAR", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(20, 142, 289, 173);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		nombreCasado = new JLabel("PABLO CASADO");
		nombreCasado.setBounds(167, 125, 102, 38);
		panel_1.add(nombreCasado);
		nombreCasado.setFont(new Font("Agency FB", Font.BOLD, 16));
		nombreCasado.setHorizontalAlignment(SwingConstants.CENTER);
		
		imagenCasado = new JLabel("");
		imagenCasado.setBounds(10, 25, 147, 125);
		panel_1.add(imagenCasado);
		
		imagenPP = new JLabel("");
		imagenPP.setBounds(179, 25, 90, 90);
		panel_1.add(imagenPP);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(211, 211, 211));
		panel_1_1.setBorder(new TitledBorder(null, "VOX", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(331, 142, 289, 173);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		nombreAbascal = new JLabel("SANTIAGO ABASCAL");
		nombreAbascal.setBounds(167, 129, 102, 34);
		panel_1_1.add(nombreAbascal);
		nombreAbascal.setFont(new Font("Agency FB", Font.BOLD, 16));
		nombreAbascal.setHorizontalAlignment(SwingConstants.CENTER);
		
		imagenAbascal = new JLabel("");
		imagenAbascal.setBounds(10, 25, 147, 125);
		panel_1_1.add(imagenAbascal);
		
		imagenVOX = new JLabel("");
		imagenVOX.setBounds(179, 29, 90, 90);
		panel_1_1.add(imagenVOX);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(211, 211, 211));
		panel_1_2.setBorder(new TitledBorder(null, "PARTIDO SOCIALISTA OBRERO ESPA\u00D1OL", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_2.setBounds(20, 337, 289, 173);
		contentPane.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		nombreSanchez = new JLabel("PEDRO SANCHEZ");
		nombreSanchez.setBounds(167, 128, 102, 35);
		panel_1_2.add(nombreSanchez);
		nombreSanchez.setFont(new Font("Agency FB", Font.BOLD, 16));
		nombreSanchez.setHorizontalAlignment(SwingConstants.CENTER);
		
		imagenSanchez = new JLabel("");
		imagenSanchez.setBounds(10, 25, 147, 125);
		panel_1_2.add(imagenSanchez);
		
		imagenPSOE = new JLabel("");
		imagenPSOE.setBounds(179, 28, 90, 90);
		panel_1_2.add(imagenPSOE);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(211, 211, 211));
		panel_1_3.setBorder(new TitledBorder(null, "UNIDOS PODEMOS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_3.setBounds(331, 337, 289, 173);
		contentPane.add(panel_1_3);
		panel_1_3.setLayout(null);
		
		nombreIglesias = new JLabel("IONE BELARRA");
		nombreIglesias.setBounds(167, 124, 112, 39);
		panel_1_3.add(nombreIglesias);
		nombreIglesias.setFont(new Font("Agency FB", Font.BOLD, 16));
		nombreIglesias.setHorizontalAlignment(SwingConstants.CENTER);
		
		imagenIglesias = new JLabel("");
		imagenIglesias.setBounds(10, 25, 147, 125);
		panel_1_3.add(imagenIglesias);
		
		imagenPODEMOS = new JLabel("");
		imagenPODEMOS.setBounds(179, 24, 90, 90);
		panel_1_3.add(imagenPODEMOS);
	}
}

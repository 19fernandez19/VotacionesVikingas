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
		setBounds(100, 100, 921, 767);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		imagenCasado = new JLabel("");
		imagenCasado.setBounds(20, 142, 192, 324);
		contentPane.add(imagenCasado);
		
		imagenSanchez = new JLabel("");
		imagenSanchez.setBounds(241, 142, 192, 324);
		contentPane.add(imagenSanchez);
		
		imagenAbascal = new JLabel("");
		imagenAbascal.setBounds(464, 142, 192, 324);
		contentPane.add(imagenAbascal);
		
		imagenIglesias = new JLabel("");
		imagenIglesias.setBounds(690, 142, 192, 324);
		contentPane.add(imagenIglesias);
		
		nombreCasado = new JLabel("PABLO CASADO");
		nombreCasado.setFont(new Font("Agency FB", Font.BOLD, 24));
		nombreCasado.setHorizontalAlignment(SwingConstants.CENTER);
		nombreCasado.setBounds(20, 476, 192, 56);
		contentPane.add(nombreCasado);
		
		nombreSanchez = new JLabel("PEDRO SANCHEZ");
		nombreSanchez.setFont(new Font("Agency FB", Font.BOLD, 24));
		nombreSanchez.setHorizontalAlignment(SwingConstants.CENTER);
		nombreSanchez.setBounds(241, 476, 192, 56);
		contentPane.add(nombreSanchez);
		
		nombreAbascal = new JLabel("SANTIAGO ABASCAL");
		nombreAbascal.setFont(new Font("Agency FB", Font.BOLD, 24));
		nombreAbascal.setHorizontalAlignment(SwingConstants.CENTER);
		nombreAbascal.setBounds(464, 476, 192, 56);
		contentPane.add(nombreAbascal);
		
		nombreIglesias = new JLabel("PABLO IGLESIAS");
		nombreIglesias.setFont(new Font("Agency FB", Font.BOLD, 24));
		nombreIglesias.setHorizontalAlignment(SwingConstants.CENTER);
		nombreIglesias.setBounds(690, 476, 192, 56);
		contentPane.add(nombreIglesias);
		
		imagenPP = new JLabel("");
		imagenPP.setBounds(20, 542, 192, 156);
		contentPane.add(imagenPP);
		
		imagenPSOE = new JLabel("");
		imagenPSOE.setBounds(241, 542, 192, 156);
		contentPane.add(imagenPSOE);
		
		imagenVOX = new JLabel("");
		imagenVOX.setBounds(464, 542, 192, 156);
		contentPane.add(imagenVOX);
		
		imagenPODEMOS = new JLabel("");
		imagenPODEMOS.setBounds(690, 542, 192, 156);
		contentPane.add(imagenPODEMOS);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(20, 10, 862, 116);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CANDIDATOS A GANAR LAS ELECCIONES");
		lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 862, 116);
		panel.add(lblNewLabel);
	}
}

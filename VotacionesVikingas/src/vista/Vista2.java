package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista2 extends JFrame {

	public JPanel panel;
	public JTextField textoNombre;
	public JTextField textoApellido;
	
	public JButton botonIniciarSesion;
	public JButton botonLimpiar;
	public JPanel panelBienvenida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista2 frame = new Vista2();
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
	public Vista2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 468);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INICIO DE SESI\u00D3N");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 40));
		lblNewLabel.setBounds(134, 21, 277, 58);
		panel.add(lblNewLabel);
		
		JLabel labelNombre = new JLabel("Nombre:");
		labelNombre.setFont(new Font("Agency FB", Font.BOLD, 24));
		labelNombre.setBounds(134, 122, 67, 31);
		panel.add(labelNombre);
		
		textoNombre = new JTextField();
		textoNombre.setBounds(211, 122, 200, 31);
		panel.add(textoNombre);
		textoNombre.setColumns(10);
		
		JLabel labelApellido = new JLabel("Apellido:");
		labelApellido.setFont(new Font("Agency FB", Font.BOLD, 24));
		labelApellido.setBounds(134, 176, 67, 31);
		panel.add(labelApellido);
		
		textoApellido = new JTextField();
		textoApellido.setColumns(10);
		textoApellido.setBounds(211, 182, 200, 31);
		panel.add(textoApellido);
		
		botonIniciarSesion = new JButton("INICIAR SESI\u00D3N");
		botonIniciarSesion.setBounds(134, 232, 123, 37);
		panel.add(botonIniciarSesion);
		
		botonLimpiar = new JButton("LIMPIAR");
		botonLimpiar.setBounds(288, 232, 123, 37);
		panel.add(botonLimpiar);
		
		JPanel panelBienvenida = new JPanel();
		panelBienvenida.setBorder(new TitledBorder(null, "BIENVENIDA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelBienvenida.setBounds(10, 294, 578, 127);
		panel.add(panelBienvenida);
	}
}

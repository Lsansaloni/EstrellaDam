package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cans extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cans frame = new Cans();
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
	public Cans() {
		setTitle("AnimApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 390);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnApli = new JMenu("Aplicacio");
		menuBar.add(mnApli);
		
		JMenuItem mntmTancar = new JMenuItem("Tancar");
		mnApli.add(mntmTancar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 150, 341);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnDadesAsociacio = new JButton("Dades asociacio");
		btnDadesAsociacio.setBounds(2, 1, 146, 35);
		panel.add(btnDadesAsociacio);
		
		JButton btnMascotes = new JButton("Mascotes");
		btnMascotes.setBounds(2, 39, 146, 35);
		panel.add(btnMascotes);
		
		JButton btnNoticias = new JButton("Noticies");
		btnNoticias.setBounds(2, 78, 147, 35);
		panel.add(btnNoticias);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.DARK_GRAY);
		panelPrincipal.setBounds(151, 0, 401, 341);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JPanel panelAso = new JPanel();
		panelAso.setBackground(new Color(230, 230, 250));
		panelAso.setBounds(4, 5, 393, 331);
		panelPrincipal.add(panelAso);
		panelAso.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom Asociació");
		lblNewLabel.setBounds(12, 12, 101, 15);
		panelAso.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(131, 10, 250, 19);
		panelAso.add(textField);
		textField.setColumns(10);
		
		JLabel lblDirecci = new JLabel("Direcció");
		lblDirecci.setBounds(12, 43, 70, 15);
		panelAso.add(lblDirecci);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(131, 41, 250, 19);
		panelAso.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(131, 72, 250, 19);
		panelAso.add(textField_2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(12, 74, 70, 15);
		panelAso.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(131, 103, 88, 19);
		panelAso.add(textField_3);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(12, 105, 70, 15);
		panelAso.add(lblTelefono);
		
		JLabel lblMovil = new JLabel("Movil");
		lblMovil.setBounds(239, 105, 43, 15);
		panelAso.add(lblMovil);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(293, 103, 88, 19);
		panelAso.add(textField_4);
		
		JLabel lblNombreDelResponsable = new JLabel("Nombre del responsable");
		lblNombreDelResponsable.setBounds(12, 139, 182, 15);
		panelAso.add(lblNombreDelResponsable);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(12, 159, 250, 19);
		panelAso.add(textField_5);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(12, 189, 88, 15);
		panelAso.add(lblDescripcion);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(12, 209, 369, 19);
		panelAso.add(textField_6);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(287, 300, 101, 25);
		panelAso.add(btnGuardar);
		
		JButton buttonEditar = new JButton("Cancelar");
		buttonEditar.setBounds(178, 300, 101, 25);
		panelAso.add(buttonEditar);
	}
}

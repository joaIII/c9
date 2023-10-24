package gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblValorTipoCambio;
	private JTextField txtTipoCambio;
	private JButton btnAdicionar;
	private JButton btnReemplazar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	
	ArregloTipoCambio a = new ArregloTipoCambio();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema frame = new Problema();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema() {
		setTitle("Pregunta 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblValorTipoCambio = new JLabel("Valor Tipo cambio:");
		lblValorTipoCambio.setBounds(10, 11, 109, 23);
		contentPane.add(lblValorTipoCambio);

		txtTipoCambio = new JTextField();
		txtTipoCambio.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtTipoCambio.setBounds(114, 11, 78, 23);
		contentPane.add(txtTipoCambio);
		txtTipoCambio.setColumns(10);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(340, 48, 180, 23);
		contentPane.add(btnAdicionar);
		
		btnReemplazar = new JButton("Reemplazar");
		btnReemplazar.addActionListener(this);
		btnReemplazar.setBounds(340, 78, 180, 23);
		contentPane.add(btnReemplazar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 315, 400);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	
	//  Declaración global

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnReemplazar) {
			actionPerformedBtnReemplazar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		limpieza();
	}
		
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		a.ampliarArreglo();
		
	}
	
	protected void actionPerformedBtnReemplazar(ActionEvent arg0) {
		a.reemplazarUltimoCambioMayorQue40();
		if(reemplazarUltimoCambioMayorQue40() = false) {
			System.out.println("No existe Ningun cambio mayor a S/4.0")
		}
	}
	
	
	//  Métodos que retornan valor (sin parámetros)
	int leerValor()  {
		return Integer.parseInt(txtTipoCambio.getText().trim());
	}
	
	//  Métodos 
	
	void imprimir() {
		imprimir("");
	}
	void limpieza() {
		txtTipoCambio.setText("");
		txtTipoCambio.requestFocus();
	}

	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	
	
}
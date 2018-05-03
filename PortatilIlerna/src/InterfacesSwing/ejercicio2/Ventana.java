package InterfacesSwing.ejercicio2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;

	JPanel panelPrincipal;
	JPanel panelBotones;
	JTextField cajaTexto;
	JButton boton[];
	
	public Ventana() {
		super("Ejercicio 2");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Metodo para crear interfaz y agregar botones
		init();	
	}

	private void init() {
		//PANEL PRINCIPAL
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout());
		
		//NORTE
		cajaTexto = new JTextField();
		panelPrincipal.add("North", cajaTexto);
		
		//CENTRO
		panelBotones = new JPanel();
		//row/col/hgap/vgap
		panelBotones.setLayout(new GridLayout(3, 3, 4, 4));
		
		//Añadimos botones
		agregarBotones();
		panelPrincipal.add("Center", panelBotones);
		
		//Agregamos todo
		getContentPane().add(panelPrincipal);
	}
	
	private void agregarBotones() {
		boton = new JButton[10];
		//Creamos los botones
		for(int i = 1; i < 10; i++) {
			boton[i] = new JButton(String.valueOf(i));
		}
		//Añadimos los botones al panel 
		for(int i = 1; i<10; i++) {
			panelBotones.add(boton[i]);
		}
		
		//Eventos de los botones
		for(int i = 1; i < 10; i++) {
			boton[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton obj = (JButton)e.getSource();
					String numero = obj.getText();
					cajaTexto.setText(String.valueOf(numero));
					obj.setEnabled(false);
				}
			});
		}
	}
}

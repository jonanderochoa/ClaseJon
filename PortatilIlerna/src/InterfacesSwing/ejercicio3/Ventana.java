package InterfacesSwing.ejercicio3;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	JPanel panelPrincipal, panelJLabel, panelJTextfield;
	JPanel panelBotones;
	JTextField t1, t2, t3, t4, t5, t6, t7;
	JLabel l1, l2, l3, l4, l5, l6, l7;
	JButton b1, b2, b3;
	Container contenedor;
	Dibujo dibujo;

	public Ventana() {
		super("Administración del sorteo de Lotería Primitiva");
		setSize(520, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Evitamos que puedan cambiar el tamaño de la ventana
		setResizable(false);
		init();
	}
	
	private void init() {
		
		contenedor = getContentPane();
		contenedor.setLayout(null);
		
		//LABELS
		l1 = new JLabel("Fecha sorteo");
		l2 = new JLabel("N1");
		l3 = new JLabel("N2");
		l4 = new JLabel("N3");
		l5 = new JLabel("N4");
		l6 = new JLabel("N5"); 
		l7 = new JLabel("Complementario");
		
		//Posicionamos lablels
		l1.setBounds(10, 15, 100, 10);
		l2.setBounds(100, 15, 100, 10);
		l3.setBounds(120, 15, 100, 10);
		l4.setBounds(140, 15, 100, 10);
		l5.setBounds(160, 15, 100, 10);
		l6.setBounds(180, 15, 100, 10);
		l7.setBounds(200, 15, 100, 10);
		
		//Añadimos los labels al contenedor
		contenedor.add(l1);
		contenedor.add(l2);
		contenedor.add(l3);
		contenedor.add(l4);
		contenedor.add(l5);
		contenedor.add(l6);
		contenedor.add(l7);
		
		//TEXTFIELD
		t1 = new JTextField(); 
		t2 = new JTextField(); 
		t3 = new JTextField(); 
		t4 = new JTextField(); 
		t5 = new JTextField(); 
		t6 = new JTextField(); 
		t7 = new JTextField(); 
		
		//Posicionamos textfield
		t1.setBounds(10, 30, 65, 20);
		t2.setBounds(100, 30, 20, 20);
		t3.setBounds(120, 30, 20, 20);
		t4.setBounds(140, 30, 20, 20);
		t5.setBounds(160, 30, 20, 20);
		t6.setBounds(180, 30, 20, 20);
		t7.setBounds(200, 30, 20, 20);
		
		//Añadimos los textfield al contenedor
		contenedor.add(t1);
		contenedor.add(t2);
		contenedor.add(t3);
		contenedor.add(t4);
		contenedor.add(t5);
		contenedor.add(t6);
		contenedor.add(t7);
		
		//BUTTON
		b1 = new JButton("Añadir"); 
		b2 = new JButton("Listar"); 
		b3 = new JButton("Cerrar"); 
		
		//Posicionamos buttons
		b1.setBounds(380, 60, 120, 20);
		b2.setBounds(380, 90, 120, 20);
		b3.setBounds(380, 420, 120, 20);
		
		//Añadimos los butons al contenedor
		contenedor.add(b1);
		contenedor.add(b2);
		contenedor.add(b3);	
		
		dibujo = new Dibujo();
		contenedor.add(dibujo);
	}	
	
}


class Dibujo extends JPanel{

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(30, 30, 100, 100);
		g.setColor(Color.WHITE);
	}
}


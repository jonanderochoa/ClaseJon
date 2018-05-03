package InterfacesSwing.ejercicio1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana extends JFrame implements ChangeListener {

	private static final long serialVersionUID = 1L;

	//Componentes
	JRadioButton r1, r2, r3;
	JTextField t;
	JLabel l;
	ButtonGroup group;
	//Panel
	JPanel jpradio, jptext, grid;
	
	public Ventana() {
		super("Ejercicio 1");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	
	private void init() {
		//Creamos un panel  grid
		grid = new JPanel();
		grid.setLayout(new GridLayout(2, 1));
		
		//Creamos un panel flow
		jpradio = new JPanel();
		jpradio.setLayout(new FlowLayout());
		
		//Creamos otro panel flow
		jptext = new JPanel();
		jptext.setLayout(new FlowLayout());
		
		//Añadimos los paneles a el panel grid
		grid.add(jpradio);
		grid.add(jptext);
		
		addComponent();
		//Añadimos el contenido
		getContentPane().add(grid);
		
		
	}
	
	private void addComponent() {
		//Creamos los radiobuttons
		r1 = new JRadioButton("AZUL");
		r2 = new JRadioButton("AMARILLO");
		r3 = new JRadioButton("VERDE");
		l = new JLabel("Color: ");
		t = new JTextField(10);
	
		//Creamob un grupo de botones y le añadimos los radiobutton
		group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
		group.add(r3);
		
		//Añadimos los botones a los Panel
		jpradio.add(r1);
		jpradio.add(r2);
		jpradio.add(r3);
		jptext.add(l);
		jptext.add(t);
		
		//Eventos
		r1.addChangeListener(this);
		r2.addChangeListener(this);
		r3.addChangeListener(this);
	}


	@Override
	public void stateChanged(ChangeEvent e) {
		if(r1.isSelected()) {
			grid.setBackground(Color.BLUE);
			jpradio.setBackground(Color.BLUE);
			jptext.setBackground(Color.BLUE);
			t.setText("AZUL");
			
		}else if(r2.isSelected()) {
			grid.setBackground(Color.YELLOW);
			jpradio.setBackground(Color.YELLOW);
			jptext.setBackground(Color.YELLOW);
			t.setText("AMARILLO");
		}else if(r3.isSelected()) {
			grid.setBackground(Color.GREEN);
			jpradio.setBackground(Color.GREEN);
			jptext.setBackground(Color.GREEN);
			t.setText("VERDE");
		}
	}
}

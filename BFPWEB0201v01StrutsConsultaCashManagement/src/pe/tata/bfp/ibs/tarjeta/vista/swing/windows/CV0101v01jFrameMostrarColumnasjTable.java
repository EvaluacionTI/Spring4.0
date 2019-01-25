package pe.tata.bfp.ibs.tarjeta.vista.swing.windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class CV0101v01jFrameMostrarColumnasjTable extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CV0101v01jFrameMostrarColumnasjTable frame = new CV0101v01jFrameMostrarColumnasjTable();
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
	public CV0101v01jFrameMostrarColumnasjTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//1. Array bidimensional de objetos con los datos de la tabla 
		Object[][] data = { 
			{"Mary", "Campione", "Esquiar", new Integer(5), new Boolean(false)}, 
			{"Lhucas", "Huml", "Patinar", new Integer(3), new Boolean(true)}, 
			{"Kathya", "Walrath", "Escalar", new Integer(2), new Boolean(false)}, 
			{"Marcus", "Andrews", "Correr", new Integer(7), new Boolean(true)}, 
			{"Angela", "Lalth", "Nadar", new Integer(4), new Boolean(false)} 
		};
		
		//2. Array de �String� con los titulos de las columnas 
		String[] columnNames = {"Nombre", "Apellido", "Pasatiempo", "A�os de Practica", "Soltero(a)"};
		
		//3. Creacion de la tabla 
		final JTable table = new JTable(data, columnNames); 
		table.setPreferredScrollableViewportSize(new Dimension(500, 80));

		//4. Creamos un scrollpanel y se lo agregamos a la tabla 
		JScrollPane scrollpane = new JScrollPane(table);

		//5. Agregamos el scrollpanel al contenedor 
		getContentPane().add(scrollpane, BorderLayout.CENTER);

		//6. manejamos la salida 
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) { 
				System.exit(0); 
			}
		});
	}

}

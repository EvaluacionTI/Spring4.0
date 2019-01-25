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
import javax.swing.table.DefaultTableModel;

public class CV0201v01jFrameMostrarColumnasDefaultTableModel extends JFrame {

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
					CV0201v01jFrameMostrarColumnasDefaultTableModel frame = new CV0201v01jFrameMostrarColumnasDefaultTableModel();
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
	public CV0201v01jFrameMostrarColumnasDefaultTableModel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//1. array bidimencional de objetos con los datos de la tabla 
		Object[][] data = { 
			{"Mary", "Campione", "Esquiar", new Integer(5), new Boolean(false)}, 
			{"Lhucas", "Huml", "Patinar", new Integer(3), new Boolean(true)}, 
			{"Kathya", "Walrath", "Escalar", new Integer(2), new Boolean(false)}, 
			{"Marcus", "Andrews", "Correr", new Integer(7), new Boolean(true)}, 
			{"Angela", "Lalth", "Nadar", new Integer(4), new Boolean(false)} 
		}; 
		
		//2. array de String�s con los t�tulos de las columnas 
		String[] columnNames = {"Nombre", "Apellido", "Pasatiempo", "A�os de Practica", "Soltero(a)" };
		
		//3. creamos el modelo de tabla con los datos anteriores 
		DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
		
		//4. se crea la tabla con el defaultablemodel 
		JTable tabla = new JTable(dtm);

		//5. una vez creada la tabla con su modelo 
		//   podemos agregar columnas (columna es hacia abajo) 
		String[] newColumn = {"Flan", "Pastel", "Helado", "Barquillo", "Manzana"}; 
		dtm.addColumn("Postre", newColumn);
		
		//6. filas 
		Object[] newRow = {"Pepe", "Grillo", "Tenis", new Integer(5), new Boolean(false), "Pera" }; 
		dtm.addRow(newRow);
		
		//7. o modificar una celda en especifico 
		dtm.setValueAt("Catherine", 1, 1); 
		//  se define el tama�o 
		tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
		
		//8. Creamos un JscrollPane y le agregamos la JTable 
		JScrollPane scrollPane = new JScrollPane(tabla);

		//9. Agregamos el JScrollPane al contenedor 
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		//10. manejamos la salida 
		addWindowListener(new WindowAdapter() { 
			@Override
			public void windowClosing(WindowEvent e) { 
				System.exit(0); 
			} 
		}); 
		
	}

}

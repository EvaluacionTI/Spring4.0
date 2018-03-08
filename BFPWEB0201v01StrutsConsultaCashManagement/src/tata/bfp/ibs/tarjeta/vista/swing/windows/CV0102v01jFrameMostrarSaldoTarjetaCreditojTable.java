package tata.bfp.ibs.tarjeta.vista.swing.windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import tata.bfp.ibs.tarjeta.controladora.CCTarjetaCredito;
import tata.bfp.ibs.tarjeta.entidad.CETarjetaCredito;

public class CV0102v01jFrameMostrarSaldoTarjetaCreditojTable extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//Arreglo de columnas de la tabla 
	private String[] masTituloColumna = 
		{"C�digo Empresa", "Nombre Empresa", "N� Pan", "N� Tarjeta Titular", "Nombre Tarjeta Titutlar",
		 "C�digo Estado Tarjeta", "Estado Tarjeta", "C�digo Vinculado", "Nombre Titula Habiente", "Ciclo Facturaci�n",
		 "L�nea Cr�dito", "Disponible Consumo", "L�nea Disposici�n Efectivo", "Disponible Disposici�n Efectivo", "Fecha Facturaci�n",
		 "Fecha Pago", "Pago M�nimo MN", "Pago Total MN", "Pago M�nimo ME", "Pago Total ME"
		};

	// Objeto de 
	private Object[][] moDataTarjetaCredito, moData;
	
	/**
	 * 
	 */
	// Objetos para cargar la informaci�n de la consulta en el DB2
	private static List<CETarjetaCredito> moLista = null;
	private static CETarjetaCredito moCETarjetaCredito;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CV0102v01jFrameMostrarSaldoTarjetaCreditojTable frame = new CV0102v01jFrameMostrarSaldoTarjetaCreditojTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public CV0102v01jFrameMostrarSaldoTarjetaCreditojTable() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		moData = listaTotalSaldoTarjetaCredito();
		
		//Creacion de la tabla 
		final JTable table = new JTable(moData, masTituloColumna); 
		table.setPreferredScrollableViewportSize(new Dimension(500, 80));
		
		//Creamos un scrollpanel y se lo agregamos a la tabla 
		JScrollPane scrollpane = new JScrollPane(table);

		//Agregamos el scrollpanel al contenedor 
		getContentPane().add(scrollpane, BorderLayout.CENTER);

		//manejamos la salida 
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) { 
				System.exit(0); 
			}
		});
		
	}

	/*
	 * Descripci�n		:	carga la lista de todos los clientes empresariales asociado a una tarjeta de cr�dito
	 * 
	 */	
	public Object[][] listaTotalSaldoTarjetaCredito() throws SQLException{
		int index = 0;
		
		CCTarjetaCredito moCCTarjetaCredito = new CCTarjetaCredito();
		
		moLista = new LinkedList<CETarjetaCredito>();
		moLista = moCCTarjetaCredito.listaTotalSaldoTarjetaCredito();
		moDataTarjetaCredito = new Object[moLista.size()][20];
		
		moCETarjetaCredito = new CETarjetaCredito();
		Iterator<CETarjetaCredito> oIt = moLista.iterator();
		
		while (oIt.hasNext()){
			
			moCETarjetaCredito = moLista.get(index);
			
			moDataTarjetaCredito[index][0] = moCETarjetaCredito.getCodigoEmpresa();
			moDataTarjetaCredito[index][1] = moCETarjetaCredito.getNombreEmpresa();
			moDataTarjetaCredito[index][2] = moCETarjetaCredito.getNumeroPan();
			moDataTarjetaCredito[index][3] = moCETarjetaCredito.getNumeroTarjetaHabiente();
			moDataTarjetaCredito[index][4] = moCETarjetaCredito.getNombreTarjeta();
			moDataTarjetaCredito[index][5] = moCETarjetaCredito.getCodigoEstadoTarjeta();
			moDataTarjetaCredito[index][6] = moCETarjetaCredito.getEstadoTarjeta();
			moDataTarjetaCredito[index][7] = moCETarjetaCredito.getCodigoVinculado();
			moDataTarjetaCredito[index][8] = moCETarjetaCredito.getNombreCliente();
			moDataTarjetaCredito[index][9] = moCETarjetaCredito.getCicloFacturacion();
			moDataTarjetaCredito[index][10] = moCETarjetaCredito.getLineaCredito();
			moDataTarjetaCredito[index][11] = moCETarjetaCredito.getSaldoLineaCredito();
			moDataTarjetaCredito[index][12] = moCETarjetaCredito.getLineaDisposicionEfectivo();
			moDataTarjetaCredito[index][13] = moCETarjetaCredito.getSaldoDisposicionEfectivo();
			moDataTarjetaCredito[index][14] = (moCETarjetaCredito.getDdmmyyyyFacturacion() == null ? "":moCETarjetaCredito.getDdmmyyyyFacturacion());
			moDataTarjetaCredito[index][15] = (moCETarjetaCredito.getDdmmyyyyPago() == null ? "":moCETarjetaCredito.getDdmmyyyyPago());
			moDataTarjetaCredito[index][16] = moCETarjetaCredito.getPagoMinimoMN();
			moDataTarjetaCredito[index][17] = moCETarjetaCredito.getPagoTotalMN();
			moDataTarjetaCredito[index][18] = moCETarjetaCredito.getPagoMinimoME();
			moDataTarjetaCredito[index][19] = moCETarjetaCredito.getPagoTotalME();

			moCETarjetaCredito = new CETarjetaCredito();
			
			oIt.next();
			index ++;
		}		
		return moDataTarjetaCredito;
	}	

}

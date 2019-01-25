package pe.tata.bfp.ibs.tarjeta.vista.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CV01v01MenuTarjetaCredito {

	private JFrame frmCashManagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CV01v01MenuTarjetaCredito window = new CV01v01MenuTarjetaCredito();
					window.frmCashManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CV01v01MenuTarjetaCredito() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCashManagement = new JFrame();
		frmCashManagement.setTitle("Cash Management - Tarjeta de Cr\u00E9dito");
		frmCashManagement.setBounds(100, 100, 450, 300);
		frmCashManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmCashManagement.setJMenuBar(menuBar);
		
		JMenu mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		JMenuItem mntmPorClienteSaldo = new JMenuItem("Por Cliente Saldo Tarjeta Cr\u00E9dito");
		mntmPorClienteSaldo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnConsulta.add(mntmPorClienteSaldo);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Total Saldo Tarjeta Cr\u00E9dito");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				CV0201v01DialogConsultaTotalSaldoTarjetaCredito oCVDialogo = new CV0201v01DialogConsultaTotalSaldoTarjetaCredito();
				oCVDialogo.setVisible(true);

			}
		});
		mnConsulta.add(mntmNewMenuItem);
		
		JMenu mnSalir = new JMenu("Salir");
		mnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		menuBar.add(mnSalir);
	}

}

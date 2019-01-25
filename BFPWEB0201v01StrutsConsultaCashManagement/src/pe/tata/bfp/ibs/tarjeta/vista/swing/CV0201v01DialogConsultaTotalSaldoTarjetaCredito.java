package pe.tata.bfp.ibs.tarjeta.vista.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class CV0201v01DialogConsultaTotalSaldoTarjetaCredito extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CV0201v01DialogConsultaTotalSaldoTarjetaCredito dialog = new CV0201v01DialogConsultaTotalSaldoTarjetaCredito();
			dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CV0201v01DialogConsultaTotalSaldoTarjetaCredito() {
		setTitle("Consulta Total Saldo Tarjeta Cr\u00E9dito");
		setBounds(100, 100, 757, 560);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setToolTipText("");
			scrollPane.setViewportBorder(new TitledBorder(null, "Detalle de Saldo de Tarjeta Cr\u00E9dito", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			contentPanel.add(scrollPane);
			{
				table = new JTable();
				scrollPane.setViewportView(table);
				table.setFont(new Font("Verdana", Font.PLAIN, 12));
				table.setShowVerticalLines(true);
				table.setShowHorizontalLines(true);
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
					},
					new String[] {
						"C\u00F3digo Empresa", "Nombre Empresa ", "N\u00FAmero PAN", "Tarjeta Titular Habiente", "Nombre Tarjeta", "C\u00F3digo Estado Tarjeta", "Nombre Estado Tarjeta", "C\u00F3digo Vinculado", "Nombre Vinculado", "Ciclo Facturaci\u00F3n", "L\u00EDnea Cr\u00E9dito", "Saldo Disponible Consumo", "L\u00EDnea Disposici\u00F3n Efectivo", "Saldo Disposici\u00F3n Efectivo", "Fecha Facturaci\u00F3n", "Fecha Pago", "Pago M\u00EDnimo MN", "Pago Total MN", "Pago M\u00EDnimo ME", "Pago Total ME"
					}
				));
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}

package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class JFrmNuevaSupervision extends JFrame {

	private JPanel contentPane;
	private SimpleDateFormat sdf;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtPersona1;
	private JTextField txtCargoPersona1;
	private JTextField txtPersona2;
	private JTextField txtCargoPersona2;
	private JTextField txtPersona3;
	private JTextField txtCargoPersona3;
	private JTextField txtPersona4;
	private JTextField txtCargoPersona4;
	private JTextField txtPersona5;
	private JTextField txtCargoPersona5;
	private JTextField txtPersona6;
	private JTextField txtCargoPersona6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrmNuevaSupervision frame = new JFrmNuevaSupervision();
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
	public JFrmNuevaSupervision() {
		setTitle("NUEVA SUPERVISION");
		setResizable(false);		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		setBounds(100, 100, 944, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 918, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
		);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de supervisi\u00F3n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd/MM/yyyy");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Unidad");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_3 = new JLabel("Motivo de supervisi\u00F3n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("N\u00FAmero de personas");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		
		/**/
		//TODO: AGREGAR EVENTOS PARA CAMBIO EN SPINNER
		JSpinner spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valorSpinner = 1;
				valorSpinner = (int)spinner.getValue();
				
				switch(valorSpinner) {
					case 1:												
						txtCargoPersona2.setEnabled(false);
						txtPersona2.setEnabled(false);
						txtCargoPersona3.setEnabled(false);
						txtPersona3.setEnabled(false);
						txtCargoPersona4.setEnabled(false);
						txtPersona4.setEnabled(false);
						txtCargoPersona5.setEnabled(false);
						txtPersona5.setEnabled(false);
						txtCargoPersona6.setEnabled(false);
						txtPersona6.setEnabled(false);						
						break;
					case 2:
						txtPersona1.setEnabled(true);
						txtCargoPersona1.setEnabled(true);
						txtPersona2.setEnabled(true);
						txtCargoPersona2.setEnabled(true);
						txtPersona3.setEnabled(false);
						txtCargoPersona3.setEnabled(false);
						txtPersona4.setEnabled(false);
						txtCargoPersona4.setEnabled(false);
						txtPersona5.setEnabled(false);
						txtCargoPersona5.setEnabled(false);
						txtPersona6.setEnabled(false);
						txtCargoPersona6.setEnabled(false);						
						break;
					case 3:
						txtPersona1.setEnabled(true);
						txtCargoPersona1.setEnabled(true);
						txtPersona2.setEnabled(true);
						txtCargoPersona2.setEnabled(true);
						txtPersona3.setEnabled(true);
						txtCargoPersona3.setEnabled(true);
						txtPersona4.setEnabled(false);
						txtCargoPersona4.setEnabled(false);
						txtPersona5.setEnabled(false);
						txtCargoPersona5.setEnabled(false);
						txtPersona6.setEnabled(false);
						txtCargoPersona6.setEnabled(false);												
						break;
					case 4:
						txtPersona1.setEnabled(true);
						txtCargoPersona1.setEnabled(true);
						txtPersona2.setEnabled(true);
						txtCargoPersona2.setEnabled(true);
						txtPersona3.setEnabled(true);
						txtCargoPersona3.setEnabled(true);
						txtPersona4.setEnabled(true);
						txtCargoPersona4.setEnabled(true);
						txtPersona5.setEnabled(false);
						txtCargoPersona5.setEnabled(false);
						txtPersona6.setEnabled(false);
						txtCargoPersona6.setEnabled(false);						
						break;
					case 5:
						txtPersona1.setEnabled(true);
						txtCargoPersona1.setEnabled(true);
						txtPersona2.setEnabled(true);
						txtCargoPersona2.setEnabled(true);
						txtPersona3.setEnabled(true);
						txtCargoPersona3.setEnabled(true);
						txtPersona4.setEnabled(true);
						txtCargoPersona4.setEnabled(true);
						txtPersona5.setEnabled(true);
						txtCargoPersona5.setEnabled(true);
						txtPersona6.setEnabled(false);
						txtCargoPersona6.setEnabled(false);						
						break;
					case 6:
						txtPersona1.setEnabled(true);
						txtCargoPersona1.setEnabled(true);
						txtPersona2.setEnabled(true);
						txtCargoPersona2.setEnabled(true);
						txtPersona3.setEnabled(true);
						txtCargoPersona3.setEnabled(true);
						txtPersona4.setEnabled(true);
						txtCargoPersona4.setEnabled(true);
						txtPersona5.setEnabled(true);
						txtCargoPersona5.setEnabled(true);
						txtPersona6.setEnabled(true);
						txtCargoPersona6.setEnabled(true);						
						break;
				}
				
				//JOptionPane.showMessageDialog(null, "Cambio en spinner, valor: "+(Integer)spinner.getValue());
				
			}
		});
		spinner.setModel(new SpinnerNumberModel(1, 1, 6, 1));
		//TODO: AGREGAR EVENTOS PARA CAMBIO EN SPINNER		
		
		JLabel lblNewLabel_5 = new JLabel("Nombre Persona 1");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtPersona1 = new JTextField();
		txtPersona1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Cargo");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtCargoPersona1 = new JTextField();
		txtCargoPersona1.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("Nombre Persona 2");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtPersona2 = new JTextField();
		txtPersona2.setColumns(10);
		
		txtCargoPersona2 = new JTextField();
		txtCargoPersona2.setColumns(10);
		
		JLabel lblNewLabel_6_1 = new JLabel("Cargo");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_2 = new JLabel("Nombre Persona 3");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtPersona3 = new JTextField();
		txtPersona3.setColumns(10);
		
		txtCargoPersona3 = new JTextField();
		txtCargoPersona3.setColumns(10);
		
		JLabel lblNewLabel_6_2 = new JLabel("Cargo");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_3 = new JLabel("Nombre Persona 4");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtPersona4 = new JTextField();
		txtPersona4.setColumns(10);
		
		txtCargoPersona4 = new JTextField();
		txtCargoPersona4.setColumns(10);
		
		JLabel lblNewLabel_6_3 = new JLabel("Cargo");
		lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_4 = new JLabel("Nombre Persona 5");
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtPersona5 = new JTextField();
		txtPersona5.setColumns(10);
		
		txtCargoPersona5 = new JTextField();
		txtCargoPersona5.setColumns(10);
		
		JLabel lblNewLabel_6_4 = new JLabel("Cargo");
		lblNewLabel_6_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_5 = new JLabel("Nombre Persona 6");
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtPersona6 = new JTextField();
		txtPersona6.setColumns(10);
		
		txtCargoPersona6 = new JTextField();
		txtCargoPersona6.setColumns(10);
		
		txtCargoPersona2.setEnabled(false);
		txtPersona2.setEnabled(false);
		txtCargoPersona3.setEnabled(false);
		txtPersona3.setEnabled(false);
		txtCargoPersona4.setEnabled(false);
		txtPersona4.setEnabled(false);
		txtCargoPersona5.setEnabled(false);
		txtPersona5.setEnabled(false);
		txtCargoPersona6.setEnabled(false);
		txtPersona6.setEnabled(false);		
		
		JLabel lblNewLabel_6_5 = new JLabel("Cargo");
		lblNewLabel_6_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnNewButton = new JButton("Generar reporte");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODIGO PARA GENERAR REPORTE; MOSTRAR JOPTIONPANE PARA DECIR QUE SE GENERARA REPORTE EN TAL RUTA
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("Guardar");
		
		JLabel lblNewLabel_7 = new JLabel("Descripci\u00F3n de actividades");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblNewLabel = new JLabel("Departamento");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 118, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblNewLabel)
											.addGap(12)
											.addComponent(comboBox, 0, 129, Short.MAX_VALUE))
										.addComponent(textField_1)))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(53)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_7))))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_5_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_5_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_5_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_5_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_5_4, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPersona5, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPersona6, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPersona4, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPersona3, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPersona2, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPersona1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
							.addGap(4)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_6_3)
										.addComponent(lblNewLabel_6_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_6_5, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(txtCargoPersona6, 140, 140, 140)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(txtCargoPersona4, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
											.addComponent(txtCargoPersona5, 146, 146, 146))))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_6)
											.addPreferredGap(ComponentPlacement.UNRELATED))
										.addComponent(lblNewLabel_6_1, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
										.addComponent(lblNewLabel_6_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
												.addComponent(txtCargoPersona3, 132, 132, 132)
												.addGap(8))
											.addGroup(gl_panel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtCargoPersona2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_panel.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(txtCargoPersona1, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))))
								.addComponent(btnNewButton_1))
							.addGap(24))
						.addComponent(btnNewButton, Alignment.LEADING)))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5)
								.addComponent(txtPersona1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6)
								.addComponent(txtCargoPersona1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_5_1)
										.addComponent(txtPersona2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_6_1))
									.addGap(18))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(txtCargoPersona2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5_2)
								.addComponent(txtPersona3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6_2)
								.addComponent(txtCargoPersona3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5_3)
								.addComponent(txtPersona4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCargoPersona4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6_3))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5_4)
								.addComponent(txtPersona5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6_4)
								.addComponent(txtCargoPersona5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5_5)
								.addComponent(txtPersona6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6_5)
								.addComponent(txtCargoPersona6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(37)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_2)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(31)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4)
								.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))))
					.addGap(23)
					.addComponent(lblNewLabel_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton)
							.addComponent(btnNewButton_1))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
					.addGap(18))
		);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setTabSize(2);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}

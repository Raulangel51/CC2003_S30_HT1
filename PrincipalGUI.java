/**
 *  @author Raul Angel Jimenez Hernandez 
 * 	19017
 * @author Donaldo Sebastian Garcia Jimenez
 * 	
 * Fecha 15/01/2020
 * 
 * Clase principal con el GUI para correr el radio
 */

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PrincipalGUI {

	private JFrame frame;
	private JTextField textField;
	private Milistener action = new Milistener();
	private JButton button_atras;
	private JButton button_siguiente;
	private JButton btnSave;
	private JButton btnCanal_1;
	private JButton btnCanal_2;
	private JButton btnCanal_3;
	private JButton btnCanal_4;
	private JButton btnOnOff;
	private JButton btnAmFm;
	private JButton btnCanal_5;
	private JButton btnCanal_6;
	private JButton btnCanal_7;
	private JButton btnCanal_8;
	private JButton btnCanal_9;
	private JButton btnCanal_10;
	private JButton btnCanal_11;
	private JButton btnCanal_12;
	Radio radio = new Radio();
	int cont = 0;
	int cont1 = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalGUI window = new PrincipalGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrincipalGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 663, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		button_atras = new JButton("<");
		button_atras.setBounds(440, 28, 64, 25);
		button_atras.addActionListener(action);
		frame.getContentPane().add(button_atras);
		
		button_siguiente = new JButton(">");
		button_siguiente.setBounds(516, 28, 70, 25);
		button_siguiente.addActionListener(action);
		frame.getContentPane().add(button_siguiente);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(516, 101, 97, 25);
		btnSave.addActionListener(action);
		frame.getContentPane().add(btnSave);
		
		btnCanal_1 = new JButton("Canal 1");
		btnCanal_1.setBounds(150, 101, 81, 25);
		btnCanal_1.addActionListener(action);
		frame.getContentPane().add(btnCanal_1);
		
		btnCanal_2 = new JButton("Canal 2");
		btnCanal_2.setBounds(238, 101, 81, 25);
		btnCanal_2.addActionListener(action);
		frame.getContentPane().add(btnCanal_2);
		
		btnCanal_3 = new JButton("Canal 3");
		btnCanal_3.setBounds(331, 101, 81, 25);
		btnCanal_3.addActionListener(action);
		frame.getContentPane().add(btnCanal_3);
		
		btnCanal_4 = new JButton("Canal 4");
		btnCanal_4.setBounds(424, 101, 80, 25);
		btnCanal_4.addActionListener(action);
		frame.getContentPane().add(btnCanal_4);
		
		btnOnOff = new JButton("ON / OFF");
		btnOnOff.setBounds(12, 13, 97, 25);
		btnOnOff.addActionListener(action);
		frame.getContentPane().add(btnOnOff);
		
		btnAmFm = new JButton("AM / FM");
		btnAmFm.setBounds(12, 82, 97, 25);
		btnAmFm.addActionListener(action);
		frame.getContentPane().add(btnAmFm);
		
		btnCanal_5 = new JButton("Canal 5");
		btnCanal_5.setBounds(150, 144, 81, 25);
		btnCanal_5.addActionListener(action);
		frame.getContentPane().add(btnCanal_5);
		
		btnCanal_6 = new JButton("Canal 6");
		btnCanal_6.setBounds(238, 144, 81, 25);
		btnCanal_6.addActionListener(action);
		frame.getContentPane().add(btnCanal_6);
		
		btnCanal_7 = new JButton("Canal 7");
		btnCanal_7.setBounds(327, 144, 81, 25);
		btnCanal_7.addActionListener(action);
		frame.getContentPane().add(btnCanal_7);
		
		btnCanal_8 = new JButton("Canal 8");
		btnCanal_8.setBounds(424, 144, 81, 25);
		btnCanal_8.addActionListener(action);
		frame.getContentPane().add(btnCanal_8);
		
		btnCanal_9 = new JButton("Canal 9");
		btnCanal_9.setBounds(150, 188, 81, 25);
		btnCanal_9.addActionListener(action);
		frame.getContentPane().add(btnCanal_9);
		
		btnCanal_10 = new JButton("Canal 10");
		btnCanal_10.setBounds(248, 188, 91, 25);
		btnCanal_10.addActionListener(action);
		frame.getContentPane().add(btnCanal_10);
		
		btnCanal_11 = new JButton("Canal 11");
		btnCanal_11.setBounds(363, 188, 91, 25);
		btnCanal_11.addActionListener(action);
		frame.getContentPane().add(btnCanal_11);
		
		btnCanal_12 = new JButton("Canal 12");
		btnCanal_12.setBounds(150, 238, 97, 25);
		btnCanal_12.addActionListener(action);
		frame.getContentPane().add(btnCanal_12);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(150, 29, 224, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
	
	public class Milistener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == btnCanal_1)
			{

			}

			if (e.getSource()==btnCanal_2)
			{

			}

			if(e.getSource() == btnCanal_3)
			{

			}

			if (e.getSource() == btnCanal_4)
			{

			}

			if ( e.getSource() == btnCanal_5)
			{
				
			}

			if(e.getSource() == btnCanal_6)
			{

			}

			if(e.getSource() == btnCanal_7)
			{

			}

			if(e.getSource() == btnCanal_8)
			{

			}

			if(e.getSource() == btnCanal_9)
			{
				
			}

			if(e.getSource() == btnCanal_10)
			{
				
			}

			if(e.getSource() == btnCanal_11)
			{
				
			}

			if(e.getSource() == btnCanal_12)
			{
				
			}

			if(e.getSource() == button_atras)
			{
				radio.setTipo(false);
			}

			if(e.getSource() == button_siguiente)
			{
				radio.setTipo(true);
				radio.cambioEstacion(radio.isTipo(), radio.isTipoFrecuencia());
			}

			if ( e.getSource() == btnSave)
			{

			}

			if(e.getSource() == btnOnOff)
			{
				cont1++;
				if (cont1 == 1) {
					radio.apagar();
				}
				if (cont1 == 2) {
					radio.encender();
					cont1 = 0;
				}

			}
			if(e.getSource() == btnAmFm)
			{
				
				cont++;
				if (cont == 1) {
					radio.setTipoFrecuencia(false);
					JOptionPane.showMessageDialog(null, "Ahora se encuentra en frecuencia: AM");
					radio.cambioTipoFrecuencia(radio.isTipoFrecuencia());
				}
				if (cont == 2) {
					radio.setTipoFrecuencia(true);
					JOptionPane.showMessageDialog(null, "Ahora se encuentra en frecuencia: PM");
					cont = 0;
					radio.cambioTipoFrecuencia(radio.isTipoFrecuencia());
				}
			}
		}
	}
}



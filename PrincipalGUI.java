/**
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
import java.awt.event.ComponentEvent;

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
	private JTextField txtEstacion;
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
	private boolean on = false;
	private boolean AM = true;
	Controlador radio = new Controlador();
	private JPanel panelRadio;
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
		frame.setBounds(100, 100, 634, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panelRadio = new JPanel();
		panelRadio.setBounds(12, 13, 596, 248);
		frame.getContentPane().add(panelRadio);
		panelRadio.setLayout(null);
		
		btnAmFm = new JButton("AM / FM");
		btnAmFm.setBounds(25, 82, 97, 25);
		panelRadio.add(btnAmFm);
		
		btnOnOff = new JButton("ON / OFF");
		btnOnOff.setBounds(25, 13, 97, 25);
		panelRadio.add(btnOnOff);
		
		txtEstacion = new JTextField();
		txtEstacion.setBounds(143, 31, 224, 40);
		panelRadio.add(txtEstacion);
		txtEstacion.setEditable(false);
		txtEstacion.setColumns(10);
		txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
		
		button_atras = new JButton("<");
		button_atras.setBounds(433, 30, 64, 25);
		panelRadio.add(button_atras);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(465, 124, 97, 25);
		panelRadio.add(btnSave);
		
		button_siguiente = new JButton(">");
		button_siguiente.setBounds(509, 30, 70, 25);
		panelRadio.add(button_siguiente);
		
		btnCanal_4 = new JButton("Canal 4");
		btnCanal_4.setBounds(344, 124, 97, 25);
		panelRadio.add(btnCanal_4);
		
		btnCanal_8 = new JButton("Canal 8");
		btnCanal_8.setBounds(344, 167, 97, 25);
		panelRadio.add(btnCanal_8);
		
		btnCanal_12 = new JButton("Canal 12");
		btnCanal_12.setBounds(344, 211, 97, 25);
		panelRadio.add(btnCanal_12);
		
		btnCanal_11 = new JButton("Canal 11");
		btnCanal_11.setBounds(241, 211, 91, 25);
		panelRadio.add(btnCanal_11);
		
		btnCanal_7 = new JButton("Canal 7");
		btnCanal_7.setBounds(237, 167, 95, 25);
		panelRadio.add(btnCanal_7);
		
		btnCanal_3 = new JButton("Canal 3");
		btnCanal_3.setBounds(241, 124, 91, 25);
		panelRadio.add(btnCanal_3);
		
		btnCanal_2 = new JButton("Canal 2");
		btnCanal_2.setBounds(134, 124, 91, 25);
		panelRadio.add(btnCanal_2);
		
		btnCanal_6 = new JButton("Canal 6");
		btnCanal_6.setBounds(134, 167, 91, 25);
		panelRadio.add(btnCanal_6);
		
		btnCanal_10 = new JButton("Canal 10");
		btnCanal_10.setBounds(134, 211, 91, 25);
		panelRadio.add(btnCanal_10);
		
		btnCanal_9 = new JButton("Canal 9");
		btnCanal_9.setBounds(25, 211, 97, 25);
		panelRadio.add(btnCanal_9);
		
		btnCanal_5 = new JButton("Canal 5");
		btnCanal_5.setBounds(25, 167, 97, 25);
		panelRadio.add(btnCanal_5);
		
		btnCanal_1 = new JButton("Canal 1");
		btnCanal_1.setBounds(25, 124, 97, 25);
		panelRadio.add(btnCanal_1);
		btnCanal_1.addActionListener(action);
		btnCanal_5.addActionListener(action);
		btnCanal_9.addActionListener(action);
		btnCanal_10.addActionListener(action);
		btnCanal_6.addActionListener(action);
		btnCanal_2.addActionListener(action);
		btnCanal_3.addActionListener(action);
		btnCanal_7.addActionListener(action);
		btnCanal_11.addActionListener(action);
		btnCanal_12.addActionListener(action);
		btnCanal_8.addActionListener(action);
		btnCanal_4.addActionListener(action);
		button_siguiente.addActionListener(action);
		btnSave.addActionListener(action);
		button_atras.addActionListener(action);
		btnOnOff.addActionListener(action);
		btnAmFm.addActionListener(action);
		
		
		
		
	}
	
	public class Milistener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == btnCanal_1)
			{
				
				if(radio.seleccionarEstacion(radio.getTipoFrecuencia(), 0) != 0.0)
				{
					txtEstacion.setText(String.format("%.1f",radio.seleccionarEstacion(radio.getTipoFrecuencia(),0) ));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El canal de la frecuencia que eligio esta vacio.");
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
			}

			if (e.getSource()==btnCanal_2)
			{
				if(radio.seleccionarEstacion(radio.getTipoFrecuencia(), 1) != 0.0)
				{
					txtEstacion.setText(String.format("%.1f",radio.seleccionarEstacion(radio.getTipoFrecuencia(),1) ));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El canal de la frecuencia que eligio esta vacio.");
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
			}

			if(e.getSource() == btnCanal_3)
			{
				if(radio.seleccionarEstacion(radio.getTipoFrecuencia(), 2) != 0.0)
				{
					txtEstacion.setText(String.format("%.1f",radio.seleccionarEstacion(radio.getTipoFrecuencia(),2) ));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El canal de la frecuencia que eligio esta vacio.");
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
			}

			if (e.getSource() == btnCanal_4)
			{
				if(radio.seleccionarEstacion(radio.getTipoFrecuencia(), 3) != 0.0)
				{
					txtEstacion.setText(String.format("%.1f",radio.seleccionarEstacion(radio.getTipoFrecuencia(),3) ));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El canal de la frecuencia que eligio esta vacio.");
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
			}

			if ( e.getSource() == btnCanal_5)
			{
				if(radio.seleccionarEstacion(radio.getTipoFrecuencia(), 4) != 0.0)
				{
					txtEstacion.setText(String.format("%.1f",radio.seleccionarEstacion(radio.getTipoFrecuencia(),4) ));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El canal de la frecuencia que eligio esta vacio.");
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
			}

			if(e.getSource() == btnCanal_6)
			{
				if(radio.seleccionarEstacion(radio.getTipoFrecuencia(), 5) != 0.0)
				{
					txtEstacion.setText(String.format("%.1f",radio.seleccionarEstacion(radio.getTipoFrecuencia(),5) ));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El canal de la frecuencia que eligio esta vacio.");
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
			}

			if(e.getSource() == btnCanal_7)
			{
				if(radio.seleccionarEstacion(radio.getTipoFrecuencia(), 6) != 0.0)
				{
					txtEstacion.setText(String.format("%.1f",radio.seleccionarEstacion(radio.getTipoFrecuencia(),6) ));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El canal de la frecuencia que eligio esta vacio.");
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
			}

			if(e.getSource() == btnCanal_8)
			{
				if(radio.seleccionarEstacion(radio.getTipoFrecuencia(), 7) != 0.0)
				{
					txtEstacion.setText(String.format("%.1f",radio.seleccionarEstacion(radio.getTipoFrecuencia(),7) ));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El canal de la frecuencia que eligio esta vacio.");
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
			}

			if(e.getSource() == btnCanal_9)
			{
				if(radio.seleccionarEstacion(radio.getTipoFrecuencia(), 8) != 0.0)
				{
					txtEstacion.setText(String.format("%.1f",radio.seleccionarEstacion(radio.getTipoFrecuencia(),8) ));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El canal de la frecuencia que eligio esta vacio.");
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
			}

			if(e.getSource() == btnCanal_10)
			{
				if(radio.seleccionarEstacion(radio.getTipoFrecuencia(), 9) != 0.0)
				{
					txtEstacion.setText(String.format("%.1f",radio.seleccionarEstacion(radio.getTipoFrecuencia(),9) ));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El canal de la frecuencia que eligio esta vacio.");
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
			}

			if(e.getSource() == btnCanal_11)
			{
				if(radio.seleccionarEstacion(radio.getTipoFrecuencia(), 10) != 0.0)
				{
					txtEstacion.setText(String.format("%.1f",radio.seleccionarEstacion(radio.getTipoFrecuencia(),10) ));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El canal de la frecuencia que eligio esta vacio.");
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
			}

			if(e.getSource() == btnCanal_12)
			{
				if(radio.seleccionarEstacion(radio.getTipoFrecuencia(), 11) != 0.0)
				{
					txtEstacion.setText(String.format("%.1f",radio.seleccionarEstacion(radio.getTipoFrecuencia(),11) ));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El canal de la frecuencia que eligio esta vacio.");
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
			}

			if(e.getSource() == button_atras)
			{
				radio.cambioEstacion(false, radio.getTipoFrecuencia());
				txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
			}

			if(e.getSource() == button_siguiente)
			{
				radio.cambioEstacion(true, radio.getTipoFrecuencia());
				txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				
			}

			if ( e.getSource() == btnSave)
			{
				try
				{
					String canales[] = new String[12];
					for(int i = 0; i < 12; i++)
					{
						canales[i] = String.valueOf(i+1);
					}
					JFrame frame = new JFrame("Canal de guardado");
					String canale = (String) JOptionPane.showInputDialog(frame, "¿Canal en que desea guardar la estacion?", "Guarda", JOptionPane.QUESTION_MESSAGE, null, canales, canales[0]);
					int canal = Integer.parseInt(canale);
					radio.guardarEstacion(radio.getEstacion(), radio.getTipoFrecuencia(), (canal-1) );
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Se ha cancelado el guardado.");
				}
			}

			if(e.getSource() == btnOnOff)
			{
				cont1++;
				if (cont1 == 1) 
				{
					radio.encenderApagar(radio.getEstado());
					for(java.awt.Component component : panelRadio.getComponents())
					{
						component.setEnabled(false);
					}
					btnOnOff.setEnabled(true);
					JOptionPane.showMessageDialog(null, "La radio se ha apagado");
					txtEstacion.setText(" ");
				}
				if (cont1 == 2) 
				{
					radio.encenderApagar(radio.getEstado());
					cont1 = 0;
					for (java.awt.Component componente : panelRadio.getComponents()) 
					{
						componente.setEnabled(true);
					}
					JOptionPane.showMessageDialog(null, "La radio se ha encendido");
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}

			}
			if(e.getSource() == btnAmFm)
			{
				
				cont++;
				if (cont == 1) {
					//radio.setTipoFrecuencia(false);
					JOptionPane.showMessageDialog(null, "Ahora se encuentra en frecuencia: AM");
					radio.cambioTipoFrecuencia(radio.getTipoFrecuencia());
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
				if (cont == 2) {
					//radio.setTipoFrecuencia(true);
					JOptionPane.showMessageDialog(null, "Ahora se encuentra en frecuencia: FM");
					cont = 0;
					radio.cambioTipoFrecuencia(radio.getTipoFrecuencia());
					txtEstacion.setText(String.format("%.1f", radio.getEstacion()));
				}
			}
		}
	}

}



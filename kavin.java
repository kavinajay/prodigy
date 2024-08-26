package temperature;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class kavin {

	private JFrame frmTemperatureConvertion;
	private JTextField C;
	private JTextField t;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kavin window = new kavin();
					window.frmTemperatureConvertion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kavin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTemperatureConvertion = new JFrame();
		frmTemperatureConvertion.setTitle("TEMPERATURE CONVERTION");
		frmTemperatureConvertion.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmTemperatureConvertion.getContentPane().setForeground(Color.GREEN);
		frmTemperatureConvertion.setBounds(100, 100, 450, 300);
		frmTemperatureConvertion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTemperatureConvertion.getContentPane().setLayout(null);
		frmTemperatureConvertion.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JLabel lblNewLabel = new JLabel("ENTER CELSIUS");
		lblNewLabel.setBounds(94, 62, 124, 49);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmTemperatureConvertion.getContentPane().add(lblNewLabel);
		
		C = new JTextField();
		C.setBounds(240, 77, 86, 20);
		frmTemperatureConvertion.getContentPane().add(C);
		C.setColumns(10);
		
		JButton btnNewButton = new JButton("CONVERT INTO FRENHEIT");
		btnNewButton.setBounds(87, 193, 220, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float ce,k;
				ce=Float.parseFloat(C.getText());
				k=(float) ((float) ce+273.15);
				ce=(float) ((ce*1.8)+32);
				
				t2.setText(String.valueOf(k));
				t.setText(String.valueOf(ce));
			}
		});
		frmTemperatureConvertion.getContentPane().add(btnNewButton);
		
		t = new JTextField();
		t.setBounds(240, 108, 86, 20);
		t.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmTemperatureConvertion.getContentPane().add(t);
		t.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("FAHRENHEIT");
		lblNewLabel_1.setBounds(94, 111, 100, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmTemperatureConvertion.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CELSIUS TO FAHRENHEIT CONVERTER");
		lblNewLabel_2.setBounds(83, 25, 362, 14);

		
		
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmTemperatureConvertion.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("KELVIN");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel_3.setBounds(94, 139, 46, 14);
		frmTemperatureConvertion.getContentPane().add(lblNewLabel_3);
		
		t2 = new JTextField();
		t2.setBounds(240, 137, 86, 20);
		frmTemperatureConvertion.getContentPane().add(t2);
		t2.setColumns(10);
	}
}

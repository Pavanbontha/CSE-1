package registrastionl;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class register {

	private JFrame frame;
	private JTextField TB1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register window = new register();
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
	public register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 1180, 857);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1166, 10);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(446, 48, 389, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME  :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(59, 180, 121, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" BRANCH :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(59, 233, 121, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("GENDER  :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(59, 289, 100, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("LANGUAGE  :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(59, 337, 121, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		TB1 = new JTextField();
		TB1.setFont(new Font("Tahoma", Font.BOLD, 15));
		TB1.setBounds(205, 187, 226, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "IT", "EEE", "ECE"}));
		CB1.setFont(new Font("Tahoma", Font.BOLD, 15));
		CB1.setBounds(190, 239, 241, 22);
		frame.getContentPane().add(CB1);
		
		JRadioButton R1 = new JRadioButton("FEMALE");
		R1.setForeground(Color.GREEN);
		R1.setFont(new Font("Tahoma", Font.BOLD, 15));
		R1.setBounds(194, 292, 95, 23);
		frame.getContentPane().add(R1);
		
		JRadioButton R2 = new JRadioButton("MALE");
		R2.setFont(new Font("Tahoma", Font.BOLD, 15));
		R2.setBounds(310, 292, 111, 23);
		frame.getContentPane().add(R2);
		
		JRadioButton R3 = new JRadioButton("OTHERS");
		R3.setFont(new Font("Tahoma", Font.BOLD, 15));
		R3.setBounds(458, 292, 111, 23);
		frame.getContentPane().add(R3);
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(R1);
		genderGroup.add(R2);
		genderGroup.add(R3);
		
		JCheckBox C1 = new JCheckBox("C");
		C1.setFont(new Font("Tahoma", Font.BOLD, 16));
		C1.setBounds(190, 340, 99, 23);
		frame.getContentPane().add(C1);
		
		JCheckBox C2 = new JCheckBox("PYTHON");
		C2.setFont(new Font("Tahoma", Font.BOLD, 15));
		C2.setBounds(332, 340, 99, 23);
		frame.getContentPane().add(C2);
		
		JCheckBox C3 = new JCheckBox("JAVA");
		C3.setFont(new Font("Tahoma", Font.BOLD, 15));
		C3.setBounds(470, 342, 99, 23);
		frame.getContentPane().add(C3);
		
		JButton btnNewButton = new JButton("SUCCESS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = TB1.getText();
				String branch = (String)CB1.getSelectedItem();
				String gender = null;
				if(R1.isSelected()) {
					gender = R1.getText();
				} else if(R2.isSelected()) {
					gender = R2.getText();
				}
				else if(R3.isSelected()) {
					gender = R3.getText();
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Please select Gender.");
					return;
				}
				
				List<String> languages = new ArrayList<>();
				
				if(C1.isSelected()) {
					languages.add(C1.getText());
				}
				if(C2.isSelected()) {
					languages.add(C2.getText());
				}
				
				
				String details = "Name: "+name+"\n"
						+ "Branch: "+branch+"\n"
						+ "Gender: "+gender+"\n"
								+ "Languages: ";
				
				for(String language : languages) {
					details += language+" ";
				}
				
				JOptionPane.showConfirmDialog(btnNewButton, details);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		btnNewButton.setBounds(436, 464, 274, 40);
		frame.getContentPane().add(btnNewButton);
	}
}

package gui_java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window;

public class Gui_login {
	static Gui_login window;
	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Gui_login();
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
	public Gui_login() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(10, 10, 462, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login System");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(134, 37, 177, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.ITALIC, 24));
		lblUsername.setBounds(32, 110, 125, 31);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.ITALIC, 24));
		lblPassword.setBounds(32, 173, 125, 31);
		frame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(157, 110, 197, 31);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(212, 152, -27, 20);
		frame.getContentPane().add(passwordField);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(157, 173, 197, 31);
		frame.getContentPane().add(txtPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password=txtPassword.getText();
				String username=txtUsername.getText();
				
				if (password.contains("password")&&username.contains("Prof"))
				{
					txtPassword.setText(null);
					txtUsername.setText(null);
					//Gui_login window = new Gui_login();
					window.frame.setVisible(false);
					A_M.main(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Login details","Login error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
			}
		});
		btnNewButton.setBounds(42, 225, 101, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Arial", Font.PLAIN, 24));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(180, 225, 101, 37);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Arial", Font.PLAIN, 24));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame=new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm you want to exit","Login systems",
				JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
				System.exit(0);
				}
			}
		});
		btnExit.setBounds(325, 225, 89, 37);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(32, 215, 368, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(32, 79, 368, 2);
		frame.getContentPane().add(separator_1);
	}
}

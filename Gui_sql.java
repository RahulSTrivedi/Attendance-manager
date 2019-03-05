package gui_java;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;

public class Gui_sql {

	private JFrame frame;

	/**
	 * Launch the application.
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_sql window = new Gui_sql();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Class.forName("com.mysql.jdbc.driver");
		
	}

	/**
	 * Create the application.
	 */
	public Gui_sql() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

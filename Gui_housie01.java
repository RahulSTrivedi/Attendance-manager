package gui_java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.stream.IntStream;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Gui_housie01 {

	private JFrame frame;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_0;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_housie01 window = new Gui_housie01();
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
	public Gui_housie01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 604, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblYourCard = new JLabel("Your Card:");
		lblYourCard.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		lblYourCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourCard.setBounds(10, 11, 102, 30);
		frame.getContentPane().add(lblYourCard);
		
		table = new JTable();
		table.setBounds(66, 124, 1, 1);
		frame.getContentPane().add(table);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 52, 107, 61);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(233, 52, 107, 61);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(350, 52, 107, 61);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(5, 126, 107, 61);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(467, 52, 107, 61);
		frame.getContentPane().add(textField_5);
		
		textField_0 = new JTextField();
		textField_0.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
			}
		});
		textField_0.setColumns(10);
		textField_0.setBounds(5, 52, 107, 61);
		frame.getContentPane().add(textField_0);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(116, 126, 107, 61);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(233, 124, 107, 61);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(350, 126, 107, 61);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(467, 126, 107, 61);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(5, 201, 107, 61);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(116, 201, 107, 61);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(233, 199, 107, 61);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(350, 201, 107, 61);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(467, 201, 107, 61);
		frame.getContentPane().add(textField_14);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// First column
				Random rand0=new Random();
				int randomNum0=rand0.nextInt(9)+1;
				textField_0.setText(Integer.toString(randomNum0));
				 
				Random rand1=new Random();
			    int randomNum1=rand1.nextInt(9)+1;
			    textField_4.setText(Integer.toString(randomNum1));
 
				Random rand2=new Random();
				int randomNum2=rand2.nextInt(9)+1;
				textField_10.setText(Integer.toString(randomNum2));
				
				//Second column
				Random rand3=new Random();
				int randomNum3=rand3.nextInt(9)+10;
				textField_1.setText(Integer.toString(randomNum3));
				 
				Random rand4=new Random();
			    int randomNum4=rand4.nextInt(9)+10;
			    textField_6.setText(Integer.toString(randomNum4));
 
				Random rand5=new Random();
				int randomNum5=rand5.nextInt(9)+10;
				textField_11.setText(Integer.toString(randomNum5));
				
				//Third column
				Random rand6=new Random();
				int randomNum6=rand6.nextInt(9)+20;
				textField_2.setText(Integer.toString(randomNum6));
				 
				Random rand7=new Random();
				int randomNum7=rand7.nextInt(9)+20;
				textField_7.setText(Integer.toString(randomNum7));
 
				Random rand8=new Random();
				int randomNum8=rand8.nextInt(9)+20;
				textField_12.setText(Integer.toString(randomNum8));
				
				//fourth column
				Random rand9=new Random();
				int randomNum9=rand9.nextInt(9)+30;
				textField_3.setText(Integer.toString(randomNum9));
				 
				Random rand10=new Random();
				int randomNum10=rand10.nextInt(9)+30;
				textField_8.setText(Integer.toString(randomNum10));
 
				Random rand11=new Random();
				int randomNum11=rand11.nextInt(9)+30;
				textField_13.setText(Integer.toString(randomNum11));
				
				//Fifth column
				Random rand12=new Random();
				int randomNum12=rand12.nextInt(9)+40;
				textField_5.setText(Integer.toString(randomNum12));
				 
				Random rand13=new Random();
			    int randomNum13=rand13.nextInt(9)+40;
			    textField_9.setText(Integer.toString(randomNum13));
 
				Random rand14=new Random();
				int randomNum14=rand14.nextInt(9)+40;
				textField_14.setText(Integer.toString(randomNum14));
			    
		 }
		});
		btnGenerate.setForeground(new Color(0, 0, 0));
		btnGenerate.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		btnGenerate.setBounds(156, 18, 129, 23);
		frame.getContentPane().add(btnGenerate);
	}
}

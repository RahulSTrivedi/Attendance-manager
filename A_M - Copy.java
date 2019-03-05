package gui_java;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.EventQueue;

import com.toedter.calendar.JCalendar;

public class A_M {

	private JFrame frame;
	private JTextField textField_oa;

	private JComboBox comboBox_0;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
    private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private JComboBox comboBox_9;
	private JComboBox comboBox_10;
	
	private JLabel lblNewLabel_2;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;
	private JLabel label_31;
	private JLabel label_32;
	private JLabel label_33;
	private JLabel label_34;
	private JLabel label_35;
	private JLabel label_36;
	private JTextField textField_sa;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A_M window = new A_M();
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
	public A_M() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 128, 128));
		frame.setBounds(0, 0, 1350, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 165, 0));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		panel.setBounds(20, 11, 1300, 670);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		/*JLabel backlabel = new JLabel("");
		backlabel.setIcon(new ImageIcon(A_M.class.getResource("/gui_java/mycollege.jpg")));
		backlabel.setHorizontalAlignment(SwingConstants.CENTER);
		backlabel.setFont(new Font("Vani", Font.PLAIN, 38));
		backlabel.setBounds(10, 11, 1280, 145);
		panel.add(backlabel);
		*/
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.DARK_GRAY);
		panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_6.setBounds(31, 61, 1259, 10);
		panel.add(panel_6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(Color.DARK_GRAY);
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setBounds(757, 22, 10, 628);
		panel.add(panel_4);
		
		
		
		
		JLabel lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Vani", Font.PLAIN, 38));
		lblNewLabel.setBounds(466, 11, 281, 60);
		panel.add(lblNewLabel);
		
		JLabel lblSapId = new JLabel("Sap Id");
		lblSapId.setHorizontalAlignment(SwingConstants.CENTER);
		lblSapId.setFont(new Font("Vani", Font.PLAIN, 38));
		lblSapId.setBounds(215, 22, 177, 60);
		panel.add(lblSapId);
		
		comboBox_0 = new JComboBox();
		comboBox_0.setModel(new DefaultComboBoxModel(new String[] {"/", "All Absent", "All Present"}));
		comboBox_0.setBounds(787, 11, 189, 42);
		panel.add(comboBox_0);
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(Color.DARK_GRAY);
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_5.setBackground(Color.DARK_GRAY);
		panel_5.setBounds(1045, 22, 10, 628);
		panel.add(panel_5);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(comboBox_0.getSelectedItem().equals("All Absent"))
				{
					comboBox_1.setSelectedItem("Absent");
					comboBox_2.setSelectedItem("Absent");
					comboBox_3.setSelectedItem("Absent");
					comboBox_4.setSelectedItem("Absent");
					comboBox_5.setSelectedItem("Absent");
					comboBox_6.setSelectedItem("Absent");
					comboBox_7.setSelectedItem("Absent");
					comboBox_8.setSelectedItem("Absent");
					comboBox_9.setSelectedItem("Absent");
					comboBox_10.setSelectedItem("Absent");
				}
				else if (comboBox_0.getSelectedItem().equals("All Present"))
				{
					comboBox_1.setSelectedItem("Present");
					comboBox_2.setSelectedItem("Present");
					comboBox_3.setSelectedItem("Present");
					comboBox_4.setSelectedItem("Present");
					comboBox_5.setSelectedItem("Present");
					comboBox_6.setSelectedItem("Present");
					comboBox_7.setSelectedItem("Present");
					comboBox_8.setSelectedItem("Present");
					comboBox_9.setSelectedItem("Present");
					comboBox_10.setSelectedItem("Present");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(A_M.class.getResource("/gui_java/downarrow3.png")));
		btnNewButton.setBounds(986, 11, 49, 48);
		panel.add(btnNewButton);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_7.setBackground(Color.DARK_GRAY);
		panel_7.setBounds(31, 163, 1024, 10);
		panel.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_8.setBackground(Color.DARK_GRAY);
		panel_8.setBounds(31, 223, 1024, 10);
		panel.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_9.setBackground(Color.DARK_GRAY);
		panel_9.setBounds(31, 283, 1024, 10);
		panel.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_10.setBackground(Color.DARK_GRAY);
		panel_10.setBounds(31, 343, 1024, 10);
		panel.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_11.setBackground(Color.DARK_GRAY);
		panel_11.setBounds(31, 403, 1024, 10);
		panel.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_12.setBackground(Color.DARK_GRAY);
		panel_12.setBounds(31, 463, 1024, 10);
		panel.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_13.setBackground(Color.DARK_GRAY);
		panel_13.setBounds(31, 523, 1024, 10);
		panel.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_14.setBackground(Color.DARK_GRAY);
		panel_14.setBounds(31, 582, 1024, 10);
		panel.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_15.setBackground(Color.DARK_GRAY);
		panel_15.setBounds(31, 640, 1024, 10);
		panel.add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_16.setBackground(Color.DARK_GRAY);
		panel_16.setBounds(31, 115, 1024, 10);
		panel.add(panel_16);
		
		JLabel lblFnameLastname = new JLabel("Firstname Middlename Lastname");
		lblFnameLastname.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				textField_sa.setText("Attendance 32%");
			}
		});
		lblFnameLastname.setFont(new Font("Arial", Font.PLAIN, 18));
		lblFnameLastname.setBounds(466, 90, 311, 14);
		panel.add(lblFnameLastname);
		
		JLabel label_10 = new JLabel("Firstname Middlename Lastname");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				textField_sa.setText("Attendance 100%");
			}
		});
		label_10.setFont(new Font("Arial", Font.PLAIN, 18));
		label_10.setBounds(466, 138, 281, 14);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Firstname Middlename Lastname");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				textField_sa.setText("Attendance 56%");
			}
		});
		label_11.setFont(new Font("Arial", Font.PLAIN, 18));
		label_11.setBounds(466, 193, 281, 14);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("Firstname Middlename Lastname");
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				textField_sa.setText("Attendance 49%");
			}
		});
		label_12.setFont(new Font("Arial", Font.PLAIN, 18));
		label_12.setBounds(466, 253, 281, 14);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("Firstname Middlename Lastname");
		label_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				textField_sa.setText("Attendance 90%");
			}
		});
		label_13.setFont(new Font("Arial", Font.PLAIN, 18));
		label_13.setBounds(466, 304, 281, 14);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("Firstname Middlename Lastname");
		label_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				textField_sa.setText("Attendance 0%");
			}
		});
		label_14.setFont(new Font("Arial", Font.PLAIN, 18));
		label_14.setBounds(466, 372, 281, 14);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("Firstname Middlename Lastname");
		label_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				textField_sa.setText("Attendance 71%");
			}
		});
		label_15.setFont(new Font("Arial", Font.PLAIN, 18));
		label_15.setBounds(466, 432, 281, 14);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("Firstname Middlename Lastname");
		label_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				textField_sa.setText("Attendance 76%");
			}
		});
		label_16.setFont(new Font("Arial", Font.PLAIN, 18));
		label_16.setBounds(466, 494, 281, 14);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("Firstname Middlename Lastname");
		label_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				textField_sa.setText("Attendance 50%");
			}
		});
		label_17.setFont(new Font("Arial", Font.PLAIN, 18));
		label_17.setBounds(466, 551, 281, 14);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("Firstname Middlename Lastname");
		label_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				textField_sa.setText("Attendance 40%");
			}
		});
		label_18.setFont(new Font("Arial", Font.PLAIN, 18));
		label_18.setBounds(466, 615, 281, 14);
		panel.add(label_18);
		
		lblNewLabel_2 = new JLabel("1");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(166, 82, 36, 22);
		panel.add(lblNewLabel_2);
		
		label_28 = new JLabel("2");
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		label_28.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_28.setBounds(166, 130, 36, 22);
		panel.add(label_28);
		
		label_29 = new JLabel("3");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_29.setBounds(166, 193, 36, 22);
		panel.add(label_29);
		
		label_30 = new JLabel("4");
		label_30.setHorizontalAlignment(SwingConstants.CENTER);
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_30.setBounds(166, 253, 36, 22);
		panel.add(label_30);
		
		label_31 = new JLabel("5");
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_31.setBounds(166, 313, 36, 22);
		panel.add(label_31);
		
		label_32 = new JLabel("6");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_32.setBounds(166, 373, 36, 22);
		panel.add(label_32);
		
		label_33 = new JLabel("7");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_33.setBounds(166, 433, 36, 22);
		panel.add(label_33);
		
		label_34 = new JLabel("8");
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_34.setBounds(166, 489, 36, 22);
		panel.add(label_34);
		
		label_35 = new JLabel("9");
		label_35.setHorizontalAlignment(SwingConstants.CENTER);
		label_35.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_35.setBounds(166, 549, 36, 22);
		panel.add(label_35);
		
		label_36 = new JLabel("10");
		label_36.setHorizontalAlignment(SwingConstants.CENTER);
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_36.setBounds(166, 615, 36, 22);
		panel.add(label_36);
		
		comboBox_1= new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"/", "Present", "Absent"}));
		comboBox_1.setBounds(777, 74, 258, 30);
		panel.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"/", "Present", "Absent"}));
		comboBox_2.setBounds(777, 124, 258, 30);
		panel.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"/", "Present", "Absent"}));
		comboBox_3.setBounds(777, 184, 258, 30);
		panel.add(comboBox_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"/", "Present", "Absent"}));
		comboBox_4.setBounds(777, 244, 258, 30);
		panel.add(comboBox_4);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"/", "Present", "Absent"}));
		comboBox_5.setBounds(777, 302, 258, 30);
		panel.add(comboBox_5);
		
		comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"/", "Present", "Absent"}));
		comboBox_6.setBounds(777, 362, 258, 30);
		panel.add(comboBox_6);
		
		comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"/", "Present", "Absent"}));
		comboBox_7.setBounds(777, 422, 258, 30);
		panel.add(comboBox_7);
		
		comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"/", "Present", "Absent"}));
		comboBox_8.setBounds(777, 484, 258, 30);
		panel.add(comboBox_8);
		
		comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"/", "Present", "Absent"}));
		comboBox_9.setBounds(777, 544, 258, 30);
		panel.add(comboBox_9);
		
		comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"/", "Present", "Absent"}));
		comboBox_10.setBounds(777, 599, 258, 30);
		panel.add(comboBox_10);
		
		JLabel lblNewLabel_3 = new JLabel("Overall attendane %");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(1075, 532, 215, 48);
		panel.add(lblNewLabel_3);
		
		textField_oa = new JTextField();
		textField_oa.setBounds(1073, 587, 217, 20);
		panel.add(textField_oa);
		textField_oa.setColumns(10);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"Lecturer's Name", "Neepa", "Nancy", "Aruna", "Pranit", "Kiran", "Sindhu", "Narendra"}));
		comboBox_11.setBounds(1065, 358, 222, 47);
		panel.add(comboBox_11);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{	// For Sr no.
				String lb=lblNewLabel_2.getText();
				int i=Integer.parseInt(lb);
				i=i+10;
				lb=""+i;
				if(i<=51)	
				lblNewLabel_2.setText(lb);
				
				String lb1=label_28.getText();
				int i1=Integer.parseInt(lb1);
				i1=i1+10;
				lb1=""+i1;
				if(i1<=52)	
					label_28.setText(lb1);
				
				String lb2=label_29.getText();
				int i2=Integer.parseInt(lb2);
				i2=i2+10;
				lb2=""+i2;
				if(i2<=53)	
					label_29.setText(lb2);
				
				String lb3=label_30.getText();
				int i3=Integer.parseInt(lb3);
				i3=i3+10;
				lb3=""+i3;
				if(i3<=54)	
					label_30.setText(lb3);
				
				String lb4=label_31.getText();
				int i4=Integer.parseInt(lb4);
				i4=i4+10;
				lb4=""+i4;
				if(i4<=55)	
					label_31.setText(lb4);
				
				String lb5=label_32.getText();
				int i5=Integer.parseInt(lb5);
				i5=i5+10;
				lb5=""+i5;
				if(i5<=56)	
					label_32.setText(lb5);
				
				String lb6=label_33.getText();
				int i6=Integer.parseInt(lb6);
				i6=i6+10;
				lb6=""+i6;
				if(i6<=57)	
					label_33.setText(lb6);
				
				String lb7=label_34.getText();
				int i7=Integer.parseInt(lb7);
				i7=i7+10;
				lb7=""+i7;
				if(i7<=58)	
					label_34.setText(lb7);
				
				String lb8=label_35.getText();
				int i8=Integer.parseInt(lb8);
				i8=i8+10;
				lb8=""+i8;
				if(i8<=59)	
					label_35.setText(lb8);
				
				String lb9=label_36.getText();
				int i9=Integer.parseInt(lb9);
				i9=i9+10;
				lb9=""+i9;
				if(i9<=60)	
					label_36.setText(lb9);
				
			}
		});
		btnNext.setBounds(1193, 316, 97, 30);
		panel.add(btnNext);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String lb=lblNewLabel_2.getText();
				int i=Integer.parseInt(lb);
				i=i-10;
				lb=""+i;
				if(i>=1)	
				lblNewLabel_2.setText(lb);
				
				String lb1=label_28.getText();
				int i1=Integer.parseInt(lb1);
				i1=i1-10;
				lb1=""+i1;
				if(i1>=2)	
					label_28.setText(lb1);
				
				String lb2=label_29.getText();
				int i2=Integer.parseInt(lb2);
				i2=i2-10;
				lb2=""+i2;
				if(i2>=3)	
					label_29.setText(lb2);
				
				String lb3=label_30.getText();
				int i3=Integer.parseInt(lb3);
				i3=i3-10;
				lb3=""+i3;
				if(i3>=4)	
					label_30.setText(lb3);
				
				String lb4=label_31.getText();
				int i4=Integer.parseInt(lb4);
				i4=i4-10;
				lb4=""+i4;
				if(i4>=5)	
					label_31.setText(lb4);
				
				String lb5=label_32.getText();
				int i5=Integer.parseInt(lb5);
				i5=i5-10;
				lb5=""+i5;
				if(i5>=6)	
					label_32.setText(lb5);
				
				String lb6=label_33.getText();
				int i6=Integer.parseInt(lb6);
				i6=i6-10;
				lb6=""+i6;
				if(i6>=7)	
					label_33.setText(lb6);
				
				String lb7=label_34.getText();
				int i7=Integer.parseInt(lb7);
				i7=i7-10;
				lb7=""+i7;
				if(i7>=8)	
					label_34.setText(lb7);
				
				String lb8=label_35.getText();
				int i8=Integer.parseInt(lb8);
				i8=i8-10;
				lb8=""+i8;
				if(i8>=9)	
					label_35.setText(lb8);
				
				String lb9=label_36.getText();
				int i9=Integer.parseInt(lb9);
				i9=i9-10;
				lb9=""+i9;
				if(i9>=10)	
					label_36.setText(lb9);
				
	
			}
		});
		btnPrevious.setBounds(1065, 316, 97, 30);
		panel.add(btnPrevious);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			String s[]=new String[10];
			s[0]=comboBox_1.getSelectedItem().toString();
			s[1]=comboBox_2.getSelectedItem().toString();
			s[2]=comboBox_3.getSelectedItem().toString();
			s[3]=comboBox_4.getSelectedItem().toString();
			s[4]=comboBox_5.getSelectedItem().toString();
			s[5]=comboBox_6.getSelectedItem().toString();
			s[6]=comboBox_7.getSelectedItem().toString();
			s[7]=comboBox_8.getSelectedItem().toString();
			s[8]=comboBox_9.getSelectedItem().toString();
			s[9]=comboBox_10.getSelectedItem().toString();
			int j = 0;
			for(int i=0;i<10;i++)
			if(s[i]=="Present")
			{
				j++;
			}
			textField_oa.setText(""+j*10);
			
			//j*10;
			 /*String host= "jdbc:mysql://localhost:3306/myproject";
             String uname="root";
             String upassword="";
             Connection con;
			try {
				//attendance_management.forName("com.mysql.jdbc.Driver"); 
				con = DriverManager.getConnection(host, uname, upassword);           
             String updateTableSQL = "UPDATE java SET Attendance = 1 WHERE Sap_id = ?";
             int i=43;
             PreparedStatement ps =con.prepareStatement(updateTableSQL);
             ps.setInt(1, i);
      
             ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubmit.setBounds(1065, 490, 225, 43);
		panel.add(btnSubmit);
		
		textField_sa = new JTextField();
		textField_sa.setHorizontalAlignment(SwingConstants.LEFT);
		textField_sa.setEditable(false);
		textField_sa.setColumns(10);
		textField_sa.setBounds(1065, 620, 222, 39);
		panel.add(textField_sa);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"Subject", "DLDA", "DM", "ECCF", "DS", "JAVA", "MATH"}));
		comboBox_12.setBounds(1154, 426, 136, 47);
		panel.add(comboBox_12);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(1070, 80, 220, 200);
		panel.add(calendar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.DARK_GRAY);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(402, 22, 10, 628);
		panel.add(panel_2);
		
		JLabel label = new JLabel("6000417001");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ebrima", Font.PLAIN, 18));
		label.setBounds(245, 74, 147, 30);
		panel.add(label);
		
		JLabel label_19 = new JLabel("6000417002");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Ebrima", Font.PLAIN, 18));
		label_19.setBounds(212, 122, 180, 30);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("6000417003");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Ebrima", Font.PLAIN, 18));
		label_20.setBounds(212, 182, 180, 30);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("6000417004");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("Ebrima", Font.PLAIN, 18));
		label_21.setBounds(212, 237, 180, 30);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("6000417005");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setFont(new Font("Ebrima", Font.PLAIN, 18));
		label_22.setBounds(212, 302, 180, 30);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("6000417006");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Ebrima", Font.PLAIN, 18));
		label_23.setBounds(215, 362, 180, 30);
		panel.add(label_23);
		
		JLabel label_24 = new JLabel("6000417007");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("Ebrima", Font.PLAIN, 18));
		label_24.setBounds(212, 424, 180, 30);
		panel.add(label_24);
		
		JLabel label_25 = new JLabel("6000417008");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("Ebrima", Font.PLAIN, 18));
		label_25.setBounds(212, 484, 180, 30);
		panel.add(label_25);
		
		JLabel label_26 = new JLabel("6000417009");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("Ebrima", Font.PLAIN, 18));
		label_26.setBounds(215, 535, 180, 30);
		panel.add(label_26);
		
		JLabel label_27 = new JLabel("6000417010");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("Ebrima", Font.PLAIN, 18));
		label_27.setBounds(212, 599, 180, 30);
		panel.add(label_27);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.DARK_GRAY);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(225, 22, 10, 628);
		panel.add(panel_1);
		
		JLabel lblSerialNumber = new JLabel("Serial number");
		lblSerialNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblSerialNumber.setFont(new Font("Vani", Font.PLAIN, 28));
		lblSerialNumber.setBounds(46, 22, 189, 49);
		panel.add(lblSerialNumber);
		
		JButton Auto = new JButton("Auto Fill");
		Auto.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(comboBox_11.getSelectedItem().equals("Pranit"))
				{
					comboBox_12.setSelectedItem("DS");
				}
				else if (comboBox_11.getSelectedItem().equals("Nancy"))
				{
					comboBox_12.setSelectedItem("ECCF");
				}
				else if (comboBox_11.getSelectedItem().equals("Neepa"))
				{
					comboBox_12.setSelectedItem("DS");
				}
				else if (comboBox_11.getSelectedItem().equals("Aruna"))
				{
					comboBox_12.setSelectedItem("DLDA");
				}
				else if (comboBox_11.getSelectedItem().equals("Sindhu"))
				{
					comboBox_12.setSelectedItem("DM");
				}
				else if (comboBox_11.getSelectedItem().equals("Narendra"))
				{
					comboBox_12.setSelectedItem("JAVA");
				}
				else if (comboBox_11.getSelectedItem().equals("Kiran"))
				{
					comboBox_12.setSelectedItem("DM");
				}
			}
		});
				
		
		Auto.setBounds(1065, 428, 79, 45);
		panel.add(Auto);
		
		JLabel lblComputerDepartment = new JLabel("Computer \r\nDepartment");
		lblComputerDepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblComputerDepartment.setHorizontalAlignment(SwingConstants.CENTER);
		lblComputerDepartment.setBounds(1065, 11, 210, 39);
		panel.add(lblComputerDepartment);
		
		JLabel lblNo = new JLabel("No.");
		lblNo.setBounds(10, 11, 53, 60);
		frame.getContentPane().add(lblNo);
		lblNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNo.setFont(new Font("Vani", Font.PLAIN, 38));
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

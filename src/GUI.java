import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
public class GUI {
	
	  JFrame f=new JFrame();
	  JTabbedPane tabPane=new JTabbedPane();
	  ArrayList<JPanel> ser=new  ArrayList<JPanel>();
	  JTable table=new JTable();
	  int tabin;
	  
	  GUI()
	  {
		   f.setBounds(100, 100, 645, 499);
		   f.setTitle("Parlours at hand");
		   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   f.setVisible(true);
	  }
	  
	  GUI(int n){
		  
	  }
	  
	  
	  
public void database_connection1(String pname,String pfor,String pservicel,String pservicet,String oname,String ocontact,String oemail,String username,String password)
{
	 try{
 Class.forName("com.mysql.jdbc.Driver");  
 Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/parlour","root","");  
 Statement stmt2=con2.createStatement(); 
 
 String sql2="Insert into Create_parlour values('"+ pname + "','" +pfor+ "','" +pservicel+ "','" +pservicet+ "','" +oname+ "','" +ocontact+ "','" +oemail+"','" +username +"','" +password+"','no image')";
System.out.println(sql2);
 stmt2.executeUpdate(sql2);
 }
 catch(Exception e)
 { System.out.println(e);} 
}

public void database_connection2(String cname,String cgender,String ccontact,String cgmail,String cusername,String cpassword)
{
	 try{
Class.forName("com.mysql.jdbc.Driver");  
Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/parlour","root","");  
Statement stmt2=con2.createStatement(); 

String sql2="Insert into Create_customer values('"+ cname + "','" +cgender+ "','" +ccontact+ "','" +cgmail+ "','" +cusername+ "','" +cpassword+ "')";
System.out.println(sql2);
stmt2.executeUpdate(sql2);
}
catch(Exception e)
{ System.out.println(e);} 
}

public void database_connection3(JLabel image_label2,String pname)
{
	try{
Class.forName("com.mysql.jdbc.Driver");  
Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/parlour","root","");  
Statement stmt2=con2.createStatement(); 

String sql2="update Create_parlour set images='"+image_label2+"' where pname='"+pname+"'";
System.out.println(sql2);
stmt2.executeUpdate(sql2);
}
catch(Exception e)
{ System.out.println(e);} 
}


public int database_connection4()
{
	int numberRow=0;
	try{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/parlour","root","");  
		Statement stmt2=con2.createStatement(); 
		
		String sql2="SELECT COUNT(*) FROM Create_parlour";
		System.out.println(sql2);
		ResultSet rs=stmt2.executeQuery(sql2);
		while(rs.next()){
		    numberRow = rs.getInt("count(*)");
		}
System.out.println(numberRow);
}
catch(Exception e)
{ System.out.println(e);} 

	return numberRow;
}


public String[] database_connection5()
{
	int n=database_connection4();
	String[] names=new String[n];
	try{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/parlour","root","");  
		Statement stmt2=con2.createStatement(); 

		String sql2="SELECT pname FROM Create_parlour";
		System.out.println(sql2);
		ResultSet rs=stmt2.executeQuery(sql2);
		int i=0;
		while(rs.next())
		{
			names[i]=rs.getString(1);
			i++;
		}
	}
catch(Exception e)
	{ 
		System.out.println(e);
	} 

	return names;
}

public String[] database_connection6()
{
	int n=database_connection4();
	String[] locations=new String[n];
	try{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/parlour","root","");  
		Statement stmt2=con2.createStatement(); 

		String sql2="SELECT pservicel FROM Create_parlour";
		System.out.println(sql2);
		ResultSet rs=stmt2.executeQuery(sql2);
		int i=0;
		while(rs.next())
		{
			locations[i]=rs.getString(1);
			i++;
		}
	}
catch(Exception e)
	{ 
		System.out.println(e);
	} 

	return locations;
}

public String[] database_connection7()
{
	int n=database_connection4();
	String[] types=new String[n];
	try{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/parlour","root","");  
		Statement stmt2=con2.createStatement(); 

		String sql2="SELECT pservicet FROM Create_parlour";
		System.out.println(sql2);
		ResultSet rs=stmt2.executeQuery(sql2);
		int i=0;
		while(rs.next())
		{
			types[i]=rs.getString(1);
			i++;
		}
	}
catch(Exception e)
	{ 
		System.out.println(e);
	} 

	return types;
}

public String[] database_connection8()
{
	int n=database_connection4();
	String[] contacts=new String[n];
	try{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/parlour","root","");  
		Statement stmt2=con2.createStatement(); 

		String sql2="SELECT pservicel FROM Create_parlour";
		System.out.println(sql2);
		ResultSet rs=stmt2.executeQuery(sql2);
		int i=0;
		while(rs.next())
		{
			contacts[i]=rs.getString(1);
			i++;
		}
	}
catch(Exception e)
	{ 
		System.out.println(e);
	} 

	return contacts;
}


public void database_connection9(String sname,String sprice,String sdes,String pname)
{
	 try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/parlour","root","");  
			Statement stmt2=con2.createStatement(); 
 
			 String sql2="Insert into service_list values('"+ sname + "','" +sprice+ "','" +sdes+ "','" +pname+ "')";
			System.out.println(sql2);
			 stmt2.executeUpdate(sql2);
			 }
			 catch(Exception e)
			 { System.out.println(e);} 
}

public void database_connection10(String sname,String sprice,String pname)
{
	 try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/parlour","root","");  
			Statement stmt2=con2.createStatement(); 
			  
			  String sql3="delete from service_list where sname='"+sname+"' and sprice='"+sprice+"'";

			  int row=stmt2.executeUpdate(sql3);
			  if(row>0)
			  {
				  System.out.println("deleted");
			  }
			  }
			  catch(Exception e)
			  { 
			  System.out.println(e);
			  } 
			
}
public void database_connection11(String sname,String sprice,String sdes,String pname)
{
	 try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/parlour","root","");  
			Statement stmt2=con2.createStatement(); 
			  
			  String sql8="update service_list set sname='"+sname+"' ,sprice ='"+sprice+"', sdes='"+sdes+"' where sprice='"+sprice+"'";
			  stmt2.executeUpdate(sql8);
		      }
			  catch(Exception e)
			  { 
				  System.out.println(e);
			  }
			
}


public void setindex(int tabIndex)
{
	int tabin=tabIndex;
}

public int getindex()
{
	return tabin;
}

public void First_Page() {
	//booking_list();
	 JPanel login_panel=new JPanel();
	 login_panel.setBackground(new java.awt.Color(240,240,240));
     login_panel.setLayout(null);
     login_panel.setEnabled(false);
     
       JLabel lblParloursAtHand = new JLabel("Parlours At Hand");
		lblParloursAtHand.setFont(new Font("Curlz MT", Font.BOLD, 38));
		lblParloursAtHand.setBounds(172, 21, 334, 38);
		login_panel.add(lblParloursAtHand);
     
     	JButton btnNewButton = new JButton("Your Parlour");
		btnNewButton.setBounds(	241, 135, 149, 87);
     	btnNewButton.setForeground(new Color(255,255,255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton.setBackground(new Color(102, 0, 153));
		login_panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Customer Login");
     	btnNewButton_1.setForeground(new Color(255,255,255));
     	btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(102, 0, 153));
		btnNewButton_1.setBounds(87, 277, 149, 96);
		login_panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Guest");
     	btnNewButton_2.setForeground(new Color(255,255,255));
     	btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(102, 0, 153));
		btnNewButton_2.setBounds(381, 277, 149, 96);
		login_panel.add(btnNewButton_2);
		
		JLabel lblAlreadyHaveOne = new JLabel("Create a Parlour");
		lblAlreadyHaveOne.setBounds(271, 235, 141, 14);
		lblAlreadyHaveOne.setForeground(Color.WHITE);
		lblAlreadyHaveOne.setForeground(new Color(255,255,0));
		login_panel.add(lblAlreadyHaveOne);
		
		JLabel lblAlreadyACustomer = new JLabel("Sign up");
		lblAlreadyACustomer.setBounds(109, 384, 176, 14);
		lblAlreadyACustomer.setForeground(new Color(255,255,0));
		login_panel.add(lblAlreadyACustomer);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login_Page();
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Login_Page();
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Guest();
			}
		});
		lblAlreadyHaveOne.addMouseListener(new java.awt.event.MouseAdapter()
	      {
	          public void mouseClicked(java.awt.event.MouseEvent e)
	           {
	        	  Create_Parlour();
	           }
	      }
	      );
		lblAlreadyACustomer.addMouseListener(new java.awt.event.MouseAdapter()
	      {
	          public void mouseClicked(java.awt.event.MouseEvent e)
	           {
	        		Be_Customer();
	           }
	      }
	      );
     
		 
		  JLabel image_label=new JLabel();
	      image_label.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour\\first page2.jpg"));
	      image_label.setBounds(0, 0,650,430);
	      login_panel.add(image_label);
	      
	      
     
     tabPane.add("Welcome", login_panel);
     VisibleGui();
}



///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////


public void Create_Parlour()
{
	JPanel create_panel=new JPanel();
	create_panel.setBackground(new java.awt.Color(240,240,240));
    create_panel.setLayout(null);
    create_panel.setEnabled(false);
    
    JLabel lblCreateYourParlour = new JLabel("Create Your Parlour");
	lblCreateYourParlour.setFont(new Font("Times New Roman", Font.BOLD, 17));
	lblCreateYourParlour.setBounds(227, 11, 195, 20);
	create_panel.add(lblCreateYourParlour);
	
	JLabel label = new JLabel("___________________________________");
	label.setFont(new Font("Tahoma", Font.BOLD, 11));
	label.setBounds(190, 16, 249, 14);
	create_panel.add(label);
	
	JLabel lblParlourName = new JLabel("Parlour's Information");
	lblParlourName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
	lblParlourName.setBounds(237, 42, 170, 14);
	create_panel.add(lblParlourName);
	
	JLabel lblParlourFor = new JLabel("*Parlour Name   :");
	lblParlourFor.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblParlourFor.setBounds(89, 68, 110, 14);
	create_panel.add(lblParlourFor);
	
	JLabel lblNewLabel = new JLabel("*Service Location:");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblNewLabel.setBounds(89, 117, 117, 14);
	create_panel.add(lblNewLabel);
	
	JLabel lblParlourType = new JLabel("*Parlour For       :");
	lblParlourType.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblParlourType.setBounds(89, 92, 110, 14);
	create_panel.add(lblParlourType);
	
	JLabel lblOwnersInformation = new JLabel("Owner's Information");
	lblOwnersInformation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
	lblOwnersInformation.setBounds(242, 187, 152, 14);
	create_panel.add(lblOwnersInformation);
	
	JLabel lblOwnerName = new JLabel("*Owner Name     :");
	lblOwnerName.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblOwnerName.setBounds(89, 211, 110, 14);
	create_panel.add(lblOwnerName);
	
	JLabel lblNewLabel_1 = new JLabel("*Contact no.       :");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblNewLabel_1.setBounds(89, 236, 110, 14);
	create_panel.add(lblNewLabel_1);
	
	JLabel lblParlourtype = new JLabel("*Service-Type     :");
	lblParlourtype.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblParlourtype.setBounds(89, 142, 124, 14);
	create_panel.add(lblParlourtype);
	
	JLabel lblEmail = new JLabel("Email               : ");
	lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblEmail.setBounds(99, 261, 100, 14);
	create_panel.add(lblEmail);
	
	JLabel lblAccountInformation = new JLabel("Account Information");
	lblAccountInformation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
	lblAccountInformation.setBounds(237, 289, 131, 14);
	create_panel.add(lblAccountInformation);
	
	JLabel lblNewLabel_2 = new JLabel("*Username        :");
	lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblNewLabel_2.setBounds(89, 322, 110, 14);
	create_panel.add(lblNewLabel_2);
	
	JLabel lblPassword = new JLabel("*Password         :");
	lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblPassword.setBounds(89, 347, 110, 14);
	create_panel.add(lblPassword);
	
	JButton btnCreate = new JButton("Create");
	btnCreate.setBounds(255, 393, 100, 32);
	create_panel.add(btnCreate);
	
	JRadioButton rdbtnWomen = new JRadioButton("Women");
    rdbtnWomen.setActionCommand("Women");
	rdbtnWomen.setBounds(205, 87, 72, 23);
	rdbtnWomen.setBackground(new Color(255,249,128));
	create_panel.add(rdbtnWomen);
	
	JRadioButton rdbtnMen = new JRadioButton("Men");
	rdbtnMen.setActionCommand("Men");
	rdbtnMen.setBounds(313, 89, 55, 23);
	rdbtnMen.setBackground(new Color(255,249,128));
	create_panel.add(rdbtnMen);
	
	JRadioButton rdbtnBoth = new JRadioButton("Both");
	rdbtnBoth.setActionCommand("Both");
	rdbtnBoth.setBounds(403, 89, 109, 23);
	rdbtnBoth.setBackground(new Color(255,249,128));
	create_panel.add(rdbtnBoth);
	
	ButtonGroup group = new ButtonGroup();
	group.add(rdbtnWomen);
	group.add(rdbtnMen);
	group.add(rdbtnBoth);
	
	JComboBox comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] {"At my place", "At your place", "Both"}));
	comboBox.setBounds(208, 142, 286, 20);
	create_panel.add(comboBox);
	
	//parlour name
	JTextField textField= new JTextField();
	textField.setBounds(208, 66, 286, 20);
	create_panel.add(textField);
	textField.setColumns(10);
	
	//owner name
	JTextField textField_1 = new JTextField();
	textField_1.setBounds(209, 209, 285, 20);
	create_panel.add(textField_1);
	textField_1.setColumns(10);

	//service location
	JTextField textField_2 = new JTextField();
	textField_2.setBounds(208, 115, 286, 20);
	create_panel.add(textField_2);
	textField_2.setColumns(10);
	
	//contact
	JTextField textField_4 = new JTextField();
	textField_4.setBounds(208, 234, 286, 20);
	create_panel.add(textField_4);
	textField_4.setColumns(10);
	
	//email
	JTextField textField_5 = new JTextField();
	textField_5.setBounds(209, 259, 285, 20);
	create_panel.add(textField_5);
	textField_5.setColumns(10);
	
	//username
	JTextField textField_6 = new JTextField();
	textField_6.setBounds(208, 320, 286, 20);
	create_panel.add(textField_6);
	textField_6.setColumns(10);
	
	 JPasswordField passwordField = new JPasswordField();
	passwordField.setBounds(207, 345, 287, 20);
	create_panel.add(passwordField);
	
	  JLabel image_label2=new JLabel();
	  image_label2.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour\\background1.jpg"));
	    image_label2.setBounds(0,0,645,480);
	  create_panel.add(image_label2);
	  
	  btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				String pname=textField.getText();
				String pfor=group.getSelection().getActionCommand();
				String oname=textField_1.getText();
				String pservicel=textField_2.getText();
				String ocontact=textField_4.getText();
				String oemail=textField_5.getText();
				String username=textField_6.getText();
				String password=passwordField.getText();
				String pservicet=(String)comboBox.getSelectedItem();
				database_connection1(pname,pfor,pservicel,pservicet,oname,ocontact,oemail,username,password);
				
				Parlour_Profile(pname,pfor,pservicel,ocontact,"4.5");
				  int indexn=getindex();
	        	  tabPane.remove(indexn);
			}
		});
	  
    tabPane.add("Create Parlour", create_panel);
    VisibleGui();
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

public void Be_Customer()
{
	JPanel customer_panel=new JPanel();
	customer_panel.setBackground(new java.awt.Color(240,240,240));
	customer_panel.setLayout(null);
	customer_panel.setEnabled(false);
	
	JLabel lblCustomerAccount = new JLabel("Customer Account");
	lblCustomerAccount.setFont(new Font("Times New Roman", Font.BOLD, 18));
	lblCustomerAccount.setBounds(233, 28, 196, 14);
	customer_panel.add(lblCustomerAccount);
	
	JLabel label = new JLabel("_________________________________");
	label.setBounds(209, 30, 244, 14);
	customer_panel.add(label);
	
	JLabel lblName = new JLabel("Name         :");
	lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblName.setBounds(111, 104, 74, 14);
	customer_panel.add(lblName);
	
	JLabel lblContactNo = new JLabel("Contact No. :");
	lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblContactNo.setBounds(111, 156, 87, 14);
	customer_panel.add(lblContactNo);
	
	JLabel label_1 = new JLabel("");
	label_1.setBounds(111, 137, 46, 14);
	customer_panel.add(label_1);
	
	JLabel lblGender = new JLabel("Gender       :");
	lblGender.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblGender.setBounds(111, 131, 74, 14);
	customer_panel.add(lblGender);
	
	JLabel lblGmailId = new JLabel("Gmail id      :");
	lblGmailId.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblGmailId.setBounds(111, 181, 87, 14);
	customer_panel.add(lblGmailId);
	
	JLabel lblCustomerInformation = new JLabel("Customer Information");
	lblCustomerInformation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
	lblCustomerInformation.setBounds(245, 70, 149, 14);
	customer_panel.add(lblCustomerInformation);
	
	JLabel lblAccountInformation = new JLabel("Account Information");
	lblAccountInformation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
	lblAccountInformation.setBounds(245, 219, 149, 14);
	customer_panel.add(lblAccountInformation);
	
	JLabel lblUsername = new JLabel("Username   :");
	lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblUsername.setBounds(111, 260, 87, 14);
	customer_panel.add(lblUsername);
	
	JLabel lblNewLabel = new JLabel("Password    :");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblNewLabel.setBounds(111, 285, 87, 14);
	customer_panel.add(lblNewLabel);
	
	JTextField textField = new JTextField();
	textField.setBounds(195, 102, 272, 20);
	customer_panel.add(textField);
	textField.setColumns(10);
	
	JTextField textField_1 = new JTextField();
	textField_1.setBounds(195, 154, 272, 20);
	customer_panel.add(textField_1);
	textField_1.setColumns(10);
	
	JTextField textField_2 = new JTextField();
	textField_2.setBounds(195, 179, 272, 20);
	customer_panel.add(textField_2);
	textField_2.setColumns(10);
	
	JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
	rdbtnNewRadioButton.setBounds(191, 126, 74, 23);
	rdbtnNewRadioButton.setActionCommand("Female");
	rdbtnNewRadioButton.setBackground(new Color(255,249,128));
	customer_panel.add(rdbtnNewRadioButton);
	
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
	rdbtnNewRadioButton_1.setActionCommand("Male");
	rdbtnNewRadioButton_1.setBounds(298, 128, 54, 23);
	rdbtnNewRadioButton_1.setBackground(new Color(255,249,128));
	customer_panel.add(rdbtnNewRadioButton_1);
	
	JRadioButton rdbtnOther = new JRadioButton("Other");
	rdbtnOther.setActionCommand("Other");
	rdbtnOther.setBounds(385, 128, 109, 23);
	rdbtnOther.setBackground(new Color(255,249,128));
	customer_panel.add(rdbtnOther);
	
	ButtonGroup group = new ButtonGroup();
	group.add(rdbtnNewRadioButton);
	group.add(rdbtnNewRadioButton_1);
	group.add(rdbtnOther);
	
	JTextField textField_3 = new JTextField();
	textField_3.setBounds(195, 258, 272, 20);
	customer_panel.add(textField_3);
	textField_3.setColumns(10);
	
	JButton btnNewButton = new JButton("Create");
	btnNewButton.setBounds(265, 346, 98, 30);
	customer_panel.add(btnNewButton);
	
	JPasswordField passwordField = new JPasswordField();
	passwordField.setBounds(195, 283, 272, 20);
	customer_panel.add(passwordField);

	  JLabel image_label2=new JLabel();
	  image_label2.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour\\background1.jpg"));
	    image_label2.setBounds(0,0,700,480);
	  customer_panel.add(image_label2);
	  
	  btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cname=textField.getText();
				String cgender=group.getSelection().getActionCommand();
				String ccontact=textField_1.getText();
				String cgmail=textField_2.getText();
				String cusername=textField_3.getText();
				String cpassword=passwordField.getText();
				
				database_connection2(cname,cgender,ccontact,cgmail,cusername,cpassword);
				customer_profile();
			}
		});
	  
	   tabPane.add("Customer Account", customer_panel);
	    VisibleGui();
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////

public void customer_profile()
{
	
	JPanel panel_5 = new JPanel();
	panel_5 .setBackground(new java.awt.Color(240,240,240));
	panel_5 .setLayout(null);
	panel_5 .setEnabled(false);
	
	JPanel panel_6 = new JPanel();
	panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel_6.setBounds(233, 57, 151, 145);
	panel_5.add(panel_6);
	
	JLabel lblMituChowdhury = new JLabel("Mitu Chowdhury");
	lblMituChowdhury.setHorizontalAlignment(SwingConstants.CENTER);
	lblMituChowdhury.setFont(new Font("Tahoma", Font.ITALIC, 16));
	lblMituChowdhury.setForeground(new Color(240,240,240));
	lblMituChowdhury.setBounds(91, 24, 424, 27);
	panel_5.add(lblMituChowdhury);
	
	JButton btnNewButton_6 = new JButton("Upload photo");
	btnNewButton_6.setBackground(new Color(32, 178, 170));
	btnNewButton_6.setBounds(253, 202, 117, 23);
	panel_5.add(btnNewButton_6);
	
	JButton btnManageBookings_1 = new JButton("Account Setting");
	btnManageBookings_1.setFont(new Font("Tahoma", Font.BOLD, 16));
	btnManageBookings_1.setBackground(new Color(255, 165, 0));
	btnManageBookings_1.setBounds(352, 265, 216, 47);
	panel_5.add(btnManageBookings_1);
	
	JButton btnPaymentService = new JButton("Payment & Service History");
	btnPaymentService.setForeground(new Color(255, 255, 255));
	btnPaymentService.setFont(new Font("Tahoma", Font.BOLD, 16));
	btnPaymentService.setBackground(new Color(139, 0, 139));
	btnPaymentService.setBounds(185, 360, 259, 47);
	panel_5.add(btnPaymentService);
	
	JButton button = new JButton("Manage Bookings");
	button.setFont(new Font("Tahoma", Font.BOLD, 16));
	button.setBackground(new Color(127, 255, 212));
	button.setBounds(52, 265, 216, 47);
	panel_5.add(button);
	
	
	 JLabel image_label3=new JLabel();
	 image_label3.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour\\profileback2.jpg"));
	 image_label3.setBounds(0,0,700,438);
	 panel_5.add(image_label3);

	   tabPane.add("profile",panel_5);
	    VisibleGui();
}

public void booking_list()
{
	  JPanel book_panel=new JPanel();
		book_panel .setBackground(new java.awt.Color(240,240,240));
		book_panel.setLayout(null);
		book_panel .setEnabled(false);
	  
	  JPanel book_panel2=new JPanel();
	  
         String Row [][]= {{"Stylish Hair","Hair Straightenning","200","21 Jan 2019","2:00 PM"},
        		 {"Henna by Riya","Mehedi(2 full hand)","1000","18 Jan 2019","1:30 PM"},
        		 {"Makeup By Nisha","Bridal Makeup","25,000","30 jan 2019","10:00 AM"},
          };
        	  
         String Column []= { "Parlour name","Service","Price","Date","Time"};
         
   	     JTable table1=new JTable(Row,Column);
         JScrollPane sp=new JScrollPane(table1);
         book_panel2.setBounds(45,60,550, 200);
          sp.setPreferredSize(new Dimension(530, 194));
          
          table1.getColumnModel().getColumn(0).setPreferredWidth(120);
         table1.getColumnModel().getColumn(1).setPreferredWidth(120);
			table1.setRowHeight(35);
			
			Font font=new Font("",1,22);
			JButton btnNewButton_9 = new JButton("Cancel Booking");
			btnNewButton_9.setForeground(new Color(255, 255, 255));
			btnNewButton_9.setBackground(new Color(139, 0, 139));
			btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
			btnNewButton_9.setBounds(249, 293, 164, 36);
			book_panel.add(btnNewButton_9);
			
			JButton btnNewButton_10 = new JButton("See Pendings");
			btnNewButton_10.setBackground(new Color(139, 0, 139));
			btnNewButton_10.setForeground(new Color(255, 255, 255));
			btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
			btnNewButton_10.setBounds(249, 351, 164, 36);
			book_panel.add(btnNewButton_10);
			
			JLabel lblNewLabel_5 = new JLabel("Approved Bookings");
			lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
			lblNewLabel_5.setBounds(249, 22, 199, 25);
			book_panel.add(lblNewLabel_5);
          
         book_panel2.add(sp);
         book_panel.add(book_panel2);
      table1.addMouseListener(new java.awt.event.MouseAdapter()
      {
          public void mouseClicked(java.awt.event.MouseEvent e)
           {
           }
      }
      );
 	 JLabel image_label3=new JLabel();
 	 image_label3.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour\\findback.jpg"));
 	 image_label3.setBounds(0,0,700,438);
 	 book_panel.add(image_label3);
 	 
		tabPane.add("Services",book_panel);
		VisibleGui();
}

public void Manage_Booking()
{
	  JPanel book_panel=new JPanel();
		book_panel .setBackground(new java.awt.Color(240,240,240));
		book_panel.setLayout(null);
		book_panel .setEnabled(false);
	  
	  JPanel book_panel2=new JPanel();
	  
         String Row [][]= {{"Mitu Chowdhury","Hair Straightenning","200","21 Jan 2019","2:00 PM"},
        		 {"Rajjak","Hair cut","1000","18 Jan 2019","1:30 PM"},
        		 {"Nisha","Hair Color","25,000","30 jan 2019","10:00 AM"},
        		 {"Mitu Chowdhury","Hair Straightenning","200","21 Jan 2019","2:00 PM"},
        		 {"Rajjak","Hair cut","1000","18 Jan 2019","1:30 PM"},
        		 {"Nisha","Hair Color","25,000","30 jan 2019","10:00 AM"},
          };
        	  
         String Column []= { "Customer Name","Service","Price","Date","Time"};
         
   	     JTable table1=new JTable(Row,Column);
         JScrollPane sp=new JScrollPane(table1);
         book_panel2.setBounds(45,60,550, 200);
          sp.setPreferredSize(new Dimension(530, 194));
          
          table1.getColumnModel().getColumn(0).setPreferredWidth(120);
         table1.getColumnModel().getColumn(1).setPreferredWidth(120);
			table1.setRowHeight(35);
			
			Font font=new Font("",1,22);
			JButton btnNewButton_9 = new JButton("Accept Booking");
			btnNewButton_9.setForeground(new Color(255, 255, 255));
			btnNewButton_9.setBackground(new Color(139, 0, 139));
			btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
			btnNewButton_9.setBounds(249, 293, 164, 36);
			book_panel.add(btnNewButton_9);
			
			JButton btnNewButton_10 = new JButton("Reject Booking");
			btnNewButton_10.setBackground(new Color(139, 0, 139));
			btnNewButton_10.setForeground(new Color(255, 255, 255));
			btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
			btnNewButton_10.setBounds(249, 351, 164, 36);
			book_panel.add(btnNewButton_10);
			
			JLabel lblNewLabel_5 = new JLabel("Bookings");
			lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
			lblNewLabel_5.setBounds(249, 22, 199, 25);
			book_panel.add(lblNewLabel_5);
          
         book_panel2.add(sp);
         book_panel.add(book_panel2);
      table1.addMouseListener(new java.awt.event.MouseAdapter()
      {
          public void mouseClicked(java.awt.event.MouseEvent e)
           {
           }
      }
      );
 	 JLabel image_label3=new JLabel();
 	 image_label3.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour\\findback.jpg"));
 	 image_label3.setBounds(0,0,700,438);
 	 book_panel.add(image_label3);
 	 
		tabPane.add("Manage",book_panel);
		VisibleGui();
}


public void Parlour_list()
{
	int n=database_connection4();
	JPanel panel_5 = new JPanel();
	panel_5.setLayout(new GridLayout(0, 1,100, 10));
	int y=11;

	JPanel[] panel_6= new JPanel[n];
	JLabel[] lblNewLabel_4=new JLabel[n];
	JLabel[] lblRating_1=new JLabel[n];
	JLabel[] lblAtYourPlace=new JLabel[n];
	String[] names=database_connection5();
	String[] locations=database_connection6();
	String[] types=database_connection7();
	
	for (int i=2;i<n;i++)
	{
		panel_6[i] = new JPanel();
		panel_6[i].setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		if(i%2==0)
		{
			panel_6[i].setBackground(new Color(255, 255, 102));
		}
		else
		{
			panel_6[i].setBackground(new Color(240, 230, 140));
		}
		
		panel_6[i].setBounds(10, y, 700, 90);
		y=y+120;
		panel_6[i].setLayout(null);
	
		lblNewLabel_4[i] = new JLabel(names[i]);
	 	lblNewLabel_4[i].setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4[i].setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4[i].setBounds(79, 6, 451, 18);
		panel_6[i].add(lblNewLabel_4[i]);
	
		lblRating_1[i] = new JLabel("Rating : 4.5");
		lblRating_1[i].setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRating_1[i].setHorizontalAlignment(SwingConstants.CENTER);
		lblRating_1[i].setBounds(227, 23, 157, 21);
		panel_6[i].add(lblRating_1[i]);
	
		lblAtYourPlace[i] = new JLabel(types[i]);
		lblAtYourPlace[i].setForeground(new Color(153, 51, 153));
		lblAtYourPlace[i].setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblAtYourPlace[i].setHorizontalAlignment(SwingConstants.CENTER);
		lblAtYourPlace[i].setBounds(227, 42, 157, 14);
		panel_6[i].add(lblAtYourPlace[i]);
		panel_5.add(panel_6[i]);
		String pname=null;
		String pservicel=null;
		int n1=i;
		panel_6[i].addMouseListener(new java.awt.event.MouseAdapter()
	      {
	          public void mouseClicked(java.awt.event.MouseEvent e)
	           {
	        	  
	        	  parlour_profile2(names[n1],types[n1],locations[n1]);
	           }
	      }
	      );
	}
	JScrollBar scrollBar_1 = new JScrollBar();
	scrollBar_1.setBounds(595, 0, 17, 419);
	panel_5.add(scrollBar_1);
	
	JScrollPane scrollPane = new JScrollPane(panel_5,   ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	scrollPane.setPreferredSize(new Dimension(600, 600));

	   tabPane.add("Parlours",scrollPane);
	    VisibleGui();
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////



public void Guest()
{
	
	JPanel find_panel=new JPanel();
	find_panel.setBackground(new java.awt.Color(240,240,240));
	find_panel.setLayout(null);
	find_panel.setEnabled(false);
	
	JLabel lblFindYourParlour = new JLabel("Find Parlours Here!");
	lblFindYourParlour.setFont(new Font("Goudy Old Style", Font.ITALIC, 25));
	lblFindYourParlour.setBounds(232, 24, 278, 32);
	find_panel.add(lblFindYourParlour);
	
	JLabel lblYourLocation = new JLabel("*Choose your location");
	lblYourLocation.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblYourLocation.setBounds(236, 79, 185, 17);
	find_panel.add(lblYourLocation);
	
	JComboBox comboBox = new JComboBox();
	comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
	comboBox.setBackground(new Color(255,140,0));
	comboBox.setForeground(new Color(0, 0, 0));
	comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dhanmondi", "Mohammadpur", "Lalmatia", "Shahbagh", "Polton", "Shantinagar", "Old town", "Lalmatia", "Rayerbazar", "Green Road", "Shamoly", "Eliphent Road", "Afsaruddin Road", "Kalabagan", "Kakrail", "New Market", "Ramna", "Shegunbagicha", "Bijoy Nagar", "Panthapath", "Eskaton", "Malibagh", "Motijheel", "Hatirjheel", "Savar", "Demra"}));
	comboBox.setBounds(82, 107, 473, 32);
	find_panel.add(comboBox);
	
	JLabel lblFilterYourSearch = new JLabel("Filter your search");
	lblFilterYourSearch.setFont(new Font("Tahoma", Font.BOLD, 15));
	lblFilterYourSearch.setBounds(245, 161, 151, 19);
	find_panel.add(lblFilterYourSearch);
	
	JButton btnSearch = new JButton("Search");
	btnSearch.setForeground(new Color(255, 255, 255));
	btnSearch.setBackground(new Color(148, 0, 211));
	btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 13));
	btnSearch.setBounds(250, 328, 125, 32);
	find_panel.add(btnSearch);
	
	JLabel lblChooseParlourType = new JLabel("Parlour For    :");
	lblChooseParlourType.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblChooseParlourType.setBounds(143, 200, 86, 14);
	find_panel.add(lblChooseParlourType);
	
	JRadioButton rdbtnWomensParlour = new JRadioButton("Male");
	rdbtnWomensParlour.setBounds(319, 197, 56, 23);
	rdbtnWomensParlour.setBackground(new Color(255,235,178));
	find_panel.add(rdbtnWomensParlour);
	
	JRadioButton radioButton = new JRadioButton("Female");
	radioButton.setBackground(new Color(255,235,178));
	radioButton.setBounds(236, 197, 68, 23);
	find_panel.add(radioButton);
	
	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Both");
	rdbtnNewRadioButton_2.setBackground(new Color(255,235,178));
	rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
	rdbtnNewRadioButton_2.setBounds(401, 196, 51, 23);
	find_panel.add(rdbtnNewRadioButton_2);
	
	JLabel lblParlourName = new JLabel("Parlour Name :");
	lblParlourName.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblParlourName.setBounds(143, 234, 92, 14);
	find_panel.add(lblParlourName);
	
	JTextField textField_5 = new JTextField();
	textField_5.setBounds(236, 232, 216, 20);
	find_panel.add(textField_5);
	textField_5.setColumns(10);
	
	JLabel lblServiceName = new JLabel("Service Name :");
	lblServiceName.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblServiceName.setBounds(143, 268, 99, 14);
	find_panel.add(lblServiceName);
	
	JTextField textField_6 = new JTextField();
	textField_6.setBounds(236, 266, 216, 20);
	find_panel.add(textField_6);
	textField_6.setColumns(10);
	
	  JLabel image_label2=new JLabel();
	  image_label2.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour\\findback.jpg"));
	    image_label2.setBounds(0,0,700,480);
	    find_panel.add(image_label2);
	    
	    btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Parlour_list();
			}
		});
	  
	   tabPane.add("Find Parlour", find_panel);
	    VisibleGui();

}


///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////


public void Login_Page()
{
	JPanel login_panel=new JPanel();
	login_panel.setBackground(new java.awt.Color(240,240,240));
	login_panel.setLayout(null);
	login_panel.setEnabled(false);
	
	
	JLabel lblParloursAtHand = new JLabel("Parlours At Hand");
	lblParloursAtHand.setFont(new Font("Brush Script MT", Font.ITALIC, 25));
	lblParloursAtHand.setForeground(new Color(255,249,128));
	lblParloursAtHand.setBounds(226, 48, 165, 32);
	login_panel.add(lblParloursAtHand);
	
	JLabel label_2 = new JLabel("=========================");
	label_2.setBounds(207, 77, 211, 14);
	label_2.setForeground(new Color(255,249,128));
	login_panel.add(label_2);
	
	JLabel label_3 = new JLabel("=========================");
	label_3.setBounds(207, 37, 211, 14);
	label_3.setForeground(new Color(255,249,128));
	login_panel.add(label_3);
	
	JLabel lblUsername_1 = new JLabel("Username    :");
	lblUsername_1.setFont(new Font("Tahoma", Font.BOLD, 15));
	lblUsername_1.setBounds(193, 138, 115, 14);
	login_panel.add(lblUsername_1);
	
	JLabel lblNewLabel_1 = new JLabel("Password     :");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
	lblNewLabel_1.setBounds(193, 201, 115, 14);
	login_panel.add(lblNewLabel_1);
	
	JTextField textField_4 = new JTextField();
	textField_4.setBounds(193, 170, 238, 20);
	login_panel.add(textField_4);
	textField_4.setColumns(10);
	
	JPasswordField passwordField_1 = new JPasswordField();
	passwordField_1.setBounds(192, 229, 239, 20);
	login_panel.add(passwordField_1);
	
	JLabel lblNewLabel_2 = new JLabel("Forgot your password?");
	lblNewLabel_2.setForeground(Color.BLUE);
	lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
	lblNewLabel_2.setBounds(192, 260, 188, 14);
	login_panel.add(lblNewLabel_2);
	
	JButton btnNewButton_1 = new JButton("Log In");
	btnNewButton_1.setForeground(new Color(255, 255, 255));
	btnNewButton_1.setBackground(new Color(0, 0, 139));
	btnNewButton_1.setBounds(261, 304, 89, 32);
	login_panel.add(btnNewButton_1);
	
	 JLabel image_label2=new JLabel();
	 image_label2.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour\\loginback.jpg"));
	 image_label2.setBounds(0,0,700,425);
	 login_panel.add(image_label2);
	
	 tabPane.add("Login", login_panel);
	    VisibleGui();
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

public void Parlour_Profile(String pname,String pfor,String pservicel,String ocontact,String crate)
{
	JPanel profile_panel=new JPanel();
	profile_panel.setBackground(new java.awt.Color(240,240,240));
	profile_panel.setLayout(null);
	profile_panel.setEnabled(false);
	
	 JLabel image_label2=new JLabel();
     image_label2.setText(" ");
	 image_label2.setBounds(5,5,130,130);
	 profile_panel.add(image_label2);
	 Border border = LineBorder.createGrayLineBorder();
	
		JButton btnUploadAPhoto = new JButton("Upload a photo");
		btnUploadAPhoto.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnUploadAPhoto.setBounds(10, 135, 111, 23);
		profile_panel.add(btnUploadAPhoto);
		
		JLabel lblNewLabel_3 = new JLabel(pname);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(149, 11, 403, 23);
		profile_panel.add(lblNewLabel_3);
		
		JLabel lblRating = new JLabel("Rating :"+crate);
		lblRating.setHorizontalAlignment(SwingConstants.CENTER);
		lblRating.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblRating.setBounds(265, 39, 165, 23);
		profile_panel.add(lblRating);
		
		JLabel lblDhanmondi = new JLabel(pservicel);
		lblDhanmondi.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblDhanmondi.setHorizontalAlignment(SwingConstants.CENTER);
		lblDhanmondi.setBounds(150, 60, 391, 14);
		profile_panel.add(lblDhanmondi);
		
		JLabel lblCell = new JLabel("cell :"+ocontact);
		lblCell.setForeground(Color.BLUE);
		lblCell.setHorizontalAlignment(SwingConstants.CENTER);
		lblCell.setBounds(142, 114, 410, 14);
		profile_panel.add(lblCell);
		
		JLabel lblParlourForMen = new JLabel("Parlour for "+pfor);
		lblParlourForMen.setHorizontalAlignment(SwingConstants.CENTER);
		lblParlourForMen.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblParlourForMen.setBounds(205, 95, 274, 14);
		profile_panel.add(lblParlourForMen);
		
		JButton btnNewButton_2 = new JButton("Service List");
		btnNewButton_2.setBackground(new Color(255, 255, 0));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
		btnNewButton_2.setBounds(31, 214, 274, 37);
		profile_panel.add(btnNewButton_2);
		
		btnNewButton_2 .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Service(pname);
			}
		});
		
		JButton btnManageBookings = new JButton("See Reviews");
		btnManageBookings.setBackground(new Color(255, 153, 51));
		btnManageBookings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnManageBookings.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
		btnManageBookings.setBounds(326, 274, 264, 37);
		profile_panel.add(btnManageBookings);
		
		JButton button = new JButton("Manage Bookings");
		button.setBackground(new Color(0, 255, 153));
		button.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
		button.setBounds(326, 214, 264, 37);
		profile_panel.add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manage_Booking();
			}
		});
		
		
		JButton btnAccountSetting = new JButton("Account Setting");
		btnAccountSetting.setBackground(new Color(255, 51, 153));
		btnAccountSetting.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
		btnAccountSetting.setBounds(31, 274, 274, 37);
		profile_panel.add(btnAccountSetting);
		
		JButton btnServicePayment = new JButton("Service & Payment History");
		btnServicePayment.setBackground(new Color(0, 255, 204));
		btnServicePayment.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
		btnServicePayment.setBounds(176, 341, 288, 37);
		profile_panel.add(btnServicePayment);

		
		btnUploadAPhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField jTextField10=new JTextField();
			    JFileChooser chooser = new JFileChooser();
			    chooser.showOpenDialog(null);
			    final File f = chooser.getSelectedFile();
			    String filename = f.getAbsolutePath();
			    if (f == null) {
			        return;
			    }
			    jTextField10.setText(filename);
			    	try
			    	{
			    		String image_file=jTextField10.getText();
			    		image_label2.setIcon(new javax.swing.ImageIcon(image_file));
			    		database_connection3(image_label2,pname);
			    	}
			    	catch (Exception ex)
			    	{
			        ex.printStackTrace();
			    	}
			}

		});	
	 image_label2.setBorder(border);
	 
	 JLabel image_label3=new JLabel();
	 image_label3.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour\\profileback.jpg"));
	 image_label3.setBounds(0,0,2000,425);
	 profile_panel.add(image_label3);
	 
	 tabPane.add("Profile", profile_panel);
	    VisibleGui();
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

public void Service(String pname) {
		JPanel service_panel=new JPanel();
		//service_panel.setBackground(new java.awt.Color(204, 255, 204));
		service_panel.setLayout(null);
		
		JPanel  service_panel2=new JPanel();
		
		service_panel2.setBounds(73, 153, 480, 250);
		Border border = LineBorder.createGrayLineBorder();
		
					JTable table1=new JTable();
					Object[] columns= {"Service Name","Price","Description"};
					DefaultTableModel model=new DefaultTableModel();
					model.setColumnIdentifiers(columns);
					table1.setModel(model);
					table1.setBackground(Color.white);
					table1.setForeground(Color.black);
					Font font=new Font("",1,22);
					table1.getColumnModel().getColumn(2).setPreferredWidth(200);
					table1.setRowHeight(30);
					Font font2=new Font("",1,22);
					

       JScrollPane sp=new JScrollPane(table1);
   	service_panel2.setBounds(73, 153, 480, 250);
       sp.setPreferredSize(new Dimension(475, 245));
       service_panel2.add(sp);
       service_panel.add( service_panel2);
       
	JLabel lblServiceName_1 = new JLabel("Service Informations");
	lblServiceName_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
	lblServiceName_1.setBounds(243, 11, 201, 14);
	service_panel.add(lblServiceName_1);
	
	JLabel lblNewLabel_4 = new JLabel("Service Name :");
	lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
	lblNewLabel_4.setBounds(65, 41, 93, 14);
	service_panel.add(lblNewLabel_4);
	
	JTextField textField_7 = new JTextField();
	textField_7.setForeground(new Color(0,0,0));
	textField_7.setBackground(new Color(255, 255, 255));
	textField_7.setBounds(168, 39, 247, 20);
	service_panel.add(textField_7);
	textField_7.setColumns(10);
	
	JLabel lblPrice = new JLabel("Price(TK)       :");
	lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 14));
	lblPrice.setBounds(65, 72, 112, 14);
	service_panel.add(lblPrice);
	
	JTextField textField_8 = new JTextField();
	textField_8.setForeground(new Color(0,0,0));
	textField_8.setBackground(new Color(255, 255, 255));
	textField_8.setColumns(10);
	textField_8.setBounds(168, 70, 247, 20);
	service_panel.add(textField_8);
	
	JLabel lblDescription = new JLabel("Description    :");
	lblDescription.setFont(new Font("Times New Roman", Font.BOLD, 14));
	lblDescription.setBounds(65, 101, 100, 14);
	service_panel.add(lblDescription);
	
	JTextArea textArea = new JTextArea();
	textArea.setForeground(new Color(0,0,0));
	textArea.setBackground(new Color(255, 255, 255));
	textArea.setLineWrap(true);
	textArea.setBounds(168, 100, 247, 48);
	textArea.setBorder(border);
	service_panel.add(textArea);
	
	JButton btnNewButton_4 = new JButton("ADD");
	btnNewButton_4.setForeground(new Color(255, 255, 255));
	btnNewButton_4.setBackground(new Color(139, 0, 139));
	btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
	btnNewButton_4.setBounds(470, 38, 88, 23);
	service_panel.add(btnNewButton_4);
	
	Object[] row=new Object[3];
	btnNewButton_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			row[0]=textField_7.getText();
			row[1]=textField_8.getText();
			row[2]=textArea.getText();
			model.addRow(row);
			
			String sname=textField_7.getText();
			String sprice=textField_8.getText();
			String sdes=textArea.getText();
			database_connection9(sname,sprice,sdes,pname);
		}
	});
	
	JButton btnNewButton_5 = new JButton("DELETE");
	btnNewButton_5.setBackground(new Color(105, 105, 105));
	btnNewButton_5.setForeground(new Color(255, 255, 255));
	btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 11));
	btnNewButton_5.setBounds(470, 69, 88, 23);
	service_panel.add(btnNewButton_5);
	
	btnNewButton_5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				int i=table1.getSelectedRow();
				if(i>=0)
				{
					model.removeRow(i);
					String sname=textField_7.getText();
					String sprice=textField_8.getText();
					database_connection10(sname,sprice,pname);
				}
				else
				{
				System.out.println("system error");
				}
		}
	});
	
    table1.addMouseListener(new java.awt.event.MouseAdapter()
    {
        public void mouseClicked(java.awt.event.MouseEvent e)
         {
        	int i=table1.getSelectedRow();
        	textField_7.setText(model.getValueAt(i,0).toString());
        	textField_8.setText(model.getValueAt(i,1).toString());
          	textArea.setText(model.getValueAt(i,2).toString());
         }
    }
    );
  
	JButton btnUpdate = new JButton("UPDATE");
	btnUpdate.setForeground(new Color(255, 255, 255));
	btnUpdate.setBackground(new Color(255, 140, 0));
	btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 11));
	btnUpdate.setBounds(470, 101, 88, 23);
	service_panel.add(btnUpdate);
	
	btnUpdate.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int i=table1.getSelectedRow();
			if (i>=0)
			{
				model.setValueAt(textField_7.getText(),i,0);
				model.setValueAt(textField_8.getText(),i,1);
				model.setValueAt(textArea.getText(),i,2);
				String sname=textField_7.getText();
				String sprice=textField_8.getText();
				String sdes=textArea.getText();
				database_connection11(sname,sprice,sdes,pname);
			}
			else
			{
				System.out.println("system error");
			}
			
		}
	});
	
	  JLabel image_label2=new JLabel();
	  image_label2.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour\\findback.jpg"));
	    image_label2.setBounds(0,0,645,480);
	  service_panel.add(image_label2);
	  
	tabPane.add("Services", service_panel);
	VisibleGui();
	
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

public void parlour_profile2(String name,String type,String pservicel)
{
	JPanel panel_3=new JPanel();
	 panel_3.setLayout(null);
	 panel_3.setEnabled(false);
	
	JLabel lblNewLabel_3 = new JLabel(name);
	lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_3.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
	lblNewLabel_3.setBounds(117, 11, 403, 23);
	lblNewLabel_3.setForeground(Color.white);
	panel_3.add(lblNewLabel_3);
	
	JLabel lblRating = new JLabel("Rating : 4.5");
	lblRating.setHorizontalAlignment(SwingConstants.CENTER);
	lblRating.setFont(new Font("Tahoma", Font.ITALIC, 13));
	lblRating.setBounds(236, 30, 165, 23);
	lblRating.setForeground(Color.white);
	panel_3.add(lblRating);
	
	JLabel lblDhanmondi = new JLabel(pservicel);
	lblDhanmondi.setFont(new Font("Tahoma", Font.ITALIC, 13));
	lblDhanmondi.setHorizontalAlignment(SwingConstants.CENTER);
	lblDhanmondi.setBounds(117, 211, 391, 14);
	lblDhanmondi.setForeground(Color.white);
	panel_3.add(lblDhanmondi);
	
	JLabel lblCell = new JLabel("cell : +880-1678256314");
	lblCell.setForeground(Color.yellow);
	lblCell.setHorizontalAlignment(SwingConstants.CENTER);
	lblCell.setBounds(110, 236, 410, 14);
	panel_3.add(lblCell);
	
	JLabel lblParlourForMen = new JLabel(type);
	lblParlourForMen.setHorizontalAlignment(SwingConstants.CENTER);
	lblParlourForMen.setFont(new Font("Tahoma", Font.ITALIC, 14));
	lblParlourForMen.setBounds(174, 186, 274, 14);
	lblParlourForMen.setForeground(Color.white);
	panel_3.add(lblParlourForMen);
	
	JButton btnNewButton_2 = new JButton("See Services");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
//			  int indexn=getindex();
//        	  tabPane.remove(indexn+1);
			service2();
		}
	});
	btnNewButton_2.setBackground(new Color(139, 0, 139));
	btnNewButton_2.setForeground(new Color(255, 255, 255));
	btnNewButton_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
	btnNewButton_2.setBounds(39, 341, 205, 55);
	panel_3.add(btnNewButton_2);
	
	JButton btnManageBookings = new JButton("See Reviews");
	btnManageBookings.setForeground(new Color(255, 255, 255));
	btnManageBookings.setBackground(new Color(139, 0, 139));
	btnManageBookings.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	btnManageBookings.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
	btnManageBookings.setBounds(384, 343, 194, 53);
	panel_3.add(btnManageBookings);
	
	JButton btnBooking = new JButton("Booking");
	btnBooking.setForeground(new Color(255, 255, 255));
	btnBooking.setBackground(new Color(139, 0, 139));
	btnBooking.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
	btnBooking.setBounds(216, 272, 185, 58);
	panel_3.add(btnBooking);
	btnBooking.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Booking();
		}
	});
	
	
	 JLabel image_label3=new JLabel();
	 image_label3.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour\\profileback2.jpg"));
	 image_label3.setBounds(0,0,700,438);
	 panel_3.add(image_label3);
	 tabPane.add("Profile", panel_3);
	    VisibleGui();
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

public void service2()
{		
	  JPanel book_panel=new JPanel();
	  //book_panel.setBackground(new java.awt.Color(204, 255, 204));
	  book_panel.setLayout(null);
	  
	  JPanel book_panel2=new JPanel();
	 // book_panel2.setBounds(67, 26, 453, 300);
	  
           String Row [][]= {{"Hair Straightenning","200","Ceramic straightner will be used"},
          	  {"Hair Rebonding","6000-10,000","Depends on the length of hair"},
          	  {"You Hair cut","200","Same for any length"},
          	  {"Straight Hair cut","100","Same for any length "},
          	  {"Layer Cut","150","Only front layer"},
          	  {"Layer Cut","350","fully layer"},
          	  {"Volume Layer","380","Fully volume layer"},
        	  {"Bangs","250","Same for any length "},
        	  {"Hair colour","1000","Garnier will be used"},
            };
          	  
           String Column []= { "Service name","Price","Description"};
           
     	     JTable table1=new JTable(Row,Column);
           JScrollPane sp=new JScrollPane(table1);
           book_panel2.setBounds(73,70, 480, 250);
            sp.setPreferredSize(new Dimension(475, 245));
            
            table1.getColumnModel().getColumn(2).setPreferredWidth(200);
			table1.setRowHeight(35);
			Font font=new Font("",1,22);
            
           book_panel2.add(sp);
           book_panel.add(book_panel2);
        table1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
             {
//             int row=table1.rowAtPoint(e.getPoint());
//             int col= table1.columnAtPoint(e.getPoint());
//             String getTableValue1=table1.getValueAt(row,col).toString();
//             String getDocName=table1.getValueAt(row,0).toString();
//             
//             formfillup_gui(getDocName);
             }
        }
        );
		tabPane.add("Services",book_panel);
		VisibleGui();
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
public void Booking()
{
	JPanel panel_7=new JPanel();
	panel_7.setBackground(new java.awt.Color(240,240,240));
	panel_7.setLayout(null);
	panel_7.setEnabled(false);
	
	JLabel lblChooseService = new JLabel("Choose Service :");
	lblChooseService.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblChooseService.setBounds(114, 103, 130, 14);
	panel_7.add(lblChooseService);
	
	JComboBox comboBox_1 = new JComboBox();
	comboBox_1.setForeground(new Color(0, 0, 0));
	comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	comboBox_1.setBackground(new Color(255, 140, 0));
	comboBox_1.setBounds(254, 97, 231, 28);
	panel_7.add(comboBox_1);
	
	JLabel lblDate = new JLabel("Set Date            :");
	lblDate.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDate.setBounds(114, 159, 130, 14);
	panel_7.add(lblDate);
	
	JTextField  textField_9 = new JTextField();
	textField_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
	textField_9.setBounds(254, 150, 48, 28);
	panel_7.add(textField_9);
	textField_9.setColumns(10);
	
	JComboBox comboBox_2 = new JComboBox();
	comboBox_2.setForeground(new Color(0, 0, 0));
	comboBox_2.setBackground(new Color(255, 140, 0));
	comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
	comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Nov", "Dec"}));
	comboBox_2.setBounds(312, 150, 78, 28);
	panel_7.add(comboBox_2);
	
	JTextField textField_10 = new JTextField();
	textField_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
	textField_10.setBounds(405, 150, 78, 28);
	panel_7.add(textField_10);
	textField_10.setColumns(10);
	
	JLabel lblDateMonthYear = new JLabel("date              month                          year");
	lblDateMonthYear.setBounds(254, 180, 231, 14);
	panel_7.add(lblDateMonthYear);
	
	JLabel lblSetTime = new JLabel("Set Time           :");
	lblSetTime.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblSetTime.setBounds(114, 225, 130, 14);
	panel_7.add(lblSetTime);
	
	JComboBox comboBox_3 = new JComboBox();
	comboBox_3.setBackground(new Color(255, 140, 0));
	comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
	comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"12:00", "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00"}));
	comboBox_3.setBounds(254, 220, 86, 28);
	panel_7.add(comboBox_3);
	
	JComboBox comboBox_4 = new JComboBox();
	comboBox_4.setBackground(new Color(152, 251, 152));
	comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
	comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
	comboBox_4.setBounds(357, 220, 48, 28);
	panel_7.add(comboBox_4);
	comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Hair Straightening", "Hair Curl", "Layer Cut", "Volume Layer", "You cut", "Straight Cut"}));
	JButton btnNewButton_7 = new JButton("Book");
	btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton_7.setForeground(new Color(255, 255, 255));
	btnNewButton_7.setBackground(new Color(139, 0, 139));
	btnNewButton_7.setBounds(270, 314, 108, 37);
	panel_7.add(btnNewButton_7);
	
	  JLabel image_label2=new JLabel();
	  image_label2.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour\\findback.jpg"));
	    image_label2.setBounds(0,0,645,480);
	  panel_7.add(image_label2);
	  
		tabPane.add("Services",panel_7);
		VisibleGui();
}

public void VisibleGui()
{
	  tabPane.setUI(new MyTabbedPaneUI());
	  f.getContentPane().add(tabPane, BorderLayout.CENTER);
	  f.setVisible(true);
}
}



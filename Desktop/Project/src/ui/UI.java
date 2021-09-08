package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Data.ProjectMain;
import model.Admin;
import model.Calisan;
import model.Musteri;
import model.myUtils;

import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
public class UI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setTitle("panel");
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 318);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		user = new JTextField();
		user.setBounds(304, 44, 169, 29);
		contentPane.add(user);
		user.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u00C7al\u0131\u015Fanlar", "M\u00FC\u015Fteri", "Admin"}));
		comboBox.setBounds(304, 209, 130, 29);
		contentPane.add(comboBox);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(304, 19, 169, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(304, 84, 169, 14);
		contentPane.add(lblPassword);
		
		pass = new JPasswordField();
		pass.setBounds(304, 109, 169, 29);
		contentPane.add(pass);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setBounds(127, 209, 169, 29);
		contentPane.add(lblMessage);
		
		JLabel lblYamanRestoran = new JLabel("YAMAN RESTORAN");
		lblYamanRestoran.setForeground(Color.RED);
		lblYamanRestoran.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 28));
		lblYamanRestoran.setBounds(10, 2, 316, 38);
		contentPane.add(lblYamanRestoran);
		
		JLabel lblHogeldiniz = new JLabel("Ho\u015Fgeldiniz");
		lblHogeldiniz.setBounds(10, 51, 89, 14);
		contentPane.add(lblHogeldiniz);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				String username = user.getText().trim();
				String password = new String(pass.getPassword());
				
				if(comboBox.getSelectedIndex()==0)
				{
				
				
				Calisan obj = new Calisan();
			ResultSet rs = obj.Login(username, password);
				
				if(rs.next()) {
					obj.setName(rs.getString("calsanlar_name"));
					obj.setRoleId(rs.getString("calsanlar_role"));
					obj.setMobileNo(rs.getString("calsanlar_num"));
					obj.setDateofBirth(rs.getString("calsanlar_birth"));
					obj.setAddress(rs.getString("calsanlar_adress"));
					obj.setHireDate(rs.getString("calsanlar_tarih"));
					obj.setEmployeeGorev(rs.getString("calsanlar_gorev"));
					
					Calisanlogin_ui eh = new Calisanlogin_ui(obj);
					eh.setVisible(true);
					
					dispose();
				}
				else {
					lblMessage.setText("yanlis isim veya sifre");
				}
				}
				else if(comboBox.getSelectedIndex()==1)
				{
				Musteri bj = new Musteri();
				ResultSet as = bj.Login(username, password);
					
					if(as.next()) {
						bj.setName(as.getString("msteri_ad"));
						bj.setMobileNo(as.getString("msteri_number"));	
						bj.setAddress(as.getString("msteri_adress"));
						bj.setId(as.getLong("idmsteri_login"));
						
						Musterilogin dh = new Musterilogin(bj);
						dh.setVisible(true);
						dispose();
						
					}
					else {
						lblMessage.setText("yanlis isim veya sifre");
						}
					
				}
				else {
					Admin bj= new Admin();
				ResultSet as = bj.Login(username, password);
					
					if(as.next()) {
						Admin_login dh = new Admin_login();
						dh.setVisible(true);
						dispose();
						
					}
					else {
						lblMessage.setText("yanlis isim veya sifre");
						}
				}
				}
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}		
	 	});
		btnLogin.setBounds(304, 149, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Musteri_register dv = new Musteri_register();
				dv.setVisible(true);
			}
		});
		btnRegister.setBounds(304, 174, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnSipariler = new JButton("Yemek Menüsünü Listele");
		btnSipariler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sparisler_goster a = new Sparisler_goster();
				a.setVisible(true);
			}
		});
		btnSipariler.setBounds(38, 125, 186, 71);
		contentPane.add(btnSipariler);
		
		
	}
}

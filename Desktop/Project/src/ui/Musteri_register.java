package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import model.Musteri;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Musteri_register extends JFrame {

	private JPanel contentPane;
	private JTextField namee;
	private JTextField usernamee;
	private JTextField adress;
	private JTextField numaraa;
	private JTextField birthh;
	private JPasswordField passwordd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Musteri_register frame = new Musteri_register();
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
	public Musteri_register() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 303, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(109, 186, 168, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnKaydol = new JButton("Kaydol");
		
		JLabel lblIsim = new JLabel("isim");
		lblIsim.setBounds(10, 11, 46, 14);
		contentPane.add(lblIsim);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(10, 36, 65, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(10, 61, 65, 14);
		contentPane.add(lblPassword);
		
		JLabel lblAdres = new JLabel("adres");
		lblAdres.setBounds(10, 86, 46, 14);
		contentPane.add(lblAdres);
		
		JLabel lblNumara = new JLabel("numara");
		lblNumara.setBounds(10, 114, 46, 14);
		contentPane.add(lblNumara);
		
		JLabel lblDoumTarihi = new JLabel("do\u011Fum tarihi");
		lblDoumTarihi.setBounds(10, 169, 84, 14);

		
		JLabel lblCinsiyet = new JLabel("Cinsiyet");
		lblCinsiyet.setBounds(10, 161, 46, 14);
		contentPane.add(lblCinsiyet);
		
		JRadioButton rdbtnErkek = new JRadioButton("erkek");
		rdbtnErkek.setBounds(62, 161, 73, 23);
		contentPane.add(rdbtnErkek);
		
		JRadioButton rdbtnKadn = new JRadioButton("kad\u0131n");
		rdbtnKadn.setBounds(137, 161, 84, 23);
		contentPane.add(rdbtnKadn);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnErkek);
		group.add(rdbtnKadn);
		
		namee = new JTextField();
		namee.setBounds(97, 8, 86, 20);
		contentPane.add(namee);
		namee.setColumns(10);	
namee.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			public void changed() {
				if (namee.getText().equals("")) {
					btnKaydol.setEnabled(false);
				lblNewLabel.setText("bosluk birakmayin");}
					else
						btnKaydol.setEnabled(true);
			}
		});
		
		usernamee = new JTextField();
		usernamee.setBounds(97, 33, 86, 20);
		contentPane.add(usernamee);
		usernamee.setColumns(10);
usernamee.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			public void changed() {
				if (usernamee.getText().equals("")) {
					btnKaydol.setEnabled(false);
				lblNewLabel.setText("bosluk birakmayin");}
					else
						btnKaydol.setEnabled(true);
			}
		});
		
		passwordd = new JPasswordField();
		passwordd.setBounds(97, 58, 86, 20);
		contentPane.add(passwordd);
passwordd.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			public void changed() {
				if (passwordd.getPassword().equals("")) {
					btnKaydol.setEnabled(false);
				lblNewLabel.setText("bosluk birakmayin");}
					else
						btnKaydol.setEnabled(true);
			}
		});
		
		adress = new JTextField();
		adress.setBounds(97, 83, 180, 23);
		contentPane.add(adress);
		adress.setColumns(10);
adress.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			public void changed() {
				if (adress.getText().equals("")) {
					btnKaydol.setEnabled(false);
				lblNewLabel.setText("bosluk birakmayin");}
					else
						btnKaydol.setEnabled(true);
			}
		});
		
		numaraa = new JTextField();
		numaraa.setBounds(97, 111, 86, 20);
		contentPane.add(numaraa);
		numaraa.setColumns(10);
numaraa.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			public void changed() {
				if (numaraa.getText().equals("")) {
					btnKaydol.setEnabled(false);
				lblNewLabel.setText("bosluk birakmayin");}
					else
						btnKaydol.setEnabled(true);
			}
		});
		
		birthh = new JTextField();
		birthh.setBounds(97, 134, 86, 20);
		contentPane.add(birthh);
		birthh.setColumns(10);
birthh.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
			public void changed() {
				if (birthh.getText().equals("")) {
					btnKaydol.setEnabled(false);
				lblNewLabel.setText("bosluk birakmayin");}
					else
						btnKaydol.setEnabled(true);
			}
		});
		
		btnKaydol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = namee.getText();
				String username = usernamee.getText().trim();
				String password = new String(passwordd.getPassword());
				String adres = adress.getText();
				String numara = numaraa.getText();
				String birth = birthh.getText();
				String gender = "Kadin";
				String etkinlik = "pasif";
				if(rdbtnErkek.isSelected()) 
				 gender = "erkek";
				 
				 if(rdbtnKadn.isSelected()) 
					 gender = "Kadin";
					 
				Musteri aw = new Musteri();
				aw.setName(name);
				aw.setEmail(username);
				aw.setPassword(password);
				aw.setMobileNo(numara);
				aw.setAddress(adres);
				aw.setDateofBirth(birth);
				aw.setGender(gender);
				aw.setEtkinlik(etkinlik);
				
				
				
				try {
					int r = aw.addMusteri(aw);
					if(r>0) {
						lblNewLabel.setText("basarili");
					}
	
					else
						lblNewLabel.setText("basarisiz");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			});
		btnKaydol.setBounds(10, 186, 89, 23);
		contentPane.add(btnKaydol);
		
		JLabel lblBirth = new JLabel("do\u011Fum tarihi");
		lblBirth.setBounds(10, 136, 77, 14);
		contentPane.add(lblBirth);
		
		JButton btnGeriDn = new JButton("Geri D\u00F6n");
		btnGeriDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnGeriDn.setBounds(188, 7, 89, 23);
		contentPane.add(btnGeriDn);
	}
}

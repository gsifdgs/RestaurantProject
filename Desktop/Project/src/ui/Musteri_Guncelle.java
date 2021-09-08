package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Musteri;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Musteri_Guncelle extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textName;
	private JTextField textAdres;
	private JTextField textNum;
	
	private long Musteriid;
	private void Displaydata() {
		try {
			Musteri a = new Musteri();
			ResultSet rs = a.searchmID(Musteriid);
			if(rs.next()) {
				textId.setText(rs.getString("idmsteri_login"));
				textName.setText(rs.getString("msteri_ad"));
				textAdres.setText(rs.getString("msteri_adress"));
				textNum.setText(rs.getString("msteri_number"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	public Musteri_Guncelle(long id) {
		Musteriid = id;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 321, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYeni = new JLabel("");
		lblYeni.setBounds(10, 164, 175, 14);
		contentPane.add(lblYeni);
		
		textId = new JTextField();
		textId.setEditable(false);
		textId.setBounds(106, 11, 175, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		textName = new JTextField();
		textName.setBounds(106, 42, 175, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textAdres = new JTextField();
		textAdres.setBounds(106, 73, 175, 20);
		contentPane.add(textAdres);
		textAdres.setColumns(10);
		
		textNum = new JTextField();
		textNum.setBounds(106, 104, 175, 20);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		JLabel lblMteriAd = new JLabel("isim");
		lblMteriAd.setBounds(10, 45, 86, 14);
		contentPane.add(lblMteriAd);
		
		JLabel lblMteriAdres = new JLabel("Adres");
		lblMteriAdres.setBounds(10, 76, 86, 14);
		contentPane.add(lblMteriAdres);
		
		JLabel lblMteriNumara = new JLabel("numara");
		lblMteriNumara.setBounds(10, 107, 86, 14);
		contentPane.add(lblMteriNumara);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 14, 86, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnGncelle = new JButton("Güncelle");
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String Name = textName.getText();
					String Adres = textAdres.getText();
					String Numara = textNum.getText();
					Musteri a = new Musteri();
					a.setId(Musteriid);
					a.setName(Name);
					a.setMobileNo(Numara);
					a.setAddress(Adres);
					int r = a.updateAdmin(a);
					if(r>0) {
						lblYeni.setText("başarıyla güncellendi");
					}
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e2.getMessage());
				}
			}
		});
		btnGncelle.setBounds(10, 135, 101, 23);
		contentPane.add(btnGncelle);
		
		JButton btnKapat = new JButton("Kapat");
		btnKapat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnKapat.setBounds(192, 135, 89, 23);
		contentPane.add(btnKapat);
		
		
		Displaydata();
		
	}

}

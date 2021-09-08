package ui;




import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import model.yemekler;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class Siparis_guncelle extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textName;
	private JTextField textKind;
	private JTextField textPrice;
	
	private int Siparisid;
	private JTextField textKod;
	private void Displaydata() {
		try {
			yemekler a = new yemekler();
			ResultSet rs = a.searchByID(Siparisid);
			if(rs.next()) {
				textId.setText(rs.getString("idsparisler"));
				textName.setText(rs.getString("sparisler_name"));
				textKind.setText(rs.getString("sparisler_tur"));
				textPrice.setText(rs.getString("sparisler_para"));
				textKod.setText(rs.getString("sparisler_kod"));
			
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	public Siparis_guncelle(int id) {
		Siparisid = id;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 514, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYeni = new JLabel("");
		lblYeni.setBounds(116, 163, 148, 23);
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
		
		textKind = new JTextField();
		textKind.setBounds(106, 73, 175, 20);
		contentPane.add(textKind);
		textKind.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setBounds(106, 104, 175, 20);
		contentPane.add(textPrice);
		textPrice.setColumns(10);
		
		Label labelimage = new Label("");
		labelimage.setBounds(307, 10, 125, 125);
		contentPane.add(labelimage);
		
		JLabel lblMteriAd = new JLabel("isim");
		lblMteriAd.setBounds(10, 45, 86, 14);
		contentPane.add(lblMteriAd);
		
		JLabel lblMteriAdres = new JLabel("Tür");
		lblMteriAdres.setBounds(10, 76, 86, 14);
		contentPane.add(lblMteriAdres);
		
		JLabel lblMteriNumara = new JLabel("Fiyat");
		lblMteriNumara.setBounds(10, 107, 86, 14);
		contentPane.add(lblMteriNumara);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 14, 86, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnGncelle = new JButton("Güncelle");
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser ch = new JFileChooser();
					File f = ch.getSelectedFile();
					int result = ch.showOpenDialog(null);
					if(result==0) {
						ImageIcon icon = new ImageIcon(ch.getSelectedFile().getAbsoluteFile().getAbsolutePath());
						//labelimage.setIconImage(icon);
					}
					String filename = f.getAbsolutePath();
					
					String Name = textName.getText();
					String Kind = textKind.getText();
					String Price = textPrice.getText();
					String Kod = textKod.getText();
				
					
					yemekler a = new yemekler();
					a.setFoodId(Siparisid);
					a.setNname(Name);
					a.setkind(Kind);
					a.setmoney(Price);
					a.setcode(Kod);;
				
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
		btnGncelle.setBounds(10, 163, 101, 23);
		contentPane.add(btnGncelle);
		
		JButton btnKapat = new JButton("Kapat");
		btnKapat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnKapat.setBounds(274, 163, 89, 23);
		contentPane.add(btnKapat);
		
		JLabel lblRol = new JLabel("Kod");
		lblRol.setBounds(10, 138, 86, 14);
		contentPane.add(lblRol);
		
		textKod = new JTextField();
		textKod.setBounds(106, 135, 175, 20);
		contentPane.add(textKod);
		textKod.setColumns(10);
		
		
		Displaydata();
		
	}
}

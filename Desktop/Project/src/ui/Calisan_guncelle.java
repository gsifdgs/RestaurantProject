package ui;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calisan;
import model.yemekler;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calisan_guncelle extends JFrame {

	private JPanel contentPane;
	
	private int Calisanid;
	private JTextField textdelete;
	


	public Calisan_guncelle() {
	
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 282, 106);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYeni = new JLabel("");
		lblYeni.setBounds(114, 42, 137, 20);
		contentPane.add(lblYeni);
		
		textdelete = new JTextField();
		textdelete.setBounds(41, 11, 111, 20);
		contentPane.add(textdelete);
		textdelete.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 14, 86, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnGncelle = new JButton("Sil");
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textdelete.getText();
				long b = Long.parseLong(a);
				Calisan d = new Calisan();
				try {
					int r = d.deleteEmployee(b);
					if(r>0){
				lblYeni.setText("basarili");
					}
					else
						lblYeni.setText("basarisiz");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnGncelle.setBounds(10, 39, 101, 23);
		contentPane.add(btnGncelle);
		
		JButton btnKapat = new JButton("Geri Dön");
		btnKapat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnKapat.setBounds(162, 10, 89, 23);
		contentPane.add(btnKapat);
	
		
	}
}

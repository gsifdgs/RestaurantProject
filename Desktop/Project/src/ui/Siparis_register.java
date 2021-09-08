package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import model.yemekler;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Siparis_register extends JFrame {

	private JPanel contentPane;
	private JTextField textAd;
	private JTextField textKod;
	private JTextField textPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Siparis_register frame = new Siparis_register();
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
	public Siparis_register() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 240, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnKaydet = new JButton("Kaydet");
		
		JLabel lblSonuc = new JLabel("");
		lblSonuc.setBounds(125, 160, 87, 18);
		contentPane.add(lblSonuc);
		
		JLabel lblAd = new JLabel("Ad\u0131");
		lblAd.setBounds(10, 11, 46, 14);
		contentPane.add(lblAd);
		
		JLabel lblKodu = new JLabel("Kodu");
		lblKodu.setBounds(10, 36, 46, 14);
		contentPane.add(lblKodu);
		
		JLabel lblFiyat = new JLabel("Fiyat\u0131");
		lblFiyat.setBounds(10, 61, 46, 14);
		contentPane.add(lblFiyat);
		
		textAd = new JTextField();
		textAd.setBounds(66, 8, 146, 20);
		contentPane.add(textAd);
		textAd.setColumns(10);
		textAd.getDocument().addDocumentListener(new DocumentListener() {
			
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
				if (textAd.getText().equals("")) {
					btnKaydet.setEnabled(false);
				lblSonuc.setText("bosluk birakmayin");}
					else {
						btnKaydet.setEnabled(true);
				lblSonuc.setText("");}
			}
		});
		
		textKod = new JTextField();
		textKod.setBounds(66, 33, 51, 20);
		contentPane.add(textKod);
		textKod.setColumns(10);
		
textKod.getDocument().addDocumentListener(new DocumentListener() {
			
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
				if (textKod.getText().equals("")) {
					btnKaydet.setEnabled(false);
				lblSonuc.setText("bosluk birakmayin");}
					else
						btnKaydet.setEnabled(true);
			}
		});
		
		textPrice = new JTextField();
		textPrice.setBounds(66, 58, 51, 20);
		contentPane.add(textPrice);
		textPrice.setColumns(10);
textPrice.getDocument().addDocumentListener(new DocumentListener() {
			
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
				if (textPrice.getText().equals("")) {
					btnKaydet.setEnabled(false);
				lblSonuc.setText("bosluk birakmayin");}
					else
						btnKaydet.setEnabled(true);
			}
		});
		
		JRadioButton rdbtnAnaYemek = new JRadioButton("Ana Yemek");
		rdbtnAnaYemek.setBounds(10, 108, 109, 23);
		contentPane.add(rdbtnAnaYemek);
		
		JRadioButton rdbtnorba = new JRadioButton("\u00C7orba");
		rdbtnorba.setBounds(10, 82, 109, 23);
		contentPane.add(rdbtnorba);
		
		JRadioButton rdbtnAperatif = new JRadioButton("Aperatif");
		rdbtnAperatif.setBounds(10, 134, 109, 23);
		contentPane.add(rdbtnAperatif);
		
		JRadioButton rdbtnIecek = new JRadioButton("\u0130\u00E7ecek");
		rdbtnIecek.setBounds(10, 160, 109, 23);
		contentPane.add(rdbtnIecek);
		
		JRadioButton rdbtnTatl = new JRadioButton("Tatl\u0131");
		rdbtnTatl.setBounds(10, 186, 109, 23);
		contentPane.add(rdbtnTatl);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnAnaYemek);
		group.add(rdbtnAperatif);
		group.add(rdbtnTatl);
		group.add(rdbtnorba);
		group.add(rdbtnIecek);
		
		JButton btnGeriDn = new JButton("Geri D\u00F6n");
		btnGeriDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnGeriDn.setBounds(123, 32, 89, 23);
		contentPane.add(btnGeriDn);
		
		
		
		
		
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textAd.getText();
				String kod = textKod.getText();
				String fiyat = textPrice.getText();
				String Tur = "Ana Yemek";
				if(rdbtnAnaYemek.isSelected())
					Tur = "Ana Yemek";
				if(rdbtnAperatif.isSelected())
					Tur = "Aperatif";
				if(rdbtnIecek.isSelected())
					Tur = "Icecek";
				if(rdbtnorba.isSelected())
					Tur = "Corba";
				if(rdbtnTatl.isSelected())
					Tur = "Tatli";
				yemekler aw = new yemekler();
				aw.setNname(name);
				aw.setmoney(fiyat);
				aw.setcode(kod);
				aw.setkind(Tur);				
				

				try {
					int r = aw.addSiparis(aw);
					if(r>0) {
						lblSonuc.setText("basarili");
					}
	
					else
						lblSonuc.setText("basarisiz");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnKaydet.setBounds(125, 186, 89, 23);
		contentPane.add(btnKaydet);
	}
}

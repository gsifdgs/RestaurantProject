package ui;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import Data.ProjectMain;
import model.Calisan;
import model.Musteri;
import model.myUtils;
import model.yemekler;
import net.proteanit.sql.DbUtils;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TableColumnModelListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTable;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JPopupMenu;
import java.awt.Component;

public class Admin_login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableA;

//	/**
	public static void searchid() {
			Ara_Degistir f = new Ara_Degistir();
			f.setVisible(true);
	}
	public static void sil() {
		Sill gz = new Sill();	
		gz.setVisible(true);
	}

	public Admin_login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 373);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMteri = new JMenu("m\u00FC\u015Fteri");
		menuBar.add(mnMteri);

		
		JMenuItem mnıtmGster = new JMenuItem("G\u00F6ster");
		mnıtmGster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Musteri r= new Musteri();
			try {
				ResultSet rs = r.listMusteri();
				tableA.setModel(myUtils.buildTableModel(rs));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		mnMteri.add(mnıtmGster);
		
		JMenuItem mnıtmEkle = new JMenuItem("Ekle");
		mnıtmEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Musteri_register a = new Musteri_register();
				a.setVisible(true);
			}
		});
		mnMteri.add(mnıtmEkle);
		
		JMenuItem mnıtmSil = new JMenuItem("Sil");
		mnıtmSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sil();
			}
		});
		
		mnMteri.add(mnıtmSil);
		
		JMenuItem mnıtmAra = new JMenuItem("Ara");
		mnıtmAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				searchid();
			}
		});
		mnMteri.add(mnıtmAra);
		
		JMenu mnalan = new JMenu("Çalışan");
		menuBar.add(mnalan);
		
		JMenuItem mnıtmGster_2 = new JMenuItem("Göster");
		mnıtmGster_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calisan_buyuk a = new Calisan_buyuk();
				a.setVisible(true);
			}
		});
		mnalan.add(mnıtmGster_2);
		
		JMenuItem mnıtmEkle_3 = new JMenuItem("Ekle");
		mnıtmEkle_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Calisan_ekle a = new Calisan_ekle();
			a.setVisible(true);
			}
		});
		mnalan.add(mnıtmEkle_3);
		
		JMenuItem mnıtmAra_2 = new JMenuItem("Ara");
		mnıtmAra_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Calisan_ara a = new Calisan_ara();
			a.setVisible(true);
			}
		});
		
		JMenuItem mnıtmSil_4 = new JMenuItem("Sil");
		mnıtmSil_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calisan_guncelle a = new Calisan_guncelle();
				a.setVisible(true);
			}
		});
		mnalan.add(mnıtmSil_4);
		mnalan.add(mnıtmAra_2);
		
		JMenu mnSipari = new JMenu("Sipari\u015F");
		menuBar.add(mnSipari);
		
		JMenuItem mnıtmGster_1 = new JMenuItem("G\u00F6ster");
		mnıtmGster_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Siparis_Buyuk a = new Siparis_Buyuk();
			a.setVisible(true);
			}
		});
		mnSipari.add(mnıtmGster_1);
		
		JMenuItem mnıtmEkle_1 = new JMenuItem("Ekle");
		mnıtmEkle_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Siparis_register a = new Siparis_register();
				a.setVisible(true);
			}
		});
		mnSipari.add(mnıtmEkle_1);
		
		JMenuItem mnıtmSil_1 = new JMenuItem("Sil");
		mnıtmSil_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sill_Siparis u = new Sill_Siparis();
				u.setVisible(true);
			}
		});
		mnSipari.add(mnıtmSil_1);
		
		JMenuItem mnıtmAra_1 = new JMenuItem("Ara");
		mnıtmAra_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ara_Siparis a = new Ara_Siparis();
				a.setVisible(true);
			}
		});
		mnSipari.add(mnıtmAra_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeHome = new JLabel("Ho\u015Fgeldiniz");
		lblWelcomeHome.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblWelcomeHome.setBounds(10, 11, 198, 32);
		contentPane.add(lblWelcomeHome);
		
		JLabel lblYourAccount = new JLabel("Sizin Hesab\u0131n\u0131z");
		lblYourAccount.setBounds(10, 42, 101, 22);
		contentPane.add(lblYourAccount);
		
		JButton btnGrevEkle = new JButton("\u00C7\u0131k\u0131\u015F yap");
		btnGrevEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UI ir = new UI();
				ir.setVisible(true);
				dispose();
			}
		});

		btnGrevEkle.setBounds(624, 11, 89, 23);
		contentPane.add(btnGrevEkle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 713, 229);
		contentPane.add(scrollPane);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(scrollPane,tableA,popupMenu);
		
		JMenuItem mnıtmEdit = new JMenuItem("Güncelle");
		mnıtmEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int rowindex = tableA.getSelectedRow();
					if(rowindex>=0) {
						int id =Integer.parseInt(tableA.getValueAt(rowindex, 0).toString());
						Musteri_Guncelle a = new Musteri_Guncelle(id);
						a.setVisible(true);
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		popupMenu.add(mnıtmEdit);
		
		JMenuItem mnıtmSil_3 = new JMenuItem("Sil");
		mnıtmSil_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						
						
						int rowindex = tableA.getSelectedRow();
						if(rowindex>=0) {
							int confirm = JOptionPane.showConfirmDialog(null, "eminmisin?");
							if(confirm==0) {
							int id =Integer.parseInt(tableA.getValueAt(rowindex, 0).toString());
							Musteri a = new Musteri();
						int r = a.deleteMusteri(id);
						if(r==1) {
							JOptionPane.showMessageDialog(null, "basariyla silindi");
							tableA.setModel(myUtils.buildTableModel(a.listMusteri()));
						}
						}
					}
						} catch (Exception e2) {
						// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, e2.getMessage());
					}
			}
		});
		popupMenu.add(mnıtmSil_3);
		
		tableA = new JTable();
		scrollPane.setColumnHeaderView(tableA);
		
	}
	private static void addPopup(Component component, JTable tableA2, final JPopupMenu popup) {
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

package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calisan;

import model.myUtils;
import model.yemekler;

import javax.swing.JScrollPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Siparis_Buyuk extends JFrame {

	private JPanel contentPane;
	private JTable tableA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Siparis_Buyuk frame = new Siparis_Buyuk();
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
	public Siparis_Buyuk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 921, 461);
		contentPane.add(scrollPane);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(scrollPane,tableA,popupMenu);
		
		JMenuItem mnıtmGncelle = new JMenuItem("Güncelle");
		mnıtmGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int rowindex = tableA.getSelectedRow();
					if(rowindex>=0) {
						int id =Integer.parseInt(tableA.getValueAt(rowindex, 0).toString());
						Siparis_guncelle a = new Siparis_guncelle(id);
						a.setVisible(true);
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		popupMenu.add(mnıtmGncelle);
		
		JMenuItem mnıtmSil = new JMenuItem("Sil");
		mnıtmSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					int rowindex = tableA.getSelectedRow();
					if(rowindex>=0) {
						int confirm = JOptionPane.showConfirmDialog(null, "eminmisin?");
						if(confirm==0) {
						int id =Integer.parseInt(tableA.getValueAt(rowindex, 0).toString());
						yemekler a = new yemekler();
					int r = a.deleteFood(id);
					if(r==1) {
						JOptionPane.showMessageDialog(null, "basariyla silindi");
						tableA.setModel(myUtils.buildTableModel(a.listYemekler()));
					}
					}
				}
					} catch (Exception e2) {
					// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, e2.getMessage());
				}
			}
		});
		popupMenu.add(mnıtmSil);
		
		tableA = new JTable();
		scrollPane.setColumnHeaderView(tableA);
		
		JButton btnGeriDn = new JButton("Geri Dön");
		btnGeriDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnGeriDn.setBounds(842, 11, 89, 23);
		contentPane.add(btnGeriDn);
		
		JButton btnGster = new JButton("Göster");
		btnGster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yemekler r= new yemekler();
				try {
					ResultSet rs = r.listYemekler();
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
		btnGster.setBounds(10, 11, 89, 23);
		contentPane.add(btnGster);
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

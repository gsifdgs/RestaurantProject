package ui;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calisan;

import model.myUtils;

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

public class Calisan_buyuk extends JFrame {

	private JPanel contentPane;
	private JTable tableA_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calisan_buyuk frame = new Calisan_buyuk();
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
	public Calisan_buyuk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnGeriDn = new JButton("Geri Dön");
		btnGeriDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		
		tableA_1 = new JTable();
		tableA_1.setBounds(10, 47, 921, 314);
		contentPane.add(tableA_1);
		btnGeriDn.setBounds(842, 11, 89, 23);
		contentPane.add(btnGeriDn);
		
		JButton btnGster = new JButton("Göster");
		btnGster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calisan r= new Calisan();
				try {
					ResultSet rs = r.listEmployee();
					tableA_1.setModel(myUtils.buildTableModel(rs));
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

}


package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.myUtils;
import model.yemekler;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Sparisler_goster extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnGeriDn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sparisler_goster frame = new Sparisler_goster();
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
	public Sparisler_goster() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 572, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 51, 536, 326);
		contentPane.add(table);
		
		JButton btnGster = new JButton("Göster");
		btnGster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yemekler r = new yemekler();
				
				try {
					ResultSet rs = r.listYemekler();
					table.setModel(myUtils.buildTableModel(rs));
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
		
		btnGeriDn = new JButton("Geri Dön");
		btnGeriDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnGeriDn.setBounds(445, 11, 101, 23);
		contentPane.add(btnGeriDn);
	}
}

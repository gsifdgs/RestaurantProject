package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Musteri;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sill extends JFrame {

	private JPanel contentPane;
	private JTextField textDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sill frame = new Sill();
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
	public Sill() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 406, 110);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUd = new JLabel("");
		lblUd.setBounds(109, 46, 271, 19);
		contentPane.add(lblUd);
		
		textDelete = new JTextField();
		textDelete.setBounds(66, 11, 190, 28);
		contentPane.add(textDelete);
		textDelete.setColumns(10);
		
		JLabel lblIdGiriniz = new JLabel("\u0130d giriniz:");
		lblIdGiriniz.setBounds(10, 11, 46, 14);
		contentPane.add(lblIdGiriniz);
		
		JButton btnSil = new JButton("Sil");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textDelete.getText();
				long b = Long.parseLong(a);
				Musteri d = new Musteri();
				try {
					int r = d.deleteMusteri(b);
					if(r>0){
				lblUd.setText("basarili");
					}
					else
						lblUd.setText("basarisiz");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSil.setBounds(10, 46, 89, 23);
		contentPane.add(btnSil);
		
		JButton btnGeriDn = new JButton("Geri D\u00F6n");
		btnGeriDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnGeriDn.setBounds(291, 11, 89, 23);
		contentPane.add(btnGeriDn);
	}
}

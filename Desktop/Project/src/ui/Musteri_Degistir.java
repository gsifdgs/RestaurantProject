package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Musteri_Degistir extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Musteri_Degistir frame = new Musteri_Degistir();
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
	public Musteri_Degistir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 189, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIsimDeitir = new JButton("isim de\u011Fi\u015Ftir");
		btnIsimDeitir.setBounds(10, 11, 153, 23);
		contentPane.add(btnIsimDeitir);
		
		JButton btnNumaraDeitir = new JButton("numara de\u011Fi\u015Ftir");
		btnNumaraDeitir.setBounds(10, 45, 153, 23);
		contentPane.add(btnNumaraDeitir);
		
		JButton btnUsernameDeitir = new JButton("username de\u011Fi\u015Ftir");
		btnUsernameDeitir.setBounds(10, 79, 153, 23);
		contentPane.add(btnUsernameDeitir);
		
		JButton btnPasswordDeitir = new JButton("password de\u011Fi\u015Ftir");
		btnPasswordDeitir.setBounds(10, 113, 153, 23);
		contentPane.add(btnPasswordDeitir);
		
		JButton btnAdresDeitir = new JButton("adres de\u011Fi\u015Ftir");
		btnAdresDeitir.setBounds(10, 147, 153, 23);
		contentPane.add(btnAdresDeitir);
	}

}

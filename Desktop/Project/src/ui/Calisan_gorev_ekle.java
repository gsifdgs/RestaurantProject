package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calisan;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calisan_gorev_ekle extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textGorev;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calisan_gorev_ekle frame = new Calisan_gorev_ekle();
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
	public Calisan_gorev_ekle() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 144);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdGiriniz = new JLabel("İd Giriniz");
		lblIdGiriniz.setBounds(10, 11, 103, 14);
		contentPane.add(lblIdGiriniz);
		
		JLabel lblGrevGiriniz = new JLabel("Görev Giriniz");
		lblGrevGiriniz.setBounds(179, 11, 103, 14);
		contentPane.add(lblGrevGiriniz);
		
		JLabel lblSonuc = new JLabel("\r\n");
		lblSonuc.setBounds(109, 67, 202, 23);
		contentPane.add(lblSonuc);
		
		textId = new JTextField();
		textId.setBounds(10, 36, 103, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		textGorev = new JTextField();
		textGorev.setBounds(179, 36, 245, 20);
		contentPane.add(textGorev);
		textGorev.setColumns(10);
		
		JButton btnGeriDn = new JButton("Geri Dön");
		btnGeriDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			dispose();
			}
		});
		btnGeriDn.setBounds(321, 67, 103, 23);
		contentPane.add(btnGeriDn);
		
		JButton btnTamam = new JButton("Tamam");
		btnTamam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String B = textId.getText();
			String C = textGorev.getText();
			long D = Long.parseLong(B);
			Calisan a = new Calisan();
			a.setGrev(C);
			a.setId(D);;
			try {
				int r = a.updateEmployeeMission(a);
				if(r>0) {
					lblSonuc.setText("işlem başarılı");
				}
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, e2.getMessage());
			}
			
			}
		});
		btnTamam.setBounds(10, 67, 89, 23);
		contentPane.add(btnTamam);
	}
}

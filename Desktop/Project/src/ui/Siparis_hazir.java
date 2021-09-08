package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Musteri;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Siparis_hazir extends JFrame {

	private JPanel contentPane;
	private JTextField textid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Siparis_hazir frame = new Siparis_hazir();
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
	public Siparis_hazir() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 370, 105);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textid = new JTextField();
		textid.setBounds(66, 8, 86, 20);
		contentPane.add(textid);
		textid.setColumns(10);
		
		JLabel lblYeni = new JLabel("");
		lblYeni.setBounds(176, 36, 168, 19);
		contentPane.add(lblYeni);
		
		JLabel lblMteriId = new JLabel("Müşteri id");
		lblMteriId.setBounds(10, 11, 46, 14);
		contentPane.add(lblMteriId);
		
		JButton btnSipariTamam = new JButton("Sipariş Tamam");
		btnSipariTamam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String f = "Pasif";
					String c = "";
					Long B = Long.parseLong(textid.getText());
					Musteri a = new Musteri();
					a.setId(B);
					a.setEtkinlik(f);
					a.setSiparis(c);
				int r1 = a.updateFoodAdmin(a);
				if(r1>0) {
					lblYeni.setText("başarıyla güncellendi");
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, e2.getMessage());
			}
			}
		});
		btnSipariTamam.setBounds(10, 32, 142, 23);
		contentPane.add(btnSipariTamam);
		
		JButton btnGeriDn = new JButton("Geri Dön");
		btnGeriDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnGeriDn.setBounds(176, 7, 86, 23);
		contentPane.add(btnGeriDn);
	}
}

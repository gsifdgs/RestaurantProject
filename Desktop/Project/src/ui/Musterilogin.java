package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calisan;
import model.Musteri;
import model.yemekler;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Musterilogin extends JFrame {

	private JPanel contentPane;
	private String[] topp = new String[30];
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Musterilogin frame = new Musterilogin();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public Musterilogin(Musteri o) throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSatnAl = new JButton("\u00C7\u0131k\u0131\u015F Yap");
		btnSatnAl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UI ir = new UI();
				ir.setVisible(true);
				dispose();
			}
		});
		btnSatnAl.setBounds(76, 11, 99, 23);
		contentPane.add(btnSatnAl);
		
		JLabel lblHogeldiniz = new JLabel("Ho\u015Fgeldiniz");
		lblHogeldiniz.setBounds(10, 11, 115, 23);
		contentPane.add(lblHogeldiniz);
		
		JLabel lblIsim = new JLabel("isim");
		lblIsim.setBounds(10, 62, 46, 14);
		contentPane.add(lblIsim);
		
		JLabel lblAdres = new JLabel("adres");
		lblAdres.setBounds(10, 87, 46, 14);
		contentPane.add(lblAdres);
		
		JLabel lblNumara = new JLabel("numara");
		lblNumara.setBounds(10, 112, 46, 14);
		contentPane.add(lblNumara);
		
		JButton btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				long id = o.getId();
				Musteri_Guncelle a = new Musteri_Guncelle(id);
				a.setVisible(true);
			}
		});
		btnGncelle.setBounds(10, 147, 89, 23);
		contentPane.add(btnGncelle);
		
		JLabel lblName = new JLabel("New label");
		lblName.setBounds(76, 62, 200, 14);
		contentPane.add(lblName);
		
		JLabel lblAdr = new JLabel("New label");
		lblAdr.setVerticalAlignment(SwingConstants.TOP);
		lblAdr.setBounds(76, 87, 200, 14);
		contentPane.add(lblAdr);
		
		JLabel lblNum = new JLabel("New label");
		lblNum.setBounds(76, 112, 200, 14);
		contentPane.add(lblNum);
		
		JButton btnSatnAl_1 = new JButton("Sipariş et");
		btnSatnAl_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					long id = o.getId();
					Sparisler A = new Sparisler(id);
					
					A.setVisible(true);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		});
		btnSatnAl_1.setBounds(190, 147, 89, 23);
		contentPane.add(btnSatnAl_1);
		
		yemekler a = new yemekler();
		
			try {
					yemekler obj = new yemekler();
					for(int i=1;i>=30;i++) {
		ResultSet rs = obj.showByID(i);
		obj.setNname(rs.getString("sparisler_name"));
		topp[i]=obj.getNname();
		}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	lblName.setText(o.getName());
	lblAdr.setText(o.getAddress());
	lblNum.setText(o.getMobileNo());
	}
}

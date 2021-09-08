package ui;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Musteri;
import model.yemekler;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Sparisler extends JFrame {

	private JPanel contentPane;
	private long Musteriid;
	

	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {
	//	EventQueue.invokeLater(new Runnable() {
		//	public void run() {
			//	try {
					
				//	Sparisler frame = new Sparisler(int id);
					//frame.setVisible(true);
				//} catch (Exception e) {
					//e.printStackTrace();
				//}
	//		}
	//	});
	//}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public Sparisler(long id) throws Exception {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 824, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnHamburgerMen = new JRadioButton("Kanat");
		rdbtnHamburgerMen.setBounds(10, 49, 121, 23);
		contentPane.add(rdbtnHamburgerMen);
		
		JRadioButton rdbtnSandviMen = new JRadioButton("Adana Kebap");
		rdbtnSandviMen.setBounds(10, 75, 109, 23);
		contentPane.add(rdbtnSandviMen);
		
		JRadioButton rdbtnTavukburgerMen = new JRadioButton("Urfa Kebap");
		rdbtnTavukburgerMen.setBounds(10, 101, 121, 23);
		contentPane.add(rdbtnTavukburgerMen);
		
		JRadioButton rdbtnPatatesMen = new JRadioButton("Tavuk Döner");
		rdbtnPatatesMen.setBounds(10, 127, 109, 23);
		contentPane.add(rdbtnPatatesMen);
		
		JRadioButton rdbtnKfteMen = new JRadioButton("Et Döner");
		rdbtnKfteMen.setBounds(10, 153, 109, 23);
		contentPane.add(rdbtnKfteMen);
		
		JRadioButton rdbtnrenciMen = new JRadioButton("Kıymalı pide");
		rdbtnrenciMen.setBounds(10, 179, 109, 23);
		contentPane.add(rdbtnrenciMen);
		
		JButton btnSatnAl = new JButton("Geri Dön");
		btnSatnAl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
			}
		});
		
		JRadioButton radiobtnHindiMen = new JRadioButton("Hindi Şiş");
		radiobtnHindiMen.setBounds(10, 256, 109, 23);
		contentPane.add(radiobtnHindiMen);
		btnSatnAl.setBounds(713, 4, 85, 23);
		contentPane.add(btnSatnAl);
		
		JRadioButton rdbtnocukMen = new JRadioButton("Patatesli Pide");
		rdbtnocukMen.setBounds(10, 205, 109, 23);
		contentPane.add(rdbtnocukMen);
		
		JLabel lblSipariSeiniz = new JLabel("Sipari\u015F se\u00E7iniz");
		lblSipariSeiniz.setBounds(640, 234, 85, 14);
		contentPane.add(lblSipariSeiniz);
		
		yemekler a = new yemekler();
		
		JLabel lblorba = new JLabel("Çorba");
		lblorba.setBounds(358, 8, 46, 14);
		contentPane.add(lblorba);
		
		JLabel lblAnaYemekler = new JLabel("Ana Yemekler");
		lblAnaYemekler.setBounds(68, 4, 109, 14);
		contentPane.add(lblAnaYemekler);
		
		JRadioButton rdbtnMercimekorbas = new JRadioButton("Mercimek Çorbası");
		rdbtnMercimekorbas.setBounds(283, 29, 121, 23);
		contentPane.add(rdbtnMercimekorbas);
	
		
		JLabel lblAperatif = new JLabel("Aperatif");
		lblAperatif.setBounds(358, 79, 46, 14);
		contentPane.add(lblAperatif);
		
		JRadioButton rdbtnSalata = new JRadioButton("Salata");
		rdbtnSalata.setBounds(283, 127, 109, 23);
		contentPane.add(rdbtnSalata);
		
		JRadioButton rdbtnPatatesKzartmas = new JRadioButton("Patates Kızartması");
		rdbtnPatatesKzartmas.setBounds(283, 101, 109, 23);
		contentPane.add(rdbtnPatatesKzartmas);
		
		JLabel lblTatl = new JLabel("Tatlı");
		lblTatl.setBounds(358, 183, 46, 14);
		contentPane.add(lblTatl);
		
		JRadioButton rdbtnStla = new JRadioButton("Sütlaç");
		rdbtnStla.setBounds(283, 204, 109, 23);
		contentPane.add(rdbtnStla);
		
		JRadioButton rdbtnKnefe = new JRadioButton("Künefe");
		rdbtnKnefe.setBounds(283, 230, 109, 23);
		contentPane.add(rdbtnKnefe);
		
		JRadioButton rdbtnekerpare = new JRadioButton("Şekerpare");
		rdbtnekerpare.setBounds(283, 256, 109, 23);
		contentPane.add(rdbtnekerpare);
		
		JLabel lblIecek = new JLabel("İçecek");
		lblIecek.setBounds(614, 8, 46, 14);
		contentPane.add(lblIecek);
		
		JRadioButton rdbtnAyran = new JRadioButton("");
		rdbtnAyran.setBounds(551, 49, 109, 23);
		contentPane.add(rdbtnAyran);
		
		JRadioButton rdbtnay = new JRadioButton("");
		rdbtnay.setBounds(551, 75, 109, 23);
		contentPane.add(rdbtnay);
		
		JRadioButton rdbtnGazoz = new JRadioButton("");
		rdbtnGazoz.setBounds(551, 101, 109, 23);
		contentPane.add(rdbtnGazoz);
		
		JRadioButton rdbtnMeyveSuyu = new JRadioButton("");
		rdbtnMeyveSuyu.setBounds(551, 127, 109, 23);
		contentPane.add(rdbtnMeyveSuyu);
		
		JRadioButton rdbtnTavuki = new JRadioButton("");
		rdbtnTavuki.setBounds(10, 23, 109, 23);
		contentPane.add(rdbtnTavuki);
		
		JLabel lblYeni = new JLabel("");
		lblYeni.setBounds(580, 205, 189, 23);
		contentPane.add(lblYeni);
		
		
		JRadioButton rdbtnKarkPide = new JRadioButton("");
		rdbtnKarkPide.setBounds(10, 231, 109, 23);
		contentPane.add(rdbtnKarkPide);
				
						JLabel lbl01 = new JLabel("");
						lbl01.setBounds(410, 33, 46, 14);
						contentPane.add(lbl01);
						
						JLabel lbl02 = new JLabel("");
						lbl02.setBounds(410, 105, 46, 14);
						contentPane.add(lbl02);
						
						JLabel lbl03 = new JLabel("");
						lbl03.setBounds(410, 131, 46, 14);
						contentPane.add(lbl03);
						
						JLabel lbl04 = new JLabel("");
						lbl04.setBounds(410, 209, 46, 14);
						contentPane.add(lbl04);
						
						JLabel lbl05 = new JLabel("");
						lbl05.setBounds(410, 234, 46, 14);
						contentPane.add(lbl05);
						
						JLabel lbl07 = new JLabel("");
						lbl07.setBounds(666, 79, 46, 14);
						contentPane.add(lbl07);
						
						JLabel lbl08 = new JLabel("");
						lbl08.setBounds(666, 105, 46, 14);
						contentPane.add(lbl08);
						
						JLabel lbl06 = new JLabel("");
						lbl06.setBounds(666, 131, 46, 14);
						contentPane.add(lbl06);
						
						JLabel lbl05_1 = new JLabel("");
						lbl05_1.setBounds(410, 260, 46, 14);
						contentPane.add(lbl05_1);
						
						JLabel lbl09 = new JLabel("");
						lbl09.setBounds(666, 53, 46, 14);
						contentPane.add(lbl09);
						
						JLabel lbl1 = new JLabel("");
						lbl1.setBounds(142, 27, 46, 14);
						contentPane.add(lbl1);
						
						JLabel lbl2 = new JLabel("");
						lbl2.setBounds(142, 53, 46, 14);
						contentPane.add(lbl2);
						
						JLabel lbl3 = new JLabel("");
						lbl3.setBounds(142, 79, 46, 14);
						contentPane.add(lbl3);
						
						JLabel lbl4 = new JLabel("");
						lbl4.setBounds(142, 105, 46, 14);
						contentPane.add(lbl4);
						
						JLabel lbl5 = new JLabel("");
						lbl5.setBounds(142, 131, 46, 14);
						contentPane.add(lbl5);
						
						JLabel lbl6 = new JLabel("");
						lbl6.setBounds(142, 157, 46, 14);
						contentPane.add(lbl6);
						
						JLabel lbl7 = new JLabel("");
						lbl7.setBounds(142, 183, 46, 14);
						contentPane.add(lbl7);
						
						JLabel lbl8 = new JLabel("");
						lbl8.setBounds(142, 209, 46, 14);
						contentPane.add(lbl8);
						
						JLabel lbl9 = new JLabel("");
						lbl9.setBounds(142, 234, 46, 14);
						contentPane.add(lbl9);
						
						JLabel lbl10 = new JLabel("");
						lbl10.setBounds(142, 260, 46, 14);
						contentPane.add(lbl10);
						
		Musteriid = id;
			
		yemekler obj = new yemekler();
					
		try {
			
				ResultSet da = obj.showByID(1);
				
				if(da.next()) {
					String ba00 = da.getString("sparisler_para");
					lbl1.setText(ba00);}
				
				ResultSet da9 = obj.showByID(21);	
				
				if(da9.next()) {
					String ba011 = da9.getString("sparisler_para");
					lbl10.setText(ba011);}
				
				ResultSet das = obj.showByID(2); 
				
				if(das.next()) {		
					String ba1 = das.getString("sparisler_para");
							lbl2.setText(ba1);}
				
				ResultSet das1 = obj.showByID(3);		
				
				if(das1.next()) {
				String ba2 = das1.getString("sparisler_para");
							lbl3.setText(ba2);}
				ResultSet das2 = obj.showByID(4);
				if(das2.next()) {
				String ba3 = das2.getString("sparisler_para");
							lbl4.setText(ba3);}
				ResultSet das3 = obj.showByID(5);
				if(das3.next()) {
				String ba4 = das3.getString("sparisler_para");
							lbl5.setText(ba4);}
				ResultSet das4 = obj.showByID(6);
				if(das4.next()) {
				String ba5 = das4.getString("sparisler_para");
							lbl6.setText(ba5);}
				ResultSet das5 = obj.showByID(7);
				if(das5.next()) {
				String ba6= das5.getString("sparisler_para");		
							lbl7.setText(ba6);}
				ResultSet das6 = obj.showByID(8);
				if(das6.next()) {
				String ba7 = das6.getString("sparisler_para");
							lbl8.setText(ba7);}
				ResultSet das7 = obj.showByID(9);
				if(das7.next()) {
				String ba8= das7.getString("sparisler_para");				
							lbl9.setText(ba8);}
				ResultSet das8 = obj.showByID(10);
				if(das8.next()) {
				String ba9 = das8.getString("sparisler_para");
							lbl01.setText(ba9);}
				ResultSet das10 = obj.showByID(11);
				if(das10.next()) {
				String ba10 = das10.getString("sparisler_para");
							lbl02.setText(ba10);}
				ResultSet das11 = obj.showByID(12);
				if(das11.next()) {
				String ba11 = das11.getString("sparisler_para");
							lbl03.setText(ba11);}
				ResultSet das12 = obj.showByID(13);
				if(das12.next()) {
				String ba12 = das12.getString("sparisler_para");				
							lbl04.setText(ba12);}
				ResultSet das13 = obj.showByID(14);
				if(das13.next()) {
				String ba13 = das13.getString("sparisler_para");		
							lbl05.setText(ba13);}
				ResultSet das14 = obj.showByID(15);
				if(das14.next()) {
				String ba14 = das14.getString("sparisler_para");
							lbl05_1.setText(ba14);}
				ResultSet das15 = obj.showByID(16);
				if(das15.next()) {
				String ba15 = das15.getString("sparisler_para");
							lbl09.setText(ba15);}
				ResultSet das16 = obj.showByID(17);
				if(das16.next()) {
				String ba16 = das16.getString("sparisler_para");
							lbl07.setText(ba16);}
				ResultSet das17 = obj.showByID(18);
				if(das17.next()) {
				String ba17 = das17.getString("sparisler_para");
							lbl08.setText(ba17);}
				ResultSet das18 = obj.showByID(19);
				if(das18.next()) {
				String ba18 = das18.getString("sparisler_para");
							lbl06.setText(ba18);}
			ResultSet d = obj.showByID(1);
				if(d.next()) {
			String b = d.getString("sparisler_name");
						rdbtnTavuki.setText(b);}
			ResultSet d9 = obj.showByID(21);
				if(d9.next()) {
			String b99 = d9.getString("sparisler_name");
						radiobtnHindiMen.setText(b99);}
			ResultSet ds = obj.showByID(2);
				if(ds.next()) {
			String b1 = ds.getString("sparisler_name");
						rdbtnHamburgerMen.setText(b1);}
			ResultSet ds1 = obj.showByID(3);
				if(ds1.next()) {
			String b2 = ds1.getString("sparisler_name");
						rdbtnSandviMen.setText(b2);}
			ResultSet ds2 = obj.showByID(4);
				if(ds2.next()) {
			String b3 = ds2.getString("sparisler_name");
						rdbtnTavukburgerMen.setText(b3);}
			ResultSet ds3 = obj.showByID(5);
				if(ds3.next()) {
			String b4 = ds3.getString("sparisler_name");
						rdbtnPatatesMen.setText(b4);}
			ResultSet ds4 = obj.showByID(6);
				if(ds4.next()) {
			String b5 = ds4.getString("sparisler_name");
						rdbtnKfteMen.setText(b5);}
			ResultSet ds5 = obj.showByID(7);
				if(ds5.next()) {
			String b6= ds5.getString("sparisler_name");			
						rdbtnrenciMen.setText(b6);}
			ResultSet ds6 = obj.showByID(8);
				if(ds6.next()) {
			String b7 = ds6.getString("sparisler_name");
						rdbtnocukMen.setText(b7);}
			ResultSet ds7 = obj.showByID(9);
				if(ds7.next()) {
			String b8= ds7.getString("sparisler_name");				
						rdbtnKarkPide.setText(b8);}
			ResultSet ds8 = obj.showByID(10);
				if(ds8.next()) {
			String b9 = ds8.getString("sparisler_name");
						rdbtnMercimekorbas.setText(b9);}
			ResultSet ds10 = obj.showByID(11);
				if(ds10.next()) {
			String b10 = ds10.getString("sparisler_name");
						rdbtnPatatesKzartmas.setText(b10);}
			ResultSet ds11 = obj.showByID(12);
				if(ds11.next()) {
			String b11 = ds11.getString("sparisler_name");
						rdbtnSalata.setText(b11);}
			ResultSet ds12 = obj.showByID(13);
				if(ds12.next()) {
			String b12 = ds12.getString("sparisler_name");				
						rdbtnStla.setText(b12);}
			ResultSet ds13 = obj.showByID(14);
				if(ds13.next()) {
			String b13 = ds13.getString("sparisler_name");			
						rdbtnKnefe.setText(b13);}
			ResultSet ds14 = obj.showByID(15);
				if(ds14.next()) {
			String b14 = ds14.getString("sparisler_name");
						rdbtnekerpare.setText(b14);}
			ResultSet ds15 = obj.showByID(16);
				if(ds15.next()) {
			String b15 = ds15.getString("sparisler_name");
						rdbtnAyran.setText(b15);}
			ResultSet ds16 = obj.showByID(17);
				if(ds16.next()) {
			String b16 = ds16.getString("sparisler_name");
						rdbtnay.setText(b16);}
			ResultSet ds17 = obj.showByID(18);
				if(ds17.next()) {
			String b17 = ds17.getString("sparisler_name");
						rdbtnGazoz.setText(b17);}
			ResultSet ds18 = obj.showByID(19);
				if(ds18.next()) {
			String b18 = ds18.getString("sparisler_name");
						rdbtnMeyveSuyu.setText(b18);}
				
		} catch (Exception e) {
			// TODO: handle exception
		}
					
					JComboBox comboBox = new JComboBox();
					comboBox.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox.setBounds(188, 24, 46, 20);
					contentPane.add(comboBox);
					
					JComboBox comboBox_2 = new JComboBox();
					comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_2.setBounds(188, 50, 46, 20);
					contentPane.add(comboBox_2);
					
					JComboBox comboBox_1 = new JComboBox();
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_1.setBounds(188, 76, 46, 20);
					contentPane.add(comboBox_1);
					
					JComboBox comboBox_3 = new JComboBox();
					comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_3.setBounds(188, 102, 46, 20);
					contentPane.add(comboBox_3);
					
					JComboBox comboBox_4 = new JComboBox();
					comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_4.setBounds(188, 128, 46, 20);
					contentPane.add(comboBox_4);
					
					JComboBox comboBox_5 = new JComboBox();
					comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_5.setBounds(188, 154, 46, 20);
					contentPane.add(comboBox_5);
					
					JComboBox comboBox_6 = new JComboBox();
					comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_6.setBounds(188, 180, 46, 20);
					contentPane.add(comboBox_6);
					
					JComboBox comboBox_7 = new JComboBox();
					comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_7.setBounds(188, 206, 46, 20);
					contentPane.add(comboBox_7);
					
					JComboBox comboBox_8 = new JComboBox();
					comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_8.setBounds(188, 231, 46, 20);
					contentPane.add(comboBox_8);
					
					JComboBox comboBox_19 = new JComboBox();
					comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_19.setBounds(188, 257, 46, 20);
					contentPane.add(comboBox_19);
					
					JComboBox comboBox_9 = new JComboBox();
					comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_9.setBounds(455, 30, 46, 20);
					contentPane.add(comboBox_9);
					
					JComboBox comboBox_10 = new JComboBox();
					comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_10.setBounds(455, 102, 46, 20);
					contentPane.add(comboBox_10);
					
					JComboBox comboBox_11 = new JComboBox();
					comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_11.setBounds(455, 128, 46, 20);
					contentPane.add(comboBox_11);
					
					JComboBox comboBox_12 = new JComboBox();
					comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_12.setBounds(455, 206, 46, 20);
					contentPane.add(comboBox_12);
					
					JComboBox comboBox_13 = new JComboBox();
					comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_13.setBounds(455, 231, 46, 20);
					contentPane.add(comboBox_13);
					
					JComboBox comboBox_14 = new JComboBox();
					comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_14.setBounds(455, 257, 46, 20);
					contentPane.add(comboBox_14);
					
					JComboBox comboBox_15 = new JComboBox();
					comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_15.setBounds(713, 50, 46, 20);
					contentPane.add(comboBox_15);
					
					JComboBox comboBox_16 = new JComboBox();
					comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_16.setBounds(713, 76, 46, 20);
					contentPane.add(comboBox_16);
					
					JComboBox comboBox_17 = new JComboBox();
					comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_17.setBounds(713, 102, 46, 20);
					contentPane.add(comboBox_17);
					
					JComboBox comboBox_18 = new JComboBox();
					comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"x1", "x2", "x3", "x4", "x5", "x6"}));
					comboBox_18.setBounds(713, 128, 46, 20);
					contentPane.add(comboBox_18);
						
				
						
							JButton btnSatnAl_1 = new JButton("Sat\u0131n al");
							btnSatnAl_1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
								String[] topp = new String[20];
								String c="";
								for(int e=0;e<20;e++) {
									topp[e] = "";
								}
								String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21;
								s1=s2=s3=s4=s5=s6=s7=s8=s9=s10=s11=s12=s13=s14=s15=s16=s17=s18=s19=s20=s21="x1";
								if(rdbtnTavuki.isSelected()) {
					if(comboBox.getSelectedIndex()==0) {s1="x1";}else if(comboBox.getSelectedIndex()==1){s1="x2";}
					else if(comboBox.getSelectedIndex()==2){s1="x3";}else if(comboBox.getSelectedIndex()==3){s1="x4";}
					else if(comboBox.getSelectedIndex()==4){s1="x5";}else{s1="x6";}								
									topp[0] = rdbtnTavuki.getText()+s1+",";
								}
								if(rdbtnHamburgerMen.isSelected()) {
					if(comboBox_2.getSelectedIndex()==0) {s2="x1";}else if(comboBox_2.getSelectedIndex()==1){s2="x2";}
					else if(comboBox_2.getSelectedIndex()==2){s2="x3";}else if(comboBox_2.getSelectedIndex()==3){s2="x4";}
					else if(comboBox_2.getSelectedIndex()==4){s2="x5";}else{s2="x6";}		
									topp[1] = rdbtnHamburgerMen.getText()+s2+",";
								}
								 if(rdbtnSandviMen.isSelected()) {
					if(comboBox_1.getSelectedIndex()==0) {s3="x1";}else if(comboBox_1.getSelectedIndex()==1){s3="x2";}
					else if(comboBox_1.getSelectedIndex()==2){s3="x3";}else if(comboBox_1.getSelectedIndex()==3){s3="x4";}
					else if(comboBox_1.getSelectedIndex()==4){s3="x5";}else{s3="x6";} 
									topp[2] = rdbtnSandviMen.getText()+s3+",";
								}
								 if(rdbtnTavukburgerMen.isSelected()) {
					if(comboBox_3.getSelectedIndex()==0) {s4="x1";}else if(comboBox_3.getSelectedIndex()==1){s4="x2";}
					else if(comboBox_3.getSelectedIndex()==2){s4="x3";}else if(comboBox_3.getSelectedIndex()==3){s4="x4";}
					else if(comboBox_3.getSelectedIndex()==4){s4="x5";}else{s4="x6";}
									topp[3] = rdbtnTavukburgerMen.getText()+s4+",";
								}
								if(rdbtnPatatesMen.isSelected()) {
					if(comboBox_4.getSelectedIndex()==0) {s5="x1";}else if(comboBox_4.getSelectedIndex()==1){s5="x2";}
					else if(comboBox_4.getSelectedIndex()==2){s5="x3";}else if(comboBox_4.getSelectedIndex()==3){s5="x4";}
					else if(comboBox_4.getSelectedIndex()==4){s5="x5";}else{s5="x6";}
									topp[4] = rdbtnPatatesMen.getText()+s5+",";
								}
								if(rdbtnKfteMen.isSelected()) {
					if(comboBox_5.getSelectedIndex()==0) {s6="x1";}else if(comboBox_5.getSelectedIndex()==1){s6="x2";}
					else if(comboBox_5.getSelectedIndex()==2){s6="x3";}else if(comboBox_5.getSelectedIndex()==3){s6="x4";}
					else if(comboBox_5.getSelectedIndex()==4){s6="x5";}else{s6="x6";}			
									topp[5] = rdbtnKfteMen.getText()+s6+",";
								}
								if(rdbtnrenciMen.isSelected()) {
					if(comboBox_6.getSelectedIndex()==0) {s7="x1";}else if(comboBox_6.getSelectedIndex()==1){s7="x2";}
					else if(comboBox_6.getSelectedIndex()==2){s7="x3";}else if(comboBox_6.getSelectedIndex()==3){s7="x4";}
					else if(comboBox_6.getSelectedIndex()==4){s7="x5";}else{s7="x6";}
									topp[6] = rdbtnrenciMen.getText()+s7+",";
								}
								if(rdbtnocukMen.isSelected()) {
					if(comboBox_7.getSelectedIndex()==0) {s8="x1";}else if(comboBox_7.getSelectedIndex()==1){s8="x2";}
					else if(comboBox_7.getSelectedIndex()==2){s8="x3";}else if(comboBox_7.getSelectedIndex()==3){s8="x4";}
					else if(comboBox_7.getSelectedIndex()==4){s8="x5";}else{s8="x6";}
									topp[7] = rdbtnocukMen.getText()+s8+",";
								}
								if(rdbtnKarkPide.isSelected()) {
					if(comboBox_8.getSelectedIndex()==0) {s9="x1";}else if(comboBox_8.getSelectedIndex()==1){s9="x2";}
					else if(comboBox_8.getSelectedIndex()==2){s9="x3";}else if(comboBox_8.getSelectedIndex()==3){s9="x4";}
					else if(comboBox_8.getSelectedIndex()==4){s9="x5";}else{s9="x6";}
									topp[8] = rdbtnKarkPide.getText()+s9+",";
								}
								if(rdbtnMercimekorbas.isSelected()) {
					if(comboBox_9.getSelectedIndex()==0) {s10="x1";}else if(comboBox_9.getSelectedIndex()==1){s10="x2";}
					else if(comboBox_9.getSelectedIndex()==2){s10="x3";}else if(comboBox_9.getSelectedIndex()==3){s10="x4";}
					else if(comboBox_9.getSelectedIndex()==4){s10="x5";}else{s10="x6";}
									topp[9] = rdbtnMercimekorbas.getText()+s10+",";
								}
								if(rdbtnPatatesKzartmas.isSelected()) {
					if(comboBox_10.getSelectedIndex()==0) {s11="x1";}else if(comboBox_10.getSelectedIndex()==1){s11="x2";}
					else if(comboBox_10.getSelectedIndex()==2){s11="x3";}else if(comboBox_10.getSelectedIndex()==3){s11="x4";}
					else if(comboBox_10.getSelectedIndex()==4){s11="x5";}else{s11="x6";}
									topp[10] = rdbtnPatatesKzartmas.getText()+s11+",";
								}
								if(rdbtnSalata.isSelected()) {
					if(comboBox_11.getSelectedIndex()==0) {s12="x1";}else if(comboBox_11.getSelectedIndex()==1){s12="x2";}
					else if(comboBox_11.getSelectedIndex()==2){s12="x3";}else if(comboBox_11.getSelectedIndex()==3){s12="x4";}
					else if(comboBox_11.getSelectedIndex()==4){s12="x5";}else{s12="x6";}
									topp[11] = rdbtnSalata.getText()+s12+",";
								}
								if(rdbtnStla.isSelected()) {
					if(comboBox_12.getSelectedIndex()==0) {s13="x1";}else if(comboBox_12.getSelectedIndex()==1){s13="x2";}
					else if(comboBox_12.getSelectedIndex()==2){s13="x3";}else if(comboBox_12.getSelectedIndex()==3){s13="x4";}
					else if(comboBox_12.getSelectedIndex()==4){s13="x5";}else{s13="x6";}
									topp[12] = rdbtnStla.getText()+s13+",";
								}
								if(rdbtnKnefe.isSelected()) {
					if(comboBox_13.getSelectedIndex()==0) {s14="x1";}else if(comboBox_13.getSelectedIndex()==1){s14="x2";}
					else if(comboBox_13.getSelectedIndex()==2){s14="x3";}else if(comboBox_13.getSelectedIndex()==3){s14="x4";}
					else if(comboBox_13.getSelectedIndex()==4){s14="x5";}else{s13="x6";}
									topp[13] = rdbtnKnefe.getText()+s14+",";
								}
								if(rdbtnekerpare.isSelected()) {
					if(comboBox_14.getSelectedIndex()==0) {s15="x1";}else if(comboBox_14.getSelectedIndex()==1){s15="x2";}
					else if(comboBox_14.getSelectedIndex()==2){s15="x3";}else if(comboBox_14.getSelectedIndex()==3){s15="x4";}
					else if(comboBox_14.getSelectedIndex()==4){s15="x5";}else{s15="x6";}
									topp[14] = rdbtnekerpare.getText()+s15+",";
								}
								if(rdbtnAyran.isSelected()) {
					if(comboBox_15.getSelectedIndex()==0) {s16="x1";}else if(comboBox_15.getSelectedIndex()==1){s16="x2";}
					else if(comboBox_15.getSelectedIndex()==2){s16="x3";}else if(comboBox_15.getSelectedIndex()==3){s16="x4";}
					else if(comboBox_15.getSelectedIndex()==4){s16="x5";}else{s16="x6";}
									topp[15] = rdbtnAyran.getText()+s16+",";
								}
								if(rdbtnay.isSelected()) {
					if(comboBox_16.getSelectedIndex()==0) {s17="x1";}else if(comboBox_16.getSelectedIndex()==1){s17="x2";}
					else if(comboBox_16.getSelectedIndex()==2){s17="x3";}else if(comboBox_16.getSelectedIndex()==3){s17="x4";}
					else if(comboBox_16.getSelectedIndex()==4){s17="x5";}else{s17="x6";}
									topp[16]= rdbtnay.getText()+s17+",";
								}
								if(rdbtnGazoz.isSelected()) {
					if(comboBox_17.getSelectedIndex()==0) {s18="x1";}else if(comboBox_17.getSelectedIndex()==1){s18="x2";}
					else if(comboBox_17.getSelectedIndex()==2){s18="x3";}else if(comboBox_17.getSelectedIndex()==3){s18="x4";}
					else if(comboBox_17.getSelectedIndex()==4){s18="x5";}else{s18="x6";}
									topp[17] = rdbtnGazoz.getText()+s18+",";
								}
								if(rdbtnMeyveSuyu.isSelected()) {
					if(comboBox_18.getSelectedIndex()==0) {s19="x1";}else if(comboBox_18.getSelectedIndex()==1){s19="x2";}
					else if(comboBox_18.getSelectedIndex()==2){s19="x3";}else if(comboBox_18.getSelectedIndex()==3){s19="x4";}
					else if(comboBox_18.getSelectedIndex()==4){s19="x5";}else{s19="x6";}
									topp[18] = rdbtnMeyveSuyu.getText()+s19+",";
								}
								if(radiobtnHindiMen.isSelected()) {
					if(comboBox_19.getSelectedIndex()==0) {s20="x1";}else if(comboBox_19.getSelectedIndex()==1){s20="x2";}
					else if(comboBox_19.getSelectedIndex()==2){s20="x3";}else if(comboBox_19.getSelectedIndex()==3){s20="x4";}
					else if(comboBox_19.getSelectedIndex()==4){s20="x5";}else{s20="x6";}
									topp[19] = radiobtnHindiMen.getText()+s20+",";
								}
								for(int i=0;i<20;i++) {
								c=c+topp[i];	
								}
								
								try {
									String f = "Aktif";
									Musteri a = new Musteri();
									a.setId(Musteriid);
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
							btnSatnAl_1.setBounds(551, 256, 247, 23);
							contentPane.add(btnSatnAl_1);
				

	}
}

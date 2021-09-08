package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.jdbc.MysqlParameterMetadata;

import javafx.scene.control.ComboBox;
import model.myUtils;
import model.yemekler;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ara_Siparis extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField textSearch;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ara_Siparis frame = new Ara_Siparis();
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
	public Ara_Siparis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textSearch = new JTextField();
		textSearch.setBounds(10, 45, 174, 30);
		contentPane.add(textSearch);
		textSearch.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"İd", "İsim", "Para", "Tur", "Kod"}));
		comboBox.setBounds(314, 47, 123, 23);
		contentPane.add(comboBox);
		
		JLabel lblNewProblem = new JLabel("");
		lblNewProblem.setBounds(194, 11, 243, 23);
		contentPane.add(lblNewProblem);
		
		table = new JTable();
		table.setBounds(10, 86, 480, 216);
		contentPane.add(table);
		
		JButton btnkYap = new JButton("Geri D\u00F6n");
		btnkYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnkYap.setBounds(10, 11, 89, 23);
		contentPane.add(btnkYap);
		
		JButton btnTamam = new JButton("Tamam");
		btnTamam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String A = Ara_Siparis.textSearch.getText();
			    yemekler a = new yemekler();
			    try {	
			    	if(comboBox.getSelectedIndex()==0){
			       
			    	long id= Long.parseLong(A);
					ResultSet as = a.searchByID(id);
					 table.setModel(myUtils.buildTableModel(as));
				
			    }
			    else if(comboBox.getSelectedIndex()==1){
				   	ResultSet as = a.searchByName(A);
						 table.setModel(myUtils.buildTableModel(as));
					
				    }
			    else  if(comboBox.getSelectedIndex()==2){
				    	
						ResultSet as = a.searchBypara(A);
						 table.setModel(myUtils.buildTableModel(as));
					
				    }
			    else if(comboBox.getSelectedIndex()==3){
				    	ResultSet as = a.searchBykind(A);
						 table.setModel(myUtils.buildTableModel(as));
					
				    }
			    else{
				   	ResultSet as = a.searchBykod(A);
						 table.setModel(myUtils.buildTableModel(as));
					
				    }} catch (Exception ee) {
						// TODO Auto-generated catch block
						ee.printStackTrace();
					}
			
			}
		});
		btnTamam.setBounds(194, 49, 89, 23);
		contentPane.add(btnTamam);
	}
}

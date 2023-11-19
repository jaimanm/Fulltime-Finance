package com.mycompany.fulltimefinance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Scholarships extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scholarships frame = new Scholarships();
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
	public Scholarships() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 994, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 128));
		panel.setPreferredSize(new Dimension(panel.getPreferredSize().width, 100));
		panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCHOLARSHIPS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(403, 45, 149, 13);
		panel.add(lblNewLabel);
		
		JPanel tableSearch = new JPanel();
		contentPane.add(tableSearch);
		tableSearch.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Search By Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(185, 10, 136, 13);
		tableSearch.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(298, 9, 96, 19);
		tableSearch.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sort by");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(527, 12, 136, 13);
		tableSearch.add(lblNewLabel_1_1);
		
		JComboBox<String> dropdownFilter = new JComboBox<>();
		dropdownFilter.setBounds(607, 8, 112, 21);
		dropdownFilter.addItem("Name");
		dropdownFilter.addItem("Req");
		dropdownFilter.addItem("Due Date");
		dropdownFilter.addItem("Amount");
		dropdownFilter.setSelectedItem("Amount");
		tableSearch.add(dropdownFilter);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);

		// Column Names
		String[] columnNames = {"Name", "Req", "Due Date", "Amount"};
		
		// Create DefaultTableModel
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);

		// Add data
		model.addRow(new Object[]{"Niche", "No essay", "12/14/23", "$50,000"});
		model.addRow(new Object[]{"Niche", "No essay", "12/14/23", "$50,000"});
		model.addRow(new Object[]{"Niche", "No essay", "12/14/23", "$50,000"});
		model.addRow(new Object[]{"Niche", "No essay", "12/14/23", "$50,000"});

		JTable table = new JTable(model);
//		scrollPane.add(table);
		scrollPane.setViewportView(table);
		
	}
}

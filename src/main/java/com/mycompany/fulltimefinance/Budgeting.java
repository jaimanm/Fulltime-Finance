package com.mycompany.fulltimefinance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;

public class Budgeting extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Budgeting frame = new Budgeting();
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
	public Budgeting() {
		//GEN-BEGIN:initComponents
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel navbar = new JPanel();
		contentPane.add(navbar, BorderLayout.NORTH);
		navbar.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnDashboard = new JButton("Dashboard");
		navbar.add(btnDashboard);
		
		JButton btnGoals = new JButton("Goals");
		navbar.add(btnGoals);
		
		JButton btnBudgeting = new JButton("Budgeting");
		btnBudgeting.setEnabled(false);
		navbar.add(btnBudgeting);
		
		JButton btnScholarships = new JButton("Scholarships & Grants");
		navbar.add(btnScholarships);
		
		JButton btnFinancialTips = new JButton("Financial Tips");
		navbar.add(btnFinancialTips);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel transactionsBanner = new JPanel();
		transactionsBanner.setBackground(new Color(255, 128, 192));
		transactionsBanner.setPreferredSize(new Dimension(100, 100));
		panel.add(transactionsBanner);
		transactionsBanner.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("TRANSACTIONS");
		lblNewLabel_1.setBounds(156, 29, 150, 22);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		transactionsBanner.add(lblNewLabel_1);
		
		JPanel tableSearch = new JPanel();
		panel.add(tableSearch);
		
		textField = new JTextField();
		tableSearch.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		tableSearch.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		// Column Names
		String[] columnNames = {"Column 1", "Column 2", "Column 3"};

		// Create DefaultTableModel
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);

		// Add data
		model.addRow(new Object[]{"Data 1", "Data 2", "Data 3"});
		model.addRow(new Object[]{"Data 4", "Data 5", "Data 6"});
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		JPanel rightSide = new JPanel();
		rightSide.setLayout(new BoxLayout(rightSide, BoxLayout.Y_AXIS));
		
		JPanel earningsPanel = new JPanel();
		rightSide.add(earningsPanel);
		earningsPanel.setLayout(null);
		
		JLabel lblNextPaycheck = new JLabel("Next Paycheck: ");
		lblNextPaycheck.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNextPaycheck.setBounds(118, 90, 101, 13);
		earningsPanel.add(lblNextPaycheck);
		
		JFormattedTextField nextPaycheck = new JFormattedTextField();
		nextPaycheck.setFont(new Font("Tahoma", Font.BOLD, 14));
		nextPaycheck.setText("Nov 23, 2023");
		nextPaycheck.setBounds(239, 84, 134, 30);
		earningsPanel.add(nextPaycheck);
		
		JLabel lblHoursWorked = new JLabel("Hours Worked: ");
		lblHoursWorked.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHoursWorked.setBounds(118, 135, 101, 13);
		earningsPanel.add(lblHoursWorked);
		
		JFormattedTextField hoursWorked = new JFormattedTextField();
		hoursWorked.setFont(new Font("Tahoma", Font.BOLD, 14));
		hoursWorked.setText("47");
		hoursWorked.setBounds(239, 129, 134, 30);
		earningsPanel.add(hoursWorked);
		
		JLabel lblExpectedEarnings = new JLabel("Expected Earnings:");
		lblExpectedEarnings.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblExpectedEarnings.setBounds(118, 175, 120, 17);
		earningsPanel.add(lblExpectedEarnings);
		
		JLabel expectedEarnings = new JLabel("$724.97");
		expectedEarnings.setFont(new Font("Tahoma", Font.BOLD, 14));
		expectedEarnings.setBounds(268, 168, 86, 30);
		earningsPanel.add(expectedEarnings);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 128));
		panel_1.setBounds(10, 10, 477, 70);
		earningsPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EARNINGS");
		lblNewLabel.setBounds(195, 24, 101, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(lblNewLabel);
		rightSide.add(Box.createRigidArea(new Dimension(0, 10)));
		
		JPanel spendingPanel = new JPanel();
		rightSide.add(spendingPanel);
		spendingPanel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 497, 86);
		panel_2.setBackground(new Color(128, 128, 255));
		spendingPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("SPENDING");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(201, 22, 108, 31);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 85, 497, 167);
		spendingPanel.add(panel_3);
		
		JComboBox<String> dropdownFilter = new JComboBox<>();
		dropdownFilter.setBounds(207, 10, 75, 21);
		dropdownFilter.addItem("Daily");
		dropdownFilter.addItem("Weekly");
		dropdownFilter.addItem("Monthly");
		dropdownFilter.addItem("Yearly");
		panel_3.setLayout(null);
		dropdownFilter.setSelectedItem("Monthly");
		panel_3.add(dropdownFilter);
		
		JLabel lblEarned = new JLabel("EARNED");
		lblEarned.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEarned.setBounds(250, 41, 108, 21);
		panel_3.add(lblEarned);
		
		JLabel lblNewLabel_3 = new JLabel("$1007.86");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(174, 41, 66, 21);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("$286.40");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(174, 72, 66, 21);
		panel_3.add(lblNewLabel_3_1);
		
		JLabel lblSpent = new JLabel("SPENT");
		lblSpent.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpent.setBounds(250, 72, 108, 21);
		panel_3.add(lblSpent);
		
		JLabel lblNewLabel_4 = new JLabel("Monthly");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(154, 103, 56, 17);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Budget: ");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(207, 103, 56, 17);
		panel_3.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("$500");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(260, 105, 45, 13);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("$213.6");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(161, 131, 66, 17);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("left in ");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6_1.setBounds(217, 130, 66, 17);
		panel_3.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("14");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6_2.setBounds(256, 130, 66, 17);
		panel_3.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("days");
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6_3.setBounds(279, 130, 66, 17);
		panel_3.add(lblNewLabel_6_3);
				
		
		
		splitPane.add(rightSide);
		
		//GEN-END:initComponents
	}
}

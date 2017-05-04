package com.intellimed.pizza.views;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnOrder;
	private JButton btnCancel;
	private JRadioButton rdbtnSmall;
	private JRadioButton rdbtnMedium;
	private JRadioButton rdbtnLarge;
	private JRadioButton rdbtnThin;
	private JRadioButton rdbtnThick;
	private JRadioButton rdbtnCash;
	private JRadioButton rdbtnCreditCard;
	private JRadioButton rdbtnForHere;
	private JRadioButton rdbtnToGo;
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JCheckBox chckbxExtraCheese;
	private JCheckBox chckbxOnions;
	private JCheckBox chckbxMushrooms;
	private JCheckBox chckbxGreenPeppers;
	private JCheckBox chckbxBlackOlives;
	private JCheckBox chckbxTomatoes;
	private JTextArea textArea;
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/com/intellimed/pizza/resources/pizza_32.png")));
		setTitle("Pizza Order System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 488);
		initComponents();
		createEvents();
	}
	
	public void initComponents(){
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Size", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Toppings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Crust Type", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_4 = new JPanel();
		
		spinner = new JSpinner();
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Customer Info", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Special Instructions", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "Payment Method", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		btnOrder = new JButton("Order");		
		btnCancel = new JButton("Cancel");

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
							.addGap(37)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
								.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
											.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
										.addComponent(panel_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(195)
									.addComponent(btnOrder)
									.addGap(18)
									.addComponent(btnCancel)))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancel)
						.addComponent(btnOrder)))
		);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		rdbtnCash = new JRadioButton("Cash");
		buttonGroup_3.add(rdbtnCash);
		rdbtnCash.setSelected(true);
		GridBagConstraints gbc_rdbtnCash = new GridBagConstraints();
		gbc_rdbtnCash.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnCash.gridx = 0;
		gbc_rdbtnCash.gridy = 0;
		panel_6.add(rdbtnCash, gbc_rdbtnCash);
		
		rdbtnCreditCard = new JRadioButton("Credit Card");
		buttonGroup_3.add(rdbtnCreditCard);
		GridBagConstraints gbc_rdbtnCreditCard = new GridBagConstraints();
		gbc_rdbtnCreditCard.gridx = 2;
		gbc_rdbtnCreditCard.gridy = 0;
		panel_6.add(rdbtnCreditCard, gbc_rdbtnCreditCard);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel lblName = new JLabel("First Name: ");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 0;
		panel_5.add(lblName, gbc_lblName);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		panel_5.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.insets = new Insets(0, 0, 0, 5);
		gbc_lblLastName.gridx = 0;
		gbc_lblLastName.gridy = 1;
		panel_5.add(lblLastName, gbc_lblLastName);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 1;
		panel_5.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		rdbtnForHere = new JRadioButton("For Here");
		rdbtnForHere.setSelected(true);
		buttonGroup_2.add(rdbtnForHere);
		GridBagConstraints gbc_rdbtnForHere = new GridBagConstraints();
		gbc_rdbtnForHere.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnForHere.gridx = 0;
		gbc_rdbtnForHere.gridy = 0;
		panel_4.add(rdbtnForHere, gbc_rdbtnForHere);
		
		rdbtnToGo = new JRadioButton("To Go");
		buttonGroup_2.add(rdbtnToGo);
		GridBagConstraints gbc_rdbtnToGo = new GridBagConstraints();
		gbc_rdbtnToGo.gridx = 1;
		gbc_rdbtnToGo.gridy = 0;
		panel_4.add(rdbtnToGo, gbc_rdbtnToGo);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		rdbtnThin = new JRadioButton("Thin");
		rdbtnThin.setSelected(true);
		buttonGroup_1.add(rdbtnThin);
		GridBagConstraints gbc_rdbtnThin = new GridBagConstraints();
		gbc_rdbtnThin.anchor = GridBagConstraints.WEST;
		gbc_rdbtnThin.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnThin.gridx = 0;
		gbc_rdbtnThin.gridy = 0;
		panel_3.add(rdbtnThin, gbc_rdbtnThin);
		
		rdbtnThick = new JRadioButton("Thick");
		buttonGroup_1.add(rdbtnThick);
		GridBagConstraints gbc_rdbtnThick = new GridBagConstraints();
		gbc_rdbtnThick.anchor = GridBagConstraints.WEST;
		gbc_rdbtnThick.gridx = 0;
		gbc_rdbtnThick.gridy = 1;
		panel_3.add(rdbtnThick, gbc_rdbtnThick);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		chckbxExtraCheese = new JCheckBox("Extra Cheese");
		GridBagConstraints gbc_chckbxExtraCheese = new GridBagConstraints();
		gbc_chckbxExtraCheese.anchor = GridBagConstraints.WEST;
		gbc_chckbxExtraCheese.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxExtraCheese.gridx = 0;
		gbc_chckbxExtraCheese.gridy = 0;
		panel_2.add(chckbxExtraCheese, gbc_chckbxExtraCheese);
		
		chckbxOnions = new JCheckBox("Onions");
		GridBagConstraints gbc_chckbxOnions = new GridBagConstraints();
		gbc_chckbxOnions.anchor = GridBagConstraints.WEST;
		gbc_chckbxOnions.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxOnions.gridx = 1;
		gbc_chckbxOnions.gridy = 0;
		panel_2.add(chckbxOnions, gbc_chckbxOnions);
		
		chckbxMushrooms = new JCheckBox("Mushrooms");
		GridBagConstraints gbc_chckbxMushrooms = new GridBagConstraints();
		gbc_chckbxMushrooms.anchor = GridBagConstraints.WEST;
		gbc_chckbxMushrooms.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxMushrooms.gridx = 0;
		gbc_chckbxMushrooms.gridy = 1;
		panel_2.add(chckbxMushrooms, gbc_chckbxMushrooms);
		
		chckbxGreenPeppers = new JCheckBox("Green Peppers");
		GridBagConstraints gbc_chckbxGreenPeppers = new GridBagConstraints();
		gbc_chckbxGreenPeppers.anchor = GridBagConstraints.WEST;
		gbc_chckbxGreenPeppers.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxGreenPeppers.gridx = 1;
		gbc_chckbxGreenPeppers.gridy = 1;
		panel_2.add(chckbxGreenPeppers, gbc_chckbxGreenPeppers);
		
		chckbxBlackOlives = new JCheckBox("Black Olives");
		GridBagConstraints gbc_chckbxBlackOlives = new GridBagConstraints();
		gbc_chckbxBlackOlives.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxBlackOlives.anchor = GridBagConstraints.WEST;
		gbc_chckbxBlackOlives.gridx = 0;
		gbc_chckbxBlackOlives.gridy = 2;
		panel_2.add(chckbxBlackOlives, gbc_chckbxBlackOlives);
		
		chckbxTomatoes = new JCheckBox("Tomatoes");
		GridBagConstraints gbc_chckbxTomatoes = new GridBagConstraints();
		gbc_chckbxTomatoes.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxTomatoes.anchor = GridBagConstraints.WEST;
		gbc_chckbxTomatoes.gridx = 1;
		gbc_chckbxTomatoes.gridy = 2;
		panel_2.add(chckbxTomatoes, gbc_chckbxTomatoes);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		rdbtnSmall = new JRadioButton("Small");
		rdbtnSmall.setSelected(true);
		buttonGroup.add(rdbtnSmall);
		GridBagConstraints gbc_rdbtnSmall = new GridBagConstraints();
		gbc_rdbtnSmall.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSmall.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnSmall.gridx = 0;
		gbc_rdbtnSmall.gridy = 0;
		panel_1.add(rdbtnSmall, gbc_rdbtnSmall);
		
		rdbtnMedium = new JRadioButton("Medium");
		buttonGroup.add(rdbtnMedium);
		GridBagConstraints gbc_rdbtnMedium = new GridBagConstraints();
		gbc_rdbtnMedium.anchor = GridBagConstraints.WEST;
		gbc_rdbtnMedium.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnMedium.gridx = 0;
		gbc_rdbtnMedium.gridy = 1;
		panel_1.add(rdbtnMedium, gbc_rdbtnMedium);
		
		rdbtnLarge = new JRadioButton("Large");
		buttonGroup.add(rdbtnLarge);
		GridBagConstraints gbc_rdbtnLarge = new GridBagConstraints();
		gbc_rdbtnLarge.anchor = GridBagConstraints.WEST;
		gbc_rdbtnLarge.gridx = 0;
		gbc_rdbtnLarge.gridy = 2;
		panel_1.add(rdbtnLarge, gbc_rdbtnLarge);
		panel.setLayout(gl_panel);
	}
	
	public void createEvents(){
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Map<String, String> orderDetails = new HashMap<String, String>();
				
				
				if (rdbtnCash.isSelected()){
					orderDetails.put("Payment Method", "Cash");
				} else if (rdbtnCreditCard.isSelected()){
					orderDetails.put("Payment Method", "Credit Card");
				}
				
				if (rdbtnSmall.isSelected()){
					orderDetails.put("Pizza Size", "Small");
				} else if (rdbtnMedium.isSelected()){
					orderDetails.put("Pizza Size", "Medium");
				} else if (rdbtnLarge.isSelected()){
					orderDetails.put("Pizza Size", "Large");
				}
				
				if (rdbtnThin.isSelected()){
					orderDetails.put("Crust Type", "Thin");
				} else if (rdbtnThick.isSelected()){
					orderDetails.put("Crust Type", "Thick");
				}
				
				if (rdbtnForHere.isSelected()){
					orderDetails.put("Delivery Method", "For Here");
				} else if (rdbtnToGo.isSelected()){
					orderDetails.put("Delivery Method", "To Go");
				}
				
				
				
				StringBuffer toppings = new StringBuffer("Toppings = ");
				if (chckbxBlackOlives.isSelected()){
					toppings.append("Black Olives\t");
				}
				if (chckbxExtraCheese.isSelected()){
					toppings.append("Extra Cheese\t");
				}				
				if (chckbxGreenPeppers.isSelected()){
					toppings.append("Green Peppers\t");
				}				
				if (chckbxMushrooms.isSelected()){
					toppings.append("Mushrooms\t");
				}				
				if (chckbxOnions.isSelected()){
					toppings.append("Onions\t");
				}				
				if (chckbxTomatoes.isSelected()){
					//toppings.append(chckbxTomatoes.getLabel());
					toppings.append("Tomatoes\t");
				}
		
				

				
				
				JOptionPane.showMessageDialog(null, "Thank you " + textField.getText() + " " + textField_1.getText() + " for your order!\nYou ordered " + spinner.getValue() + " pizza(s). "
						+ "Order Details:\n\n" + orderDetails + "\n" + toppings + "\nSpecial Instructions = " + textArea.getText());
				resetWindow();
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int userSelection = JOptionPane.showConfirmDialog(null, "Entered information will be lost. Are you sure you want to cancel this order?", "Cancel Order", JOptionPane.YES_NO_OPTION);
				if (userSelection == 0){
					System.out.println("Order is canceled!");
					resetWindow();
					
				} else {
					System.out.println("Order is not canceled!");

				}

			}
		});
	}
	
	
	public void resetWindow(){
		rdbtnCash.setSelected(true);
		rdbtnSmall.setSelected(true);
		rdbtnForHere.setSelected(true);
		rdbtnThin.setSelected(true);
		
		chckbxBlackOlives.setSelected(false);
		chckbxExtraCheese.setSelected(false);
		chckbxGreenPeppers.setSelected(false);
		chckbxMushrooms.setSelected(false);
		chckbxOnions.setSelected(false);
		chckbxTomatoes.setSelected(false);
		
		textArea.setText("");
		textField.setText("");
		textField_1.setText("");
		
		spinner.setValue(0);
		
	}
}

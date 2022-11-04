package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import javax.swing.JInternalFrame;
import java.awt.ScrollPane;
import java.awt.Color;
import java.awt.Button;
import javax.swing.ScrollPaneConstants;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import java.awt.Insets;

public class Frame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
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
	public Frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setAutoscrolls(false);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(20, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Меню");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		
		JButton btnNewButton = new JButton("New button");
		panel_6.add(btnNewButton);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_7.add(btnNewButton_1);
		
		JPanel panel_8 = new JPanel();
		panel_1.add(panel_8);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_8.add(btnNewButton_2);
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_1.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_1.add(panel_11);
		
		JPanel panel_11_1 = new JPanel();
		panel_1.add(panel_11_1);
		
		JPanel panel_11_2 = new JPanel();
		panel_1.add(panel_11_2);
		
		JPanel panel_11_3 = new JPanel();
		panel_1.add(panel_11_3);
		
		JPanel panel_11_4 = new JPanel();
		panel_1.add(panel_11_4);
		
		JPanel panel_11_5 = new JPanel();
		panel_1.add(panel_11_5);
		
		JPanel panel_11_6 = new JPanel();
		panel_1.add(panel_11_6);
		
		JPanel panel_11_7 = new JPanel();
		panel_1.add(panel_11_7);
		
		JPanel panel_11_8 = new JPanel();
		panel_1.add(panel_11_8);
		
		JPanel panel_11_9 = new JPanel();
		panel_1.add(panel_11_9);
		
		JPanel panel_11_10 = new JPanel();
		panel_1.add(panel_11_10);
		panel_11_10.setLayout(new GridLayout(1, 3, 0, 0));
		
		JPanel panel_13 = new JPanel();
		panel_11_10.add(panel_13);
		panel_13.setLayout(new BoxLayout(panel_13, BoxLayout.X_AXIS));
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(Frame2.class.getResource("/images/png-clipart-gear-icon-gears-file-transport-transportation-thumbnailк.png")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_13.add(btnNewButton_5);
		
		JPanel panel_14 = new JPanel();
		panel_11_10.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_11_10.add(panel_15);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setColumnHeaderView(panel);
		
		JLabel lblNewLabel = new JLabel("Поиск");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(50);
		
		JPanel panel_2 = new JPanel();
		scrollPane.setViewportView(panel_2);
		
		JPanel panel_12 = new JPanel();
		
		JPanel panel_12_1 = new JPanel();
		
		JLabel lblNewLabel_2_1 = new JLabel("НАЗВАНИЕ");
		
		JLabel lblNewLabel_3_1 = new JLabel("ПАРОЛЬ");
		
		JButton btnNewButton_3_1 = new JButton("New button");
		
		JButton btnNewButton_4_1 = new JButton("New button");
		GroupLayout gl_panel_12_1 = new GroupLayout(panel_12_1);
		gl_panel_12_1.setHorizontalGroup(
			gl_panel_12_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGroup(gl_panel_12_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(btnNewButton_4_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_12_1.setVerticalGroup(
			gl_panel_12_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGroup(gl_panel_12_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_1)
						.addComponent(btnNewButton_4_1))
					.addContainerGap())
		);
		panel_12_1.setLayout(gl_panel_12_1);
		
		JPanel panel_12_2 = new JPanel();
		
		JLabel lblNewLabel_2_2 = new JLabel("НАЗВАНИЕ");
		
		JLabel lblNewLabel_3_2 = new JLabel("ПАРОЛЬ");
		
		JButton btnNewButton_3_2 = new JButton("New button");
		
		JButton btnNewButton_4_2 = new JButton("New button");
		GroupLayout gl_panel_12_2 = new GroupLayout(panel_12_2);
		gl_panel_12_2.setHorizontalGroup(
			gl_panel_12_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGroup(gl_panel_12_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(btnNewButton_4_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_12_2.setVerticalGroup(
			gl_panel_12_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGroup(gl_panel_12_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_2, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_2)
						.addComponent(btnNewButton_4_2))
					.addContainerGap())
		);
		panel_12_2.setLayout(gl_panel_12_2);
		
		JPanel panel_12_3 = new JPanel();
		
		JLabel lblNewLabel_2_3 = new JLabel("НАЗВАНИЕ");
		
		JLabel lblNewLabel_3_3 = new JLabel("ПАРОЛЬ");
		
		JButton btnNewButton_3_3 = new JButton("New button");
		
		JButton btnNewButton_4_3 = new JButton("New button");
		GroupLayout gl_panel_12_3 = new GroupLayout(panel_12_3);
		gl_panel_12_3.setHorizontalGroup(
			gl_panel_12_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(btnNewButton_4_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_12_3.setVerticalGroup(
			gl_panel_12_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_3, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_3)
						.addComponent(btnNewButton_4_3))
					.addContainerGap())
		);
		panel_12_3.setLayout(gl_panel_12_3);
		
		JPanel panel_12_3_1 = new JPanel();
		
		JLabel lblNewLabel_2_3_1 = new JLabel("НАЗВАНИЕ");
		
		JLabel lblNewLabel_3_3_1 = new JLabel("ПАРОЛЬ");
		
		JButton btnNewButton_3_3_1 = new JButton("New button");
		
		JButton btnNewButton_4_3_1 = new JButton("New button");
		GroupLayout gl_panel_12_3_1 = new GroupLayout(panel_12_3_1);
		gl_panel_12_3_1.setHorizontalGroup(
			gl_panel_12_3_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_3_1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_3_3_1, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3_3_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(btnNewButton_4_3_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_12_3_1.setVerticalGroup(
			gl_panel_12_3_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12_3_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_3_1, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3_3_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_3_1)
						.addComponent(btnNewButton_4_3_1))
					.addContainerGap())
		);
		panel_12_3_1.setLayout(gl_panel_12_3_1);
		
		JPanel panel_12_3_2 = new JPanel();
		
		JLabel lblNewLabel_2_3_2 = new JLabel("НАЗВАНИЕ");
		
		JLabel lblNewLabel_3_3_2 = new JLabel("ПАРОЛЬ");
		
		JButton btnNewButton_3_3_2 = new JButton("New button");
		
		JButton btnNewButton_4_3_2 = new JButton("New button");
		GroupLayout gl_panel_12_3_2 = new GroupLayout(panel_12_3_2);
		gl_panel_12_3_2.setHorizontalGroup(
			gl_panel_12_3_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_3_2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_3_3_2, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3_3_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(btnNewButton_4_3_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_12_3_2.setVerticalGroup(
			gl_panel_12_3_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12_3_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_3_2, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3_3_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_3_2)
						.addComponent(btnNewButton_4_3_2))
					.addContainerGap())
		);
		panel_12_3_2.setLayout(gl_panel_12_3_2);
		
		JPanel panel_12_3_3 = new JPanel();
		
		JLabel lblNewLabel_2_3_3 = new JLabel("НАЗВАНИЕ");
		
		JLabel lblNewLabel_3_3_3 = new JLabel("ПАРОЛЬ");
		
		JButton btnNewButton_3_3_3 = new JButton("New button");
		
		JButton btnNewButton_4_3_3 = new JButton("New button");
		GroupLayout gl_panel_12_3_3 = new GroupLayout(panel_12_3_3);
		gl_panel_12_3_3.setHorizontalGroup(
			gl_panel_12_3_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_3_3, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_3_3_3, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3_3_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(btnNewButton_4_3_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_12_3_3.setVerticalGroup(
			gl_panel_12_3_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12_3_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_3_3, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3_3_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_3_3)
						.addComponent(btnNewButton_4_3_3))
					.addContainerGap())
		);
		panel_12_3_3.setLayout(gl_panel_12_3_3);
		
		JPanel panel_12_3_4 = new JPanel();
		
		JLabel lblNewLabel_2_3_4 = new JLabel("НАЗВАНИЕ");
		
		JLabel lblNewLabel_3_3_4 = new JLabel("ПАРОЛЬ");
		
		JButton btnNewButton_3_3_4 = new JButton("New button");
		
		JButton btnNewButton_4_3_4 = new JButton("New button");
		GroupLayout gl_panel_12_3_4 = new GroupLayout(panel_12_3_4);
		gl_panel_12_3_4.setHorizontalGroup(
			gl_panel_12_3_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_3_4, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_3_3_4, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3_3_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(btnNewButton_4_3_4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_12_3_4.setVerticalGroup(
			gl_panel_12_3_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12_3_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_3_4, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3_3_4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_3_4)
						.addComponent(btnNewButton_4_3_4))
					.addContainerGap())
		);
		panel_12_3_4.setLayout(gl_panel_12_3_4);
		
		JPanel panel_12_3_5 = new JPanel();
		
		JLabel lblNewLabel_2_3_5 = new JLabel("НАЗВАНИЕ");
		
		JLabel lblNewLabel_3_3_5 = new JLabel("ПАРОЛЬ");
		
		JButton btnNewButton_3_3_5 = new JButton("New button");
		
		JButton btnNewButton_4_3_5 = new JButton("New button");
		GroupLayout gl_panel_12_3_5 = new GroupLayout(panel_12_3_5);
		gl_panel_12_3_5.setHorizontalGroup(
			gl_panel_12_3_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_3_5, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_3_3_5, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3_3_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(btnNewButton_4_3_5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_12_3_5.setVerticalGroup(
			gl_panel_12_3_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12_3_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_3_5, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3_3_5, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_3_5)
						.addComponent(btnNewButton_4_3_5))
					.addContainerGap())
		);
		panel_12_3_5.setLayout(gl_panel_12_3_5);
		
		JPanel panel_12_3_5_1 = new JPanel();
		
		JLabel lblNewLabel_2_3_5_1 = new JLabel("НАЗВАНИЕ");
		
		JLabel lblNewLabel_3_3_5_1 = new JLabel("ПАРОЛЬ");
		
		JButton btnNewButton_3_3_5_1 = new JButton("New button");
		
		JButton btnNewButton_4_3_5_1 = new JButton("New button");
		GroupLayout gl_panel_12_3_5_1 = new GroupLayout(panel_12_3_5_1);
		gl_panel_12_3_5_1.setHorizontalGroup(
			gl_panel_12_3_5_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_5_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_3_5_1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_3_3_5_1, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3_3_5_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(btnNewButton_4_3_5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_12_3_5_1.setVerticalGroup(
			gl_panel_12_3_5_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_5_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12_3_5_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_3_5_1, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3_3_5_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_3_5_1)
						.addComponent(btnNewButton_4_3_5_1))
					.addContainerGap())
		);
		panel_12_3_5_1.setLayout(gl_panel_12_3_5_1);
		
		JPanel panel_12_3_5_2 = new JPanel();
		
		JLabel lblNewLabel_2_3_5_2 = new JLabel("НАЗВАНИЕ");
		
		JLabel lblNewLabel_3_3_5_2 = new JLabel("ПАРОЛЬ");
		
		JButton btnNewButton_3_3_5_2 = new JButton("New button");
		
		JButton btnNewButton_4_3_5_2 = new JButton("New button");
		GroupLayout gl_panel_12_3_5_2 = new GroupLayout(panel_12_3_5_2);
		gl_panel_12_3_5_2.setHorizontalGroup(
			gl_panel_12_3_5_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_5_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_3_5_2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_3_3_5_2, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3_3_5_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(btnNewButton_4_3_5_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_12_3_5_2.setVerticalGroup(
			gl_panel_12_3_5_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_5_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12_3_5_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_3_5_2, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3_3_5_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_3_5_2)
						.addComponent(btnNewButton_4_3_5_2))
					.addContainerGap())
		);
		panel_12_3_5_2.setLayout(gl_panel_12_3_5_2);
		
		JPanel panel_12_3_5_3 = new JPanel();
		
		JLabel lblNewLabel_2_3_5_3 = new JLabel("НАЗВАНИЕ");
		
		JLabel lblNewLabel_3_3_5_3 = new JLabel("ПАРОЛЬ");
		
		JButton btnNewButton_3_3_5_3 = new JButton("New button");
		
		JButton btnNewButton_4_3_5_3 = new JButton("New button");
		
		JPanel panel_12_3_5_4 = new JPanel();
		
		JLabel lblNewLabel_2_3_5_4 = new JLabel("НАЗВАНИЕ");
		
		JLabel lblNewLabel_3_3_5_4 = new JLabel("ПАРОЛЬ");
		
		JButton btnNewButton_3_3_5_4 = new JButton("New button");
		
		JButton btnNewButton_4_3_5_4 = new JButton("New button");
		GroupLayout gl_panel_12_3_5_4 = new GroupLayout(panel_12_3_5_4);
		gl_panel_12_3_5_4.setHorizontalGroup(
			gl_panel_12_3_5_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGap(0, 530, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_5_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_3_5_4, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_3_3_5_4, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3_3_5_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(btnNewButton_4_3_5_4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_12_3_5_4.setVerticalGroup(
			gl_panel_12_3_5_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGap(0, 42, Short.MAX_VALUE)
				.addGroup(gl_panel_12_3_5_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12_3_5_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_3_5_4, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3_3_5_4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_3_5_4)
						.addComponent(btnNewButton_4_3_5_4))
					.addContainerGap())
		);
		panel_12_3_5_4.setLayout(gl_panel_12_3_5_4);
		GroupLayout gl_panel_12_3_5_3 = new GroupLayout(panel_12_3_5_3);
		gl_panel_12_3_5_3.setHorizontalGroup(
			gl_panel_12_3_5_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12_3_5_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_3_5_3, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_3_3_5_3, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3_3_5_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(btnNewButton_4_3_5_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
				.addComponent(panel_12_3_5_4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
		);
		gl_panel_12_3_5_3.setVerticalGroup(
			gl_panel_12_3_5_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12_3_5_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12_3_5_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_3_5_3, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3_3_5_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_3_5_3)
						.addComponent(btnNewButton_4_3_5_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_12_3_5_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
		);
		panel_12_3_5_3.setLayout(gl_panel_12_3_5_3);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_12, GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
						.addComponent(panel_12_1, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12_2, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12_3, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12_3_1, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12_3_2, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12_3_3, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12_3_4, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12_3_5, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12_3_5_1, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12_3_5_2, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12_3_5_3, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_12_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_12_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_12_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_12_3_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_12_3_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_12_3_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_12_3_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_12_3_5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_12_3_5_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_12_3_5_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_12_3_5_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_2 = new JLabel("НАЗВАНИЕ");
		
		JLabel lblNewLabel_3 = new JLabel("ПАРОЛЬ");
		
		JButton btnNewButton_3 = new JButton("New button");
		
		JButton btnNewButton_4 = new JButton("New button");
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3)
						.addComponent(btnNewButton_4))
					.addContainerGap())
		);
		panel_12.setLayout(gl_panel_12);
		panel_2.setLayout(gl_panel_2);
	}
}
